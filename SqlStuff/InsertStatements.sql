DELETE FROM BUILDING;
DELETE FROM EMPLOYEE;
DELETE FROM RESERVATION;
DELETE FROM TIMEOFF;

--Buildings Table
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

--Employee Table
INSERT ALL
    INTO EMPLOYEE (empNum, firstName, lastName, middleInit, phone, username, pass, supervisorNum) VALUES (123456789, 'John', 'Smith', 'B', '414-288-1234', 'JSmith', 'apple486', NULL)
    INTO EMPLOYEE (empNum, firstName, lastName, middleInit, phone, username, pass, supervisorNum) VALUES (234567891, 'Sarah', 'Jane', 'D', '414-288-4567', 'SJane', 'pear239', 123456789)
    INTO EMPLOYEE (empNum, firstName, lastName, middleInit, phone, username, pass, supervisorNum) VALUES (345678912, 'Mathew', 'Tennent', 'A', '414-288-5678', 'MTennent', 'pumpkin123', 123456789)
    INTO EMPLOYEE (empNum, firstName, lastName, middleInit, phone, username, pass, supervisorNum) VALUES (165904214,'Xena','Bean','C','984-798-7032','XBean','Craseu', 123456789)
    INTO EMPLOYEE (empNum, firstName, lastName, middleInit, phone, username, pass, supervisorNum) VALUES (169207044,'Harper','Jarvis','M','514-355-4953','HJarvis','feugiattellus', 123456789)
    INTO EMPLOYEE (empNum, firstName, lastName, middleInit, phone, username, pass, supervisorNum) VALUES (163707136,'Madonna','Dawson','K','745-778-7274','MDawson','auctorvelit.', 123465789)
    INTO EMPLOYEE (empNum, firstName, lastName, middleInit, phone, username, pass, supervisorNum) VALUES (167210073,'Nash','Fisher','P','131-660-1324','NFisher','diamPellentesque', 123456789)
    INTO EMPLOYEE (empNum, firstName, lastName, middleInit, phone, username, pass, supervisorNum) VALUES (165205266,'Beatrice','Hooper','P','484-112-7815','BHooper','Suspendissecommodo', 123456789)
    INTO EMPLOYEE (empNum, firstName, lastName, middleInit, phone, username, pass, supervisorNum) VALUES (162803077,'Kennan','Reeves','M','489-837-0345','KReeves','facilisiseget,', 123456789)
    INTO EMPLOYEE (empNum, firstName, lastName, middleInit, phone, username, pass, supervisorNum) VALUES (168205136,'Anne','Gallegos','R','794-864-7013','AGallagos','Nullamlobortis', 123456789)
    INTO EMPLOYEE (empNum, firstName, lastName, middleInit, phone, username, pass, supervisorNum) VALUES (162901235,'Honorato','Hughes','G','764-111-5795','HHughes','Donecat', 123456789)
    INTO EMPLOYEE (empNum, firstName, lastName, middleInit, phone, username, pass, supervisorNum) VALUES (164106274,'Karyn','Collins','S','241-719-0426','KCollins','accumsansed,', 123456789)
    INTO EMPLOYEE (empNum, firstName, lastName, middleInit, phone, username, pass, supervisorNum) VALUES (163106076,'Bradley','Griffin','R','360-680-6156','BGriffin','risusodio,', 123456789)
    INTO EMPLOYEE (empNum, firstName, lastName, middleInit, phone, username, pass, supervisorNum) VALUES (167506215,'Lee','Phillips','Y','990-962-0971','LPhillips','disparturient', 123456789)
    INTO EMPLOYEE (empNum, firstName, lastName, middleInit, phone, username, pass, supervisorNum) VALUES (160001181,'Keane','Travis','L','681-746-0719','KTravis','duinec', 123456789)
    INTO EMPLOYEE (empNum, firstName, lastName, middleInit, phone, username, pass, supervisorNum) VALUES (162710246,'Gretchen','Vance','T','353-893-0908','GVance','metusvitae', 123456789)
    INTO EMPLOYEE (empNum, firstName, lastName, middleInit, phone, username, pass, supervisorNum) VALUES (163504040,'Vernon','Allen','W','611-150-1259','VAllen','iaculisquis,', 123456789)
    INTO EMPLOYEE (empNum, firstName, lastName, middleInit, phone, username, pass, supervisorNum) VALUES (160510097,'Dieter','Jarvis','C','897-428-0901','DJArvis','sagittissemper.', 123456789)
    INTO EMPLOYEE (empNum, firstName, lastName, middleInit, phone, username, pass, supervisorNum) VALUES (165606078,'Guy','Neal','M','444-431-5961','GNeal','tinciduntdui', 123456789)
    INTO EMPLOYEE (empNum, firstName, lastName, middleInit, phone, username, pass, supervisorNum) VALUES (164311289,'Raya','Lynch','B','631-159-2768','RLynch','nuncac', 123456789)
    INTO EMPLOYEE (empNum, firstName, lastName, middleInit, phone, username, pass, supervisorNum) VALUES (169909246,'Paul','Lindsey','H','834-634-2747','PLindsey','atvelit.', 123456789)
   SELECT * FROM dual;

