SELECT 
	pd.name,
	pv.name,
	pd.price
FROM
	products pd
	INNER JOIN providers pv ON(pd.id_providers = pv.id)
	INNER JOIN categories cat ON(cat.id = pd.id_categories)
WHERE 
	pd.price > 1000
	AND cat.name LIKE 'Super Luxury';