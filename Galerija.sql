drop database if exists galerija;
create database galerija;
use galerija;

create table galerija(
    sifra int not null primary key auto_increment,
    naziv varchar(100),
    nadredena int, 
    autor int
);

create table autor(
    sifra int not null primary key auto_increment,
    ime varchar(20),
    prezime varchar(20)
);

create table slika(
    sifra int not null primary key auto_increment,
    galerija int,
    putanja varchar(200)
);

create table slika_oznaka(
    slika int,
    oznaka int
);

create table oznaka(
    sifra int not null primary key auto_increment,
    naziv varchar(50)
);

alter table galerija add foreign key (nadredena) references galerija(sifra);
alter table galerija add foreign key (autor) references autor(sifra);
alter table slika add foreign key (galerija) references galerija(sifra);
alter table slika_oznaka add foreign key (slika) references slika(sifra);
alter table slika_oznaka add foreign key (oznaka) references oznaka(sifra);

insert into autor(sifra, ime, prezime) values
(null, 'Miladin', 'Šobić'),
(null, 'Đorđe', 'Balašević'),
(null, 'Arsen', 'Dedić');

insert into galerija(sifra, naziv, nadredena, autor) values
(null, 'Kantautori balkana', null, 1),
(null, 'Legende', null, 2),
(null, 'Pjevači', null, 3);

insert into slika (sifra, galerija, putanja) values
(null, 1, null),
(null, 2, null),
(null, 3, null);

insert into oznaka (sifra, naziv) values
(null, 'Rođendan'),
(null, 'Nešto2'),
(null, 'Nešto3');

insert into slika_oznaka (slika, oznaka) values
(3, 1),
(2, 2),
(1, 3);

update autor set prezime = 'Mikić' where sifra = 1;
update autor set prezime = 'Horvat' where sifra = 2;

delete from slika_oznaka where slika = 3;
delete from slika_oznaka where slika = 1;
