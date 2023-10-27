-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-10-2023 a las 01:07:36
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sistemadecompras`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE `compra` (
  `idCompra` int(11) NOT NULL,
  `idProveedor` int(11) NOT NULL,
  `detalle` text NOT NULL,
  `cant` int(11) NOT NULL,
  `total` double NOT NULL,
  `fecha` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `compra`
--

INSERT INTO `compra` (`idCompra`, `idProveedor`, `detalle`, `cant`, `total`, `fecha`) VALUES
(6, 7, '[2 - Heladera c/ freezer 200 lts]', 5, 750, '2023-10-26 23:03:44'),
(7, 8, '[3 - Lavarropas carga frontal 10 kg]', 10, 582, '2023-10-26 23:03:59'),
(9, 9, '[2 - Heladera c/ freezer 200 lts, 3 - Lavarropas carga frontal 10 kg, 4 - Lavavajillas ecologico]', 30, 9974, '2023-10-26 23:06:47');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallecompra`
--

CREATE TABLE `detallecompra` (
  `idDetalle` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precioCosto` double NOT NULL,
  `idCompra` int(11) NOT NULL,
  `idProducto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `detallecompra`
--

INSERT INTO `detallecompra` (`idDetalle`, `cantidad`, `precioCosto`, `idCompra`, `idProducto`) VALUES
(1, 5, 375000, 1, 1),
(2, 2, 150000, 2, 1),
(3, 2, 150000, 3, 1),
(4, 2, 150000, 4, 1),
(5, 2, 150000, 5, 1),
(6, 5, 2750, 6, 2),
(7, 10, 6582, 7, 3),
(8, 1, 789.2, 8, 4),
(9, 10, 5500, 9, 2),
(10, 10, 6582, 9, 3),
(11, 10, 7892, 9, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  `estado` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `nombre`, `precio`, `stock`, `estado`) VALUES
(1, 'microondas wave 3500w', 75000, 12, 0),
(2, 'Heladera c/ freezer 200 lts', 550, 15, 1),
(3, 'Lavarropas carga frontal 10 kg', 658.2, 20, 1),
(4, 'Lavavajillas ecologico', 789.2, 11, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `idProveedor` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `domicilio` varchar(50) DEFAULT NULL,
  `telefono` varchar(30) DEFAULT NULL,
  `estado` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`idProveedor`, `nombre`, `domicilio`, `telefono`, `estado`) VALUES
(1, 'a', 'b', 'c', 0),
(3, 'Samsung', 'Calle 123', '44466655', 0),
(4, 'Panasonic', 'Calle 555', '464646', 0),
(5, 'Phillips', 'Avenida 456', '464646', 0),
(6, 'Lalala', 'Calle ', '123', 0),
(7, 'Samsung', 'Calle 123', '445566', 1),
(8, 'Phillips', 'Av Calle 123', '4466655', 1),
(9, 'Lenovo', 'Calle 456', '4466655', 1),
(10, 'Gafa', 'Calle 444', '464646', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`idCompra`),
  ADD KEY `idProveedor` (`idProveedor`);

--
-- Indices de la tabla `detallecompra`
--
ALTER TABLE `detallecompra`
  ADD PRIMARY KEY (`idDetalle`),
  ADD KEY `idProducto` (`idProducto`),
  ADD KEY `idCompra` (`idCompra`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idProducto`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`idProveedor`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `compra`
--
ALTER TABLE `compra`
  MODIFY `idCompra` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `detallecompra`
--
ALTER TABLE `detallecompra`
  MODIFY `idDetalle` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `idProveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `compra`
--
ALTER TABLE `compra`
  ADD CONSTRAINT `compra_ibfk_1` FOREIGN KEY (`idProveedor`) REFERENCES `proveedor` (`idProveedor`);

--
-- Filtros para la tabla `detallecompra`
--
ALTER TABLE `detallecompra`
  ADD CONSTRAINT `detallecompra_ibfk_1` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`),
  ADD CONSTRAINT `detallecompra_ibfk_2` FOREIGN KEY (`idCompra`) REFERENCES `compra` (`idCompra`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
