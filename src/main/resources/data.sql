-- Delete tables
DELETE FROM "SmartStocksDB"."UserRole";
DELETE FROM "SmartStocksDB"."Role";
DELETE FROM "SmartStocksDB"."PortfolioHistory";
DELETE FROM "SmartStocksDB"."PortfolioComposition";
DELETE FROM "SmartStocksDB"."Portfolio";
DELETE FROM "SmartStocksDB"."User";
DELETE FROM "SmartStocksDB"."InvestmentHistory";
DELETE FROM "SmartStocksDB"."Investment";
DELETE FROM "SmartStocksDB"."Benchmark";
DELETE FROM "SmartStocksDB"."RiskProfile";
DELETE FROM "SmartStocksDB"."InvestmentType";
DELETE FROM "SmartStocksDB"."UserTerm";

-- Benchmark
INSERT INTO "SmartStocksDB"."Benchmark" (id, name) VALUES (1, 'CDI');
INSERT INTO "SmartStocksDB"."Benchmark" (id, name) VALUES (2, 'SELIC');
ALTER SEQUENCE "SmartStocksDB".benchmark_id_seq RESTART WITH 3;

-- RiskProfile
INSERT INTO "SmartStocksDB"."RiskProfile" (id, name) VALUES (1, 'CONSERVADOR');
INSERT INTO "SmartStocksDB"."RiskProfile" (id, name) VALUES (2, 'AGRESSIVO');
ALTER SEQUENCE "SmartStocksDB".riskprofile_id_seq RESTART WITH 3;

-- InvestmentType
INSERT INTO "SmartStocksDB"."InvestmentType" (id, name) VALUES (1, 'InvestmentType 1');
INSERT INTO "SmartStocksDB"."InvestmentType" (id, name) VALUES (2, 'InvestmentType 2');
ALTER SEQUENCE "SmartStocksDB".investmenttype_id_seq RESTART WITH 3;

-- UserTerm
INSERT INTO "SmartStocksDB"."UserTerm" (id, name) VALUES (1, 'CURTO');
INSERT INTO "SmartStocksDB"."UserTerm" (id, name) VALUES (2, 'CURTO_MEDIO');
ALTER SEQUENCE "SmartStocksDB".userterm_id_seq RESTART WITH 3;

-- Investment
INSERT INTO "SmartStocksDB"."Investment" (id, name, "typeId", "riskProfileId", "minimumInvestment") VALUES (1, 'Investment 1', 1, 1, 1987344);
INSERT INTO "SmartStocksDB"."Investment" (id, name, "typeId", "riskProfileId", "minimumInvestment") VALUES (2, 'Investment 2', 2, 2, 2987344);
ALTER SEQUENCE "SmartStocksDB".investment_id_seq RESTART WITH 3;

-- InvestmentHistory
INSERT INTO "SmartStocksDB"."InvestmentHistory" (id, "investmentId", "performanceDate", "benchmarkId", "performancePercentageDay", "performancePercentageMonth", "performancePercentage12Months", "performancePercentageTotal", "performancePercentageBenchmark") VALUES (1, 1, '2024-04-09', 1, 0.95, 10.3, 102.9, 700.43, 954.93);
INSERT INTO "SmartStocksDB"."InvestmentHistory" (id, "investmentId", "performanceDate", "benchmarkId", "performancePercentageDay", "performancePercentageMonth", "performancePercentage12Months", "performancePercentageTotal", "performancePercentageBenchmark") VALUES (2, 1, '2024-01-02', 1, 0.95, 10.3, 102.9, 700.43, 954.93);
ALTER SEQUENCE "SmartStocksDB".investmenthistory_id_seq RESTART WITH 3;

-- User
INSERT INTO "SmartStocksDB"."User" (id, name, email, password, "isEnabled", "riskProfileId", "capitalAmount", "termId") VALUES (1, 'Admin', 'admin@email.com', '$2a$10$jpEHj8ljMd99p.fo0Rn2G.S3JlpubimsG00QZUOKIp2N65rn9d4dC', true, 1, 100000, 1);
INSERT INTO "SmartStocksDB"."User" (id, name, email, password, "isEnabled", "riskProfileId", "capitalAmount", "termId") VALUES (2, 'Patrick José', 'patrick.jose@email.com', '$2a$10$b2xDCby6oT6Uap23m.LE0.nZ6ZkaApZR.yfr3QZ08LUW9Gru3/4Xi', true, 1, 200000, 1);
INSERT INTO "SmartStocksDB"."User" (id, name, email, password, "isEnabled", "riskProfileId", "capitalAmount", "termId") VALUES (3, 'Gustavo Martins', 'gustavo.martins@email.com', '$2a$10$wdfYvgRb9gL92JHvz3DcIeA6I7SUAKkrb808IpdicxUsreTreTn9G', true, 1, 300000, 1);
ALTER SEQUENCE "SmartStocksDB".user_id_seq RESTART WITH 4;

-- Portfolio
INSERT INTO "SmartStocksDB"."Portfolio" (id, "dateCreated", "userId") VALUES (1,'2024-11-17', 1);
INSERT INTO "SmartStocksDB"."Portfolio" (id, "dateCreated", "userId") VALUES (2,'2024-11-19', 1);
ALTER SEQUENCE "SmartStocksDB".portfolio_id_seq RESTART WITH 3;

-- PortfolioComposition
INSERT INTO "SmartStocksDB"."PortfolioComposition" ("portfolioId", "investmentId", "allocationPercentage") OVERRIDING SYSTEM VALUE VALUES (1, 1, 0.89);
INSERT INTO "SmartStocksDB"."PortfolioComposition" ("portfolioId", "investmentId", "allocationPercentage") OVERRIDING SYSTEM VALUE VALUES (2, 2, 0.54);
-- ALTER SEQUENCE "SmartStocksDB".portfoliocomposition_id_seq RESTART WITH 3;

-- PortfolioHistory
INSERT INTO "SmartStocksDB"."PortfolioHistory" (id, "portfolioId", "performanceDate", "performancePercentageDay", "performancePercentageMonth", "performancePercentage12Months", "performancePercentageTotal", "performancePercentageBenchmark") VALUES (1, 1, '2024-01-01', 0.99, 30.30, 102.45, 784.93, 504.02);
INSERT INTO "SmartStocksDB"."PortfolioHistory" (id, "portfolioId", "performanceDate", "performancePercentageDay", "performancePercentageMonth", "performancePercentage12Months", "performancePercentageTotal", "performancePercentageBenchmark") VALUES (2, 1, '2024-02-01', 0.99, 30.30, 102.45, 784.93, 504.02);
ALTER SEQUENCE "SmartStocksDB".portfoliohistory_id_seq RESTART WITH 3;

-- Role
INSERT INTO "SmartStocksDB"."Role" (id, name) VALUES (1, 'ADMIN');
INSERT INTO "SmartStocksDB"."Role" (id, name) VALUES (2, 'USER');
ALTER SEQUENCE "SmartStocksDB".role_id_seq RESTART WITH 3;

-- UserRole
INSERT INTO "SmartStocksDB"."UserRole" ("userId", "roleId") VALUES (1, 1);
INSERT INTO "SmartStocksDB"."UserRole" ("userId", "roleId") VALUES (1, 2);
INSERT INTO "SmartStocksDB"."UserRole" ("userId", "roleId") VALUES (2, 1);
INSERT INTO "SmartStocksDB"."UserRole" ("userId", "roleId") VALUES (3, 2);