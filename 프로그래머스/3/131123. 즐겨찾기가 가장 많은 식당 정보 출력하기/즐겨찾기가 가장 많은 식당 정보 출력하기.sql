-- 코드를 입력하세요
SELECT R.FOOD_TYPE, R.REST_ID, R.REST_NAME, R.FAVORITES
FROM REST_INFO R
JOIN (
    SELECT FOOD_TYPE, MAX(FAVORITES) AS MAX_FAVORITES
    FROM REST_INFO
    GROUP BY FOOD_TYPE
) AS M ON R.FOOD_TYPE = M.FOOD_TYPE AND R.FAVORITES = M.MAX_FAVORITES
ORDER BY R.FOOD_TYPE DESC;