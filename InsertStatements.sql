DELETE FROM BUILDING;
DELETE FROM EMPLOYEE;
DELETE FROM RESERVATION;

INSERT ALL
    INTO BUILDING (bName, bAbbrev, bAddress, bPhone, maxRooms) VALUES ('Abbottsford Hall', 'AB', '722 N 13th St', '414-288-5468', 100)
    INTO BUILDING (bName, bAbbrev, bAddress, bPhone, maxRooms) VALUES ('Carpenter Tower', 'CT', '1032 W. Wisconsin Ave', '414-288-7606', 125)
    INTO BUILDING (bName, bAbbrev, bAddress, bPhone, maxRooms) VALUES ('Cobeen Hall', 'CO', '1111 W. Wells St', '414-288-3131', 150)
    INTO BUILDING (bName, bAbbrev, bAddress, bPhone, maxRooms) VALUES ('Humphrey Hall', 'HU', '1716 W. Wisconsin Ave', '414-288-7616', 90)
    INTO BUILDING (bName, bAbbrev, bAddress, bPhone, maxRooms) VALUES ('Mashuda', 'MA', '1926 W. Wisconsin Ave', '414-288-3100', 75)
    INTO BUILDING (bName, bAbbrev, bAddress, bPhone, maxRooms) VALUES ('ODonnell', 'OD', '725 N. 18th St', '414-288-7800', 100)
    INTO BUILDING (bName, bAbbrev, bAddress, bPhone, maxRooms) VALUES ('Schroeder Hall', 'WS', '725 N. 13th St', '414-288-6464', 80)
    INTO BUILDING (bName, bAbbrev, bAddress, bPhone, maxRooms) VALUES ('Straz Tower', 'ST', '915 W. Wisconsin Ave', '414-288-3579', 125)
    INTO BUILDING (bName, bAbbrev, bAddress, bPhone, maxRooms) VALUES ('Eckstein Tower', 'ET', '721 N. 17th St', '414-288-1725', 150)
    INTO BUILDING (bName, bAbbrev, bAddress, bPhone, maxRooms) VALUES ('Wells Hall', 'WH', '721 N. 17th St', '414-288-0792', 125)
SELECT * FROM dual;

INSERT ALL
    INTO EMPLOYEE (empNum, firstName, lastName, middleInit, phone, username, pass, supervisorNum) VALUES (123456789, 'John', 'Smith', 'B', '414-288-1234', 'JSmith', 'apple486', NULL)
    INTO EMPLOYEE (empNum, firstName, lastName, middleInit, phone, username, pass, supervisorNum) VALUES (234567891, 'Sarah', 'Jane', 'D', '414-288-4567', 'SJane', 'pear239', 123456789)
    INTO EMPLOYEE (empNum, firstName, lastName, middleInit, phone, username, pass, supervisorNum) VALUES (345678912, 'Mathew', 'Tennent', 'A', '414-288-5678', 'MTennent', 'pumpkin123', 123456789)
SELECT * FROM dual

INSERT ALL 
    INTO RESERVATION(reservNum, companyName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('105', 'TWC', 'Brian Moss', '414-555-1234', 'OD', '05-MAY-2020', '07-MAY-2020', 5)
    INTO RESERVATION(reservNum, companyName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('106', 'Six Flags', 'Trisana Chandler', '414-222-2345', 'CT', '15-MAY-2020', '20-MAY-2020', 15)
    INTO RESERVATION(reservNum, companyName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('107', 'Woodmans', 'Daja Kisubo', '414-777-3456', 'CO', '05-Jun-2020', '10-JUN-2020', 7)
SELECT * FROM dual;