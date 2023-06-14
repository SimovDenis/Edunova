drop database if exists vjezba_8;
create database vjezba_8;
use vjezba_8;

create table decko(
    sifra int not null primary key auto_increment,
    kuna decimal(12,10),
    lipa decimal(17,10),
    bojakose varchar(44),
    treciputa datetime not null,
    ogrlica int not null,
    ekstrovertno bit not null
);

create table muskarac(
    sifra int not null primary key auto_increment,
    haljina varchar(47),
    drugiputa datetime not null,
    treciputa datetime
);

create table muskarac_decko(
    sifra int not null primary key auto_increment,
    muskarac int not null,
    decko int not null
);

create table becar(
    sifra int not null primary key auto_increment,
    eura decimal(15,10) not null,
    treciputa datetime,
    prviputa datetime,
    muskarac int
);

create table neprijatelj(
    sifra int not null primary key auto_increment,
    kratkamajica varchar(44),
    introvertno bit,
    indiferentno bit,
    ogrlica int not null,
    becar int not null
);

create table brat(
    sifra int not null primary key auto_increment,
    introvertno bit,
    novcica decimal(14,7) not null,
    treciputa datetime,
    neprijatelj int
);

create table prijateljica(
    sifra int not null primary key auto_increment,
    vesta varchar(50),
    nausnica int not null,
    introvertno bit not null
);

create table cura(
    sifra int not null primary key auto_increment,
    nausnica int not null,
    indiferentno bit,
    ogrlica int not null,
    gustoca decimal(12,6),
    drugiputa datetime,
    vesta varchar(33),
    prijateljica int
);

alter table muskarac_decko add foreign key (muskarac) references muskarac(sifra);
alter table muskarac_decko add foreign key (decko) references decko(sifra);
alter table becar add foreign key (muskarac) references muskarac(sifra);
alter table neprijatelj add foreign key (becar) references becar(sifra);
alter table brat add foreign key (neprijatelj) references neprijatelj(sifra);
alter table cura add foreign key (prijateljica) references prijateljica(sifra);

insert into muskarac(drugiputa) values
('1988-01-01 19:32:33'),
('1999-01-31 01:33:19'),
('1928-11-01 22:20:56');

insert into decko(treciputa, ogrlica, ekstrovertno) values
('2002-05-01', 3, 1),
('2007-12-11', 22, 1),
('2023-05-30', 100, 0);

insert into muskarac_decko(muskarac, decko) values
(1, 1),
(2, 3),
(2, 2);

insert into becar(prviputa, eura) values
('1928-11-01 19:32:33', 123.33),
(null, 4539.01),
(null, 3343.28);

insert into neprijatelj(ogrlica, becar) values
(11, 1),
(4, 3),
(203, 2);

update cura set indiferentno = false;

delete from brat where novcica != 12.75;

select prviputa
from becar
where treciputa is null;

select a.bojakose, f.neprijatelj, e.introvertno
from decko a
inner join muskarac_decko b on a.sifra = b.decko
inner join muskarac c on c.sifra = b.muskarac
inner join becar d on c.sifra = d.muskarac
inner join neprijatelj e on d.sifra = e.becar
inner join brat f on e.sifra = f.neprijatelj
where d.treciputa is not null and c.drugiputa is not null
order by e.introvertno desc;

select a.drugiputa, a.treciputa
from muskarac a
left join muskarac_decko b on a.sifra = b.muskarac
where b.muskarac is null;