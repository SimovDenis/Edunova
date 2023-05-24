drop database if exists dvd;
create database dvd;
use dvd;

create table korisnik(
    sifra int not null primary key auto_increment,
    ime varchar(20),
    prezime varchar(20),
    email varchar(100)
);

create table obrazac(
    sifra int not null primary key auto_increment,
    korisnik int,
    dvd_email varchar(100),
    napomena varchar(200)
);

create table fotografija(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    datum_objave datetime
);

create table vijest(
    sifra int not null primary key auto_increment,
    naslov varchar(100),
    tijelo varchar(500),
    datum_objave datetime
);

create table dogadaj(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    pocetak datetime,
    zavrsetak datetime
);

create table foto_korisnik(
    fotografija int,
    korisnik int
);

create table dogadaj_korisnik(
    dogadaj int,
    korisnik int
);

create table vijest_korisnik(
    vijest int,
    korisnik int
);

alter table foto_korisnik add foreign key (fotografija) references fotografija(sifra);
alter table foto_korisnik add foreign key (korisnik) references korisnik(sifra);
alter table obrazac add foreign key (korisnik) references korisnik(sifra);
alter table dogadaj_korisnik add foreign key (dogadaj) references dogadaj(sifra);
alter table dogadaj_korisnik add foreign key (korisnik) references korisnik(sifra);
alter table vijest_korisnik add foreign key (vijest) references vijest(sifra);
alter table vijest_korisnik add foreign key (korisnik) references korisnik(sifra);
