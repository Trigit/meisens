/*
Navicat MySQL Data Transfer

Source Server         : meisens
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : meisens

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2014-12-09 18:51:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) DEFAULT NULL COMMENT '姓名',
  `mobilePhone` varchar(11) DEFAULT NULL COMMENT '手机',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `phone` varchar(20) DEFAULT NULL COMMENT '电话',
  `about` varchar(50) DEFAULT NULL COMMENT '主题',
  `content` varchar(1024) DEFAULT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23426 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES ('23425', '很多富豪打算', '325435', '454@45435', '45', '6636', '突然回个话');
