CREATE TABLE ORDERS (
   ID          INT        NOT NULL,
   DATE        DATETIME, 
   CUSTOMER_ID INT ,
   AMOUNT     double,
   PRIMARY KEY (ID),
   FOREIGN KEY(CUSTOMER_ID) REFERENCES CUSTOMERS(ID) 
);