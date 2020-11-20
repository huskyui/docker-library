create database if not exists `test`;
use `test`;
drop table if exists `user`;
create table `user`(
    `id` int(11) AUTO_INCREMENT,
    `count` int(11) default '0',
	primary key(`id`)
);