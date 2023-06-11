# Challenge ONE | Java | Back-end | Hotel Alura

Este proyecto es un sistema de reservas para un hotel desarrollado en Java.

## Funcionalidades

- **Sistema de autenticación de usuario**: Permite que solo los usuarios pertenecientes al hotel puedan acceder al sistema.
- **Gestión de reservas**: Permite crear, editar y eliminar reservas para los clientes del hotel.
- **Consulta de información**: Permite buscar en la base de datos tanto la información de los clientes como de las reservas.
- **Gestión de huéspedes**: Permite registrar, editar y eliminar datos de los huéspedes del hotel.
- **Cálculo del valor de la reserva**: Calcula automáticamente el valor de la reserva en función de la cantidad de días y una tasa diaria configurable. Por ejemplo, si tenemos una reserva de 3 días y la tasa diaria es de $20, el sistema multiplicará los 3 días por el valor de la tasa, mostrando al usuario el costo total de la reserva antes de guardarla.
- **Base de datos**: Utiliza una base de datos para almacenar todos los datos requeridos anteriormente.

## Habilidades trabajadas

- **Java**: Lenguaje de programación utilizado para el desarrollo del sistema.
- **Autenticación de usuarios**: Implementación de un sistema de autenticación para garantizar el acceso solo a los usuarios del hotel.
- **Controladores (Controllers)**: Definición de controladores para manejar las solicitudes HTTP y definir los puntos finales de la API.
- **Repositorios (Repositories)**: Implementación de repositorios para interactuar con la base de datos y realizar operaciones CRUD en los modelos de datos.
- **Base de datos**: Configuración y uso de una base de datos para almacenar y consultar la información de los clientes y las reservas.
- **Cálculos automáticos**: Implementación de lógica para calcular automáticamente el valor de la reserva en función de la duración y la tasa diaria.

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


## Configuración y ejecución

Para configurar y ejecutar la aplicación:

1. Clona el repositorio en tu máquina local.
2. Configura la base de datos según tu elección (por ejemplo, MySQL, PostgreSQL).
3. Actualiza la configuración de la base de datos en el archivo de configuración de la aplicación (`application.properties` o `application.yml`).
4. Ejecuta la aplicación utilizando tu IDE preferido o mediante la línea de comandos.
5. Realiza las solicitudes HTTP correspondientes utilizando herramientas como Postman o cURL.

Recuerda que es posible que debas realizar otros pasos adicionales dependiendo de tu entorno de desarrollo y configuración de la base de datos.

¡Disfruta explorando el sistema de reservas del Hotel Alura!

## 🔗 Links
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/matiasjb95/)

https://app.aluracursos.com/emprega-one/profile/matiasss95

![cms_files_10224_1677508436Prancheta_1](https://github.com/MatiasJB95/challenge-one-alura-hotel-latam/assets/115195236/9b0d63e3-8c0b-4010-984e-d63d16b5b8bf)



