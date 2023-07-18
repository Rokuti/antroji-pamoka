SELECT * FROM uzsakymai u 
JOIN klientai on u.kliento_id = klientai.id;

SELECT *
from uzsakymai u
join uzsakymo_produktai up on u.id = up.uzsakymo_id
join produktai p on up.produkto_id = p.id
JOIN klientai k on k.id = u.kliento_id;

SELECT * FROM uzsakymai u join klientai k on u.kliento_id = k.id
WHERE k.pavadinimas = 'Apex';

SELECT u.id, u.data, u.kliento_id 
FROM uzsakymai u join klientai k on u.kliento_id = k.id 
WHERE k.pavadinimas = 'Apex';

SELECT up.produkto_id, p.pavadinimas, p.kaina, up.kiekis
FROM uzsakymai u 
join uzsakymo_produktai up on u.id = up.uzsakymo_id
join produktai p on up.produkto_id = p.id
WHERE u.id = 1006;

SELECT p.pavadinimas, p.kaina, up.kiekis, p.kaina * up.kiekis as bendra_kaina
FROM uzsakymai u 
join uzsakymo_produktai up on u.id = up.uzsakymo_id
join produktai p on up.produkto_id = p.id
WHERE u.id = 1007
ORDER BY up.kiekis ASC;

SELECT p.pavadinimas, up.produkto_id, up.kiekis
FROM uzsakymai u 
join uzsakymo_produktai up on u.id = up.uzsakymo_id
join produktai p on up.produkto_id = p.id
WHERE u.data = '2023-07-11'

SELECT p.id, p.pavadinimas, p.kaina, up.kiekis, k.pavadinimas, u.data, u.id
from uzsakymai u
join uzsakymo_produktai up on u.id = up.uzsakymo_id
join produktai p on up.produkto_id = p.id
JOIN klientai k on k.id = u.kliento_id
WHERE k.valstija = 'WA';

SELECT SUM(p.kaina* up.kiekis) AS BENDRA_KAINA
FROM uzsakymai u 
join uzsakymo_produktai up on u.id = up.uzsakymo_id
join produktai p on up.produkto_id = p.id
WHERE u.id = 1006;
