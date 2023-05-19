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
    udaljenost int, 
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


