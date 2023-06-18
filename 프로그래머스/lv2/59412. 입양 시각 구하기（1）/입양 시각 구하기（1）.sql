SELECT HOUR(DATETIME) 'HOUR', COUNT(DATETIME) COUNT
FROM ANIMAL_OUTS
GROUP BY HOUR
HAVING HOUR BETWEEN '09' AND '19'
ORDER BY HOUR;