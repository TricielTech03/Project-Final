-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Dec 21, 2018 at 10:54 AM
-- Server version: 5.7.21
-- PHP Version: 5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `confidentail`
--

-- --------------------------------------------------------

--
-- Table structure for table `goods_vehicle`
--

DROP TABLE IF EXISTS `goods_vehicle`;
CREATE TABLE IF NOT EXISTS `goods_vehicle` (
  `user_id` varchar(255) NOT NULL,
  `post_id` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `vehicle_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `goods_vehicle`
--

INSERT INTO `goods_vehicle` (`user_id`, `post_id`, `status`, `vehicle_id`) VALUES
('admin@gmail.com', '2', '0', '4');

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(8);

-- --------------------------------------------------------

--
-- Table structure for table `mybooking`
--

DROP TABLE IF EXISTS `mybooking`;
CREATE TABLE IF NOT EXISTS `mybooking` (
  `id` bigint(20) NOT NULL,
  `cdate` date DEFAULT NULL,
  `capacity` varchar(255) DEFAULT NULL,
  `freight_charges` varchar(255) DEFAULT NULL,
  `from_address` varchar(255) DEFAULT NULL,
  `goods_image` varchar(255) DEFAULT NULL,
  `goods_type` varchar(255) DEFAULT NULL,
  `to_address` varchar(255) DEFAULT NULL,
  `truck_color` varchar(255) DEFAULT NULL,
  `truck_driver` varchar(255) DEFAULT NULL,
  `truck_image` varchar(255) DEFAULT NULL,
  `truck_model` varchar(255) DEFAULT NULL,
  `truck_name` varchar(255) DEFAULT NULL,
  `truck_owner` varchar(255) DEFAULT NULL,
  `truck_owner_phone` varchar(255) DEFAULT NULL,
  `truck_registration_no` varchar(255) DEFAULT NULL,
  `truck_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mybooking`
--

INSERT INTO `mybooking` (`id`, `cdate`, `capacity`, `freight_charges`, `from_address`, `goods_image`, `goods_type`, `to_address`, `truck_color`, `truck_driver`, `truck_image`, `truck_model`, `truck_name`, `truck_owner`, `truck_owner_phone`, `truck_registration_no`, `truck_type`) VALUES
(1, '2018-12-13', '7 Ton', '1700', 'JC Nagar ', 'http://triciel.com/truckit/mobile_services/truck_images/truck5.jpg', 'MACHINERIES', 'R R Nagar', 'Green', 'Arvind', 'http://triciel.com/truckit/mobile_services/post_load_images/1.jpg', 'LIEBHERR50', 'LIEBHERR', 'Kumar', '8945689494', 'KA 40 A 1080', 'TRAILER'),
(2, '2018-12-13', '10 Ton', '1700', 'JC Nagar ', 'http://triciel.com/truckit/mobile_services/truck_images/truck3.jpg', 'GRANITES', 'R R Nagar', 'BlueGrey', 'Madan', 'http://triciel.com/truckit/mobile_services/post_load_images/2.jpg', 'Ford50', 'FORD', 'Kumar', '8945689494', 'KA 20 A 2088', '20 FEET TRAILER LOW BED'),
(3, '2018-12-13', '4 Ton', '7000', 'RT Nagar ', 'http://triciel.com/truckit/mobile_services/truck_images/truck1.jpg', 'TEXTILES', '#68', 'Green', 'Srinivas', 'http://triciel.com/truckit/mobile_services/post_load_images/1000.jpg', 'TATA25', 'TATA', 'Kumar', '8945689494', 'TS 20 S 1947', 'TATA 407'),
(4, '2018-12-13', '4 Ton', '7000', 'RT Nagar ', 'http://triciel.com/truckit/mobile_services/truck_images/truck5.jpg', 'TEXTILES', '#68', 'Green', 'Arvind', 'http://triciel.com/truckit/mobile_services/post_load_images/1000.jpg', 'LIEBHERR50', 'LIEBHERR', 'Kumar', '8945689494', 'KA 40 A 1080', 'TATA 407'),
(5, '2018-12-13', '10 Ton', '5000', '65 ', 'http://triciel.com/truckit/mobile_services/truck_images/truck2.jpg', 'REFRIGERATOR TRUCK', 'Mohan bbbh', 'RED', 'Danny', 'http://triciel.com/truckit/mobile_services/post_load_images/4.png', 'Toyota50', 'TOYOTA', 'Kumar', '8945689494', 'KA 20 A 2018', 'TEXTILES');

-- --------------------------------------------------------

--
-- Table structure for table `persistent_logins`
--

DROP TABLE IF EXISTS `persistent_logins`;
CREATE TABLE IF NOT EXISTS `persistent_logins` (
  `username` varchar(64) NOT NULL,
  `series` varchar(64) NOT NULL,
  `token` varchar(64) NOT NULL,
  `last_used` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`series`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `post_loads`
--

DROP TABLE IF EXISTS `post_loads`;
CREATE TABLE IF NOT EXISTS `post_loads` (
  `id` bigint(20) NOT NULL,
  `cdate` date DEFAULT NULL,
  `ctime` time DEFAULT NULL,
  `capacity` varchar(255) DEFAULT NULL,
  `display_charges` varchar(255) DEFAULT NULL,
  `freight_charges` varchar(255) DEFAULT NULL,
  `from_address` varchar(255) DEFAULT NULL,
  `goods_photo` varchar(255) DEFAULT NULL,
  `goods_type` varchar(255) DEFAULT NULL,
  `location_charges` varchar(255) DEFAULT NULL,
  `to_address` varchar(255) DEFAULT NULL,
  `truck_type` varchar(255) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `post_loads`
--

INSERT INTO `post_loads` (`id`, `cdate`, `ctime`, `capacity`, `display_charges`, `freight_charges`, `from_address`, `goods_photo`, `goods_type`, `location_charges`, `to_address`, `truck_type`, `user_id`) VALUES
(1, '2018-12-12', '02:59:11', '4 Ton', '1', '333', 'RT Nagar', 'http://triciel.com/truckit/mobile_services/post_load_images/1000.jpg', 'TEXTILES', '1', '#68', 'TATA 407', 'admin@gmail.com'),
(2, '2018-12-12', '02:59:11', '7 Ton', '1', '1700', 'JC Nagar', 'http://triciel.com/truckit/mobile_services/post_load_images/1.jpg', 'MACHINERIES', '1', 'RR NAGAR', 'TRAILER', 'admin@gmail.com'),
(3, '2018-12-12', '03:53:11', '10 Ton', '1', '1700', 'JC Nagar', 'http://triciel.com/truckit/mobile_services/post_load_images/2.jpg', 'GRANITES', '1', 'RR NAGAR', '20 FEET TRAILER LOW BED', 'admin@gmail.com'),
(4, '2018-12-12', '03:45:11', '1 Ton', '1', '1700', 'no 68 1st floor 1st block 15th cross rt nagar Bangalore ', 'http://triciel.com/truckit/mobile_services/post_load_images/3.png', 'CONTAINER 24FT', '1', 'no 26 1st floor 1st block 15th cross ', 'PRINTED BOOKS (OR) PAPER ROLLS', 'admin@gmail.com'),
(5, '2018-12-12', '03:45:11', '2 Ton', '1', '1700', 'rt nagar Bangalore ', 'http://triciel.com/truckit/mobile_services/post_load_images/3.png', 'CONTAINER 24FT', '1', 'no 26 1st floor 1st block 15th cross ', 'BOOKS (OR) PAPER ROLLS', 'admin@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
CREATE TABLE IF NOT EXISTS `role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `role`
--

INSERT INTO `role` (`role_id`, `role`) VALUES
(1, 'ADMIN');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id` bigint(20) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `created_by` bigint(20) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phonell` varchar(255) DEFAULT NULL,
  `phone_mobile` varchar(255) DEFAULT NULL,
  `updated_by` bigint(20) DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `active` int(11) DEFAULT NULL,
  `createdby` bigint(20) DEFAULT NULL,
  `firstname` varchar(255) DEFAULT NULL,
  `lastname` varchar(255) DEFAULT NULL,
  `phonemobile` varchar(255) DEFAULT NULL,
  `updatedby` bigint(20) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `address`, `created_by`, `created_date`, `email`, `first_name`, `last_name`, `password`, `phonell`, `phone_mobile`, `updated_by`, `updated_date`, `user_name`, `active`, `createdby`, `firstname`, `lastname`, `phonemobile`, `updatedby`, `username`) VALUES
