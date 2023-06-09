CREATE TABLE farmers (farmer_id INT PRIMARY KEY,farmer_name VARCHAR(50),farmer_address VARCHAR(100),farmer_phone VARCHAR(20));
CREATE TABLE crops (crop_id INT PRIMARY KEY,crop_name VARCHAR(50),crop_type VARCHAR(50),crop_yield INT);
CREATE TABLE livestock (livestock_id INT PRIMARY KEY,livestock_type VARCHAR(50),livestock_breed VARCHAR(50),livestock_quantity INT);
CREATE TABLE fields (field_id INT PRIMARY KEY,field_name VARCHAR(50),field_area INT);
CREATE TABLE field_Crops (field_id INT,crop_id INT,planting_date DATE,harvest_date DATE,FOREIGN KEY (field_id) REFERENCES fields(field_id),
FOREIGN KEY (crop_id) REFERENCES crops(crop_id));
CREATE TABLE field_Livestock (field_id INT,livestock_id INT,start_date DATE,end_date DATE,FOREIGN KEY (field_id) REFERENCES fields(field_id),
FOREIGN KEY (livestock_id) REFERENCES livestock(livestock_id));
CREATE TABLE harvests (harvest_id INT PRIMARY KEY,field_id INT,crop_id INT,harvest_date DATE,harvested_quantity INT,FOREIGN KEY (field_id) REFERENCES fields(field_id),
FOREIGN KEY (crop_id) REFERENCES crops(crop_id));
CREATE TABLE sales (sale_id INT PRIMARY KEY,crop_id INT,sale_date DATE,sale_quantity INT,sale_price DECIMAL(10, 2),
FOREIGN KEY (crop_id) REFERENCES crops(crop_id));
CREATE TABLE expenses (expense_id INT PRIMARY KEY,field_id INT,expense_date DATE,expense_type VARCHAR(50),expense_amount DECIMAL(10, 2),
FOREIGN KEY (field_id) REFERENCES fields(field_id));
CREATE TABLE weatherrecords(weather_id INT PRIMARY KEY,field_id INT,weather_date DATE,temperature DECIMAL(5, 2),rainfall VARCHAR(50),
FOREIGN KEY (field_id) REFERENCES fields(field_id));
CREATE TABLE employees ( employee_id INT PRIMARY KEY, employee_name varchar(50), employee_role varchar(50),employee_salary varchar(40));
CREATE TABLE employees_fields (employee_id INT PRIMARY KEY,field_id INT ,start_date date ,end_date date);
CREATE TABLE farms(id  int ,Name varchar(30) ,Address varchar(40));
