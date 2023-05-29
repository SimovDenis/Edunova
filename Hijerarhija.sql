drop database if exists hijerarhija;
create database hijerarhija;
use hijerarhija;

create table zaposlenik(
    sifra int not null primary key auto_increment,
    ime varchar(20),
    prezime varchar(20),
    placa int,
    nadredeni int
);

alter table zaposlenik add foreign key (nadredeni) references zaposlenik(sifra);

insert into zaposlenik (sifra, ime, prezime, placa, nadredeni) values
(100, 'Ante', 'Gotovan', 10000, null),
(101, 'Ante', 'Mirkotić', 9000, 100),
(102, 'Marin', 'Ivić', 9000, 101),
(103, 'Artur', 'Skolnik', 8500, 101);

update zaposlenik set placa = 9500
where sifra = 101;




