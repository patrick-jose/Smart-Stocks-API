-- DROP SCHEMA "SmartStocksDB";

-- CREATE SCHEMA "SmartStocksDB" AUTHORIZATION "PatrickGustavo";

-- DROP SEQUENCE "SmartStocksDB".portfoliohistory_id_seq;

CREATE SEQUENCE "SmartStocksDB".portfoliohistory_id_seq
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 2147483647
	START 1
	CACHE 1
	NO CYCLE;

-- Permissions

ALTER SEQUENCE "SmartStocksDB".portfoliohistory_id_seq OWNER TO "PatrickGustavo";
GRANT ALL ON SEQUENCE "SmartStocksDB".portfoliohistory_id_seq TO "PatrickGustavo";

GRANT ALL PRIVILEGES ON SCHEMA "SmartStocksDB" TO "PatrickGustavo";

-- DROP SEQUENCE "SmartStocksDB".benchmark_id_seq;

CREATE SEQUENCE "SmartStocksDB".benchmark_id_seq
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 2147483647
	START 1
	CACHE 1
	NO CYCLE;

-- Permissions

ALTER SEQUENCE "SmartStocksDB".benchmark_id_seq OWNER TO "PatrickGustavo";
GRANT ALL ON SEQUENCE "SmartStocksDB".benchmark_id_seq TO "PatrickGustavo";

-- DROP SEQUENCE "SmartStocksDB".investment_id_seq;

CREATE SEQUENCE "SmartStocksDB".investment_id_seq
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 2147483647
	START 1
	CACHE 1
	NO CYCLE;

-- Permissions

ALTER SEQUENCE "SmartStocksDB".investment_id_seq OWNER TO "PatrickGustavo";
GRANT ALL ON SEQUENCE "SmartStocksDB".investment_id_seq TO "PatrickGustavo";

-- DROP SEQUENCE "SmartStocksDB".investmenthistory_id_seq;

CREATE SEQUENCE "SmartStocksDB".investmenthistory_id_seq
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 2147483647
	START 1
	CACHE 1
	NO CYCLE;

-- Permissions

ALTER SEQUENCE "SmartStocksDB".investmenthistory_id_seq OWNER TO "PatrickGustavo";
GRANT ALL ON SEQUENCE "SmartStocksDB".investmenthistory_id_seq TO "PatrickGustavo";

-- DROP SEQUENCE "SmartStocksDB".investmenttype_id_seq;

CREATE SEQUENCE "SmartStocksDB".investmenttype_id_seq
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 2147483647
	START 1
	CACHE 1
	NO CYCLE;

-- Permissions

ALTER SEQUENCE "SmartStocksDB".investmenttype_id_seq OWNER TO "PatrickGustavo";
GRANT ALL ON SEQUENCE "SmartStocksDB".investmenttype_id_seq TO "PatrickGustavo";

-- DROP SEQUENCE "SmartStocksDB".portfolio_id_seq;

CREATE SEQUENCE "SmartStocksDB".portfolio_id_seq
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 2147483647
	START 1
	CACHE 1
	NO CYCLE;

-- Permissions

ALTER SEQUENCE "SmartStocksDB".portfolio_id_seq OWNER TO "PatrickGustavo";
GRANT ALL ON SEQUENCE "SmartStocksDB".portfolio_id_seq TO "PatrickGustavo";

-- DROP SEQUENCE "SmartStocksDB".portfoliocomposition_investmentid_seq;

CREATE SEQUENCE "SmartStocksDB".portfoliocomposition_investmentid_seq
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 2147483647
	START 1
	CACHE 1
	NO CYCLE;

-- Permissions

ALTER SEQUENCE "SmartStocksDB".portfoliocomposition_investmentid_seq OWNER TO "PatrickGustavo";
GRANT ALL ON SEQUENCE "SmartStocksDB".portfoliocomposition_investmentid_seq TO "PatrickGustavo";

-- DROP SEQUENCE "SmartStocksDB".portfoliocomposition_portfolioid_seq;

CREATE SEQUENCE "SmartStocksDB".portfoliocomposition_portfolioid_seq
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 2147483647
	START 1
	CACHE 1
	NO CYCLE;

-- Permissions

ALTER SEQUENCE "SmartStocksDB".portfoliocomposition_portfolioid_seq OWNER TO "PatrickGustavo";
GRANT ALL ON SEQUENCE "SmartStocksDB".portfoliocomposition_portfolioid_seq TO "PatrickGustavo";

