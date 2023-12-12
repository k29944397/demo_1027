CREATE TABLE IF NOT EXISTS `demo`.`atm` (
  `account` varchar(20) NOT NULL,
  `password` varchar(60) DEFAULT NULL,
  `balance` int DEFAULT '0',
  PRIMARY KEY (`account`)
) 
ENGINE=InnoDB 
DEFAULT CHARSET=utf8mb4 
COLLATE=utf8mb4_0900_ai_ci;