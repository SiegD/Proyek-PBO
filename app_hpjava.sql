-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 28, 2021 at 07:07 PM
-- Server version: 10.1.39-MariaDB
-- PHP Version: 7.3.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `app_hpjava`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_jual`
--

CREATE TABLE `tb_jual` (
  `id` int(11) NOT NULL,
  `no_transaksi` varchar(15) NOT NULL,
  `tgl_jual` date NOT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_jual`
--

INSERT INTO `tb_jual` (`id`, `no_transaksi`, `tgl_jual`, `total`) VALUES
(1, 'T-1', '2021-01-29', 19200000),
(2, 'T-2', '2021-01-29', 25800000),
(3, 'T-3', '2021-01-29', 2500000),
(4, 'T-4', '2021-01-29', 21800000),
(5, 'T-5', '2021-01-29', 5000000),
(6, 'T-6', '2021-01-29', 21800000),
(7, 'T-7', '2021-01-29', 28800000),
(8, 'T-8', '2021-01-29', 100000000),
(9, 'T-9', '2021-01-29', 7500000),
(10, 'T-10', '2021-01-29', 7500000),
(11, 'T-11', '2021-01-29', 15000000),
(12, 'T-12', '2021-01-29', 7500000),
(13, 'T-13', '2021-01-29', 26800000),
(14, 'T-14', '2021-01-29', 24300000),
(15, 'T-15', '2021-01-29', 16800000),
(16, 'T-16', '2021-01-29', 50000000),
(17, 'T-17', '2021-01-29', 75000000),
(18, 'T-18', '2021-01-29', 7500000),
(19, 'T-19', '2021-01-29', 32400000),
(20, 'T-20', '2021-01-29', 7500000),
(21, 'T-21', '2021-01-29', 16800000),
(22, 'T-22', '2021-01-29', 24300000),
(23, 'T-23', '2021-01-29', 25000000),
(24, 'T-24', '2021-01-29', 7500000),
(25, 'T-25', '2021-01-29', 77900000),
(26, 'T-26', '2021-01-29', 60300000),
(27, 'T-27', '2021-01-29', 7500000),
(28, 'T-28', '2021-01-29', 7500000),
(29, 'T-29', '2021-01-29', 128800000),
(30, 'T-30', '2021-01-29', 7500000),
(31, 'T-31', '2021-01-29', 7500000),
(32, 'T-32', '2021-01-29', 100000000),
(33, 'T-33', '2021-01-29', 2500000);

-- --------------------------------------------------------

--
-- Table structure for table `tb_jual_detail`
--

CREATE TABLE `tb_jual_detail` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `merk` varchar(13) NOT NULL,
  `harga` double NOT NULL,
  `qty` int(11) NOT NULL,
  `sub_total` double NOT NULL,
  `no_transaksi` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_jual_detail`
--

INSERT INTO `tb_jual_detail` (`id`, `nama`, `merk`, `harga`, `qty`, `sub_total`, `no_transaksi`) VALUES
(1, 'Note 20', 'Samsung', 9600000, 3, 28800000, 'T-7'),
(2, '9T', 'Oneplus', 5600000, 3, 16800000, 'T-15'),
(3, 'A20', 'Samsung', 2500000, 3, 7500000, 'T-28'),
(4, '9T', 'Oneplus', 5600000, 3, 16800000, 'T-28'),
(5, 'A20', 'Samsung', 2500000, 3, 7500000, 'T-28'),
(6, '9T', 'Oneplus', 5600000, 3, 16800000, 'T-28'),
(7, 'A20', 'Samsung', 2500000, 3, 7500000, 'T-28'),
(8, 'A20', 'Samsung', 2500000, 40, 100000000, 'T-29'),
(9, 'Note 20', 'Samsung', 9600000, 3, 28800000, 'T-29'),
(10, 'A20', 'Samsung', 2500000, 3, 7500000, 'T-30'),
(11, 'A20', 'Samsung', 2500000, 3, 7500000, 'T-31'),
(12, 'A20', 'Samsung', 2500000, 40, 100000000, 'T-32'),
(13, 'A20', 'Samsung', 2500000, 1, 2500000, 'T-33');

-- --------------------------------------------------------

--
-- Table structure for table `tb_keranjang_jual`
--

CREATE TABLE `tb_keranjang_jual` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `merk` varchar(13) NOT NULL,
  `harga` float NOT NULL,
  `qty` int(11) NOT NULL,
  `sub_total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tb_merk`
--

CREATE TABLE `tb_merk` (
  `id` int(11) NOT NULL,
  `nama_merk` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_merk`
--

INSERT INTO `tb_merk` (`id`, `nama_merk`) VALUES
(1, 'Xiaomi'),
(2, 'Samsung'),
(3, 'Apple'),
(4, 'Realme'),
(5, 'Oneplus');

-- --------------------------------------------------------

--
-- Table structure for table `tb_smartphone`
--

CREATE TABLE `tb_smartphone` (
  `id` int(11) NOT NULL,
  `merk` varchar(13) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `stock` int(11) NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_smartphone`
--

INSERT INTO `tb_smartphone` (`id`, `merk`, `nama`, `stock`, `harga`) VALUES
(1, 'Oneplus', '9T', 12, 5600000),
(2, 'Samsung', 'A20', 9, 2500000),
(3, 'Samsung', 'Note 20', 17, 9600000);

-- --------------------------------------------------------

--
-- Table structure for table `tb_users`
--

CREATE TABLE `tb_users` (
  `id` int(11) NOT NULL,
  `username` varchar(25) NOT NULL,
  `password` varchar(50) NOT NULL,
  `status` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_users`
--

INSERT INTO `tb_users` (`id`, `username`, `password`, `status`) VALUES
(1, 'Admin', 'Admin123', 'ADMIN'),
(2, 'Irwan', 'Irwan123', 'Owner');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_jual`
--
ALTER TABLE `tb_jual`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tb_jual_detail`
--
ALTER TABLE `tb_jual_detail`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tb_keranjang_jual`
--
ALTER TABLE `tb_keranjang_jual`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tb_merk`
--
ALTER TABLE `tb_merk`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tb_smartphone`
--
ALTER TABLE `tb_smartphone`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `nama` (`nama`);

--
-- Indexes for table `tb_users`
--
ALTER TABLE `tb_users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_jual`
--
ALTER TABLE `tb_jual`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- AUTO_INCREMENT for table `tb_jual_detail`
--
ALTER TABLE `tb_jual_detail`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `tb_keranjang_jual`
--
ALTER TABLE `tb_keranjang_jual`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=92;

--
-- AUTO_INCREMENT for table `tb_merk`
--
ALTER TABLE `tb_merk`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tb_smartphone`
--
ALTER TABLE `tb_smartphone`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tb_users`
--
ALTER TABLE `tb_users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
