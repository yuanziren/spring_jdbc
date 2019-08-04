/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : spring_jdbc

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2019-05-29 14:57:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `aname` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `money` double(12,0) DEFAULT NULL,
  `user_id` int(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('8', 'zhang8', '1', '1000', '24', '2018-08-11 09:55:29', '2018-08-11 09:55:32', '0');
INSERT INTO `account` VALUES ('9', 'zhang9', '1', '1000', '24', '2018-08-11 09:55:29', '2018-08-11 09:55:32', '0');
