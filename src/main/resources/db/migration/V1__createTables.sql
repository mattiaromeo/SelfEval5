create table USER(
id int primary key auto_increment,
name varchar(100)
);

create table HIGHWAY(
id int primary key auto_increment,
name varchar(100),
distance double
);

create table INCIDENT(
id int primary key auto_increment,
name varchar(100),
type varchar(100),
distance double,
highwayid int,
userid int
);

create table USER_INCIDENT(
id int primary key auto_increment,
userid int,
incidentid int
);

