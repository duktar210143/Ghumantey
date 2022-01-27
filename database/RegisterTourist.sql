Create database Ghumantey;

use Ghumantey;

create TABLE Tourist(
TouristID int auto_increment,
CONSTRAINT PK_tourist primary key(TouristID),
TourName varchar(20),
tourmobile varchar(15),
TourGender varchar(15),
TourDOB varchar(10),
TourAddress varchar(30),
TourUserName varchar(20),
Password varchar(30)
);





