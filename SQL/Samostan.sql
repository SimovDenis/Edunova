drop database if exists samostan;
create database samostan;
use samostan;

create table samostan(
    sifra int not null primary key auto_increment,
    naziv varchar(100),
    adresa varchar(100),
    kontakt varchar(100),
    iban varchar(50)
);

create table nadredeni_svecenik(
    sifra int not null primary key auto_increment,
    osoba int not null,
    broj_podredenih_svecenika int
);

create table svecenik(
    sifra int not null primary key auto_increment,
    samostan int not null,
    nadredeni_svecenik int not null,
    osoba int not null
);

create table posao(
    sifra int not null primary key auto_increment,
    naziv varchar(100),
    trajanje int
);

create table osoba(
    sifra int not null primary key auto_increment,
    ime varchar(20),
    prezime varchar(20),
    datum_zaredenja date
);

create table zaduzeni_svecenik(
    svecenik int,
    posao int
);

alter table svecenik add foreign key (samostan) references samostan(sifra);
alter table svecenik add foreign key (nadredeni_svecenik) references nadredeni_svecenik(sifra);
alter table svecenik add foreign key (osoba) references osoba(sifra);
alter table zaduzeni_svecenik add foreign key (svecenik) references svecenik(sifra);
alter table zaduzeni_svecenik add foreign key (posao) references posao(sifra);
alter table nadredeni_svecenik add foreign key (osoba) references osoba(sifra);

insert into osoba(sifra, ime, prezime, datum_zaredenja) values
(null, 'Darko', 'Lazić', '2009-04-13'),
(null, 'Goran', 'Stipan', null),
(null, 'Tomo', 'Vuk', '2009-04-13');

insert into samostan(sifra, naziv, adresa, kontakt, iban) values
(null, 'Dubrava', null, null, null),
(null, 'Klarisa', null, null, null),
(null, 'Marijine sestre', null, null, null);

insert into nadredeni_svecenik (sifra, osoba, broj_podredenih_svecenika) values
(null, 1, 5),
(null, 2, 10),
(null, 3, 2);

insert into svecenik (samostan, nadredeni_svecenik, osoba) values
(1, 2, 3),
(2, 3, 2),
(3, 1, 1);

insert into posao (sifra, naziv, trajanje) values
(null, 'Vođenje vjeronauka osnovnoškolcima', 90),
(null, 'Vođenje vjeronauka srednjoškolcima', 40),
(null, 'Organizacija financija', null);

insert into zaduzeni_svecenik (svecenik, posao) values
(1, 2),
(2, 3),
(3, 1);
