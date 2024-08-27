-- 코드를 작성해주세요
SELECT ROUND(AVG(TB.A),2) AS AVERAGE_LENGTH
FROM (
    SELECT IFNULL(LENGTH,10) AS A
    FROM FISH_INFO
) TB