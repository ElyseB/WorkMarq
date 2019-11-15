DROP TABLE EMPLOYEE CASCADE CONSTRAINTS;
DROP TABLE BUILDING CASCADE CONSTRAINTS;
DROP TABLE RESERVATION CASCADE CONSTRAINTS;
DROP TABLE TIMEOFF CASCADE CONSTRAINTS;

CREATE TABLE EMPLOYEE(
    empNum INT PRIMARY KEY,
    firstName VARCHAR2 (25) NOT NULL,
    lastName VARCHAR2 (25) NOT NULL,
    middleInit VARCHAR2 (5),
    phone VARCHAR2 (15),
    username VARCHAR2 (50),
    pass VARCHAR2 (50),
    supervisorNum INT
);

CREATE TABLE BUILDING(
    bName VARCHAR2 (25) PRIMARY KEY,
    bAbbrev VARCHAR2 (5) UNIQUE NOT NULL,
    bAddress VARCHAR2 (250) NOT NULL,
    bPhone VARCHAR2(15) NOT NULL,
    maxRooms INT NOT NULL
);


CREATE TABLE RESERVATION(
    reservNum INT PRIMARY KEY,
    companyName VARCHAR2(250), 
    contactName VARCHAR2 (250) NOT NULL,
    contactPhone VARCHAR2 (15) NOT NULL,
    occupies VARCHAR2(5),
    reservStart DATE,
    reservEnd DATE,
    roomsNeeded INT,
    CONSTRAINT FK_Occupies FOREIGN KEY (Occupies) REFERENCES BUILDING (BAbbrev) ON DELETE CASCADE
);

CREATE TABLE TIMEOFF(
    empNum INT PRIMARY KEY,
    startDate DATE,
    endDate DATE,
    totalHours INT,
    typeHoursUsed VARCHAR2(100), 
    CONSTRAINT check_typeHoursUsed 
        CHECK (typeHoursUsed IN ('AL', 'FLOATING HOLIDAY', 'PLANNED MEDICAL', 'BANKED HOLIDAY'))
);