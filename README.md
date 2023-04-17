# Challenge ONE | Java | Back-end | Hotel Alura

Sistema de reservas para un hotel realizado en Java



- Sistema de autenticación de usuario para que solo usuarios pertenecientes al hotel consigan acceder al sistema;
- Permitir crear, editar y eliminar una reserva para los clientes;
- Buscar en la base de datos todas las informaciones tanto de los clientes como de las reservas;
- Registrar, editar y eliminar datos de los huéspedes;
- Calcular el valor de la reserva en base a la cantidades de días de la reserva y a una tasa diaria que puede ser asignada por ti y en la moneda local de tu país, por ejemplo si tenemos una reserva de 3 dias y el valor de nuestra diaria son 20$ debemos multiplicar esos 3 dias por el valor de la diaria, lo que serian 60$, todo esto deberá ser hecho automaticamente y mostrado al usuario antes de guardar la reserva;
- Base de datos para almacenar todos los datos pedidos anteriormente.

## Base de datos MYSQL
```
//Creando la base de datos
CREATE DATABASE hotel_alura;



//tabla de huespedes

CREATE TABLE `huespedes` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `NOMBRE` varchar(45) DEFAULT NULL,
  `APELLIDO` varchar(45) DEFAULT NULL,
  `FECHA_NACIMIENTO` date NOT NULL,
  `NACIONALIDAD` varchar(25) DEFAULT NULL,
  `TELEFONO` varchar(50) DEFAULT NULL,
  `ID_RESERVA` int DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID_RESERVA` (`ID_RESERVA`),
  CONSTRAINT `huespedes_ibfk_1` FOREIGN KEY (`ID_RESERVA`) REFERENCES `reservas` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

//tabla de reservas

CREATE TABLE `reservas` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `FECHA_ENTRADA` date NOT NULL,
  `FECHA_SALIDA` date NOT NULL,
  `VALOR` bigint NOT NULL,
  `FORMA_PAGO` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

//tabla de usuarios

CREATE TABLE `usuarios` (
  `nickname` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

```







## Demo

https://user-images.githubusercontent.com/115195236/232333731-bd7ba305-343f-41ca-a917-13eafca546b7.mp4



https://user-images.githubusercontent.com/115195236/232333745-3bd7970e-af67-42b5-9384-6fe4db54ad2e.mp4


## 🔗 Links

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/matiasjb95/)

https://app.aluracursos.com/emprega-one/profile/matiasss95



