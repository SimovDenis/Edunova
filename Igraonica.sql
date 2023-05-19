drop database if exists igraonica;
create database igraonica;
use igraonica;

create table djelatnik(
    sifra int not null primary key auto_increment,
    ime varchar(20),
    iban varchar(20),
    oib char(11),
    prezime varchar(20),
    radnoMjesto varchar(50)
);

create table posjeta(
    sifra int not null primary key auto_increment,
    datumVrijemeDolaska datetime,
    datumVrijemeOdlaska datetime,
    napomena varchar(150),
    djelatnik_sifra int
);

create table dijete(
    sifra int not null primary key auto_increment,
    imeRoditelja varchar(20),
    prezime varchar(20),
    telefonRoditelja varchar(20)
);

create table dijeteposjeta(
    dijete int not null,
    posjeta int not null
);

create table uslugaposjeta(
    usluga int not null,
    posjeta int not null
);

create table usluga(
    sifra int not null primary key auto_increment,
    cijena int,
    jedinicaMjere varchar(20),
    kolicina int,
    naziv varchar(50)   
);

create table operater(
    sifra int not null primary key auto_increment,
    email varchar(100),
    ime varchar(20),
    lozinka varchar(30),
    oib char(11),
    prezime varchar(20)
);

alter table posjeta add foreign key (djelatnik_sifra) references djelatnik(sifra);
alter table dijeteposjeta add foreign key (dijete) references dijete(sifra);
alter table dijeteposjeta add foreign key (posjeta) references posjeta(sifra);
alter table uslugaposjeta add foreign key (usluga) references usluga(sifra);
alter table uslugaposjeta add foreign key (posjeta) references posjeta(sifra);

insert into djelatnik (sifra, ime, iban, oib, prezime, radnoMjesto) values
(null, 'Ivan', null, null, 'Majdenić', 'Domar'),
(null, 'Ivan', null, null, 'Krunić', 'Kuhar'),
(null, 'Martina', null, null, 'Kuček', 'Teta');

insert into posjeta (sifra, datumVrijemeDolaska, datumVrijemeOdlaska, napomena, djelatnik_sifra) values
(null, '2023-05-19 08', '2023-05-19 17:45', null, 1),
(null, '2023-05-19 08:15', '2023-05-19 17', null, 2),
(null, '2023-05-19 07:25', '2023-05-19 17:15', null, 3);

insert into dijete (sifra, imeRoditelja, prezime, telefonRoditelja) values
(null, 'Vedrana', 'Matić', null),
(null, 'Uroš', 'Šikić', null),
(null, 'Marijan', 'Ston', null);

insert into usluga (sifra, cijena, jedinicaMjere, kolicina, naziv) values
(null, 15, null, 2, 'Trampolin'),
(null, 15, null, 2, 'Tobogan'),
(null, 30, null, 1, 'Laser tag');

insert into dijeteposjeta (dijete, posjeta) values
(1, 3),
(2, 1),
(3, 2);

insert into uslugaposjeta (usluga, posjeta) values
(1, 2),
(2, 1),
(3, 3);

insert into operater (sifra, email, ime, lozinka, oib, prezime) values
(null, null, 'Krešimir', '1234', null, 'Katić'),
(null, null, 'Mile', '4321', null, 'Horvat'),
(null, null, 'Andrej', '0000', null, 'Šimić');

update djelatnik set ime = 'Štef' where sifra = 2;
update posjeta set datumVrijemeDolaska = '2023-05-19 08:20' where sifra = 2;
update operater set email = 'kresimir.katic1234@gmail.com' where lozinka = 1234;

delete from dijeteposjeta where dijete = 2;
delete from uslugaposjeta where usluga = 2;
delete from posjeta where sifra = 1;
