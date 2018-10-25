(SELECT
	name,
	customers_number
FROM
	lawyers
WHERE
	customers_number = (SELECT MIN(customers_number) FROM lawyers) OR
	customers_number = (SELECT MAX(customers_number) FROM lawyers)
ORDER BY
	name ASC)	
UNION ALL
	(SELECT 'Average', AVG(customers_number)::INTEGER FROM lawyers) 