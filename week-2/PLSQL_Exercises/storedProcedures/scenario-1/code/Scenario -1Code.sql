CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
    newBalance Accounts.Balance%TYPE;
BEGIN
    FOR acc IN (
        SELECT AccountID, Balance
        FROM Accounts
        WHERE AccountType = 'Savings'
    ) LOOP
        -- Calculate 1% interest
        newBalance := acc.Balance * 1.01;

        -- Update balance
        UPDATE Accounts
        SET Balance = newBalance,
            LastModified = SYSDATE
        WHERE AccountID = acc.AccountID;

        -- Output message
        DBMS_OUTPUT.PUT_LINE('Interest applied to Account ID: ' || acc.AccountID ||' | Old Balance: $' || acc.Balance ||'New Balance: $' || ROUND(newBalance, 2));
    END LOOP;

    COMMIT;
END;
/