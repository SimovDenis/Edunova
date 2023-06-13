drop database if exists vjezba_3;
create database vjezba_3;
use vjezba_3;

create table brat(
    sifra int not null primary key auto_increment,
    jmbag char(11),
    ogrlica int not null,
    ekstrovertno int not null
);

create table brat_prijatelj(
    sifra int not null primary key auto_increment,
    prijatelj int not null,
    brat int not null
);

create table prijatelj(
    sifra int not null primary key auto_increment,
    kuna decimal(16,10),
    haljina varchar(37),
    lipa decimal(13,10),
    dukserica varchar(31),
    indiferentno bit not null
);

create table ostavljena(
    sifra int not null primary key auto_increment,
    kuna decimal(17,5),
    lipa decimal(15,6),
    majica varchar(36),
    modelnaocala varchar(31) not null,
    prijatelj int
);

create table snasa(
    sifra int not null primary key auto_increment,
    introvertno bit,
    kuna decimal(15,6) not null,
    eura decimal(12,9) not null,
    treciputa datetime,
    ostavljena int not null
);

create table punica(
    sifra int not null primary key auto_increment,
    asocijalno bit,
    kratkamajica varchar(44),
    kuna decimal(13,8) not null,
    vesta varchar(32) not null,
    snasa int
);

create table cura(
    sifra int not null primary key auto_increment,
    dukserica varchar(49),
    maraka decimal(13,7),
    drugiputa datetime,
    majica varchar(49),
    novcica decimal(15,8),
    ogrlica int not null
);

create table svekar(
    sifra int not null primary key auto_increment,
    novcica decimal(16,8) not null,
    suknja varchar(44) not null,
    bojakose varchar(36),
    prstena int,
    narukvica int not null,
    cura int not null
);

alter table svekar add foreign key (cura) references cura(sifra);
alter table punica add foreign key (snasa) references snasa(sifra);
alter table snasa add foreign key (ostavljena) references ostavljena(sifra);
alter table ostavljena add foreign key (prijatelj) references prijatelj(sifra);
alter table brat_prijatelj add foreign key (brat) references brat(sifra);
alter table brat_prijatelj add foreign key (prijatelj) references prijatelj(sifra);

insert into brat (ogrlica, ekstrovertno) values
('biserna', 1),
('drvena', 1),
('rucna izrada', 0);

insert into prijatelj (indiferentno) values
(1),
(0),
(1);

insert into brat_prijatelj (brat, prijatelj) values
(1,1),
(1,3),
(1,2);

insert into ostavljena (modelnaocala) values
('okrugli'),
('romb'),
('pilotske');

insert into snasa (kuna, eura, ostavljena) values
(14243.44, 235.43, 1),
(563.78, 24555.43, 2),
(345.32, 11135.44, 3);

update svekar set suknja = 'Osijek';

delete from punica where kratkamajica = 'AB';

select a.majica
from ostavljena a 
where a.lipa not in (9, 10, 20, 30, 35);

select a.ekstrovertno, f.vesta, e.kuna
from brat a
inner join brat_prijatelj b on a.sifra = b.brat
inner join prijatelj c on c.sifra = b.prijatelj
inner join ostavljena d on c.sifra = d.prijatelj
inner join snasa e on d.sifra = e.ostavljena
inner join punica f on e.sifra = f.snasa
where d.lipa != 91 and c.haljina like '%ba%'
order by e.kuna desc;

select a.haljina, a.lipa
from prijatelj a
left join brat_prijatelj b on a.sifra = b.prijatelj
where b.prijatelj is null;