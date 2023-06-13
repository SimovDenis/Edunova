drop database if exists vjezba_7;
create database vjezba_7;
use vjezba_7;

create table mladic(
    sifra int not null primary key auto_increment,
    prstena int,
    lipa decimal(14,5) not null,
    narukvica int not null,
    drugiputa datetime not null
);

create table zarucnik(
    sifra int not null primary key auto_increment,
    vesta varchar(34),
    asocijalno bit not null,
    modelnaocala varchar(43),
    narukvica int not null,
    novcica decimal(15,5) not null
);

create table zarucnik_mladic(
    sifra int not null primary key auto_increment,
    zarucnik int not null,
    mladic int not null
);

create table ostavljen(
    sifra int not null primary key auto_increment,
    lipa decimal(14,6),
    introvertno bit not null,
    kratkamajica varchar(38) not null,
    prstena int not null,
    zarucnik int
);

create table prijateljica(
    sifra int not null primary key auto_increment,
    haljina varchar(45),
    gustoca decimal(15,10) not null,
    ogrlica int,
    novcica decimal(12,5),
    ostavljen int
);

create table sestra(
    sifra int not null primary key auto_increment,
    bojakose varchar(34) not null,
    hlace varchar(36) not null,
    lipa decimal(15,6),
    stilfrizura varchar(40) not null,
    maraka decimal(12,8) not null,
    prijateljica int
);

create table cura(
    sifra int not null primary key auto_increment,
    lipa decimal(12,9) not null,
    introvertno bit,
    modelnaocala varchar(40),
    narukvica int,
    treciputa datetime,
    kuna decimal(14,9)
);

create table punica(
    sifra int not null primary key auto_increment,
    majica varchar(40),
    eura decimal(12,6) not null,
    prstena int,
    cura int not null
);

alter table zarucnik_mladic add foreign key (zarucnik) references zarucnik(sifra);
alter table zarucnik_mladic add foreign key (mladic) references mladic(sifra);
alter table ostavljen add foreign key (zarucnik) references zarucnik(sifra);
alter table prijateljica add foreign key (ostavljen) references ostavljen(sifra);
alter table sestra add foreign key (prijateljica) references prijateljica(sifra);
alter table punica add foreign key (cura) references cura(sifra);

insert into zarucnik(asocijalno, narukvica, novcica) values
(1, 145, 156.55),
(1, 19, 12.99),
(0, 1, 2256.52);

insert into mladic(lipa, narukvica, drugiputa) values
(145.22, 33, '1999-02-01'),
(2245.22, 2, '2023-06-11'),
(565.33, 11, '2002-02-01');

insert into zarucnik_mladic(zarucnik, mladic) values
(1, 1),
(1, 3),
(1, 2);

insert into ostavljen(introvertno, kratkamajica, prstena) values
(1, 'bijela', 22),
(0, 'šarena', 4),
(1, 'polo', 1);

insert into prijateljica(gustoca) values
(13.99),
(2.45),
(333.99);

update punica set eura = 15.77;

delete from sestra where hlace < 'AB';

select kratkamajica
from ostavljen
where introvertno is null;

select a.narukvica, f.stilfrizura, e.gustoca
from mladic a
inner join zarucnik_mladic b on a.sifra = b.mladic
inner join zarucnik c on c.sifra = b.zarucnik
inner join ostavljen d on c.sifra = d.zarucnik
inner join prijateljica e on d.sifra = e.ostavljen
inner join sestra f on e.sifra = f.prijateljica
where d.introvertno is not null and c.asocijalno is not null
order by e.gustoca desc;

select a.asocijalno, a.modelnaocala
from zarucnik a
left join zarucnik_mladic b on a.sifra = b.zarucnik
where b.zarucnik is null;