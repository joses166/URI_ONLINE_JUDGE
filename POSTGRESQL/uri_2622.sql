SELECT
	c.name
FROM
	customers c
	LEFT OUTER JOIN legal_person lp ON(c.id = lp.id_customers)
WHERE
	lp.id_customers IS NOT NULL;