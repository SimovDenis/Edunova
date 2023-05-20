drop database if exists taksi_sluzba;
create database taksi_sluzba;
use taksi_sluzba;

create table tvrtka(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    vlasnik varchar(50),
    adresa varchar(100)
);

create table vozilo(
    sifra int not null primary key auto_increment,
    tip varchar(50),
    tvrtka int,
    boja varchar(30)
);

create table vozac(
    sifra int not null primary key auto_increment,
    vozilo int not null,
    putnik int,
    osoba int
);

create table voznja(
    sifra int not null primary key auto_increment,
    udaljenost decimal(3,1), 
    trajanje int,
    cijena int,
    ocjena int
);

create table putnik(
    sifra int not null primary key auto_increment,
    osoba int
);

create table klijent(
    putnik int,
    voznja int
);

create table osoba(
    sifra int not null primary key auto_increment,
    ime varchar(20),
    prezime varchar(20)
);

alter table vozilo add foreign key (tvrtka) references tvrtka(sifra);
alter table vozac add foreign key (vozilo) references vozilo(sifra);
alter table vozac add foreign key (putnik) references putnik(sifra);
alter table vozac add foreign key (osoba) references osoba(sifra);
alter table putnik add foreign key (osoba) references osoba(sifra);
alter table klijent add foreign key (putnik) references putnik(sifra);
alter table klijent add foreign key (voznja) references voznja(sifra);

insert into osoba (sifra, ime, prezime) values
(null, 'Barbara', 'Glović'),
(null, 'Tina', 'Vukov'),
(null, 'Bruno', 'Milić');

insert into tvrtka (sifra, naziv, vlasnik, adresa) values
(null, 'Brzi i žestoki', 'Vin Benzin', null),
(null, 'Puma', 'Usain Bolt', null),
(null, 'Europa', 'Ivan Goranić', null);

insert into vozilo (sifra, tip, tvrtka, boja) values
(null, 'Škoda Octavia', 1, 'Plava'),
(null, 'Ford Focus', 2, 'Crvena'),
(null, 'Volvo D40', 3, 'Žuta');

insert into putnik (sifra, osoba) values
(null, 1),
(null, 3),
(null, 2);

insert into voznja (sifra, udaljenost, trajanje, cijena, ocjena) values
(null, 20, 20, 10, 5),
(null, 3.5, 10, 10, 3),
(null, 6, 12, 11, 5);

insert into vozac (sifra, vozilo, putnik, osoba) values
(null, 2, 3, 1),
(null, 1, 2, 3),
(null, 3, 2, 1);

insert into klijent (putnik, voznja) values
(2, 3),
(1, 1),
(3, 3);


