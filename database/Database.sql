use ghumantey;
create table car(
Carphoneno varchar(11) not null,
constraint pk_car primary key(Carphoneno),
carstartingpoint varchar(50),
carendingpoint varchar(50),
cararrivaldate varchar(50),
cardeparturedate varchar(50));



create table bus(
Busphoneno varchar(11) not null,
constraint pk_bus primary key(Busphoneno),
busstartingpoint varchar(50),
busendingpoint varchar(50),
busarrivaldate varchar(50),
busdeparturedate varchar(50));
