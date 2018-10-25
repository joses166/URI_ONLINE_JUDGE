SELECT
	name,
	o.id
FROM
	customers c
	INNER JOIN orders o ON(c.id = o.id_customers)
WHERE 
	date_part('month', o.orders_date) <= 6;