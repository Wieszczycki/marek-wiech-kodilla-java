#dodanie nowego postu do POSTS (dostał ID=9)
INSERT INTO POSTS (USER_ID, BODY)
VALUES (4, "And nothing else matters");
COMMIT;
SELECT * FROM POSTS;

#modyfikacja BODY nowego postu na "To delete"
UPDATE POSTS
SET BODY = "To delete"
WHERE ID = 9;
COMMIT;
SELECT * FROM POSTS;

#usunięcie nowego postu
DELETE FROM POSTS
WHERE ID = 9;
COMMIT;
SELECT * FROM POSTS;