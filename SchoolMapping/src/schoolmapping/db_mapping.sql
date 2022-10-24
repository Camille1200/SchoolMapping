-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Oct 25, 2022 at 01:12 AM
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
(1, 1, 1, 'From the system face to the right side and you\'ll see the admission area.', '2022-10-25 06:41:27', NULL, '4', NULL),
(2, 2, 1, 'Way 1 : From the System face at the back and walk straight ahead the entrance of the auditorium is beside the stairs.', '2022-10-25 06:41:27', NULL, '4', NULL),
(3, 3, 1, 'Way 2 : From the System face to the right side and walk ahead and then turn left and you\'ll see the elevator beside the elevator right side you\'ll see an entrance to the auditorium.', '2022-10-25 06:41:27', NULL, '4', NULL),
(4, 4, 1, 'From the system face to the left side and you\'ll see the Cashier beside the Registrar.', '2022-10-25 06:41:27', NULL, '4', NULL),
(5, 5, 1, 'From the system face to the back and to right and you\'ll see the DSA Office near at President\'s Office', '2022-10-25 06:41:27', NULL, '4', NULL),
(6, 6, 1, 'From the system face to the back and to Left and you\'ll see the Meeting Room near at Cashier.', '2022-10-25 06:41:27', NULL, '4', NULL),
(7, 7, 1, 'From the system face to the back and to Left and you\'ll see the President\'s Office.', '2022-10-25 06:41:27', NULL, '4', NULL),
(8, 8, 1, 'From the system face to the left side and you\'ll see the Registrar.', '2022-10-25 06:41:27', NULL, '4', NULL),
(9, 9, 1, 'From the lobby, turn left up to the corner, then turn right and, elevator or stairs can be used as mode of way to be on the 2nd floor.', '2022-10-25 06:41:27', NULL, '4', NULL),
(10, 10, 1, 'From the System face to the right side and walk ahead and then turn left and you\'ll see the elevator beside it walk ahead and you\'ll see a stair going up.', '2022-10-25 06:41:27', NULL, '4', NULL),
(11, 10, 2, 'When you reach the Second Floor you\'ll see an open space.', '2022-10-25 06:41:27', NULL, '4', NULL),
(12, 10, 3, 'Walk ahead and then turn right and you\'ll see the canteen.', '2022-10-25 06:41:27', NULL, '4', NULL),
(13, 11, 1, 'From the System face to the right side and walk ahead and then turn left and you\'ll see the elevator beside it walk ahead and you\'ll see a stair going up.', '2022-10-25 06:41:27', NULL, '4', NULL),
(14, 11, 2, 'When you reach the Second Floor you\'ll see an open space.', '2022-10-25 06:41:27', NULL, '4', NULL),
(15, 11, 3, 'Walk ahead and then turn Left and you\'ll another open space or open area.', '2022-10-25 06:41:27', NULL, '4', NULL);

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
(1, 'Admission', 'Admission.png', '2022-10-25 06:29:21', NULL, '4', NULL),
(2, 'Auditorium Way 1', 'Auditorium Way 1.png', '2022-10-25 06:29:21', NULL, '4', NULL),
(3, 'Auditorium Way 2', 'Auditorium Way 2.png', '2022-10-25 06:29:21', NULL, '4', NULL),
(4, 'Cashier', 'Cashier.png', '2022-10-25 06:29:21', NULL, '4', NULL),
(5, 'DSA Office', 'DSA OFFICE.png', '2022-10-25 06:29:21', NULL, '4', NULL),
(6, 'Meeting Room', 'Meeting Room.png', '2022-10-25 06:29:21', NULL, '4', NULL),
(7, 'President Office', 'President Office.png', '2022-10-25 06:29:21', NULL, '4', NULL),
(8, 'Registrar', 'Registrar.png', '2022-10-25 06:29:21', NULL, '4', NULL),
(9, 'Way to 2nd', 'Way to 2nd.png', '2022-10-25 06:29:21', NULL, '4', NULL),
(10, '2nd Canteen', '2nd Canteen.png', '2022-10-25 06:29:21', NULL, '4', NULL),
(11, '2nd Open Area', '2nd Open Area.png', '2022-10-25 06:29:21', NULL, '4', NULL);

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
  MODIFY `guide_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `map_coordinates`
--
ALTER TABLE `map_coordinates`
  MODIFY `coordinate_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `place`
--
ALTER TABLE `place`
  MODIFY `place_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `superadmin`
--
ALTER TABLE `superadmin`
  MODIFY `admin_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
