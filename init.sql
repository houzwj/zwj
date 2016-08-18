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