-- DROP SEQUENCE "SmartStocksDB".riskprofile_id_seq;

CREATE SEQUENCE "SmartStocksDB".riskprofile_id_seq
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 2147483647
	START 1
	CACHE 1
	NO CYCLE;

-- Permissions

ALTER SEQUENCE "SmartStocksDB".riskprofile_id_seq OWNER TO "PatrickGustavo";
GRANT ALL ON SEQUENCE "SmartStocksDB".riskprofile_id_seq TO "PatrickGustavo";

-- DROP SEQUENCE "SmartStocksDB".user_id_seq;

CREATE SEQUENCE "SmartStocksDB".user_id_seq
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 2147483647
	START 1
	CACHE 1
	NO CYCLE;

-- Permissions

ALTER SEQUENCE "SmartStocksDB".user_id_seq OWNER TO "PatrickGustavo";
GRANT ALL ON SEQUENCE "SmartStocksDB".user_id_seq TO "PatrickGustavo";

-- DROP SEQUENCE "SmartStocksDB".userterm_id_seq;

CREATE SEQUENCE "SmartStocksDB".userterm_id_seq
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 2147483647
	START 1
	CACHE 1
	NO CYCLE;

-- Permissions

ALTER SEQUENCE "SmartStocksDB".userterm_id_seq OWNER TO "PatrickGustavo";
GRANT ALL ON SEQUENCE "SmartStocksDB".userterm_id_seq TO "PatrickGustavo";
-- "SmartStocksDB"."Benchmark" definition

-- Drop table

-- DROP TABLE "SmartStocksDB"."Benchmark";

CREATE TABLE "SmartStocksDB"."Benchmark" (
	id int4 DEFAULT nextval('"SmartStocksDB".benchmark_id_seq'::regclass) NOT NULL,
	"name" varchar NOT NULL,
	CONSTRAINT benchmark_pk PRIMARY KEY (id),
	CONSTRAINT benchmark_unique UNIQUE (name)
);

-- Permissions

ALTER TABLE "SmartStocksDB"."Benchmark" OWNER TO "PatrickGustavo";
GRANT ALL ON TABLE "SmartStocksDB"."Benchmark" TO "PatrickGustavo";


-- "SmartStocksDB"."InvestmentType" definition

-- Drop table

-- DROP TABLE "SmartStocksDB"."InvestmentType";

CREATE TABLE "SmartStocksDB"."InvestmentType" (
	id int4 DEFAULT nextval('"SmartStocksDB".investmenttype_id_seq'::regclass) NOT NULL,
	"name" varchar NOT NULL,
	CONSTRAINT investmenttype_pk PRIMARY KEY (id),
	CONSTRAINT investmenttype_unique UNIQUE (name)
);

-- Permissions

ALTER TABLE "SmartStocksDB"."InvestmentType" OWNER TO "PatrickGustavo";
GRANT ALL ON TABLE "SmartStocksDB"."InvestmentType" TO "PatrickGustavo";


-- "SmartStocksDB"."RiskProfile" definition

-- Drop table

-- DROP TABLE "SmartStocksDB"."RiskProfile";

CREATE TABLE "SmartStocksDB"."RiskProfile" (
	id int4 DEFAULT nextval('"SmartStocksDB".riskprofile_id_seq'::regclass) NOT NULL,
	"name" varchar NOT NULL,
	CONSTRAINT riskprofile_pk PRIMARY KEY (id),
	CONSTRAINT riskprofile_unique UNIQUE (name)
);

-- Permissions

ALTER TABLE "SmartStocksDB"."RiskProfile" OWNER TO "PatrickGustavo";
GRANT ALL ON TABLE "SmartStocksDB"."RiskProfile" TO "PatrickGustavo";


-- "SmartStocksDB"."UserTerm" definition

-- Drop table

-- DROP TABLE "SmartStocksDB"."UserTerm";

CREATE TABLE "SmartStocksDB"."UserTerm" (
	id int4 DEFAULT nextval('"SmartStocksDB".userterm_id_seq'::regclass) NOT NULL,
	"name" varchar NOT NULL,
	CONSTRAINT userterm_pk PRIMARY KEY (id),
	CONSTRAINT userterm_unique UNIQUE (name)
);

-- Permissions

