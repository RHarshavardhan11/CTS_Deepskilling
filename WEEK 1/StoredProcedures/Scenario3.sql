-- Exercise 3 : Stored Procedures
-- Scenario 3
-- Transfer funds between accounts

CREATE OR REPLACE PROCEDURE TransferFunds(

    p_from_account IN NUMBER,
    p_to_account IN NUMBER,
    p_amount IN NUMBER

)
IS

    v_balance NUMBER;

BEGIN

    SELECT balance
    INTO v_balance
    FROM accounts
    WHERE account_id = p_from_account;

    IF v_balance >= p_amount THEN

        UPDATE accounts
        SET balance = balance - p_amount
        WHERE account_id = p_from_account;

        UPDATE accounts
        SET balance = balance + p_amount
        WHERE account_id = p_to_account;

        COMMIT;

    ELSE

        DBMS_OUTPUT.PUT_LINE('Insufficient Balance');

    END IF;

END;
/