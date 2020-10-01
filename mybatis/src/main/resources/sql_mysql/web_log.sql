/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50628
 Source Host           : localhost:3306
 Source Schema         : zero

 Target Server Type    : MySQL
 Target Server Version : 50628
 File Encoding         : 65001

 Date: 21/09/2020 22:22:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for web_log
-- ----------------------------
DROP TABLE IF EXISTS `web_log`;
CREATE TABLE `web_log`  (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '唯一标识',
  `code` int(3) NULL DEFAULT NULL COMMENT '请求状态码（例如：200,500,404等）',
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作描述',
  `username` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作用户',
  `start_time` bigint(11) NULL DEFAULT NULL COMMENT '操作时间',
  `spend_time` bigint(11) NULL DEFAULT NULL COMMENT '消耗时间（毫秒）',
  `base_path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '根路径',
  `uri` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'URI',
  `url` varchar(552) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'URL',
  `method` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '请求类型',
  `ip` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'IP地址',
  `parameter` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '请求参数',
  `result` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '请求返回的结果',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 24 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '系统日志表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of web_log
-- ----------------------------
INSERT INTO `web_log` VALUES (1, NULL, NULL, NULL, 1600696387383, 163, 'http://localhost:8089', '/tSalary/selectOne', 'http://localhost:8089/tSalary/selectOne', 'GET', NULL, NULL, '{\"name\":\"Airi Satou\",\"id\":1,\"position\":\"Accountant\",\"office\":\"Tokyo\",\"salary\":20000,\"age\":33,\"startDate\":1587772800000}');
INSERT INTO `web_log` VALUES (2, NULL, '查询所有的员工信息', NULL, 1600696598604, 50, 'http://localhost:8089', '/tSalary/findAll', 'http://localhost:8089/tSalary/findAll', 'GET', NULL, NULL, '[{\"name\":\"Airi Satou\",\"id\":1,\"position\":\"Accountant\",\"office\":\"Tokyo\",\"salary\":20000,\"age\":33,\"startDate\":1587772800000},{\"name\":\"Angelica Ramos\",\"id\":2,\"position\":\"Chief Executive Officer (CEO)\",\"office\":\"London\",\"salary\":1200000,\"age\":47,\"startDate\":960249600000},{\"name\":\"Ashton Cox\",\"id\":3,\"position\":\"Junior Technical Author\",\"office\":\"San Francisco\",\"salary\":20000,\"age\":66,\"startDate\":1587600000000},{\"name\":\"Bradley Greer\",\"id\":4,\"position\":\"Software Engineer\",\"office\":\"London\",\"salary\":35000,\"age\":45,\"startDate\":1461628800000},{\"name\":\"Brenden Wagner\",\"id\":5,\"position\":\"Software Engineer\",\"office\":\"San Francisco\",\"salary\":35000,\"age\":28,\"startDate\":1244505600000},{\"name\":\"Brielle Williamson\",\"id\":6,\"position\":\"Integration Specialist\",\"office\":\"New York\",\"salary\":45000,\"age\":61,\"startDate\":1303257600000},{\"name\":\"Bruno Nash\",\"id\":7,\"position\":\"Software Engineer\",\"office\":\"London\",\"salary\":35000,\"age\":38,\"startDate\":1510790400000},{\"name\":\"Caesar Vance\",\"id\":8,\"position\":\"Pre-Sales Support\",\"office\":\"New York\",\"salary\":10600,\"age\":21,\"startDate\":1407888000000},{\"name\":\"Cara Stevens\",\"id\":9,\"position\":\"Sales Assistant\",\"office\":\"New York\",\"salary\":13000,\"age\":46,\"startDate\":1474675200000},{\"name\":\"Cedric Kelly\",\"id\":10,\"position\":\"Senior Javascript Developer\",\"office\":\"Edinburgh\",\"salary\":28000,\"age\":22,\"startDate\":1461283200000},{\"name\":\"Dob Drew\",\"id\":11,\"position\":\"Accountant\",\"office\":\"Edinburgh\",\"salary\":13000,\"age\":24,\"startDate\":1139616000000},{\"name\":\"Charde Marshall\",\"id\":12,\"position\":\"Regional Director\",\"office\":\"San Francisco\",\"salary\":24700,\"age\":36,\"startDate\":1528329600000},{\"name\":\"Dai Rios\",\"id\":13,\"position\":\"Personnel Lead\",\"office\":\"San Francisco\",\"salary\":56000,\"age\":35,\"startDate\":1244505600000},{\"name\":\"Donna Snider\",\"id\":14,\"position\":\"Customer Support\",\"office\":\"New York\",\"salary\":37200,\"age\":27,\"startDate\":1303257600000},{\"name\":\"Doris Wilder\",\"id\":15,\"position\":\"Sales Assistant\",\"office\":\"London\",\"salary\":12900,\"age\":23,\"startDate\":1510790400000},{\"name\":\"Finn Camacho\",\"id\":16,\"position\":\"Support Engineer\",\"office\":\"New York\",\"salary\":10600,\"age\":47,\"startDate\":1407888000000},{\"name\":\"Fiona Green\",\"id\":17,\"position\":\"Chief Operating Officer (COO)\",\"office\":\"New York\",\"salary\":50600,\"age\":48,\"startDate\":1474675200000},{\"name\":\"Garrett Winters\",\"id\":18,\"position\":\"Accountant\",\"office\":\"Edinburgh\",\"salary\":20000,\"age\":63,\"startDate\":1461283200000},{\"name\":\"Gavin Cortez\",\"id\":19,\"position\":\"Team Leader\",\"office\":\"San Francisco\",\"salary\":51800,\"age\":22,\"startDate\":1528329600000},{\"name\":\"Herrod Chandler\",\"id\":20,\"position\":\"Sales Assistant\",\"office\":\"San Francisco\",\"salary\":12900,\"age\":47,\"startDate\":1356912000000},{\"name\":\"Hope Fuentes\",\"id\":21,\"position\":\"Secretary\",\"office\":\"San Francisco\",\"salary\":20000,\"age\":59,\"startDate\":1234310400000}]');
INSERT INTO `web_log` VALUES (3, NULL, '根据员工ID，查询员工信息', NULL, 1600696720227, 32, 'http://localhost:8089', '/tSalary/findOne/2', 'http://localhost:8089/tSalary/findOne/2', 'GET', NULL, NULL, '{\"name\":\"Angelica Ramos\",\"id\":2,\"position\":\"Chief Executive Officer (CEO)\",\"office\":\"London\",\"salary\":1200000,\"age\":47,\"startDate\":960249600000}');
INSERT INTO `web_log` VALUES (4, NULL, '根据员工ID，查询员工信息', NULL, 1600696726178, 14, 'http://localhost:8089', '/tSalary/findOne/5', 'http://localhost:8089/tSalary/findOne/5', 'GET', NULL, NULL, '{\"name\":\"Brenden Wagner\",\"id\":5,\"position\":\"Software Engineer\",\"office\":\"San Francisco\",\"salary\":35000,\"age\":28,\"startDate\":1244505600000}');
INSERT INTO `web_log` VALUES (5, NULL, '根据员工ID，查询员工信息', NULL, 1600696730964, 2, 'http://localhost:8089', '/tSalary/findOne/20', 'http://localhost:8089/tSalary/findOne/20', 'GET', NULL, NULL, '{\"name\":\"Herrod Chandler\",\"id\":20,\"position\":\"Sales Assistant\",\"office\":\"San Francisco\",\"salary\":12900,\"age\":47,\"startDate\":1356912000000}');
INSERT INTO `web_log` VALUES (6, NULL, '根据员工ID，查询员工信息', NULL, 1600697000392, 20, 'http://localhost:8089', '/tSalary/findOne/2', 'http://localhost:8089/tSalary/findOne/2', 'GET', NULL, NULL, '{\"name\":\"Angelica Ramos\",\"id\":2,\"position\":\"Chief Executive Officer (CEO)\",\"office\":\"London\",\"salary\":1200000,\"age\":47,\"startDate\":960249600000}');
INSERT INTO `web_log` VALUES (7, NULL, '查询所有的员工信息', NULL, 1600697025357, 10, 'http://localhost:8089', '/tSalary/findAll', 'http://localhost:8089/tSalary/findAll', 'GET', NULL, NULL, '[{\"name\":\"Airi Satou\",\"id\":1,\"position\":\"Accountant\",\"office\":\"Tokyo\",\"salary\":20000,\"age\":33,\"startDate\":1587772800000},{\"name\":\"Angelica Ramos\",\"id\":2,\"position\":\"Chief Executive Officer (CEO)\",\"office\":\"London\",\"salary\":1200000,\"age\":47,\"startDate\":960249600000},{\"name\":\"Ashton Cox\",\"id\":3,\"position\":\"Junior Technical Author\",\"office\":\"San Francisco\",\"salary\":20000,\"age\":66,\"startDate\":1587600000000},{\"name\":\"Bradley Greer\",\"id\":4,\"position\":\"Software Engineer\",\"office\":\"London\",\"salary\":35000,\"age\":45,\"startDate\":1461628800000},{\"name\":\"Brenden Wagner\",\"id\":5,\"position\":\"Software Engineer\",\"office\":\"San Francisco\",\"salary\":35000,\"age\":28,\"startDate\":1244505600000},{\"name\":\"Brielle Williamson\",\"id\":6,\"position\":\"Integration Specialist\",\"office\":\"New York\",\"salary\":45000,\"age\":61,\"startDate\":1303257600000},{\"name\":\"Bruno Nash\",\"id\":7,\"position\":\"Software Engineer\",\"office\":\"London\",\"salary\":35000,\"age\":38,\"startDate\":1510790400000},{\"name\":\"Caesar Vance\",\"id\":8,\"position\":\"Pre-Sales Support\",\"office\":\"New York\",\"salary\":10600,\"age\":21,\"startDate\":1407888000000},{\"name\":\"Cara Stevens\",\"id\":9,\"position\":\"Sales Assistant\",\"office\":\"New York\",\"salary\":13000,\"age\":46,\"startDate\":1474675200000},{\"name\":\"Cedric Kelly\",\"id\":10,\"position\":\"Senior Javascript Developer\",\"office\":\"Edinburgh\",\"salary\":28000,\"age\":22,\"startDate\":1461283200000},{\"name\":\"Dob Drew\",\"id\":11,\"position\":\"Accountant\",\"office\":\"Edinburgh\",\"salary\":13000,\"age\":24,\"startDate\":1139616000000},{\"name\":\"Charde Marshall\",\"id\":12,\"position\":\"Regional Director\",\"office\":\"San Francisco\",\"salary\":24700,\"age\":36,\"startDate\":1528329600000},{\"name\":\"Dai Rios\",\"id\":13,\"position\":\"Personnel Lead\",\"office\":\"San Francisco\",\"salary\":56000,\"age\":35,\"startDate\":1244505600000},{\"name\":\"Donna Snider\",\"id\":14,\"position\":\"Customer Support\",\"office\":\"New York\",\"salary\":37200,\"age\":27,\"startDate\":1303257600000},{\"name\":\"Doris Wilder\",\"id\":15,\"position\":\"Sales Assistant\",\"office\":\"London\",\"salary\":12900,\"age\":23,\"startDate\":1510790400000},{\"name\":\"Finn Camacho\",\"id\":16,\"position\":\"Support Engineer\",\"office\":\"New York\",\"salary\":10600,\"age\":47,\"startDate\":1407888000000},{\"name\":\"Fiona Green\",\"id\":17,\"position\":\"Chief Operating Officer (COO)\",\"office\":\"New York\",\"salary\":50600,\"age\":48,\"startDate\":1474675200000},{\"name\":\"Garrett Winters\",\"id\":18,\"position\":\"Accountant\",\"office\":\"Edinburgh\",\"salary\":20000,\"age\":63,\"startDate\":1461283200000},{\"name\":\"Gavin Cortez\",\"id\":19,\"position\":\"Team Leader\",\"office\":\"San Francisco\",\"salary\":51800,\"age\":22,\"startDate\":1528329600000},{\"name\":\"Herrod Chandler\",\"id\":20,\"position\":\"Sales Assistant\",\"office\":\"San Francisco\",\"salary\":12900,\"age\":47,\"startDate\":1356912000000},{\"name\":\"Hope Fuentes\",\"id\":21,\"position\":\"Secretary\",\"office\":\"San Francisco\",\"salary\":20000,\"age\":59,\"startDate\":1234310400000}]');
INSERT INTO `web_log` VALUES (8, NULL, '根据员工ID，查询员工信息', NULL, 1600697426588, 323, 'http://localhost:8089', '/tSalary/findById', 'http://localhost:8089/tSalary/findById', 'GET', NULL, '{\"id\":11}', '{\"name\":\"Dob Drew\",\"id\":11,\"position\":\"Accountant\",\"office\":\"Edinburgh\",\"salary\":13000,\"age\":24,\"startDate\":1139616000000}');
INSERT INTO `web_log` VALUES (9, NULL, NULL, NULL, 1600697574217, 37, 'http://localhost:8089', '/webLog/selectOne', 'http://localhost:8089/webLog/selectOne', 'GET', NULL, NULL, '{\"result\":\"{\\\"name\\\":\\\"Angelica Ramos\\\",\\\"id\\\":2,\\\"position\\\":\\\"Chief Executive Officer (CEO)\\\",\\\"office\\\":\\\"London\\\",\\\"salary\\\":1200000,\\\"age\\\":47,\\\"startDate\\\":960249600000}\",\"basePath\":\"http://localhost:8089\",\"method\":\"GET\",\"description\":\"根据员工ID，查询员工信息\",\"startTime\":1600696720227,\"id\":3,\"uri\":\"/tSalary/findOne/2\",\"url\":\"http://localhost:8089/tSalary/findOne/2\",\"spendTime\":32}');
INSERT INTO `web_log` VALUES (10, NULL, '查看日志详情', NULL, 1600697899214, 219, 'http://localhost:8089', '/webLog/findById', 'http://localhost:8089/webLog/findById', 'GET', NULL, '{\"id\":5}', '{\"result\":\"{\\\"name\\\":\\\"Herrod Chandler\\\",\\\"id\\\":20,\\\"position\\\":\\\"Sales Assistant\\\",\\\"office\\\":\\\"San Francisco\\\",\\\"salary\\\":12900,\\\"age\\\":47,\\\"startDate\\\":1356912000000}\",\"basePath\":\"http://localhost:8089\",\"method\":\"GET\",\"description\":\"根据员工ID，查询员工信息\",\"startTime\":1600696730964,\"id\":5,\"uri\":\"/tSalary/findOne/20\",\"url\":\"http://localhost:8089/tSalary/findOne/20\",\"spendTime\":2}');
INSERT INTO `web_log` VALUES (11, NULL, '根据员工ID，查询员工信息', NULL, 1600697909198, 114, 'http://localhost:8089', '/tSalary/findById', 'http://localhost:8089/tSalary/findById', 'GET', NULL, '{\"id\":11}', '{\"name\":\"Dob Drew\",\"id\":11,\"position\":\"Accountant\",\"office\":\"Edinburgh\",\"salary\":13000,\"age\":24,\"startDate\":1139616000000}');
INSERT INTO `web_log` VALUES (12, NULL, '根据员工ID，查询员工信息', NULL, 1600698072507, 292, 'http://localhost:8089', '/tSalary/findById', 'http://localhost:8089/tSalary/findById', 'GET', NULL, '{\"id\":11}', '{\"name\":\"Dob Drew\",\"id\":11,\"position\":\"Accountant\",\"office\":\"Edinburgh\",\"salary\":13000,\"age\":24,\"startDate\":1139616000000}');
INSERT INTO `web_log` VALUES (13, NULL, '根据员工ID，查询员工信息', NULL, 1600698073660, 3, 'http://localhost:8089', '/tSalary/findById', 'http://localhost:8089/tSalary/findById', 'GET', NULL, '{\"id\":11}', '{\"name\":\"Dob Drew\",\"id\":11,\"position\":\"Accountant\",\"office\":\"Edinburgh\",\"salary\":13000,\"age\":24,\"startDate\":1139616000000}');
INSERT INTO `web_log` VALUES (14, NULL, '根据员工ID，查询员工信息', NULL, 1600698074297, 2, 'http://localhost:8089', '/tSalary/findById', 'http://localhost:8089/tSalary/findById', 'GET', NULL, '{\"id\":11}', '{\"name\":\"Dob Drew\",\"id\":11,\"position\":\"Accountant\",\"office\":\"Edinburgh\",\"salary\":13000,\"age\":24,\"startDate\":1139616000000}');
INSERT INTO `web_log` VALUES (15, NULL, '根据员工ID，查询员工信息', NULL, 1600698074488, 6, 'http://localhost:8089', '/tSalary/findById', 'http://localhost:8089/tSalary/findById', 'GET', NULL, '{\"id\":11}', '{\"name\":\"Dob Drew\",\"id\":11,\"position\":\"Accountant\",\"office\":\"Edinburgh\",\"salary\":13000,\"age\":24,\"startDate\":1139616000000}');
INSERT INTO `web_log` VALUES (16, NULL, '根据员工ID，查询员工信息', NULL, 1600698074765, 7, 'http://localhost:8089', '/tSalary/findById', 'http://localhost:8089/tSalary/findById', 'GET', NULL, '{\"id\":11}', '{\"name\":\"Dob Drew\",\"id\":11,\"position\":\"Accountant\",\"office\":\"Edinburgh\",\"salary\":13000,\"age\":24,\"startDate\":1139616000000}');
INSERT INTO `web_log` VALUES (17, NULL, '根据员工ID，查询员工信息', NULL, 1600698075048, 3, 'http://localhost:8089', '/tSalary/findById', 'http://localhost:8089/tSalary/findById', 'GET', NULL, '{\"id\":11}', '{\"name\":\"Dob Drew\",\"id\":11,\"position\":\"Accountant\",\"office\":\"Edinburgh\",\"salary\":13000,\"age\":24,\"startDate\":1139616000000}');
INSERT INTO `web_log` VALUES (18, NULL, '根据员工ID，查询员工信息', NULL, 1600698075304, 4, 'http://localhost:8089', '/tSalary/findById', 'http://localhost:8089/tSalary/findById', 'GET', NULL, '{\"id\":11}', '{\"name\":\"Dob Drew\",\"id\":11,\"position\":\"Accountant\",\"office\":\"Edinburgh\",\"salary\":13000,\"age\":24,\"startDate\":1139616000000}');
INSERT INTO `web_log` VALUES (19, NULL, '根据员工ID，查询员工信息', NULL, 1600698075513, 10, 'http://localhost:8089', '/tSalary/findById', 'http://localhost:8089/tSalary/findById', 'GET', NULL, '{\"id\":11}', '{\"name\":\"Dob Drew\",\"id\":11,\"position\":\"Accountant\",\"office\":\"Edinburgh\",\"salary\":13000,\"age\":24,\"startDate\":1139616000000}');
INSERT INTO `web_log` VALUES (20, NULL, '根据员工ID，查询员工信息', NULL, 1600698075755, 3, 'http://localhost:8089', '/tSalary/findById', 'http://localhost:8089/tSalary/findById', 'GET', NULL, '{\"id\":11}', '{\"name\":\"Dob Drew\",\"id\":11,\"position\":\"Accountant\",\"office\":\"Edinburgh\",\"salary\":13000,\"age\":24,\"startDate\":1139616000000}');
INSERT INTO `web_log` VALUES (21, NULL, '根据员工ID，查询员工信息', NULL, 1600698078878, 3, 'http://localhost:8089', '/tSalary/findById', 'http://localhost:8089/tSalary/findById', 'GET', NULL, '{\"id\":21}', '{\"name\":\"Hope Fuentes\",\"id\":21,\"position\":\"Secretary\",\"office\":\"San Francisco\",\"salary\":20000,\"age\":59,\"startDate\":1234310400000}');
INSERT INTO `web_log` VALUES (22, NULL, '根据员工ID，查询员工信息', NULL, 1600698082722, 2, 'http://localhost:8089', '/tSalary/findById', 'http://localhost:8089/tSalary/findById', 'GET', NULL, '{\"id\":30}', NULL);
INSERT INTO `web_log` VALUES (23, NULL, '根据员工ID，查询员工信息', NULL, 1600698085525, 2, 'http://localhost:8089', '/tSalary/findById', 'http://localhost:8089/tSalary/findById', 'GET', NULL, '{\"id\":3}', '{\"name\":\"Ashton Cox\",\"id\":3,\"position\":\"Junior Technical Author\",\"office\":\"San Francisco\",\"salary\":20000,\"age\":66,\"startDate\":1587600000000}');