# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < D:\GitHub\Edunova\Kostrukcija_zupanije.sql

drop database if exists konstrukcija_zupanije;
create database konstrukcija_zupanije;
use konstrukcija_zupanije;

create table zupanija(
    sifra int not null primary key auto_increment,
    naziv varchar(100),
    zupan int
);

create table zupan(
    sifra int not null primary key auto_increment,
    ime varchar(30),
    prezime varchar(50)
);

create table opcina(
    sifra int not null primary key auto_increment,
    zupanija int,
    naziv varchar(100)
);

create table mjesto(
    sifra int not null primary key auto_increment,
    opcina int,
    naziv varchar(100)
);

alter table zupanija add foreign key (zupan) references zupan(sifra);
alter table opcina add foreign key (zupanija) references zupanija(sifra);
alter table mjesto add foreign key (opcina) references opcina(sifra);

# Osječko-Baranjska
insert into zupan(ime, prezime) values ('Ivan', 'Anušić');
insert into zupanija(naziv, zupan) values ('Osječko-Baranjska', 1);

insert into opcina(zupanija, naziv) values 
(1, 'Belišće'),
(1, 'Valpovo'),
(1, 'Petrijevci'),
(1, 'Vuka'),
(1, 'Čepin'),
(1, 'Bilje');

insert into mjesto(opcina, naziv) values
(1, 'Belišće'),
(1, 'Tiborjanci'),
(1, 'Gat'),
(2, 'Valpovo'),
(2, 'Šag'),
(2, 'Marjančaci'),
(3, 'Petrijevci'),
(3, 'Satnica'),
(4, 'Vuka'),
(4, 'Hrastovac'),
(5, 'Čepin'),
(6, 'Bilje');

# Grad Zagreb
insert into zupan(ime, prezime) values ('Tomislav', 'Tomašević');
insert into zupanija(naziv, zupan) values ('Grad Zagreb', 2);

insert into opcina(zupanija, naziv) values 
(2, 'Bistra'),
(2, 'Brckovljani'),
(2, 'Brdovec'),
(2, 'Dubravica'),
(2, 'Jakovlje'),
(2, 'Kravarsko');

insert into mjesto(opcina, naziv) values
(7, 'Bukovje Bistransko'),
(7, 'Donja Bistra'),
(7, 'Gornja Bistra'),
(8, 'Brckovljani'),
(8, 'Donje Dvorišće'),
(8, 'Gornje Dvorišće'),
(8, 'Gračec'),
(9, 'Brdovec'),
(9, 'Donji Laduč'),
(10, 'Dubravica'),
(11, 'Igrišće'),
(12, 'Čakanec');

# Vukovarsko-Srijemska
insert into zupan(ime, prezime) values ('Damir', 'Dekanić');
insert into zupanija(naziv, zupan) values ('Vukovarsko-Srijemska', 3);

insert into opcina(zupanija, naziv) values 
(3, 'Borovo'),
(3, 'Gunja'),
(3, 'Trpinja'),
(3, 'Andrijaševci'),
(3, 'Babina Greda'),
(3, 'Tovarnik');

insert into mjesto(opcina, naziv) values
(13, 'Borovo'),
(14, 'Gunja'),
(15, 'Bobota'),
(15, 'Trpinja'),
(15, 'Vera'),
(15, 'Ćelije'),
(15, 'Pačetin'),
(16, 'Rokovci'),
(16, 'Andrijaševci'),
(17, 'Babina Greda'),
(18, 'Ilača'),
(18, 'Tovarnik');

# Promjena imena mjesta i brisanje općina
update mjesto set naziv = 'Kitišanci' where naziv = 'Belišće';
update mjesto set naziv = 'Vinogradci' where naziv = 'Tiborjanci';
update mjesto set naziv = 'Veliškovci' where naziv = 'Gat';
update mjesto set naziv = 'Oborovo Bistransko' where naziv = 'Bukovje Bistransko';
update mjesto set naziv = 'Novaki Bistranski' where naziv = 'Donja Bistra';

delete from mjesto where naziv = 'Valpovo';
delete from mjesto where naziv = 'Marjančaci';
delete from mjesto where naziv = 'Šag';
delete from opcina where naziv = 'Valpovo';

delete from mjesto where naziv = 'Babina Greda';
delete from opcina where naziv = 'Babina Greda';

