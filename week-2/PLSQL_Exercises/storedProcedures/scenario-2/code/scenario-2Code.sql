CREATE or  REPLACE PROCEDURE UpdateEmployeeBonus(
    p_department IN employees.department%TYPE,
    p_bonusPercentage IN NUMBER
)is 
oldSalary employees.salary%TYPE;
newSalary employees.salary%TYPE;
BEGIN
    for emp in(
        SELECT employeeid, name, salary
        from EMPLOYEES
        where DEPARTMENT = p_department
    )LOOP
    oldSalary := emp.salary;
    newSalary := oldSalary + (oldSalary*p_bonusPercentage/100);

    update employees
    set salary = newSalary
    where employeeid = emp.employeeid;

    DBMS_OUTPUT.PUT_LINE('Bonus applied to ' || emp.Name ||' (ID: ' || emp.EmployeeID || '): ' ||'Old Salary: $' || oldSalary || ' → New Salary: $' || ROUND(newSalary, 2));
    end loop;
    commit;
end;
/