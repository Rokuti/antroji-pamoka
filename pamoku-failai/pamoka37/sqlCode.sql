create table prekes (
    id int unsigned zerofill not null auto_increment,
    pavadinimas varchar(200) not null,
    kaina decimal(10,2) unsigned,
    kiekis_sandelyje int unsigned not null default 0,
    kategorija varchar(100),
    primary key(id)
);

insert into prekes (
id,
    pavadinimas,
    kaina,
    kiekis_sandelyje,
    kategorija
)
VALUES(
null,
    'akiniai',
    12.99,
    900,
    'aksesuarai'
),(
null,
    'arbuzas',
    4.99,
    10,
    'darzoves'
);

insert into knygos(	id,
                   pavadinimas,
                   leidimo_metai,
                   kaina,
                   kisbn,
                   autorius	)
                   VALUES (
                   null,
                   'odiseja',
                   1899,
                   18.99,
                   8.9,
                   'dzordanas'),(
                   null,
                   'banga',
                   1999,
                   29.99,
                   7.9,
                   'jura');

                   truncate table knygos;