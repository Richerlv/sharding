CREATE DATABASE `mall`;
CREATE TABLE `orders0` (
                           `id` bigint NOT NULL AUTO_INCREMENT,
                           `order_number` varchar(50) NOT NULL,
                           `create_time` date NOT NULL,
                           `creater` varchar(20) NOT NULL,
                           `money` decimal(10,0) NOT NULL,
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `orders1` (
                           `id` bigint NOT NULL AUTO_INCREMENT,
                           `order_number` varchar(50) NOT NULL,
                           `create_time` date NOT NULL,
                           `creater` varchar(20) NOT NULL,
                           `money` decimal(10,0) NOT NULL,
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;