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
-- Table structure for table `smbms_bill`
--

DROP TABLE IF EXISTS `smbms_bill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `smbms_bill` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `billCode` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '账单编码',
  `productName` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '商品名称',
  `productDesc` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '商品描述',
  `productUnit` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '商品单位',
  `productCount` decimal(20,2) DEFAULT NULL COMMENT '产品总计',
  `totalPrice` decimal(20,2) DEFAULT NULL COMMENT '账单总价',
  `isPayment` int(10) DEFAULT NULL COMMENT '是否付款（1，未支付2，已支付)',
  `providerId` bigint(20) DEFAULT NULL COMMENT '供应商',
  `creationDate` datetime DEFAULT NULL COMMENT '创建时间',
  `createdBy` bigint(20) DEFAULT NULL COMMENT '创建者',
  `modifyDate` datetime DEFAULT NULL COMMENT '更新时间',
  `modifyBy` bigint(20) DEFAULT NULL COMMENT '更新者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `smbms_bill`
--

LOCK TABLES `smbms_bill` WRITE;
/*!40000 ALTER TABLE `smbms_bill` DISABLE KEYS */;
/*!40000 ALTER TABLE `smbms_bill` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-06-26  9:38:17
