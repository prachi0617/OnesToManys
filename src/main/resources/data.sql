INSERT INTO universities 
(university_code, university_name, country, state_province, city, address, email, phone, website, established_year, university_type)
VALUES
('UD', 'University of Delaware', 'USA', 'DE', 'Newark', '210 South College Avenue, Newark, DE', 'info@udel.edu', '302-831-2792', 'https://www.udel.edu', 1743, 'Public'),
('TU', 'Temple University', 'USA', 'PA', 'Philadelphia', '1801 North Broad Street, Philadelphia, PA', 'info@temple.edu', '215-204-7000', 'https://www.temple.edu', 1884, 'Public'),
('DU', 'Drexel University', 'USA', 'PA', 'Philadelphia', '3141 Chestnut Street, Philadelphia, PA', 'info@drexel.edu', '215-895-2000', 'https://www.drexel.edu', 1891, 'Private'),
('DSU', 'Delaware State University', 'USA', 'DE', 'Dover', '1200 North DuPont Highway, Dover, DE', 'info@desu.edu', '302-857-6060', 'https://www.desu.edu', 1891, 'Public'),
('WU', 'Wilmington University', 'USA', 'DE', 'New Castle', '320 North DuPont Highway, New Castle, DE', 'info@wilmu.edu', '877-967-5464', 'https://www.wilmu.edu', 1968, 'Private');

INSERT INTO departments
(department_name, department_code, university_id, head_of_department, department_email, department_phone, building_name, total_faculty, total_students)
VALUES
('Computer Science', 'CS', 1, 'Dr. Alan Smith', 'cs@udel.edu', '302-831-1001', 'Smith Hall', 35, 620),
('Business Administration', 'BUS', 1, 'Dr. Maria Johnson', 'business@udel.edu', '302-831-1002', 'Business Center', 42, 850),
('Engineering', 'ENG', 2, 'Dr. Robert Brown', 'engineering@temple.edu', '215-204-2001', 'Engineering Hall', 50, 1100),
('Biology', 'BIO', 2, 'Dr. Susan Miller', 'biology@temple.edu', '215-204-2002', 'Science Building', 28, 480),
('Data Science', 'DS', 3, 'Dr. Kevin Lee', 'datascience@drexel.edu', '215-895-3001', 'Tech Center', 25, 390),
('Mathematics', 'MATH', 1, 'Dr. Emily Davis', 'math@udel.edu', '302-831-1003', 'Math Hall', 22, 350),
('Nursing', 'NURS', 4, 'Dr. Linda Wilson', 'nursing@desu.edu', '302-857-7001', 'Health Science Building', 30, 540),
('Cybersecurity', 'CYB', 5, 'Dr. James Taylor', 'cybersecurity@wilmu.edu', '877-967-5001', 'Technology Hall', 18, 300);