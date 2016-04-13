/*
SQLyog Community v10.41 
MySQL - 5.1.63-community : Database - techweaver_inbm
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`techweaver_inbm` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `techweaver_inbm`;

/*Table structure for table `categories` */

DROP TABLE IF EXISTS `categories`;

CREATE TABLE `categories` (
  `category_id` int(15) NOT NULL AUTO_INCREMENT,
  `catogory_name` varchar(50) DEFAULT NULL,
  `category_description` varchar(500) DEFAULT NULL,
  `category_picture_url` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `categories` */

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `customer_id` int(50) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `class` varchar(50) DEFAULT NULL,
  `flat` varchar(50) DEFAULT NULL,
  `building` varchar(50) DEFAULT NULL,
  `address1` varchar(150) DEFAULT NULL,
  `address2` varchar(150) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `state` varchar(50) DEFAULT NULL,
  `postal_code` varchar(50) DEFAULT NULL,
  `country` varchar(50) DEFAULT NULL,
  `phone` varchar(25) DEFAULT NULL,
  `alternate_phone` varchar(25) DEFAULT NULL,
  `mobile` varchar(20) DEFAULT NULL,
  `email` varchar(150) DEFAULT NULL,
  `voicemail` varchar(150) DEFAULT NULL,
  `password` varchar(150) DEFAULT NULL,
  `billing_address` varchar(300) DEFAULT NULL,
  `billing_city` varchar(50) DEFAULT NULL,
  `billing_region` varchar(50) DEFAULT NULL,
  `billing_postal_code` varchar(50) DEFAULT NULL,
  `billing_country` varchar(50) DEFAULT NULL,
  `ship_address` varchar(300) DEFAULT NULL,
  `ship_city` varchar(50) DEFAULT NULL,
  `ship_region` varchar(50) DEFAULT NULL,
  `ship_postal_code` varchar(50) DEFAULT NULL,
  `ship_country` varchar(50) DEFAULT NULL,
  `date_entered` date DEFAULT NULL,
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `customer` */

/*Table structure for table `order_details` */

DROP TABLE IF EXISTS `order_details`;

CREATE TABLE `order_details` (
  `order_detail_id` int(15) NOT NULL AUTO_INCREMENT,
  `order_id` varchar(50) NOT NULL,
  `product_id` varchar(50) NOT NULL,
  `order_number` int(255) DEFAULT NULL,
  `price` decimal(65,2) DEFAULT NULL,
  `quantity` decimal(65,2) DEFAULT NULL,
  `discount` decimal(65,2) DEFAULT NULL,
  `total` decimal(65,2) DEFAULT NULL,
  `IDSKU` varchar(50) DEFAULT NULL,
  `size` varchar(50) DEFAULT NULL,
  `color` varchar(50) DEFAULT NULL,
  `fulfilled` varchar(50) DEFAULT NULL,
  `ship_date` date DEFAULT NULL,
  `bill_date` date DEFAULT NULL,
  PRIMARY KEY (`order_detail_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `order_details` */

/*Table structure for table `orders` */

DROP TABLE IF EXISTS `orders`;

CREATE TABLE `orders` (
  `order_id` int(15) NOT NULL AUTO_INCREMENT,
  `customer_id` varchar(50) DEFAULT NULL,
  `order_number` varchar(50) DEFAULT NULL,
  `payment_id` varchar(50) DEFAULT NULL,
  `order_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `ship_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `required_date` date DEFAULT NULL,
  `shipper_id` varchar(50) DEFAULT NULL,
  `freight` varchar(500) DEFAULT NULL COMMENT 'cargo',
  `sales_tax` decimal(10,2) DEFAULT NULL,
  `transaction_status` varchar(10) DEFAULT NULL COMMENT 'Cancel,Active,rejected',
  `errloc` varchar(50) DEFAULT NULL,
  `errmsg` varchar(50) DEFAULT NULL,
  `fulfilled` varchar(15) DEFAULT NULL,
  `deleted` varchar(15) DEFAULT NULL,
  `paid` varchar(15) DEFAULT NULL,
  `paymentdate` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `orders` */

/*Table structure for table `payments` */

DROP TABLE IF EXISTS `payments`;

CREATE TABLE `payments` (
  `id` int(15) NOT NULL,
  `amount_paid` decimal(65,4) DEFAULT NULL,
  `payment_type` varchar(25) DEFAULT NULL,
  `payment_date` date DEFAULT NULL,
  `amount_balance` decimal(65,4) DEFAULT NULL,
  `balance_amount_payment_date` date DEFAULT NULL,
  `alert_on_date` varchar(1) DEFAULT NULL,
  `cheque_invoicenote_number` varchar(50) NOT NULL,
  `payment_sale_order` varchar(10) DEFAULT NULL COMMENT 'order/sale',
  PRIMARY KEY (`id`,`cheque_invoicenote_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `payments` */

insert  into `payments`(`id`,`amount_paid`,`payment_type`,`payment_date`,`amount_balance`,`balance_amount_payment_date`,`alert_on_date`,`cheque_invoicenote_number`,`payment_sale_order`) values (1,300.0000,'CASH','2015-12-23',150.0000,'2015-12-23','Y','xyz1235','SALE');

/*Table structure for table `products` */

DROP TABLE IF EXISTS `products`;

CREATE TABLE `products` (
  `product_id` int(15) NOT NULL AUTO_INCREMENT COMMENT 'Alphanumeric',
  `sku` varchar(50) NOT NULL COMMENT '(stock Keeping Unit)Size,type eg. KG/Litr/qnty',
  `vendor_product_id` varchar(50) DEFAULT NULL,
  `product_name` varchar(50) NOT NULL,
  `product_description` varchar(500) DEFAULT NULL,
  `supplier_id` varchar(50) DEFAULT NULL,
  `category_id` varchar(50) DEFAULT NULL,
  `quantity_per_unit` decimal(65,2) DEFAULT NULL,
  `unit_price` decimal(65,2) NOT NULL,
  `msrp` decimal(65,2) NOT NULL COMMENT 'manufacturer''s suggested retail price',
  `available_size` decimal(65,2) DEFAULT NULL,
  `available_colors` varchar(500) DEFAULT NULL,
  `size` decimal(65,2) DEFAULT NULL,
  `color` varchar(20) DEFAULT NULL,
  `discount` decimal(65,2) DEFAULT NULL,
  `unitweight` decimal(65,2) DEFAULT NULL,
  `units_in_stock` decimal(65,2) NOT NULL,
  `units_on_order` decimal(65,2) DEFAULT NULL,
  `reorder_level` decimal(65,2) DEFAULT NULL,
  `product_available` varchar(1) NOT NULL COMMENT 'Y/N',
  `discount_available` varchar(1) NOT NULL COMMENT 'Y/N',
  `current_order` decimal(65,2) DEFAULT NULL,
  `picture_url` varchar(500) DEFAULT NULL COMMENT 'image path',
  `ranking` int(10) DEFAULT NULL,
  `note` varchar(1000) DEFAULT NULL,
  `sms_notification` varchar(1) DEFAULT NULL,
  `IDSKU` varchar(50) DEFAULT NULL,
  `product_expiry_date` date DEFAULT NULL,
  `product_deleted` varchar(1) DEFAULT NULL,
  `alert_expiry_date` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

/*Data for the table `products` */

insert  into `products`(`product_id`,`sku`,`vendor_product_id`,`product_name`,`product_description`,`supplier_id`,`category_id`,`quantity_per_unit`,`unit_price`,`msrp`,`available_size`,`available_colors`,`size`,`color`,`discount`,`unitweight`,`units_in_stock`,`units_on_order`,`reorder_level`,`product_available`,`discount_available`,`current_order`,`picture_url`,`ranking`,`note`,`sms_notification`,`IDSKU`,`product_expiry_date`,`product_deleted`,`alert_expiry_date`) values (3,'QTY','v1','P1name','p1 desc','s1','c',1.00,1.00,1.00,40.00,'black,blue',40.00,'white',0.00,1.00,148.00,500.00,150.00,'Y','N',0.00,'Picture path',10,'Sample Notes','N','IDSKU1','2015-12-23','Y','N'),(4,'QTY','v1','P2name','p1 desc','s1','c',1.00,1.00,1.00,40.00,'black,blue',40.00,'white',0.00,1.00,150.00,500.00,150.00,'Y','N',0.00,'Picture path',10,'Sample Notes','N','IDSKU1','2015-12-23','Y','N'),(5,'QTY','v1','P3name','p1 desc','s1','c',1.00,1.00,1.00,40.00,'black,blue',40.00,'white',0.00,1.00,1000.00,500.00,150.00,'Y','N',0.00,'Picture path',10,'Sample Notes','N','IDSKU1','2016-01-02','N','N'),(6,'QTY','v1','P4name','p1 desc','s1','c',1.00,1.00,1.00,40.00,'black,blue',40.00,'white',0.00,1.00,1000.00,500.00,150.00,'Y','N',0.00,'Picture path',10,'Sample Notes','N','IDSKU1','2016-01-02','N','N'),(7,'QTY','v1','P5name','p1 desc','s1','c',1.00,1.00,1.00,40.00,'black,blue',40.00,'white',0.00,1.00,1000.00,500.00,150.00,'Y','N',0.00,'Picture path',10,'Sample Notes','N','IDSKU1','2016-01-02','N','N'),(8,'QTY','v1','P6name','p1 desc','s1','c',1.00,1.00,1.00,40.00,'black,blue',40.00,'white',0.00,1.00,1000.00,500.00,150.00,'Y','N',0.00,'Picture path',10,'Sample Notes','N','IDSKU1','2016-01-02','N','N'),(9,'QTY','v1','P7name','p1 desc','s1','c',1.00,1.00,1.00,40.00,'black,blue',40.00,'white',0.00,1.00,1000.00,500.00,150.00,'Y','N',0.00,'Picture path',10,'Sample Notes','N','IDSKU1','2016-01-02','N','N'),(10,'QTY','v1','P8name','p1 desc','s1','c',1.00,1.00,1.00,40.00,'black,blue',40.00,'white',0.00,1.00,1000.00,500.00,150.00,'Y','N',0.00,'Picture path',10,'Sample Notes','N','IDSKU1','2016-01-02','N','N'),(11,'QTY','v1','P9name','p1 desc','s1','c',1.00,1.00,1.00,40.00,'black,blue',40.00,'white',0.00,1.00,1000.00,500.00,150.00,'Y','N',0.00,'Picture path',10,'Sample Notes','N','IDSKU1','2016-01-02','N','N'),(12,'QTY','v1','P9name','p1 desc','s1','c',1.00,1.00,1.00,40.00,'black,blue',40.00,'white',0.00,1.00,1000.00,500.00,150.00,'Y','N',0.00,'Picture path',10,'Sample Notes','N','IDSKU1','2016-01-02','N','N'),(13,'QTY','v1','P9name','p1 desc','s1','c',1.00,1.00,1.00,40.00,'black,blue',40.00,'white',0.00,1.00,1000.00,500.00,150.00,'Y','N',0.00,'Picture path',10,'Sample Notes','N','IDSKU1','2016-01-02','N','N'),(14,'QTY','v1','P9name','p1 desc','s1','c',1.00,1.00,1.00,40.00,'black,blue',40.00,'white',0.00,1.00,1000.00,500.00,150.00,'Y','N',0.00,'Picture path',10,'Sample Notes','N','IDSKU1','2016-01-02','N','N'),(15,'QTY','v1','P9name','p1 desc','s1','c',1.00,1.00,1.00,40.00,'black,blue',40.00,'white',0.00,1.00,1000.00,500.00,150.00,'Y','N',0.00,'Picture path',10,'Sample Notes','N','IDSKU1','2016-01-02','N','N'),(16,'QTY','v1','P10name','p1 desc','s1','c',1.00,1.00,1.00,40.00,'black,blue',40.00,'white',0.00,1.00,1000.00,500.00,150.00,'Y','N',0.00,'Picture path',10,'Sample Notes','N','IDSKU1','2016-01-02','N','N');

/*Table structure for table `suppliers` */

DROP TABLE IF EXISTS `suppliers`;

CREATE TABLE `suppliers` (
  `supplier_id` int(15) NOT NULL AUTO_INCREMENT,
  `company_name` varchar(150) DEFAULT NULL,
  `contact_first_name` varchar(100) DEFAULT NULL,
  `contact_last_name` varchar(100) DEFAULT NULL,
  `contact_title` varchar(100) DEFAULT NULL,
  `address1` varchar(100) DEFAULT NULL,
  `address2` varchar(100) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `state` varchar(50) DEFAULT NULL,
  `postalcode` varchar(20) DEFAULT NULL,
  `country` varchar(50) DEFAULT NULL,
  `phone` varchar(25) DEFAULT NULL,
  `altarnate_phone` varchar(25) DEFAULT NULL,
  `mobile_number` varchar(20) DEFAULT NULL,
  `fax` varchar(25) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `url` varchar(500) DEFAULT NULL,
  `payment_methods` varchar(200) DEFAULT NULL,
  `dicount_type` varchar(200) DEFAULT NULL,
  `type_goods` varchar(20) DEFAULT NULL,
  `notes` varchar(1000) DEFAULT NULL,
  `discount_avialable` varchar(1) DEFAULT NULL COMMENT 'Y/N',
  `current_order` decimal(65,2) DEFAULT NULL,
  `logo` varchar(500) DEFAULT NULL,
  `customer_id` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`supplier_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `suppliers` */

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `user_id` int(15) NOT NULL AUTO_INCREMENT,
  `firt_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `middle_name` varchar(50) DEFAULT NULL,
  `Phone_extension_number` varchar(20) DEFAULT NULL,
  `reports_to` varchar(50) DEFAULT NULL,
  `job_title` varchar(50) DEFAULT NULL,
  `address` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `users` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
