CREATE SCHEMA IF NOT EXISTS `sigcd` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `sigcd` ;

-- -----------------------------------------------------
-- Table `sigcd`.`GradoAcademicoAA`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS `sigcd`.`GradoAcademico` (
    `idGradoAcademico` INT NOT NULL AUTO_INCREMENT,
    `gradoAcadamico` VARCHAR(45),
    PRIMARY KEY (`idGradoAcademico`)
);

-- -----------------------------------------------------
-- Table `sigcd`.`Estado`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS `sigcd`.`Estado` (
    `idEstado` INT NOT NULL AUTO_INCREMENT,
    `estado` VARCHAR(45),
    PRIMARY KEY (`idEstado`)
);

-- -----------------------------------------------------
-- Table `sigcd`.`Estudiante`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS `sigcd`.`Estudiante` (
    `idEstudiante` INT NOT NULL AUTO_INCREMENT,
    `cedula` VARCHAR(45) NOT NULL,
    `nombre` VARCHAR(45) NOT NULL,
    `primerApellido` VARCHAR(45) NOT NULL,
    `segundoApellido` VARCHAR(45) NOT NULL,
    `telefonoHabitacion` VARCHAR(45),
    `telefonoCelular` VARCHAR(45) NOT NULL,
    `distrito` VARCHAR(45) NOT NULL,
    `barrio` VARCHAR(45) NOT NULL,
    `direccionExacta` VARCHAR(45) NOT NULL,
    `gradoAcademico` INT NOT NULL,
    `edad` INT NOT NULL,
    `fechaNacimiento` VARCHAR(45) NOT NULL,
    `nombreMadre` VARCHAR(45) NOT NULL,
    `primerApellidoMadre` VARCHAR(45) NOT NULL,
    `segundoApellidoMadre` VARCHAR(45) NOT NULL,
    `nombrePadre` VARCHAR(45) NOT NULL,
    `primerApellidoPadre` VARCHAR(45) NOT NULL,
    `segundoApellidoPadre` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`idEstudiante`),
    CONSTRAINT `fkGradoAcademico` FOREIGN KEY (`gradoAcademico`)
        REFERENCES `sigcd`.`GradoAcademico` (`idGradoAcademico`)
);

-- -----------------------------------------------------
-- Table `sigcd`.`Solicitante`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS `sigcd`.`Solicitante` (
    `idSolicitante` INT NOT NULL AUTO_INCREMENT,
    `cedula` VARCHAR(45) NOT NULL,
    `nombre` VARCHAR(45) NOT NULL,
    `primerApellido` VARCHAR(45) NOT NULL,
    `segundoApellido` VARCHAR(45) NOT NULL,
    `telefonoHabitacion` VARCHAR(45),
    `telefonoCelular` VARCHAR(45) NOT NULL,
    `distrito` VARCHAR(45) NOT NULL,
    `barrio` VARCHAR(45) NOT NULL,
    `direccionExacta` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`idSolicitante`)
);

-- -----------------------------------------------------
-- Table `sigcd`.`AyudaTemporal`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS `sigcd`.`AyudaTemporal` (
    `idAyudaTemporal` INT NOT NULL AUTO_INCREMENT,
    `estado` INT NOT NULL,
    `solicitante` INT NOT NULL,
    `motivoAyuda` VARCHAR(200) NOT NULL,
    `fechaCreacion` TIMESTAMP NOT NULL,
    PRIMARY KEY (`idAyudaTemporal`),
    CONSTRAINT `fkSolicitante` FOREIGN KEY (`solicitante`)
        REFERENCES `sigcd`.`solicitante` (`idSolicitante`),
    CONSTRAINT `fkEstadoAY` FOREIGN KEY (`estado`)
        REFERENCES `sigcd`.`Estado` (`idEstado`)
);

-- -----------------------------------------------------
-- Table `sigcd`.`BecaMunicipal`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS `sigcd`.`BecaMunicipal` (
    `idBecaMunicipal` INT NOT NULL AUTO_INCREMENT,
    `estado` INT NOT NULL,
    `estudiante` INT NOT NULL,
    `fechaCreacion` TIMESTAMP NOT NULL,
    PRIMARY KEY (`idBecaMunicipal`),
    CONSTRAINT `fkEstudiante` FOREIGN KEY (`estudiante`)
        REFERENCES `sigcd`.`estudiante` (`idEstudiante`),
    CONSTRAINT `fkEstadoBM` FOREIGN KEY (`estado`)
        REFERENCES `sigcd`.`Estado` (`idEstado`)
);  

insert	into Estado values(1, "Aceptado");