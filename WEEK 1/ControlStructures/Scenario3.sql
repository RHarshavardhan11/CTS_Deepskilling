-- Print reminder for loans due within next 30 days

BEGIN

    FOR rec IN (

        SELECT customer_id, loan_id, due_date
        FROM loans
        WHERE due_date <= SYSDATE + 30

    ) LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan '
            || rec.loan_id
            || ' for Customer '
            || rec.customer_id
            || ' is due on '
            || rec.due_date
        );

    END LOOP;

END;
/