-- 코드를 작성해주세요
SELECT COUNT(*) AS FISH_COUNT
FROM (
    SELECT IFNULL(LENGTH,'NULL') AS AA
    FROM FISH_INFO
) AS A
WHERE A.AA = 'NULL'

