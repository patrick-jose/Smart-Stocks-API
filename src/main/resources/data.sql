-- Delete tables
DELETE FROM "SmartStocksDB"."InvestmentHistory";
DELETE FROM "SmartStocksDB"."Investment";
DELETE FROM "SmartStocksDB"."Benchmark";
DELETE FROM "SmartStocksDB"."RiskProfile";
DELETE FROM "SmartStocksDB"."InvestmentType";
DELETE FROM "SmartStocksDB"."UserTerm";

-- Benchmark
INSERT INTO "SmartStocksDB"."Benchmark" (id, name) VALUES (1, 'Benchmark 1');
INSERT INTO "SmartStocksDB"."Benchmark" (id, name) VALUES (2, 'Benchmark 2');
ALTER SEQUENCE "SmartStocksDB".benchmark_id_seq RESTART WITH 3;

-- RiskProfile
INSERT INTO "SmartStocksDB"."RiskProfile" (id, name) VALUES (1, 'RiskProfile 1');
INSERT INTO "SmartStocksDB"."RiskProfile" (id, name) VALUES (2, 'RiskProfile 2');
ALTER SEQUENCE "SmartStocksDB".riskprofile_id_seq RESTART WITH 3;

-- InvestmentType
INSERT INTO "SmartStocksDB"."InvestmentType" (id, name) VALUES (1, 'InvestmentType 1');
INSERT INTO "SmartStocksDB"."InvestmentType" (id, name) VALUES (2, 'InvestmentType 2');
ALTER SEQUENCE "SmartStocksDB".investmenttype_id_seq RESTART WITH 3;

-- UserTerm
INSERT INTO "SmartStocksDB"."UserTerm" (id, name) VALUES (1, 'UserTerm 1');
INSERT INTO "SmartStocksDB"."UserTerm" (id, name) VALUES (2, 'UserTerm 2');
ALTER SEQUENCE "SmartStocksDB".userterm_id_seq RESTART WITH 3;

-- Investment
INSERT INTO "SmartStocksDB"."Investment" (id, name, "typeId", "riskProfileId", "minimumInvestment") VALUES (1, 'Investment 1', 1, 1, 1987344);
INSERT INTO "SmartStocksDB"."Investment" (id, name, "typeId", "riskProfileId", "minimumInvestment") VALUES (2, 'Investment 2', 2, 2, 2987344);
ALTER SEQUENCE "SmartStocksDB".investment_id_seq RESTART WITH 3;

-- InvestmentHistory
INSERT INTO "SmartStocksDB"."InvestmentHistory" (id, "investmentId", "performanceDate", "benchmarkId", "performancePercentageDay", "performancePercentageMonth", "performancePercentage12Months", "performancePercentageTotal", "performancePercentageBenchmark") VALUES (1, 1, '01-01-2024', 1, 0.95, 10.3, 102.9, 700.43, 954.93);
INSERT INTO "SmartStocksDB"."InvestmentHistory" (id, "investmentId", "performanceDate", "benchmarkId", "performancePercentageDay", "performancePercentageMonth", "performancePercentage12Months", "performancePercentageTotal", "performancePercentageBenchmark") VALUES (2, 1, '01-01-2024', 1, 0.95, 10.3, 102.9, 700.43, 954.93);
ALTER SEQUENCE "SmartStocksDB".investmenthistory_id_seq RESTART WITH 3;