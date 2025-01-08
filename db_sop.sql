-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 08, 2025 at 02:54 AM
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
-- Database: `db_sop`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_mbrg`
--

CREATE TABLE `tb_mbrg` (
  `kodeBarang` varchar(12) NOT NULL,
  `pelanggan` varchar(30) NOT NULL,
  `jenisBarang` varchar(50) NOT NULL,
  `stok` int(11) NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_mbrg`
--

INSERT INTO `tb_mbrg` (`kodeBarang`, `pelanggan`, `jenisBarang`, `stok`, `harga`) VALUES
('AA001', 'Fajar', 'Adidas Adizero', 5, 3000000),
('HC003', 'Hanifah', 'Hoka Clifton', 10, 2500000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_mbrg`
--
ALTER TABLE `tb_mbrg`
  ADD PRIMARY KEY (`kodeBarang`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
