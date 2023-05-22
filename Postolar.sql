# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < D:\GitHub\SQL_Vjezba\Postolar.sql

drop database if exists postolar;
create database postolar;
use postolar;

create table postolar(
    sifra int not null primary key auto_increment,
    osoba int not null,
    iban varchar(30),
    naziv_obrta varchar(30)
);

create table popravak(
    sifra int not null primary key auto_increment,
    vrsta_popravka varchar(30),
    postolar int,
    segrt int,
    obuca int,
    cijena decimal(6,2)
);

create table obuca(
    sifra int not null primary key auto_increment,
    naziv varchar(40),
    boja varchar(20),
    starost int,
    korisnik int
);

create table korisnik(
    sifra int not null primary key auto_increment,
    osoba int
);

create table segrt(
    sifra int not null primary key auto_increment,
    osoba int not null,
    datum_pocetka_rada date,
    broj_ugovora varchar(20)
);

create table osoba(
    sifra int not null primary key auto_increment,
    ime varchar(20),
    prezime varchar(20),
    oib char(11)
);

alter table postolar add foreign key (osoba) references osoba(sifra);
alter table popravak add foreign key (postolar) references postolar(sifra);
alter table popravak add foreign key (segrt) references segrt(sifra);
alter table popravak add foreign key (obuca) references obuca(sifra);
alter table obuca add foreign key (korisnik) references korisnik(sifra);
alter table korisnik add foreign key (osoba) references osoba(sifra);
alter table segrt add foreign key (osoba) references osoba(sifra);

insert into osoba (sifra, ime, prezime, oib) values
(null, 'Josip', 'Šobić', 64622497144),
(null, 'Barbara', 'Milić', 24622497157),
(null, 'Martin', 'Mužar', 54665997144);

insert into korisnik (sifra, osoba) values
(null, 3),
(null, 2),
(null, 1);

insert into postolar (sifra, osoba, iban, naziv_obrta) values
(null, 1, null, 'Patika'),
(null, 2, null, 'Moja Štikla'),
(null, 3, null, 'Korak');

insert into segrt (sifra, osoba, datum_pocetka_rada, broj_ugovora) values
(null, 1, '2019-06-07', '1456-2019'),
(null, 2, '2012-03-28', '9987-2012'),
(null, 3, '2020-12-01', '4655-2020');

insert into obuca (sifra, naziv, boja, starost, korisnik) values
(null, 'Nike Air', 'Bijelo-Crvena', 20, 2),
(null, 'Reebok', 'Žuta', 2, 3),
(null, 'Adidas', 'Crna', 1, 2);

insert into popravak (sifra, vrsta_popravka, postolar, segrt, obuca, cijena) values
(null, 'Bojanje', 1, null, 2, 50.55),
(null, 'Krpanje', null, 2, 1, 18.45),
(null, 'Zamjena konca na đonu', null, 3, 3, 10);

update popravak set postolar = 2, segrt = null where sifra = 2;
update osoba set oib = 87556981120 where sifra = 1;
update segrt set datum_pocetka_rada = '2019-06-17' where sifra = 1;


