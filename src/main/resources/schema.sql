DROP TABLE IF EXISTS department;
DROP TABLE IF EXISTS positions ;
DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS certificates ;
DROP TABLE IF EXISTS history;

CREATE TABLE IF NOT EXISTS departments (
	id INTEGER PRIMARY KEY AUTO_INCREMENT ,/*AUTOINCREMENT */
	version INTEGER NOT NULL,
	full_name VARCHAR(255),
	parent_id INTEGER NOT NULL,
	FOREIGN KEY(parent_id) REFERENCES departments(id)
);

CREATE TABLE IF NOT EXISTS positions (
  id INTEGER NOT NULL PRIMARY KEY,
  position_name VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS employees (
	id INTEGER PRIMARY KEY AUTO_INCREMENT ,/*AUTOINCREMENT */
	version INTEGER NOT NULL,
	first_name VARCHAR(50) NOT NULL ,
	last_name VARCHAR(50) NOT NULL,
	middle_name VARCHAR(50),
	sex VARCHAR(5),
	birth_date DATE NOT NULL,
	department_id INTEGER NOT NULL,
	position_id INTEGER NOT NULL,
	grade INTEGER NOT NULL,
	salary INTEGER NOT NULL,
	FOREIGN KEY(department_id) REFERENCES departments(id),
	FOREIGN KEY(position_id) REFERENCES positions(id)
);


CREATE TABLE IF NOT EXISTS certificates (
  id           INTEGER PRIMARY KEY AUTO_INCREMENT ,/*AUTOINCREMENT */
  employee_id  INTEGER,
  certif_name  VARCHAR(255) NOT NULL,
  issue_date   DATE         NOT NULL,
  company_name VARCHAR(255) NOT NULL,
  code         INTEGER      NOT NULL UNIQUE,
  scan         BLOB         NOT NULL,
  FOREIGN KEY (employee_id) REFERENCES employees(id)
);

CREATE TABLE IF NOT EXISTS history (
  id          INTEGER PRIMARY KEY AUTO_INCREMENT,/*AUTOINCREMENT */
  employee_id INTEGER,
  event_date   DATE         NOT NULL,
  event       VARCHAR(255) NOT NULL,
  FOREIGN KEY (employee_id) REFERENCES employees(id)
);