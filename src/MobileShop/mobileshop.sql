-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 31, 2022 at 05:53 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `my shop`
--

-- --------------------------------------------------------

--
-- Table structure for table `mobileshop`
--

CREATE TABLE `mobileshop` (
  `mobileid` int(11) NOT NULL,
  `brandname` varchar(30) DEFAULT NULL,
  `modelname` varchar(30) DEFAULT NULL,
  `ram` varchar(10) DEFAULT NULL,
  `rom` varchar(10) DEFAULT NULL,
  `processor` varchar(30) DEFAULT NULL,
  `buydate` date DEFAULT NULL,
  `selldate` date DEFAULT NULL,
  `Priceofcellphone` double DEFAULT NULL,
  `currentstatus` varchar(10) DEFAULT NULL CHECK (`currentstatus` in ('Available','sold'))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mobileshop`
--

INSERT INTO `mobileshop` (`mobileid`, `brandname`, `modelname`, `ram`, `rom`, `processor`, `buydate`, `selldate`, `Priceofcellphone`, `currentstatus`) VALUES
(1, 'mi', 'redmi 6', '4', '64', 'Snapdragon 888 plus', '2020-02-02', '2021-02-01', 40000, 'Available'),
(2, 'mi', 'redmi 5', '4', '64', 'Snapdragon 888 plus', '2020-01-01', '2021-02-01', 7000, 'sold'),
(3, 'realmi', 'narzo', '4', '63', 'snapdragon', '2021-02-03', '2022-01-01', 8000, 'sold'),
(4, 'mi', 'redmi 3', '3', '32', 'Snapdragon 888 plus', '2020-01-01', NULL, 9000, 'sold '),
(5, 'mi', 'Xiaom 12 pro', '12', '256', 'snapdragon 8 Gen', '2021-02-21', NULL, 10000, 'Available'),
(6, 'Realmi', 'narzo 50a', '4', '64', 'snapdragon', '2021-02-10', '2022-04-20', 12000, 'sold '),
(7, 'mi', 'redmi', '4', '64', 'snapdragon', '2021-02-02', '2022-05-10', 17000, 'sold '),
(8, 'mi', 'redmi 7a', '4', '128', 'snapdragon 8 Gen', '2022-01-21', NULL, 44200, 'available'),
(9, 'mi', 'redmi', '3', '32', 'snapdragon', '2021-02-21', '2022-04-02', 10000, 'sold '),
(10, 'mi', 'redmi', '3', '32', 'snapdrago', '2021-02-02', '2022-10-01', 12200, 'sold '),
(11, 'Sumsung', 'note 4', '3', '64', 'snapdragon', '2022-01-10', NULL, 30000, 'Available'),
(12, 'realmi', 'narzo', '4', '64', 'snapdragon', '2021-03-10', NULL, 0, 'Available'),
(13, 'Sumsung', 'note 9 pro', '4', '128', 'snapdragon 8', '2022-02-10', '2022-10-10', 30020, 'sold '),
(14, 'mi', 'redmi 6a pro', '4', '64', 'snapdragon', '2022-02-02', '2022-05-05', 4000, 'Available'),
(15, 'mi', 'redmi 5', '3', '32', 'snapdragon', '2022-02-04', '2022-06-10', 6400, 'sold '),
(16, 'mi', 'redmi 6a', '6', '128', 'snapdragon 8 Gen', '2022-01-10', NULL, 10000, 'Available'),
(17, 'realmi', 'narzo 50a', '4', '64', 'snapdragon 8', '2022-02-10', '2022-02-15', 4400, 'sold '),
(18, 'Sumsung', 'note 10 pro', '6', '128', 'snapdragon 8 Gen', '2022-01-20', NULL, 23400, 'Available'),
(19, 'realme', 'narzo 50a pro', '6', '256', 'snapdragon', '2022-01-02', NULL, 30000, 'Available'),
(20, 'mi', 'redmi 5a pro', '4', '64', 'snapdragon 8', '2022-02-20', NULL, 30400, 'Available'),
(21, 'mi', 'redmi', '4', '64', 'snapdragon', '2022-02-20', NULL, 20000.2, 'Available'),
(22, 'mi', 'redmi 8 pro', '4', '64', 'snapdragon', '2022-02-20', NULL, 10000, 'Available'),
(23, 'motrola', 'motrola pro', '4', '64', 'snapdragon', '2022-01-30', NULL, 40000, 'Available'),
(100, 'mi', 'mobile', '4', '64', 'snakedrago', '2000-12-23', NULL, 0, 'sold ');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `mobileshop`
--
ALTER TABLE `mobileshop`
  ADD PRIMARY KEY (`mobileid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
