CREATE TABLE `url_tb` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `reqIp` varchar(120) DEFAULT NULL,
  `reqUrl` varchar(240) DEFAULT NULL,
  `reqTime` datetime DEFAULT NULL,
  `status` int(1) DEFAULT '0' COMMENT '状态 0：正常 1：非法',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;