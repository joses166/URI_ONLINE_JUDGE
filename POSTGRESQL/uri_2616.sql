select 
	c.id, 
	c.name 
from customers c 

where not exists (select id_customers from locations where id_customers = c.id);
