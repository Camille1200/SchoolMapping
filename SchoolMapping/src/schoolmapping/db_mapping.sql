-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Oct 23, 2022 at 03:24 AM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_mapping`
--

-- --------------------------------------------------------

--
-- Table structure for table `guide`
--

CREATE TABLE `guide` (
  `guide_id` int(11) NOT NULL,
  `place_id` int(11) NOT NULL,
  `instruction_no` int(11) NOT NULL,
  `instruction` text NOT NULL,
  `datecreated` datetime NOT NULL,
  `dateupdated` datetime DEFAULT NULL,
  `added_by` text DEFAULT NULL,
  `updated_by` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `guide`
--

INSERT INTO `guide` (`guide_id`, `place_id`, `instruction_no`, `instruction`, `datecreated`, `dateupdated`, `added_by`, `updated_by`) VALUES
(1, 1, 3, 'Go to school', '2022-10-23 07:01:47', '2022-10-23 09:23:39', 'oliverjohns', '4'),
(2, 0, 3, 'Go to fourth floor', '2022-10-23 08:55:34', NULL, '4', NULL),
(3, 2, 2, 'Third', '2022-10-23 09:07:08', '2022-10-23 09:23:01', '4', '4');

-- --------------------------------------------------------

--
-- Table structure for table `map_coordinates`
--

CREATE TABLE `map_coordinates` (
  `coordinate_id` int(11) NOT NULL,
  `place_id` int(11) NOT NULL,
  `coord_x` int(11) NOT NULL,
  `coord_y` int(11) NOT NULL,
  `datecreated` datetime NOT NULL,
  `dateupdated` datetime DEFAULT NULL,
  `added_by` text NOT NULL,
  `updated_by` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `map_coordinates`
--

INSERT INTO `map_coordinates` (`coordinate_id`, `place_id`, `coord_x`, `coord_y`, `datecreated`, `dateupdated`, `added_by`, `updated_by`) VALUES
(1, 1, 11, 15, '2022-10-20 04:27:39', '2022-10-20 14:45:28', 'john', 'john'),
(2, 1, 50, 10, '2022-10-20 04:32:10', NULL, 'john', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `place`
--

CREATE TABLE `place` (
  `place_id` int(11) NOT NULL,
  `place_name` text NOT NULL,
  `place_url` text NOT NULL,
  `datecreated` datetime NOT NULL,
  `dateupdated` datetime DEFAULT NULL,
  `added_by` text DEFAULT NULL,
  `updated_by` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `place`
--

INSERT INTO `place` (`place_id`, `place_name`, `place_url`, `datecreated`, `dateupdated`, `added_by`, `updated_by`) VALUES
(1, 'Washrooms', 'https://www.facebook.com', '2022-10-20 14:27:11', '2022-10-23 05:20:16', 'john', '4'),
(2, '44', '44', '2022-10-23 05:11:53', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `superadmin`
--

CREATE TABLE `superadmin` (
  `admin_id` int(11) NOT NULL,
  `admin_name` text NOT NULL,
  `admin_handle` text NOT NULL,
  `admin_password` text NOT NULL,
  `datecreated` datetime NOT NULL,
  `dateupdated` datetime DEFAULT NULL,
  `added_by` text DEFAULT NULL,
  `updated_by` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `superadmin`
--

INSERT INTO `superadmin` (`admin_id`, `admin_name`, `admin_handle`, `admin_password`, `datecreated`, `dateupdated`, `added_by`, `updated_by`) VALUES
(1, 'John', 'johndoe', 'OkayNo.1ito', '2022-10-20 14:36:06', '2022-10-21 03:11:22', 'john', 'john'),
(2, 'olivers', 'oliverjohns', '123', '2022-10-22 21:39:07', '2022-10-23 04:29:57', 'john', 'oliverjohn'),
(3, 'John Okay', 'okay', '', '2022-10-23 03:19:23', '2022-10-23 04:34:24', NULL, 'oliverjohns'),
(4, '33', '23', '123', '2022-10-23 04:00:05', NULL, 'oliverjohn', NULL),
(5, '4', '4', '4', '2022-10-23 04:02:36', NULL, 'oliverjohn', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `guide`
--
ALTER TABLE `guide`
  ADD PRIMARY KEY (`guide_id`);

--
-- Indexes for table `map_coordinates`
--
ALTER TABLE `map_coordinates`
  ADD PRIMARY KEY (`coordinate_id`);

--
-- Indexes for table `place`
--
ALTER TABLE `place`
  ADD PRIMARY KEY (`place_id`);

--
-- Indexes for table `superadmin`
--
ALTER TABLE `superadmin`
  ADD PRIMARY KEY (`admin_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `guide`
--
ALTER TABLE `guide`
  MODIFY `guide_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `map_coordinates`
--
ALTER TABLE `map_coordinates`
  MODIFY `coordinate_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `place`
--
ALTER TABLE `place`
  MODIFY `place_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `superadmin`
--
ALTER TABLE `superadmin`
  MODIFY `admin_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
