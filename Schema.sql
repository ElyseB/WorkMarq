DROP TABLE EMPLOYEE CASCADE CONSTRAINTS;
DROP TABLE BUILDING CASCADE CONSTRAINTS;
DROP TABLE RESERVATION CASCADE CONSTRAINTS;

CREATE TABLE EMPLOYEE(
    EmpNum INT PRIMARY KEY,
    FirstName VARCHAR2 (25) NOT NULL,
    LastName VARCHAR2 (25) NOT NULL,
    MiddleInit VARCHAR2 (5),
    Phone VARCHAR2 (15)
);

CREATE TABLE BUILDING(
    BName VARCHAR2 (25) PRIMARY KEY,
    BAbbrev VARCHAR2 (5) UNIQUE NOT NULL,
    BAddress VARCHAR2 (250) NOT NULL,
    BPhone VARCHAR2(15) NOT NULL
);


CREATE TABLE RESERVATION(
    ReservNum INT PRIMARY KEY,
    CompanyName VARCHAR2(250), 
    ContactName VARCHAR2 (250) NOT NULL,
    ContactPhone VARCHAR2 (15) NOT NULL,
    Occupies VARCHAR2(5),
    ReservStart DATE,
    ReservEnd DATE,
    CONSTRAINT FK_Occupies FOREIGN KEY (Occupies) REFERENCES BUILDING (BAbbrev) ON DELETE CASCADE
);
