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
