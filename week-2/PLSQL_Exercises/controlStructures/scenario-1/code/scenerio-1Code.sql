DECLARE
    customerAge NUMBER;
BEGIN
    for cust in (select customerid, dob from customers) loop
        customerAge := floor(months_between(sysdate, cust.dob)/12);
        if customerAge >= 60 then
            update loans
            set interestrate = interestrate - 1
            where customerid = cust.customerid;
            DBMS_OUTPUT.PUT_LINE('Discount applied to Customer ID: ' || cust.CustomerID);
        end if;
    end loop;
    commit;
END;
/