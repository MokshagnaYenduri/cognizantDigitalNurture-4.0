CREATE OR REPLACE PROCEDURE TransferFunds(
    p_sourceAccountID IN Accounts.AccountID%TYPE,
    p_targetAccountID IN Accounts.AccountID%TYPE,
    p_amount          IN NUMBER
) IS
    sourceBalance Accounts.Balance%TYPE;
    targetBalance Accounts.Balance%TYPE;
BEGIN
    IF p_amount <= 0 THEN
        RAISE_APPLICATION_ERROR(-20001, 'Transfer amount should be more than $0.');
    END IF;

    SELECT Balance INTO sourceBalance
    FROM Accounts
    WHERE AccountID = p_sourceAccountID
    FOR UPDATE;

    IF p_amount > sourceBalance THEN
        RAISE_APPLICATION_ERROR(-20002, 'Insufficient funds in source account.');
    END IF;

    SELECT Balance INTO targetBalance
    FROM Accounts
    WHERE AccountID = p_targetAccountID
    FOR UPDATE;

    UPDATE Accounts
    SET Balance = Balance - p_amount,
        LastModified = SYSDATE
    WHERE AccountID = p_sourceAccountID;

    UPDATE Accounts
    SET Balance = Balance + p_amount,
        LastModified = SYSDATE
    WHERE AccountID = p_targetAccountID;

    DBMS_OUTPUT.PUT_LINE('Transfer of $' || p_amount || ' from Account ' || p_sourceAccountID ||
                         ' to Account ' || p_targetAccountID || ' completed successfully.');

    COMMIT;
END;
/