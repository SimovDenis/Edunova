drop database if exists frizerski_salon;
create database frizerski_salon;
use frizerski_salon;

create table frizerski_salon(
	sifra int not null primary key auto_increment,
	naziv varchar(100) not null,
	adresa varchar (150),
	kontakt varchar(50),
	vlasnik varchar(50) 
);

create table djelatnica(
	sifra int not null primary key auto_increment,
	frizerski_salon int not null,
	iban varchar(50),
	osoba int not null,
	oib char(11)
);

create table korisnik(
	sifra int not null primary key auto_increment,
	osoba int not null,
	usluga varchar(100),
	djelatnica int not null
);

create table usluga(
	sifra int not null primary key auto_increment,
	tip_usluge varchar(100),
	cijena decimal(5,2),
	trajanje int,
	korisnik int not null
);

create table osoba(
	sifra int not null primary key auto_increment,
	ime varchar(50),
	prezime varchar(50),
	kontakt varchar(100)
);

alter table djelatnica add foreign key (frizerski_salon) references frizerski_salon(sifra);
alter table djelatnica add foreign key (osoba) references osoba(sifra);
alter table korisnik add foreign key (osoba) references osoba(sifra);
alter table korisnik add foreign key (djelatnica) references djelatnica(sifra);
alter table usluga add foreign key (korisnik) references korisnik(sifra);

insert into osoba(sifra, ime, prezime, kontakt) values
(null, 'Denis', 'Simov', null), 
(null, 'Marija', 'Matić', null), 
(null, 'Eva', 'Golub', null);

insert into frizerski_salon(sifra, naziv, adresa, kontakt, vlasnik) values
(null, 'Diva', 'Vl. Nazora 65, Valpovo', null, null),
(null, 'Lady', 'Ul. Matija Gupca 86, Belišće', null, null),
(null, 'Black', 'Braće Radić 16, Valpovo', null, null);

insert into djelatnica (sifra, frizerski_salon, iban, osoba, oib) values
(null, 1, null, 1, null),
(null, 2, null, 2, null),
(null, 3, null, 3, null);

insert into korisnik (sifra, osoba, usluga, djelatnica) values
(null, 1, 'Pranje kose', 2),
(null, 2, 'Bojanje', 3),
(null, 3, 'Pramenovi', 1);

insert into usluga (sifra, tip_usluge, cijena, trajanje, korisnik) values
(null, '100', 3, 15, 1),
(null, '200', 20, 120, 2),
(null, '300', 20, 150, 3);
