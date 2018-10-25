SELECT 
	regexp_replace(LPAD(np.cpf, 11),'([0-9]{3})([0-9]{3})([0-9]{3})','\1.\2.\3-')
FROM
	customers c
	INNER JOIN natural_person np ON(c.id = np.id_customers);