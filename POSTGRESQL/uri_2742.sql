SELECT
	l.name,
	round((l.omega * 1.618), 3) AS "Fator N"
FROM
	dimensions d
	INNER JOIN life_registry l ON(d.id = l.dimensions_id)
WHERE
	l.name LIKE 'Richard%'
	AND (d.name LIKE 'C875'	OR d.name LIKE 'C774')