--Reservation Table

INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('TWC', 'Brian Moss', '414-555-1234', 'OD', (TO_DATE('05-MAY-2020', 'DD-MM-YYYY')), (TO_DATE('07-MAY-2020','DD-MM-YYYY')), 5);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('Six Flags', 'Trisana Chandler', '414-222-2345', 'CT', (TO_DATE('15-MAY-2020', 'DD-MM-YYYY')), (TO_DATE('20-MAY-2020', 'DD-MM-YYYY')), 15);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('Woodmans', 'Daja Kisubo', '414-777-3456', 'CO', (TO_DATE('05-JUN-2020', 'DD-MM-YYYY')), (TO_DATE('10-JUN-2020', 'DD-MM-YYYY')), 7);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('Duis Elementum Dui Institute','Jasper Cannon','1-664-833-2334','AB', (TO_DATE('13-FEB-19','DD-MM-YYYY')), (TO_DATE('04-OCT-19', 'DD-MM-YYYY')), 26);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('Enim Condimentum Eget Inc.','Sean Tate','1-758-158-5457','CT', (TO_DATE('26-SEP-20', 'DD-MM-YYYY')), (TO_DATE('28-OCT-20', 'DD-MM-YYYY')), 11);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('In Consectetuer Industries','Amaya Joyce','1-876-378-6272','CO', (TO_DATE('25-JUN-20', 'DD-MM-YYYY')), (TO_DATE('08-APR-19', 'DD-MM-YYYY')), 10);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('Sit Industries','Ursula Harrison','1-617-701-7543','HU', (TO_DATE('06-MAY-19', 'DD-MM-YYYY')), (TO_DATE('17-MAY-19', 'DD-MM-YYYY')), 84);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('Vel Mauris Integer PC','Avye Berry','1-799-743-8945','MA', (TO_DATE('07-APR-19', 'DD-MM-YYYY')), (TO_DATE('20-AUG-19', 'DD-MM-YYYY')), 16);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('Aliquet Industries','Matthew Lester','1-413-938-3085','OD', (TO_DATE('10-AUG-20', 'DD-MM-YYYY')), (TO_DATE('21-APR-20','DD-MM-YYYY')), 13);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('Rutrum Fusce Institute','Marshall Thompson','1-778-458-1836','WS', (TO_DATE('14-APR-20', 'DD-MM-YYYY')), (TO_DATE('06-JUN-20', 'DD-MM-YYYY')), 12);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('Lorem Eget Mollis Institute','Alice Parks','1-620-254-0237','ST', (TO_DATE('16-MAR-19', 'DD-MM-YYYY')), (TO_DATE('22-SEP-19','DD-MM-YYYY')), 50);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('Diam Corporation','Timothy Gomez','1-543-719-3908','ET', (TO_DATE('31-JAN-20', 'DD-MM-YYYY')), (TO_DATE('02-JUL-20', 'DD-MM-YYYY')), 24);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('Donec Fringilla Donec Corp.','Gray Vaughan','1-721-834-1858','WH', (TO_DATE('30-NOV-19', 'DD-MM-YYYY')), (TO_DATE('09-APR-20', 'DD-MM-YY')), 12);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('Ornare Industries','Taylor Hull','1-410-245-7934','AB', (TO_DATE('27-JUN-19', 'DD-MM-YYYY')), (TO_DATE('19-OCT-20','DD-MM-YYYY')), 74);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('Velit Eget Laoreet Company','Craig Giles','1-267-536-3426','CT', (TO_DATE('25-FEB-19', 'DD-MM-YYYY')), (TO_DATE('11-APR-19','DD-MM-YYYY')), 24);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('Mi Lorem Vehicula Inc.','Selma Maldonado','1-260-664-2691','CO', (TO_DATE('14-AUG-20', 'DD-MM-YYYY')), (TO_DATE('08-AUG-20', 'DD-MM-YYYY')), 54);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('Mi Aliquam Gravida Corp.','Mechelle Castillo','1-861-208-2174','HU', (TO_DATE('20-OCT-20', 'DD-MM-YYYY')), (TO_DATE('28-APR-19', 'DD-MM-YYYY')), 47);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('Metus Aliquam Company','Isaiah Park','1-614-633-8258','MA', (TO_DATE('28-JUN-19', 'DD-MM-YYYY')), (TO_DATE('14-MAR-20', 'DD-MM-YYYY')), 59);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('Tortor Dictum Eu Incorporated','Olivia Chan','1-451-906-0000','OD', (TO_DATE('20-MAY-19', 'DD-MM-YYYY')), (TO_DATE('04-JUN-20', 'DD-MM-YYYY')), 14);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('Amet Dapibus Id Ltd','Denise Baxter','1-396-196-4602','WS', (TO_DATE('27-JUL-20', 'DD-MM-YYYY')), (TO_DATE('20-JUN-20', 'DD-MM-YYYY')), 30);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('Imperdiet Ullamcorper Ltd','Gemma Berg','1-768-328-0598','ST', (TO_DATE('10-JAN-19', 'DD-MM-YYYY')), (TO_DATE('24-JAN-20', 'DD-MM-YYYY')), 33);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('Quam Company','Hector Rivers','1-624-816-3503', 'CO', (TO_DATE('16-SEP-19', 'DD-MM-YYYY')), (TO_DATE('31-JAN-20', 'DD-MM-YYYY')), 74);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('Elit Elit Fermentum Corporation','Tasha Hines','1-522-900-4111','WH', (TO_DATE('03-NOV-20', 'DD-MM-YYYY')), (TO_DATE('10-SEP-20', 'DD-MM-YYYY')), 40);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('Curabitur Dictum Phasellus Associates','Kaden Winters','1-538-944-9098','AB', (TO_DATE('17-FEB-20', 'DD-MM-YYYY')), (TO_DATE('18-JUN-20', 'DD-MM-YYYY')), 43);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('Vel Quam Dignissim Consulting','Howard Stephenson','1-592-778-1543','CT', (TO_DATE('13-OCT-20', 'DD-MM-YYYY')), (TO_DATE('12-JUL-19', 'DD-MM-YYYY')), 82);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('Aenean Massa Integer Inc.','Lila Cash','1-329-874-7776','CO', (TO_DATE('29-AUG-20', 'DD-MM-YYYY')), (TO_DATE('22-MAY-20', 'DD-MM-YYYY')), 100);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('Proin Vel Arcu Foundation','Calvin Riggs','1-618-763-9706','HU', (TO_DATE('21-APR-19', 'DD-MM-YYYY')), (TO_DATE('24-MAR-19', 'DD-MM-YYYY')), 16);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('Et Magnis Dis Corp.','Samuel Drake','1-846-377-2517','MA', (TO_DATE('22-MAY-20', 'DD-MM-YYYY')), (TO_DATE('11-JUN-19', 'DD-MM-YYYY')), 90);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('Vulputate Consulting','Portia Dickson','1-969-616-2023','OD', (TO_DATE('02-FEB-20', 'DD-MM-YYYY')), (TO_DATE('09-JAN-20', 'DD-MM-YYYY')), 67);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('Libero Foundation','Gwendolyn Francis','1-797-634-5428','WS', (TO_DATE('24-AUG-19', 'DD-MM-YYYY')), (TO_DATE('03-FEB-20', 'DD-MM-YYYY')), 90);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('Auctor PC','Hayfa Wiley','1-613-531-2905','ST', (TO_DATE('22-OCT-20', 'DD-MM-YYYY')), (TO_DATE('01-APR-20', 'DD-MM-YYYY')), 82);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('Dis Parturient Limited','Allen Pearson','1-383-568-8912','ET', (TO_DATE('03-JAN-20', 'DD-MM-YYYY')), (TO_DATE('22-APR-20', 'DD-MM-YYYY')), 53);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('Id Foundation','Guy Branch','1-192-501-9022','WH', (TO_DATE('24-SEP-19', 'DD-MM-YYYY')), (TO_DATE('03-JUN-19', 'DD-MM-YYYY')), 18);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('Sodales Mauris Blandit Associates','Curran Williamson','1-604-577-6713','AB', (TO_DATE('11-APR-19', 'DD-MM-YYYY')), (TO_DATE('15-APR-20', 'DD-MM-YYYY')), 87);
INSERT INTO RESERVATION(orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) VALUES ('Quam Dignissim Pharetra LLC','Kermit Case','1-178-603-7333','CT', (TO_DATE('11-OCT-20', 'DD-MM-YYYY')), (TO_DATE('25-JUL-20', 'DD-MM-YYYY')), 57);


