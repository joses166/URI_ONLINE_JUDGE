SELECT
	p.name,
	cat.name
FROM
	products p
	INNER JOIN categories cat ON(p.id_categories = cat.id)
WHERE 
	p.amount > 100
	AND cat.id IN(1,2,3,6,9)
ORDER BY 
	p.name;