(1, 'Hyderabad', 1, '2018-12-12 10:17:18', 'erange@gmail.com', 'Erange', 'E', 'chddu', '9845498452', '9443398453', 1, '2018-12-12 10:17:18', 'ean', 1, NULL, NULL, NULL, NULL, NULL, NULL),
(2, 'Desert', 2, '2018-12-12 10:18:39', 'miramar@gmail.com', 'Miramar', 'M', 'pubg', '8845498452', '8443398453', 2, '2018-12-12 10:18:39', 'miramar', 1, NULL, NULL, NULL, NULL, NULL, NULL),
(3, 'GreenLand', 3, '2018-12-12 10:20:03', 'sanhok@gmail.com', 'Sanhok', 'S', 'pubg', '884998452', '8493398453', 3, '2018-12-12 10:20:03', 'sanhok', 1, NULL, NULL, NULL, NULL, NULL, NULL),
(4, 'Himalayas', 4, '2018-12-12 10:21:00', 'vikendi@gmail.com', 'Vikendi', 'V', 'pubg', '884498452', '9493398453', 4, '2018-12-12 10:21:00', 'vikendi', 1, NULL, NULL, NULL, NULL, NULL, NULL),
(5, 'Raj', 5, '2018-12-19 13:17:14', 'manju@gmail.com', 'Rajesh', 'S', '$2a$10$vunjwHtNEmRkAEDrrNlqDOQkuqC58Xeql28DfXC/0/zAkrTfZIQUi', NULL, NULL, NULL, '2018-12-19 13:17:14', NULL, 1, NULL, 'Manjunath', 'M', NULL, NULL, 'hyundai'),
(6, NULL, NULL, '2018-12-21 15:26:10', 'manohar@gmail.com', NULL, NULL, '$2a$10$MmltySjAtqk59lHwe/eBqO9goukbWGMp2Q7N6TwLx1JBXe4bFDA8q', NULL, NULL, NULL, '2018-12-21 15:26:10', NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `user_role`
--

DROP TABLE IF EXISTS `user_role`;
CREATE TABLE IF NOT EXISTS `user_role` (
  `user_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`),
  KEY `user_role_key` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user_role`
--

INSERT INTO `user_role` (`user_id`, `role_id`) VALUES
(5, 1),
(6, 1);

-- --------------------------------------------------------

--
-- Table structure for table `vehicle_list`
--

DROP TABLE IF EXISTS `vehicle_list`;
CREATE TABLE IF NOT EXISTS `vehicle_list` (
  `id` bigint(20) NOT NULL,
  `distance` varchar(255) DEFAULT NULL,
  `driver_name` varchar(255) DEFAULT NULL,
  `driver_id` varchar(255) DEFAULT NULL,
  `driver_mobile_no` varchar(255) DEFAULT NULL,
  `favourite_status` varchar(255) DEFAULT NULL,
  `freight_charge` varchar(255) DEFAULT NULL,
  `lattitude` varchar(255) DEFAULT NULL,
  `longitude` varchar(255) DEFAULT NULL,
  `truck_main_image` varchar(255) DEFAULT NULL,
  `truck_name` varchar(255) DEFAULT NULL,
  `truck_no` varchar(255) DEFAULT NULL,
  `truck_owner` varchar(255) DEFAULT NULL,
  `truck_owner_phone` varchar(255) DEFAULT NULL,
  `truck_type` varchar(255) DEFAULT NULL,
  `vehicle_rating` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vehicle_list`
--

INSERT INTO `vehicle_list` (`id`, `distance`, `driver_name`, `driver_id`, `driver_mobile_no`, `favourite_status`, `freight_charge`, `lattitude`, `longitude`, `truck_main_image`, `truck_name`, `truck_no`, `truck_owner`, `truck_owner_phone`, `truck_type`, `vehicle_rating`) VALUES
(1, '10', 'Beera Balla', 'dri-4', '9845298452', '1', '9000', '13.037705', '77.597822', 'http://triciel.com/truckit/mobile_services/truck_images/truck5.jpg\r\n', 'LIEBHERR', 'KA 40 A 1080', 'Kumar Arvind', '8945689494', 'Tipper', '5'),
(2, '15', 'Channa Basava', 'dri-2', '9846298452', '1', '10000', '14.037705', '77.547822', 'http://triciel.com/truckit/mobile_services/truck_images/truck2.jpg\r\n', 'Ford', 'KA 40 A 1090', 'Kumar Arvind', '8945689494', 'Tipper', '2'),
(3, '14', 'Zuul', 'dri-3', '9846298552', '1', '10000', '14.037705', '77.547822', 'http://triciel.com/truckit/mobile_services/truck_images/truck3.jpg\r\n', 'Toyota', 'KA 40 A 1390', 'Kumar Arvind', '8945689494', 'Tipper', '4'),
(4, '18', 'Shamanna', 'dri-4', '9446298552', '1', '15000', '13.037705', '75.547822', 'http://triciel.com/truckit/mobile_services/truck_images/truck4.jpg\r\n', 'optimus', 'KA 40 A 1340', 'Kumar Arvind', '8945669494', 'Tipper', '3'),
(7, '10', 'Beera Balla', 'dri-4', '9845298452', '1', '9000', '13.037705', '77.597822', 'http://triciel.com/truckit/mobile_services/truck_images/truck5.jpg\r\n', 'LIEBHERR', 'KA 40 A 1080', 'Kumar Arvind', '8945689494', 'Tipper', '6');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `user_role`
--
ALTER TABLE `user_role`
  ADD CONSTRAINT `FKa68196081fvovjhkek5m97n3y` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
