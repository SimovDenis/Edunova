drop database if exists vjezba_5;
create database vjezba_5;
use vjezba_5;

create table cura(
    sifra int not null primary key auto_increment,
    carape varchar(41) not null,
    maraka decimal(17,10) not null,
    asocijalno bit,
    vesta varchar(47) not null
);

create table svekar_cura(
    sifra int not null primary key auto_increment,
    svekar int not null,
    cura int not null  
);

create table svekar(
    sifra int not null primary key auto_increment,
    bojakose varchar(33),
    majica varchar(31),
    carape varchar(31) not null,
    haljina varchar(43),
    narukvica int,
    eura decimal(14,5) not null
);

create table punac(
    sifra int not null primary key auto_increment,
    dukserica varchar(33),
    prviputa datetime not null,
    majica varchar(36),
    svekar int not null
);

create table punica(
    sifra int not null primary key auto_increment,
    hlace varchar(43) not null,
    nausnica int not null,
    ogrlica int,
    vesta varchar(49) not null,
    modelnaocala varchar(31) not null,
    treciputa datetime not null,
    punac int not null
);

create table ostavljena(
    sifra int not null primary key auto_increment,
    majica varchar(33),
    ogrlica int not null,
    carape varchar(44),
    stilfrizura varchar(42),
    punica int not null
);

create table zarucnik(
    sifra int not null primary key auto_increment,
    jmbag char(11),
    lipa decimal(12,8),
    indiferentno bit not null
);

create table mladic(
    sifra int not null primary key auto_increment,
    kratkamajica varchar(48) not null,
    haljina varchar(30) not null,
    asocijalno bit,
    zarucnik int
);

alter table svekar_cura add foreign key (svekar) references svekar(sifra);
alter table svekar_cura add foreign key (cura) references cura(sifra);
alter table punac add foreign key (svekar) references svekar(sifra);
alter table punica add foreign key (punac) references punac(sifra);
alter table ostavljena add foreign key (punica) references punica(sifra);
alter table mladic add foreign key (zarucnik) references zarucnik(sifra);

insert into cura(carape, maraka, vesta) values
('bijele', 134.56, 'bozicna'),
('sarene', 15674.46, 'sarena'),
('crne', 46734.56, 'bijela');

insert into svekar(carape, eura) values
('bijele', 42535.3),
('crne', 1255.36),
('zute', 5435.33);

insert into svekar_cura(svekar, cura) values
(1,1),
(2,3),
(3,2);

insert into punac(prviputa, svekar) values
('1999-01-01 23:33:26', 1),
('2003-01-01 16:33:26', 2),
('2023-06-08 08:13:20', 3);

insert into punica(hlace, nausnica, modelnaocala, vesta, treciputa, punac) values
('bijele', 2, 'okrugli', 'srebrna', '2023-06-08 08:13:20', 1),
('nove', 1, 'romboidni', 'zelena', '2021-12-09 08:19:20', 2),
('plave', 2, 'police', 'zimska', '2013-06-08 18:13:21', 3);

update mladic set haljina = 'Osijek';

delete from ostavljena where ogrlica = 17;

select majica
from punac
where prviputa is null;

select a.asocijalno, f.stilfrizura, e.nausnica
from cura a
inner join svekar_cura b on a.sifra = b.cura
inner join svekar c on c.sifra = b.svekar
inner join  punac d on c.sifra = d.svekar
inner join punica e on d.sifra = e.punac
inner join ostavljena f on e.sifra = f.punica
where d.prviputa is not null and c.majica like '%ba%'
order by e.nausnica desc;

select a.majica, a.carape
from svekar a
left join svekar_cura b on a.sifra = b.svekar
where b.svekar is null;
