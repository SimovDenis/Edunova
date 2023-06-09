drop database if exists vjezba_6;
create database vjezba_6;
use vjezba_6;

create table punac(
    sifra int not null primary key auto_increment,
    ekstrovertno bit not null,
    suknja varchar(30) not null,
    majica varchar(40) not null,
    prviputa datetime not null
);

create table svekrva(
  sifra int not null primary key auto_increment,
  hlace varchar(48) not null,
  suknja varchar(42) not null,
  ogrlica int not null,
  treciputa datetime not null,
  dukserica varchar(32) not null,
  narukvica int not null,
  punac int  
);

create table ostavljena(
    sifra int not null primary key auto_increment,
    prviputa datetime not null,
    kratkamajica varchar(39) not null,
    drugiputa datetime,
    maraka decimal(14,10)
);

create table prijatelj(
    sifra int not null primary key auto_increment,
    haljina varchar(35),
    prstena int not null,
    introvertno bit,
    stilfrizura varchar(36)
);

create table prijatelj_ostavljena(
    sifra int not null primary key auto_increment,
    prijatelj int not null,
    ostavljena int not null
);

create table brat(
    sifra int not null primary key auto_increment,
    nausnica int not null,
    treciputa datetime not null,
    narukvica int not null,
    hlace varchar(31),
    prijatelj int
);

create table zena(
    sifra int not null primary key auto_increment,
    novcica decimal(14,8) not null,
    narukvica int not null,
    dukserica varchar(40) not null,
    haljina varchar(30),
    hlace varchar(32),
    brat int not null
);

create table decko(
    sifra int not null primary key auto_increment,
    prviputa datetime,
    modelnaocala varchar(41),
    nausnica int,
    zena int not null
);

alter table svekrva add foreign key (punac) references punac(sifra);
alter table prijatelj_ostavljena add foreign key (prijatelj) references prijatelj(sifra);
alter table prijatelj_ostavljena add foreign key (ostavljena) references ostavljena(sifra);
alter table brat add foreign key (prijatelj) references prijatelj(sifra);
alter table zena add foreign key (brat) references brat(sifra);
alter table decko add foreign key (zena) references zena(sifra);

insert into prijatelj(prstena) values
(2),
(68),
(22);

insert into ostavljena(prviputa, kratkamajica) values
('2002-10-21', 'nova'),
('2022-06-01', 'polo'),
('1999-11-29', 'bijela');

insert into prijatelj_ostavljena(prijatelj, ostavljena) values
(1,1),
(1,3),
(1,2);

insert into brat(nausnica, treciputa, narukvica) values
(12, '1979-01-01', 1),
(4, '2002-01-01', 44),
(8, '1990-01-01', 98);

insert into zena(novcica, narukvica, dukserica, brat) values
(14.33, 5, 'plava', 1),
(1678.31, 15, 'bijela', 2),
(1444.33, 1, 'zimska', 3);

update svekrva set suknja = 'Osijek';

delete from decko where modelnaocala < 'AB';

select narukvica
from brat
where treciputa is null;

select a.drugiputa, f.zena, e.narukvica
from ostavljena a
inner join prijatelj_ostavljena b on a.sifra = b.ostavljena
inner join prijatelj c on b.prijatelj = c.sifra
inner join brat d on c.sifra = d.prijatelj
inner join zena e on b.sifra = e.brat
inner join decko f on e.sifra = f.zena
where d.treciputa is not null and c.prstena = 219
order by e.narukvica desc;

select a.prstena, a.introvertno
from prijatelj a
left join prijatelj_ostavljena b on a.sifra = b.prijatelj
where b.prijatelj is null;
