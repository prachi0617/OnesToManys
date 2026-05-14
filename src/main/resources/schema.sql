DROP TABLE IF EXISTS departments;
DROP TABLE IF EXISTS universities;

CREATE TABLE universities (
    university_id INTEGER PRIMARY KEY AUTOINCREMENT,
    university_code TEXT NOT NULL,
    university_name TEXT NOT NULL,
    country TEXT NOT NULL,
    state_province TEXT NOT NULL,
    city TEXT NOT NULL,
    address TEXT NOT NULL,
    email TEXT NOT NULL,
    phone TEXT NOT NULL,
    website TEXT NOT NULL,
    established_year INTEGER,
    university_type TEXT NOT NULL
);

CREATE TABLE departments (
    department_id INTEGER PRIMARY KEY AUTOINCREMENT,
    department_name TEXT NOT NULL,
    department_code TEXT NOT NULL,
    university_id INTEGER NOT NULL,
    head_of_department TEXT NOT NULL,
    department_email TEXT NOT NULL,
    department_phone TEXT NOT NULL,
    building_name TEXT NOT NULL,
    total_faculty INTEGER,
    total_students INTEGER,
    FOREIGN KEY (university_id) REFERENCES universities(university_id)
);