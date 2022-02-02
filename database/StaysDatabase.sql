create TABLE Stays(
StaysID int auto_increment,
CONSTRAINT PK_Stays primary key(StaysID),
Name varchar(30),
Mail varchar(20),
Pass varchar(20),
Gender varchar(1),
TotalnumberofAdults int,
TotalnumberofChildren int,
ArrivalDate varchar(20),
DepartureDate varchar(20)
);
