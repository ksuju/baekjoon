-- 코드를 입력하세요
SELECT A.*
FROM
    (SELECT I.ANIMAL_ID, I.ANIMAL_TYPE, I.NAME
     FROM ANIMAL_INS I
    WHERE I.SEX_UPON_INTAKE LIKE('Intact%')) AS A
JOIN ANIMAL_OUTS O ON A.ANIMAL_ID = O.ANIMAL_ID
WHERE O.SEX_UPON_OUTCOME LIKE 'Neutered%'
OR O.SEX_UPON_OUTCOME LIKE 'Spayed%'