SELECT
name,
CAST(date_part('day', payday) AS INTEGER)
FROM
loan;