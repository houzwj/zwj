DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `parentId` bigint(20) DEFAULT NULL,
  `location` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(10) DEFAULT NULL,
  `lastname` varchar(10) DEFAULT NULL,
  `ldapUserName` varchar(20) DEFAULT NULL,
  `gender` varchar(2) DEFAULT NULL,
  `birthdate` datetime DEFAULT NULL,
  `title` varchar(10) DEFAULT NULL,
  `grade` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into `employee` (`id`, `firstname`, `lastname`, `ldapUserName`, `gender`, `birthdate`, `title`, `grade`, `departmentId`) values('1','kevin','dulant','jim','0','2016-08-18 11:16:23','aa','1','2');
insert into `department` (`id`, `name`, `parentId`, `location`) values('1','dep1',NULL,'dd');
insert into `department` (`id`, `name`, `parentId`, `location`) values('2','department','1','ss');
insert into `department` (`id`, `name`, `parentId`, `location`) values('3','dep3','2','aa');

