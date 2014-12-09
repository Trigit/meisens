/*
Navicat MySQL Data Transfer

Source Server         : MYSQL56
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : mysql

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2014-12-07 13:39:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `cid` int(8) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `uid` varchar(8) NOT NULL COMMENT '用户id',
  `uname` varchar(10) NOT NULL COMMENT '用户名称',
  `upwd` varchar(10) NOT NULL COMMENT '用户密码',
  KEY `index_u` (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------
