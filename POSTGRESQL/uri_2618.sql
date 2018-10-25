SELECT 
	pd.name,
	pv.name,
	cat.name
FROM
	categories cat
	INNER JOIN products pd ON(pd.id_categories = cat.id)
	INNER JOIN providers pv	ON(pv.id = pd.id_providers)
WHERE
	pv.name LIKE 'Sansul SA'
	AND cat.name LIKE 'Imported';