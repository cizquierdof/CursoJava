#nueva base de datos
CREATE SCHEMA `carreteras` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci;
#tabla categorias
CREATE TABLE `carreteras`.`categorias` (
  `idcategorias` INT NOT NULL,
  `categoria` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idcategorias`)
);
#tabla carreteras
CREATE TABLE `carreteras`.`carreteras` (
  `idcarreteras` INT NOT NULL,
  `nombre_carretera` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idcarreteras`)
);
#tabla tramos
CREATE TABLE `carreteras`.`tramos` (
  `idtramos` INT NOT NULL,
  `descripcion_tramo` VARCHAR(45) NOT NULL,
  `final_carretera` TINYINT NOT NULL,
  PRIMARY KEY (`idtramos`)
);
#tabla terminos municipales
CREATE TABLE `carreteras`.`termino_municipal` (
  `idtermino_municipal` INT NOT NULL,
  `nombre_municipio` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idtermino_municipal`)
);
#inserta primeros municipios
INSERT INTO `carreteras`.`termino_municipal` (`idtermino_municipal`, `nombre_municipio`)
VALUES
  ('1', 'Oliva');
INSERT INTO `carreteras`.`termino_municipal` (`idtermino_municipal`, `nombre_municipio`)
VALUES
  ('2', 'Gandía');
INSERT INTO `carreteras`.`termino_municipal` (`idtermino_municipal`, `nombre_municipio`)
VALUES
  ('3', 'bellreguard');
INSERT INTO `carreteras`.`termino_municipal` (`idtermino_municipal`, `nombre_municipio`)
VALUES
  ('4', 'Tavernes');
#inserta categorias
INSERT INTO `carreteras`.`categorias` (`idcategorias`, `categoria`)
VALUES
  ('1', 'locales');
INSERT INTO `carreteras`.`categorias` (`idcategorias`, `categoria`)
VALUES
  ('2', 'comarcales');
INSERT INTO `carreteras`.`categorias` (`idcategorias`, `categoria`)
VALUES
  ('3', 'regionales');
INSERT INTO `carreteras`.`categorias` (`idcategorias`, `categoria`)
VALUES
  ('4', 'nacionales');
INSERT INTO `carreteras`.`categorias` (`idcategorias`, `categoria`)
VALUES
  ('5', 'autovía');
INSERT INTO `carreteras`.`categorias` (`idcategorias`, `categoria`)
VALUES
  ('6', 'autopìsta');
#fk de carreteras
ALTER TABLE `carreteras`.`carreteras`
ADD
  INDEX `categoria_idx` (`categoria` ASC);;
ALTER TABLE `carreteras`.`carreteras`
ADD
  CONSTRAINT `categoria` FOREIGN KEY (`categoria`) REFERENCES `carreteras`.`categorias` (`idcategorias`) ON DELETE NO ACTION ON UPDATE NO ACTION;
#fktramo carretera origen