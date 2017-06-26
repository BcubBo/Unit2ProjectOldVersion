CREATE DATABASE  IF NOT EXISTS `smbms` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;
USE `smbms`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: smbms
-- ------------------------------------------------------
-- Server version	5.7.17-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `smbms_user`
--

DROP TABLE IF EXISTS `smbms_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `smbms_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `userCode` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户编码',
  `userName` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户名称',
  `userPassword` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户密码',
  `gender` int(10) DEFAULT NULL COMMENT '性别（1男2女）',
  `bornDate` date DEFAULT NULL COMMENT '出生日期',
  `phone` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '移动电话号码',
  `address` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '地址',
  `userType` int(10) DEFAULT NULL COMMENT '用户类型（1系统管理员2经理3普通员工）',
  `createBy` bigint(20) DEFAULT NULL COMMENT '创建者（userId)',
  `creationDate` datetime DEFAULT NULL COMMENT '更新时间',
  `modifyBy` bigint(20) DEFAULT NULL COMMENT '更新者(userId)',
  `modifyDate` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `smbms_user`
--

LOCK TABLES `smbms_user` WRITE;
/*!40000 ALTER TABLE `smbms_user` DISABLE KEYS */;
INSERT INTO `smbms_user` VALUES (10,'account2','userName2','11223344',2,'1922-02-06','15113141314','userName2userName2',3,NULL,NULL,16,'2017-06-13 13:42:31'),(16,'account4','userName4','1111mmmm',1,'1988-06-05','18113141314','account4',1,NULL,NULL,16,'2017-06-13 13:43:55'),(17,'username5','userName5','22222222',NULL,'1999-05-08',NULL,NULL,3,NULL,NULL,NULL,NULL),(18,'userCode2','用户2',NULL,NULL,'1978-03-06',NULL,NULL,1,NULL,NULL,NULL,NULL),(19,'userCode2','用户2',NULL,NULL,'1968-01-02',NULL,NULL,1,NULL,NULL,NULL,NULL),(20,'account5','acco5',NULL,1,'1974-06-13','13113141314','account5',3,NULL,NULL,16,'2017-06-13 13:44:36'),(21,'用户3','用户3',NULL,NULL,'1968-05-08',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(25,NULL,'userAcc2','11111111',1,'2017-06-22','13113141313','sfsdfsdfsdfsdfsdfsdf',3,10,'2017-06-07 12:18:16',10,'2017-06-13 13:31:10'),(26,'testUserAccount','测试账户','11112222',1,'1974-06-19','13113141314','null',1,10,'2017-06-07 12:25:53',NULL,NULL),(29,'bcubbo','bcubbo','bcubbobcubbo',1,'1994-06-30','13113141314','',3,26,'2017-06-07 18:08:38',NULL,NULL),(35,'bcubbo2','bcubbo2','bcubbobcubbo',1,'2017-03-08','','',2,29,'2017-06-07 18:30:47',NULL,NULL);
/*!40000 ALTER TABLE `smbms_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-06-26  9:38:18
