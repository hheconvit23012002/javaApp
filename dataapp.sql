-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: userapp
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `question`
--

DROP TABLE IF EXISTS `question`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `question` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `questionstring` varchar(100) NOT NULL,
  `answerA` varchar(100) NOT NULL,
  `answerB` varchar(100) NOT NULL,
  `answerC` varchar(100) NOT NULL,
  `answerD` varchar(100) NOT NULL,
  `answerExactly` varchar(100) NOT NULL,
  `idthemequestion` int NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `PK_idthemequestion_idx` (`idthemequestion`),
  CONSTRAINT `PK_idthemequestion` FOREIGN KEY (`idthemequestion`) REFERENCES `themequestion` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `question`
--

LOCK TABLES `question` WRITE;
/*!40000 ALTER TABLE `question` DISABLE KEYS */;
INSERT INTO `question` VALUES (4,'What\'s the rate for a double room?','10 a.m','$250.00','Per hour','Very fast','$250.00',2),(5,'How con i get to the airport?','By snuffle','By shackle','By shuffle','By shuttle','By shuttle',2),(6,'Does the lobby have internet?','Yes, every other Friday','Yes, at 11 a.m','Yes, 24 hours a day, every day','Yes, in room 209','Yes, 24 hours a day, every day',2),(7,'My teacher (have).................. long hair. ','have','has','have had','had','has',3),(8,'They (not want )………to play the love games, but they (play)…...…..now.','isn\'t want, plays','doesn\'t want, plays','not want, are playing ','don’t want, are playing','don’t want, are playing',3),(9,'Look! The man (climb)……..up the tree.','is climbing','climbs','are climbing','climb','is climbing',3),(10,'The new comers (not know)…...............…… the rules of the club.','doesn\'t know','don’t know','isn\'t knowing','aren\'t knowing','don’t know',3),(11,'.................. Tom (be) mad? He ( throw)………all his books and (cry) ………..now.','Is, are throwing, crying','Is, is throwing, crying','Is, throws, cries','Is, is throw, cry','Is, is throwing, crying',3);
/*!40000 ALTER TABLE `question` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Fullname` varchar(50) DEFAULT NULL,
  `Email` varchar(50) NOT NULL,
  `Age` int NOT NULL,
  `username` varchar(50) NOT NULL,
  `pass` varchar(50) DEFAULT NULL,
  `type` int NOT NULL,
  PRIMARY KEY (`ID`,`username`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (15,'admin','huan@gmail.com',20,'admin','1',0),(16,'day la admin','admin@gmail.com',20,'admin1','1',1);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `themequestion`
--

DROP TABLE IF EXISTS `themequestion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `themequestion` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `namethemequestion` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `themequestion`
--

LOCK TABLES `themequestion` WRITE;
/*!40000 ALTER TABLE `themequestion` DISABLE KEYS */;
INSERT INTO `themequestion` VALUES (2,'Hotel Dialogues'),(3,'Present simple,continuous');
/*!40000 ALTER TABLE `themequestion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `themevocabulary`
--

DROP TABLE IF EXISTS `themevocabulary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `themevocabulary` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Nametheme` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `Nametheme_UNIQUE` (`Nametheme`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `themevocabulary`
--

LOCK TABLES `themevocabulary` WRITE;
/*!40000 ALTER TABLE `themevocabulary` DISABLE KEYS */;
INSERT INTO `themevocabulary` VALUES (1,'animal'),(2,'drink'),(5,'family'),(6,'food'),(4,'iteams');
/*!40000 ALTER TABLE `themevocabulary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vocabulary`
--

DROP TABLE IF EXISTS `vocabulary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vocabulary` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `English` varchar(50) NOT NULL,
  `Vietnamese` varchar(50) NOT NULL,
  `idtheme` int NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `Vietnamese` (`Vietnamese`),
  KEY `PK_idtheme_idx` (`idtheme`),
  CONSTRAINT `PK_idtheme` FOREIGN KEY (`idtheme`) REFERENCES `themevocabulary` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vocabulary`
--

LOCK TABLES `vocabulary` WRITE;
/*!40000 ALTER TABLE `vocabulary` DISABLE KEYS */;
INSERT INTO `vocabulary` VALUES (7,'cat','mèo',1),(8,'bear','con gấu',1),(9,'chimpanzee','con tinh tinh',1),(10,'elephant','con voi',1),(11,'fox','con cáo',1),(12,'lion','con sư tử',1),(13,'bat','dơi',1),(14,'deer','hươi',1),(20,'father','bố',5),(21,'milk','sữa',2),(24,'soda','nước uống có ga',2),(25,'tea','trà',2),(26,'mother','mẹ',5),(27,'son','con trai',5),(28,'brother','anh trai/em trai',5),(29,'sister','chị gái/em gái',5),(30,'uncle','bác trai',5);
/*!40000 ALTER TABLE `vocabulary` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-05  8:25:32
