create database library;
use library;
create table users(ID int primary key not null auto_increment, name varchar(50), surname varchar(50), username varchar(50), password varchar(50));
SET GLOBAL time_zone = '+3:00';
create table book_details (Book_ID int primary key not null auto_increment, Book_Name varchar(250), Author varchar(100), Quantity int);
create table issued_books (ID int primary key not null auto_increment, Book_ID int, Book_Name varchar(250), Author_Name varchar(250), Username varchar(100));
select * from issued_books;
select * from users;
select * from book_details;