--Timeoff Table
INSERT ALL
    INTO TIMEOFF (empNum, startDate, endDate, totalHours, typeHoursUsed) VALUES (234567891, (TO_DATE('02-JAN-2020', 'DD-MM-YYYY')), (TO_DATE('04-JAN-2020','DD-MM-YYYY')), 24, 'AL')
    INTO TIMEOFF (empNum, startDate, endDate, totalHours, typeHoursUsed) VALUES (165904214, (TO_DATE('08-FEB-2020', 'DD-MM-YYYY')), (TO_DATE('09-FEB-2020','DD-MM-YYYY')), 16, 'BANKED HOLIDAY')
    INTO TIMEOFF (empNum, startDate, endDate, totalHours, typeHoursUsed) VALUES (163707136, (TO_DATE('10-JAN-2020', 'DD-MM-YYYY')), (TO_DATE('15-JAN-2020','DD-MM-YYYY')), 48, 'AL')
    INTO TIMEOFF (empNum, startDate, endDate, totalHours, typeHoursUsed) VALUES (165205266, (TO_DATE('02-JAN-2020', 'DD-MM-YYYY')), (TO_DATE('02-JAN-2020','DD-MM-YYYY')), 8, 'AL')
    INTO TIMEOFF (empNum, startDate, endDate, totalHours, typeHoursUsed) VALUES (162803077, (TO_DATE('01-JAN-2020', 'DD-MM-YYYY')), (TO_DATE('03-JAN-2020','DD-MM-YYYY')), 24, 'AL')
    INTO TIMEOFF (empNum, startDate, endDate, totalHours, typeHoursUsed) VALUES (165205266, (TO_DATE('05-FEB-2020', 'DD-MM-YYYY')), (TO_DATE('06-FEB-2020','DD-MM-YYYY')), 24, 'FLOATING HOLIDAY')
    INTO TIMEOFF (empNum, startDate, endDate, totalHours, typeHoursUsed) VALUES (163106076, (TO_DATE('15-MAR-2020', 'DD-MM-YYYY')), (TO_DATE('28-MAR-2020','DD-MM-YYYY')), 80, 'PLANNED MEDICAL')
    INTO TIMEOFF (empNum, startDate, endDate, totalHours, typeHoursUsed) VALUES (169909246, (TO_DATE('29-JAN-2020', 'DD-MM-YYYY')), (TO_DATE('02-FEB-2020','DD-MM-YYYY')), 40, 'AL')
    INTO TIMEOFF (empNum, startDate, endDate, totalHours, typeHoursUsed) VALUES (165606078, (TO_DATE('02-FEB-2020', 'DD-MM-YYYY')), (TO_DATE('03-FEB-2020','DD-MM-YYYY')), 16, 'AL')
    INTO TIMEOFF (empNum, startDate, endDate, totalHours, typeHoursUsed) VALUES (163504040, (TO_DATE('13-FEB-2020', 'DD-MM-YYYY')), (TO_DATE('15-FEB-2020','DD-MM-YYYY')), 24, 'AL')
SELECT * FROM dual;