SELECT
	pd.name
FROM
	providers pv
	INNER JOIN products pd ON(pd.id_providers = pv.id)
WHERE
	pd.amount BETWEEN 10 AND 20
	AND pv.name LIKE 'P%';
	