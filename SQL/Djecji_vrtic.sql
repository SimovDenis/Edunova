drop database if exists djecji_vrtic;
create database djecji_vrtic;
use djecji_vrtic;

create table vrtic(
	sifra int not null primary key auto_increment,
	naziv varchar(80) not null,
	adresa varchar(100),
	kontakt varchar(50),
	privatan boolean
);

create table odgojna_skupina(
	sifra int not null primary key auto_increment,
	naziv varchar(30) not null,
	max_djece int,
	boja varchar(15),
	odgajateljica int not null,
	vrtic int
);

create table odgajateljica (
	sifra int not null primary key auto_increment,
	osoba int not null,
	strucna_sprema int,
	iban varchar(50),
	kontakt varchar(100),
	broj_ugovora varchar(35)
);

create table strucna_sprema(
	sifra int not null primary key auto_increment,
	vrsta varchar(50),
	mjesto_obuke varchar(30),
	datum_obuke date
);

create table osoba(
	sifra int not null primary key auto_increment,
	ime varchar(30),
	prezime varchar(30),
	oib char(11)
);

create table dijete(
	sifra int not null primary key auto_increment,
	osoba int not null,
	odgojna_skupina int not null,
	dob int,
	kontakt_skrbnika varchar(100)
);

alter table odgojna_skupina add foreign key (odgajateljica) references odgajateljica(sifra);
alter table dijete add foreign key (odgojna_skupina) references odgojna_skupina(sifra);
alter table dijete add foreign key (osoba) references osoba(sifra);
alter table odgajateljica add foreign key (osoba) references osoba(sifra);
alter table odgajateljica add foreign key (strucna_sprema) references strucna_sprema(sifra);
alter table odgojna_skupina add foreign key (vrtic) references vrtic(sifra);

insert into osoba(sifra, ime, prezime, oib) values
(null, 'Jana', 'Brčić', null),
(null, 'Ivo', 'Andrić', null),
(null, 'Fran', 'Primorac', null);

insert into strucna_sprema (sifra, vrsta, mjesto_obuke, datum_obuke) values
(null, null, 'Osijek', '1998-06-11'),
(null, null, 'Osijek', '2001-05-02'),
(null, null, 'Zagreb', '2010-11-21');

insert into odgajateljica (sifra, osoba, strucna_sprema, iban, kontakt, broj_ugovora) values
(null, 1, 1, null, null, '59-1998'),
(null, 2, 2, null, null, '245-2001'),
(null, 2, 2, null, null, '6452-2010');

insert into vrtic (sifra, naziv, adresa, kontakt, privatan) values
(null, 'Maslačak', null, null, false),
(null, 'Maza', null, null, true),
(null, 'Leptir', null, null, false);

insert into odgojna_skupina (sifra, naziv, max_djece, boja, odgajateljica, vrtic) values
(null, 'Medvjedići', 25, 'Plava', 1, 1),
(null, 'Leptirići', 25, 'Zelena', 2, 2),
(null, 'Slonići', 25, 'Crvena', 3, 3);

insert into dijete (sifra, osoba, odgojna_skupina, dob, kontakt_skrbnika) values
(null, 1, 1, 4, null),
(null, 2, 3, 6, null),
(null, 3, 2, 3, null);
