SELECT 
	m.id,
	m.name
FROM
	movies m
	INNER JOIN genres g ON(g.id = m.id_genres)
	INNER JOIN movies_actors ma ON(ma.id_movies = m.id)
	INNER JOIN actors a ON(a.id = ma.id_actors)
WHERE
	a.name LIKE 'Marcelo Silva'
	OR a.name LIKE 'Miguel Silva'
	AND g.description LIKE 'Action';

