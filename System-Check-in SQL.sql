-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 18, 2025 at 06:54 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `systemtest`
--

-- --------------------------------------------------------

--
-- Table structure for table `addkeycard`
--

CREATE TABLE `addkeycard` (
  `keycard_id` varchar(255) NOT NULL,
  `Student_ID` bigint(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `addkeycard`
--

INSERT INTO `addkeycard` (`keycard_id`, `Student_ID`) VALUES
('1DBB6905', 6752101124);

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `password`) VALUES
('Patiphat chunoon', '123456'),
('Juthathip Thiprak', '123456');

-- --------------------------------------------------------

--
-- Table structure for table `check_in`
--

CREATE TABLE `check_in` (
  `Student_ID` bigint(100) NOT NULL,
  `First_Name` varchar(255) NOT NULL,
  `Last_Name` varchar(255) NOT NULL,
  `Date` date NOT NULL,
  `TIME` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `check_in`
--

INSERT INTO `check_in` (`Student_ID`, `First_Name`, `Last_Name`, `Date`, `TIME`) VALUES
(6752101124, 'Montanan', 'Ubolhom', '2025-08-16', '01:31:18'),
(6752100233, 'Boonyisa', 'Panphetr', '2025-08-16', '01:32:26'),
(6752100551, 'Juthathip', 'Thiprak', '2025-08-16', '04:07:03'),
(6752100551, 'Juthathip', 'Thiprak', '2025-08-16', '04:07:57'),
(6752100551, 'Juthathip', 'Thiprak', '2025-08-16', '04:08:55'),
(6752100551, 'Juthathip', 'Thiprak', '2025-08-16', '04:10:53'),
(6752100551, 'Juthathip', 'Thiprak', '2025-08-16', '16:42:44'),
(6752100551, 'Juthathip', 'Thiprak', '2025-08-16', '16:51:05'),
(6752100551, 'Juthathip', 'Thiprak', '2025-08-16', '16:54:41'),
(6752100551, 'Juthathip', 'Thiprak', '2025-08-16', '17:15:43'),
(6752100551, 'Juthathip', 'Thiprak', '2025-08-17', '20:43:27'),
(6752100551, 'Juthathip', 'Thiprak', '2025-08-18', '00:32:31'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '02:15:09'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '02:16:42'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '02:20:06'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '02:20:59'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '02:22:03'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '02:22:03'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '02:23:05'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '02:25:41'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '02:31:20'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '02:35:36'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '02:37:39'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '02:39:12'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '02:40:33'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '02:44:53'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '02:45:14'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '02:48:37'),
(6752100551, 'Juthathip', 'Thiprak', '2025-08-18', '03:23:01'),
(6752100551, 'Juthathip', 'Thiprak', '2025-08-18', '03:24:08'),
(6752100551, 'Juthathip', 'Thiprak', '2025-08-18', '03:24:36'),
(6752100551, 'Juthathip', 'Thiprak', '2025-08-18', '03:26:36'),
(6752100551, 'Juthathip', 'Thiprak', '2025-08-18', '03:27:32'),
(6752100551, 'Juthathip', 'Thiprak', '2025-08-18', '03:28:25'),
(6752100551, 'Juthathip', 'Thiprak', '2025-08-18', '03:29:29'),
(6752100551, 'Juthathip', 'Thiprak', '2025-08-18', '12:41:34'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '14:26:26'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '14:30:57'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '14:30:57'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '14:34:14'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '14:35:58'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '14:36:25'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '14:38:23'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '14:45:01'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '14:45:11'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '14:46:08'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '14:53:53'),
(6752100551, 'mae', 'eiei', '2025-08-18', '14:57:18'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '15:00:46'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '15:02:08'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '15:07:10'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '15:07:31'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '16:44:46'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '16:45:09'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '16:45:15'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '16:45:20'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '16:51:20'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '16:51:40'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '17:45:21'),
(6752101124, 'Montanan', 'Ubolhom', '2025-08-18', '17:46:51');

-- --------------------------------------------------------

--
-- Table structure for table `registertest`
--

CREATE TABLE `registertest` (
  `Student_ID` bigint(100) NOT NULL,
  `First_Name` varchar(255) NOT NULL,
  `Last_Name` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `Gmail` varchar(255) NOT NULL,
  `Major` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `registertest`
--

INSERT INTO `registertest` (`Student_ID`, `First_Name`, `Last_Name`, `Password`, `Gmail`, `Major`) VALUES
(6752101124, 'Montanan', 'Ubolhom', '2424242', 'Montagan21@gmail.com', 'AME');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
