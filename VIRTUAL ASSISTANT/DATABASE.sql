-- Create the database
CREATE DATABASE VirtualAssistantDB;

-- Use the database
USE VirtualAssistantDB;

-- Create clients table
CREATE TABLE clients (
    client_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255),
    phone VARCHAR(20)
);

-- Create services table
CREATE TABLE services (
    service_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    hourly_rate DECIMAL(10, 2) NOT NULL
);

-- Create invoices table
CREATE TABLE invoices (
    invoice_id INT AUTO_INCREMENT PRIMARY KEY,
    client_id INT,
    invoice_date DATE,
    total DECIMAL(10, 2),
    tax DECIMAL(10, 2) DEFAULT 0,
    FOREIGN KEY (client_id) REFERENCES clients(client_id)
);

-- Create invoice_items table to store services in each invoice
CREATE TABLE invoice_items (
    item_id INT AUTO_INCREMENT PRIMARY KEY,
    invoice_id INT,
    service_id INT,
    hours DECIMAL(5, 2),
    FOREIGN KEY (invoice_id) REFERENCES invoices(invoice_id),
    FOREIGN KEY (service_id) REFERENCES services(service_id)
);
