CREATE DATABASE springboot;
use springboot;

DROP TABLE IF EXISTS `Person`;

CREATE TABLE `Person` (
  `id` int unsigned NOT NULL auto_increment,
  `lastname` varchar(50) default NULL,
  `firstname` varchar(50) default NULL,
  PRIMARY KEY (`id`)
) AUTO_INCREMENT=1;

INSERT INTO `Person` (`lastname`,`firstname`)
VALUES
  ("Hyde","Jemima"),
  ("Thornton","Adele"),
  ("Ramirez","Shellie"),
  ("Pennington","Kelly"),
  ("Forbes","Bruno"),
  ("Britt","Quinn"),
  ("Glass","Jescie"),
  ("Booker","Thane"),
  ("Riddle","Lance"),
  ("Kline","Rylee"),
  ("Neal","Sonia"),
  ("Mitchell","Neil"),
  ("Saunders","Alexis"),
  ("Watkins","Branden"),
  ("Vaughan","Emi"),
    ("Hancock","Palmer"),
  ("Holloway","Isabella"),
  ("Cotton","Silas"),
  ("Wong","Ryder"),
  ("Cooper","Nero"),
    ("Delacruz","Tallulah"),
  ("Sullivan","Imelda"),
  ("Stewart","Orlando"),
  ("Drake","Thor"),
  ("Strickland","Adrienne");