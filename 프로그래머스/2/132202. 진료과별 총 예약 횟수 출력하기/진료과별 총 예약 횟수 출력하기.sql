-- 코드를 입력하세요
SELECT A.진료과코드, COUNT(A.5월) AS 5월예약건수
FROM
(
    SELECT MCDP_CD '진료과코드', 
    DATE_FORMAT(APNT_YMD,'%Y-%m') AS '5월'
    FROM APPOINTMENT
) AS A
WHERE A.5월 LIKE '%05'
GROUP BY A.진료과코드
ORDER BY 5월예약건수, A.진료과코드
