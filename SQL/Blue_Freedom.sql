drop database if exists BlueFreedom;
create database BlueFreedom;
use BlueFreedom;

create table svidamise_komentar(
    sifra int not null primary key auto_increment,
    osoba int,
    komentar int
);

create table komentar (
    sifra int not null primary key auto_increment,
    vrijemekomentiranja datetime,
    opis varchar(200),
    objava int ,
    osoba int
);

create table objava (
    sifra int not null primary key auto_increment,
    naslov varchar(100),
    upis varchar(100),
    vrijemeizrade datetime,
    ipadresa varchar(150),
    osoba int
);

create table operater (
    sifra int not null primary key auto_increment,
    ime varchar(20),
    prezime varchar(30),
    email varchar(100),
    lozinka varchar(20),
    uloga varchar(50)
);

create table osoba (
    sifra int not null primary key auto_increment,
    ime varchar(20),
    prezime varchar(30),
    datumrodenja datetime,
    email varchar(100),
    lozinka varchar(20),
    brojtel int,
    administrator int,
    stanje int,
    aktivan boolean,
    uniqueid varchar(10)
);

create table svidamise (
    sifra int not null primary key auto_increment,
    vrijemesvidanja datetime,
    objava int,
    osoba int
);

alter table svidamise_komentar add foreign key (osoba) references osoba(sifra);
alter table svidamise_komentar add foreign key (komentar) references komentar(sifra);
alter table komentar add foreign key (objava) references objava(sifra);
alter table komentar add foreign key (osoba) references osoba(sifra);
alter table objava add foreign key (osoba) references osoba(sifra);
alter table svidamise add foreign key (objava) references objava(sifra);
alter table svidamise add foreign key (osoba) references osoba(sifra);