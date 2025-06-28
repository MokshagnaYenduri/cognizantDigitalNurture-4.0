SET SERVEROUTPUT ON;

BEGIN
    FOR cust IN (SELECT customerid, name, balance, isvip FROM customers) LOOP
        IF cust.balance > 10000 THEN
            UPDATE customers
            SET isvip = 'Y'
            WHERE customerid = cust.customerid;

            DBMS_OUTPUT.PUT_LINE('Customer "' || cust.name || '" (ID: ' || cust.customerid || ') promoted to VIP. Balance: $' || cust.balance);
        END IF;
    END LOOP;

    COMMIT;
END;
/