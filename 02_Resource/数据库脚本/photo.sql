/*
Navicat MySQL Data Transfer

Source Server         : MYSQL56
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : mysql

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2014-12-07 13:40:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for photo
-- ----------------------------
DROP TABLE IF EXISTS `photo`;
CREATE TABLE `photo` (
  `cid` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `type` varchar(5) DEFAULT NULL COMMENT '类型',
  `path` varchar(100) DEFAULT NULL COMMENT '路径',
  `name` varchar(50) DEFAULT NULL COMMENT '显示名',
  KEY `index_p` (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
