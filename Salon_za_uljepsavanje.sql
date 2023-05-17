drop database if exists salon_za_uljepsavanje;
create database salon_za_uljepsavanje;
use salon_za_uljepsavanje;

create table salon(
	sifra int not null primary key auto_increment,
	naziv varchar(100) not null,
	kontakt varchar(100),
	adresa varchar(100),
	vlasnik varchar(100) not null
);

create table djelatnica(
	sifra int not null primary key auto_increment,
	iban varchar(50),
	salon int not null,
	broj_ugovora varchar(50),
	osoba int not null
);

create table korisnik(
	sifra int not null primary key auto_increment,
	osoba int,
	djelatnica int not null,
	usluga varchar(50)
);

create table usluga(
	sifra int not null primary key auto_increment,
	naziv varchar(100),
	korisnik int not null,
	cijena decimal(5,2),
	trajanje int
);

create table osoba(
	sifra int not null primary key auto_increment,
	ime varchar(50),
	prezime varchar(50),
	kontakt varchar(100)
);

alter table djelatnica add foreign key (salon) references salon(sifra);
alter table djelatnica add foreign key (osoba) references osoba(sifra);
alter table korisnik add foreign key (osoba) references osoba(sifra);
alter table korisnik add foreign key (djelatnica) references djelatnica(sifra);
alter table usluga add foreign key (korisnik) references korisnik(sifra);

insert into osoba (sifra, ime, prezime, kontakt) values
(null, 'Zoran', 'Ivić', null),
(null, 'Goran', 'Brkić', null),
(null, 'Mario', 'Vidošić', null),
(null, 'Petar', 'Zgrebec', null);

insert into salon (sifra, naziv, kontakt, adresa, vlasnik) values
(null, 'Lady', null, null, 'Đurđica Mišić'),
(null, 'Beauty', null, null, 'Stella Matković'),
(null, 'Happy', null, null, 'Karmela Tutić');

insert into djelatnica (sifra, iban, salon, broj_ugovora, osoba) values
(null, null, 1, '6989/2023', 1),
(null, null, 2, '2367/2023', 2),
(null, null, 3, '0897/2023', 3);

insert into korisnik (sifra, osoba, djelatnica, usluga) values
(null, 1, 2, 'Nokti na rukama'),
(null, 2, 3, 'Nokti na nogama'),
(null, 3, 1, 'Trepavice');

insert into usluga (sifra, naziv, korisnik, cijena, trajanje) values
(null, 'Nokti na nogama', 1, 20, 60),
(null, 'Nokti na rukama', 2, 20, 65),
(null, 'Trepavice', 2, 17, 45);