ALTER TABLE "SmartStocksDB"."UserTerm" OWNER TO "PatrickGustavo";
GRANT ALL ON TABLE "SmartStocksDB"."UserTerm" TO "PatrickGustavo";


-- "SmartStocksDB"."Investment" definition

-- Drop table

-- DROP TABLE "SmartStocksDB"."Investment";

CREATE TABLE "SmartStocksDB"."Investment" (
	id int4 DEFAULT nextval('"SmartStocksDB".investment_id_seq'::regclass) NOT NULL,
	"name" varchar NOT NULL,
	"typeId" int4 NOT NULL,
	"riskProfileId" int4 NOT NULL,
	"minimumInvestment" numeric NULL,
	CONSTRAINT investment_pk PRIMARY KEY (id),
	CONSTRAINT investment_investmenttype_fk FOREIGN KEY ("typeId") REFERENCES "SmartStocksDB"."InvestmentType"(id) ON DELETE SET NULL ON UPDATE SET NULL,
	CONSTRAINT investment_riskprofile_fk FOREIGN KEY ("riskProfileId") REFERENCES "SmartStocksDB"."RiskProfile"(id) ON DELETE SET NULL ON UPDATE SET NULL
);

-- Permissions

ALTER TABLE "SmartStocksDB"."Investment" OWNER TO "PatrickGustavo";
GRANT ALL ON TABLE "SmartStocksDB"."Investment" TO "PatrickGustavo";


-- "SmartStocksDB"."InvestmentHistory" definition

-- Drop table

-- DROP TABLE "SmartStocksDB"."InvestmentHistory";

CREATE TABLE "SmartStocksDB"."InvestmentHistory" (
	id int4 DEFAULT nextval('"SmartStocksDB".investmenthistory_id_seq'::regclass) NOT NULL,
	"investmentId" int4 NOT NULL,
	"performanceDate" date NOT NULL,
	"benchmarkId" int4 NULL,
	"performancePercentageDay" numeric NOT NULL,
	"performancePercentageMonth" numeric NULL,
	"performancePercentage12Months" numeric NULL,
	"performancePercentageTotal" numeric NOT NULL,
	"performancePercentageBenchmark" numeric NULL,
	CONSTRAINT investmenthistory_pk PRIMARY KEY (id),
	CONSTRAINT investmenthistory_benchmark_fk FOREIGN KEY ("benchmarkId") REFERENCES "SmartStocksDB"."Benchmark"(id) ON DELETE SET NULL ON UPDATE SET NULL,
	CONSTRAINT investmenthistory_investment_fk FOREIGN KEY ("investmentId") REFERENCES "SmartStocksDB"."Investment"(id) ON DELETE SET NULL ON UPDATE SET NULL
);

-- Permissions

ALTER TABLE "SmartStocksDB"."InvestmentHistory" OWNER TO "PatrickGustavo";
GRANT ALL ON TABLE "SmartStocksDB"."InvestmentHistory" TO "PatrickGustavo";


-- "SmartStocksDB"."User" definition

-- Drop table

-- DROP TABLE "SmartStocksDB"."User";

CREATE TABLE "SmartStocksDB"."User" (
	id int4 DEFAULT nextval('"SmartStocksDB".user_id_seq'::regclass) NOT NULL,
	"name" varchar NOT NULL,
	email varchar NOT NULL,
	password varchar NOT NULL,
	"isEnabled" boolean NOT NULL,
	"riskProfileId" int4 NULL,
	"capitalAmount" numeric NULL,
	"termId" int4 NULL,
	CONSTRAINT user_pk PRIMARY KEY (id),
	CONSTRAINT user_unique UNIQUE (email),
	CONSTRAINT user_riskprofile_fk FOREIGN KEY ("riskProfileId") REFERENCES "SmartStocksDB"."RiskProfile"(id) ON DELETE SET NULL ON UPDATE SET NULL,
	CONSTRAINT user_userterm_fk FOREIGN KEY ("termId") REFERENCES "SmartStocksDB"."UserTerm"(id)
);

-- Permissions

ALTER TABLE "SmartStocksDB"."User" OWNER TO "PatrickGustavo";
GRANT ALL ON TABLE "SmartStocksDB"."User" TO "PatrickGustavo";


-- "SmartStocksDB"."Portfolio" definition

-- Drop table

-- DROP TABLE "SmartStocksDB"."Portfolio";

