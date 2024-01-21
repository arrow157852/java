CREATE DATABASE  IF NOT EXISTS `grifo` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `grifo`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: grifo
-- ------------------------------------------------------
-- Server version	8.0.34

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `planilha`
--

DROP TABLE IF EXISTS `planilha`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `planilha` (
  `material` varchar(100) DEFAULT NULL,
  `valor_unidade` float DEFAULT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `CategoriaID` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `CategoriaID` (`CategoriaID`),
  CONSTRAINT `planilha_ibfk_1` FOREIGN KEY (`CategoriaID`) REFERENCES `categorias` (`CategoriaID`)
) ENGINE=InnoDB AUTO_INCREMENT=83 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `planilha`
--

LOCK TABLES `planilha` WRITE;
/*!40000 ALTER TABLE `planilha` DISABLE KEYS */;
INSERT INTO `planilha` VALUES ('Aterrinsert_Tel__p_rebar',47,1,2),('Re_bar_aco__galvanizado_38___3_METROS',9.27,2,2),('Re_bar_aco__galvanizado_38___3.4_METROS_',45.66,3,2),('Cabo_cobre_nu_35mm',35,4,2),('Cabo_cobre_nu_50mm',40,5,2),('Cabo_bimetalico_cobreado_70mm',0,6,2),('Corodoalha__de_aco__14__16_mm',8,7,2),('Corodoalha__de_aco_38___50_mm',16,8,2),('Corodoalha__de_aco_716___70_mm',20,9,2),('cabo_de_alumino_70mm',14,10,2),('Cabo_flexivel_verde_16_mm',13,11,2),('Tampa_ferro_fundido_250mm_',55,12,2),('Tampa_aco__250mm__',55,13,2),('Caixa_de_inspecao_plastico_completa_20x15',16,14,2),('Caixa_de_inspecao_300mm_PRT_957',18,15,2),('Caixa_BEP_metal__9_ou_11_terminais_',400,16,2),('Caixa_bep_pvc_5_terminais_',200,17,2),('Caixa_BEP_Tetrapolar_classe_12_mon0737',0,18,2),('Caixa_Equibox_Tetrapolar_classe1e2compact',0,19,2),('Clips_galvanizado_3/8',3,20,2),('Clips_galvanizado_1/2',5,21,2),('Clips_galvanizado_5/8',7,22,2),('Clips_galvanizado_3/4',9,23,2),('Clips_galvanizado_1',12,24,2),('Conector_de_haste_CHT1(GTDU)',16,25,2),('Conector_split_bolt_35mm',20,26,2),('Conector_split_bolt_50mm',23,27,2),('fixador_universal_35mm__par_fendido_sapata',19.8,28,2),('Haste_alta_camada__58_x_2.40m',150,29,2),('Haste_baixa_camada',62,30,2),('Luva_pra_emenda_de_haste_',20,31,2),('Terminal_de_compresscao_16mm',5,32,2),('Terminal_de_compresscao_35',8,33,2),('Terminal_de_compresscao_50',10,34,2),('Terminal_de_compresscao_70',12,35,2),('Seal_Tubo',5.6,36,2),('solda_exotermica_completa_',30,37,2),('Conector_box_',7.2,38,2),('Adesivo_poliuretano__veda_calhas_',20,39,2),('Conector_Emenda_50_mm_PRT_903_',21,40,2),('Conector_Emenda_50_mm_PRT_901',10,41,2),('Barra_chata_alum’nio_7/8x18',39,42,2),('abracadeira_galv._p_eletroduto_pvc_1_',1.8,43,2),('abracadeira_galv._p_eletroduto__pvc_1_12',2,44,2),('eletroduto_pvc_3m_1',25,45,2),('luva_de_emenda_70mm',12,46,2),('luva_de_emenda_50mm',10,47,2),('caixa_Inspecao_suspensa_',23,48,2),('Isolador_simples___paratec_PRT_253',3,49,2),('isolador_para_quina_tel(2_pecas)',48.87,50,2),('isolador_200_mm',6,51,2),('Isoladores__20_cm__paratec_PRT_214',6,52,2),('presilha_latao_estanhado_para_cabo_aco_70mm',3,53,2),('bucha_de_reducao_p_mastro_1_12x34',15,54,2),('Base_p_mastro_1_12',36,55,2),('apoio_p_mastro_1_12_',6.2,56,2),('Suporte_porta_bandeira_1_12_PRT_522',18,57,2),('abracadeira_p_simalizador_PRT_986',15,58,2),('captor_franklin_aluminio',55,59,2),('conjunto_de_estaios_1_1/2',150,60,2),('eletroduto_p_mastro_galvanizado_medio_1_12__3m',120,61,2),('Mastro_galvanizado_3_m_1_12_',220,62,2),('Mastro_galvanizado_6_m_',330,63,2),('Mastro_galvanizado_20_m_',0,64,2),('sinalizador_com_fotocelula_completo_individual_do_mastro_',70,65,2),('sinalizador_duplo_com_fotocelula_',90,66,2),('Mastro_franklin_(Eletroduto)_3m_COMPLETO_',350,67,2),('Mastro_franklin_(galvanizado)3m_COMPLETO_',450,68,2),('Mastro_franklin_6m___COMPLETO_',650,69,2),('Mastro_20_m_(termotecnica_)	',0,70,2),('Mastro_Franklin_3_m__com_estaio___COMPLETO_',550,71,2),('Mini_captor_de_aluminio',7,72,2),('Parafuso_brocante_',0.15,73,2),('Parafuso_de_emenda_14_x_34__completo_',1.5,74,2),('Parafuso_de_Parede_completo___8_mm_',1.5,75,2),('Parafuso_de_Parede_completo___6_mm_',0.9,76,2),('DPS_CLAMPER_VCL_275V_12.560KA_SLIM',150,77,2),('DPS_CLAMPER_VCL_275V_45KA_SLIM',90,78,2),('Fita_perfurada',30,79,2);
/*!40000 ALTER TABLE `planilha` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `before_insert_trigger_planilha` BEFORE INSERT ON `planilha` FOR EACH ROW BEGIN
    SET NEW.CategoriaID = 2;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-01-20 22:20:31
