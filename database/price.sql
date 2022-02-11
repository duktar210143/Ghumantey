show databases;
use Ghumantey;

show tables;
create Table price(
RoomId int auto_increment,
constraint Pk_Room primary key(RoomId),
Roomtype varchar(100),
Priceofroom int
);

INSERT into price VAlUES(1,"King size bed with attach bathroom",1000);
select * FROM price;