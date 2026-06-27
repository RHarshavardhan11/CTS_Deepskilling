-- Exercise 3 : Stored Procedures
-- Scenario 1
-- Process monthly interest for savings accounts

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest
IS
BEGIN

    FOR rec IN (
        SELECT account_id, balance
        FROM accounts
        WHERE account_type = 'SAVINGS'
    ) LOOP

        UPDATE accounts
        SET balance = balance + (rec.balance * 0.01)
        WHERE account_id = rec.account_id;

    END LOOP;

    COMMIT;

END;
/