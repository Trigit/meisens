/*
Navicat MySQL Data Transfer

Source Server         : MYSQL56
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : mysql

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2014-12-07 13:41:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `c_id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) DEFAULT NULL COMMENT '姓名',
  `phone` varchar(11) DEFAULT NULL COMMENT '手机',
  `email` varchar(25) DEFAULT NULL COMMENT '邮箱',
  `tel` varchar(12) DEFAULT NULL COMMENT '电话',
  `Theme` varchar(50) DEFAULT NULL COMMENT '主题',
  `content` varchar(255) DEFAULT NULL COMMENT '内容',
  KEY `index_e` (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
