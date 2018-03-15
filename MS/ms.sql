/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : ms

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2018-03-08 14:39:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_goods
-- ----------------------------
DROP TABLE IF EXISTS `t_goods`;
CREATE TABLE `t_goods` (
  `goodsId` int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一主键货物Id',
  `status` tinyint(1) NOT NULL COMMENT '货物状态 0表示可用 1表示不可用',
  `goodsCode` varchar(50) NOT NULL COMMENT '货物编号',
  `goodsName` varchar(50) NOT NULL COMMENT '货物名称',
  `goodsCatagory` varchar(50) DEFAULT NULL COMMENT '货物类别',
  `material` varchar(20) DEFAULT NULL COMMENT '材质',
  `goodsNote` varchar(100) DEFAULT NULL COMMENT '货物备注 货物信息补充内容',
  `shipperId` int(11) DEFAULT NULL COMMENT '所属货主Id',
  `goodsImg` varchar(50) DEFAULT NULL COMMENT '货物图片 服务器图片url',
  `expiryDate` int(6) DEFAULT NULL COMMENT '保质期',
  `price` double(8,0) DEFAULT NULL,
  PRIMARY KEY (`goodsId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_goods
-- ----------------------------
INSERT INTO `t_goods` VALUES ('1', '1', 'eeeeee', '手机', '1', '1', '1', '1', '1', '1', '2');
INSERT INTO `t_goods` VALUES ('2', '2', '2', '电脑', '2', '2', '2', '2', '2', '2', '2');
INSERT INTO `t_goods` VALUES ('4', '0', '3', '电视剧', '3', '3', '3', '3', '3', '3', '3');