CREATE TABLE "SmartStocksDB"."Portfolio" (
	id int4 DEFAULT nextval('"SmartStocksDB".portfolio_id_seq'::regclass) NOT NULL,
	"dateCreated" date NOT NULL,
	"userId" int4 NOT NULL,
	CONSTRAINT portfolio_pk PRIMARY KEY (id),
	CONSTRAINT portfolio_user_fk FOREIGN KEY ("userId") REFERENCES "SmartStocksDB"."User"(id)
);

-- Permissions

ALTER TABLE "SmartStocksDB"."Portfolio" OWNER TO "PatrickGustavo";
GRANT ALL ON TABLE "SmartStocksDB"."Portfolio" TO "PatrickGustavo";


-- "SmartStocksDB"."PortfolioComposition" definition

-- Drop table

-- DROP TABLE "SmartStocksDB"."PortfolioComposition";

CREATE TABLE "SmartStocksDB"."PortfolioComposition" (
	"portfolioId" int4 GENERATED ALWAYS AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
	"investmentId" int4 GENERATED ALWAYS AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
	"allocationPercentage" numeric NOT NULL,
	CONSTRAINT portfoliocomposition_pk PRIMARY KEY ("portfolioId", "investmentId"),
	CONSTRAINT portfoliocomposition_investment_fk FOREIGN KEY ("investmentId") REFERENCES "SmartStocksDB"."Investment"(id) ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT portfoliocomposition_portfolio_fk FOREIGN KEY ("portfolioId") REFERENCES "SmartStocksDB"."Portfolio"(id) ON DELETE CASCADE ON UPDATE CASCADE
);

-- Permissions

ALTER TABLE "SmartStocksDB"."PortfolioComposition" OWNER TO "PatrickGustavo";
GRANT ALL ON TABLE "SmartStocksDB"."PortfolioComposition" TO "PatrickGustavo";


-- "SmartStocksDB"."PortfolioHistory" definition

-- Drop table

-- DROP TABLE "SmartStocksDB"."PortfolioHistory";

CREATE TABLE "SmartStocksDB"."PortfolioHistory" (
	id int4 DEFAULT nextval('"SmartStocksDB".portfoliohistory_id_seq'::regclass) NOT NULL,
	"portfolioId" int4 NOT NULL,
	"performanceDate" date NOT NULL,
	"performancePercentageDay" numeric NOT NULL,
	"performancePercentageMonth" numeric NULL,
	"performancePercentage12Months" numeric NULL,
	"performancePercentageTotal" numeric NOT NULL,
	"performancePercentageBenchmark" numeric NULL,
	CONSTRAINT portfoliohistory_pk PRIMARY KEY (id),
	CONSTRAINT portfoliohistory_portfolio_fk FOREIGN KEY ("portfolioId") REFERENCES "SmartStocksDB"."Portfolio"(id)
);

-- Permissions

ALTER TABLE "SmartStocksDB"."PortfolioHistory" OWNER TO "PatrickGustavo";
GRANT ALL ON TABLE "SmartStocksDB"."PortfolioHistory" TO "PatrickGustavo";

-- DROP SEQUENCE "SmartStocksDB".role_id_seq;

CREATE SEQUENCE "SmartStocksDB".role_id_seq
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 2147483647
	START 1
	CACHE 1
	NO CYCLE;

-- Permissions

ALTER SEQUENCE "SmartStocksDB".role_id_seq OWNER TO "PatrickGustavo";
GRANT ALL ON SEQUENCE "SmartStocksDB".role_id_seq TO "PatrickGustavo";

CREATE TABLE "SmartStocksDB"."Role" (
	id int4 DEFAULT nextval('"SmartStocksDB".role_id_seq'::regclass) NOT NULL,
	"name" varchar NOT NULL,
	CONSTRAINT role_pk PRIMARY KEY (id),
	CONSTRAINT role_unique UNIQUE (name)
);

CREATE TABLE "SmartStocksDB"."UserRole" (
	"userId" int4 NOT NULL,
	"roleId" int4 NOT NULL,
	CONSTRAINT userrole_user_fk FOREIGN KEY ("userId") REFERENCES "SmartStocksDB"."User"(id) ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT userrole_role_fk FOREIGN KEY ("roleId") REFERENCES "SmartStocksDB"."Role"(id) ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT userrole_unique UNIQUE ("userId", "roleId")
);

-- Permissions

GRANT ALL ON SCHEMA "SmartStocksDB" TO "PatrickGustavo";