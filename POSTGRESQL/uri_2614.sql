SELECT
	c.name,
	r.rentals_date
FROM
	customers c
	INNER JOIN rentals r ON(c.id = r.id_customers)
WHERE
	date_part('month', r.rentals_date) = 9
	AND date_part('year', r.rentals_date) = 2016;