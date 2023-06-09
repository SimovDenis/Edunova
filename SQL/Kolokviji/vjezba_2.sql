drop database if exists vjezba_2;
create database vjezba_2;
use vjezba_2;

create table svekar(
    sifra int not null primary key auto_increment,
    stilfrizura varchar(48),
    ogrlica int not null,
    asocijalno bit not null
);

create table prijatelj(
    sifra int not null primary key auto_increment,
    modelnaocala varchar(37),
    treciputa datetime not null,
    ekstrovertno bit not null,
    prviputa datetime,
    svekar int not null  
);

create table zarucnica(
    sifra int not null primary key auto_increment,
    narukvica int,
    bojakose varchar(37) not null,
    novcica decimal(15,9),
    lipa decimal(15,8) not null,
    indiferentno bit not null
);

create table decko_zarucnica(
    sifra int not null primary key auto_increment,
    decko int not null,
    zarucnica int not null
);

create table decko(
    sifra int not null primary key auto_increment,
    indiferentno bit,
    vesta varchar(34),
    asocijalno bit not null
);

create table cura(
    sifra int not null primary key auto_increment,
    haljina varchar(33) not null,
    drugiputa datetime not null,
    suknja varchar(38),
    narukvica int,
    introvertno int,
    majica varchar(40) not null,
    decko int
);

create table neprijatelj(
    sifra int not null primary key auto_increment,
    majica varchar(32),
    haljina varchar(43) not null,
    lipa decimal(16,8),
    modelnaocala varchar(49) not null,
    kuna decimal(12,6) not null,
    jmbag char(11),
    cura int
);

create table brat(
    sifra int not null primary key auto_increment,
    suknja varchar(47),
    ogrlica int not null,
    asocijalno bit not null,
    neprijatelj int not null
);

alter table prijatelj add foreign key (svekar) references svekar(sifra);
alter table decko_zarucnica add foreign key (decko) references decko(sifra);
alter table decko_zarucnica add foreign key (zarucnica) references zarucnica(sifra);
alter table cura add foreign key (decko) references decko(sifra);
alter table neprijatelj add foreign key (cura) references cura(sifra);
alter table brat add foreign key (neprijatelj) references neprijatelj(sifra);

insert into decko (asocijalno) values
(1),
(0),
(0);

insert into zarucnica (bojakose, lipa, indiferentno) values
('plava', 145.45, 1),
('smeda', 456745.33, 1),
('plava', 15675.45, 0);

insert into decko_zarucnica (decko, zarucnica) values
(1,1),
(2,3),
(3,2);

insert into cura (haljina, drugiputa, majica) values
('ljetna', '1999-01-01', 'plava'),
('cvijetni uzorak', '2023-06-01', 'duksa'),
('ljetna', '2010-11-01', 'kratki rukav');

insert into neprijatelj (haljina, modelnaocala, kuna) values
('kratka', 'okrugli', 44253.44),
('kratka', 'pilotske', 2245.54),
('ljetna', 'romb', 33.44);

update prijatelj set treciputa = '2020-04-30';

delete from brat where ogrlica != 14;

select suknja
from cura
where drugiputa is null;

select a.novcica, f.neprijatelj, e.haljina
from zarucnica a
inner join decko_zarucnica b on a.sifra = b.zarucnica
inner join decko c on c.sifra = b.decko
inner join cura d on c.sifra = d.decko
inner join neprijatelj e on d.sifra = e.cura
inner join brat f on e.sifra = f.neprijatelj
where d.drugiputa is not null and c.vesta like '%ba%'
order by e.haljina desc;

select a.vesta, a.asocijalno
from decko a
left join decko_zarucnica b on a.sifra = b.decko
where b.decko is null;
