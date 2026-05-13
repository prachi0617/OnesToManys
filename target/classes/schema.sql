cat > src/main/resources/schema.sql <<'EOF'
DROP TABLE IF EXISTS departments;
DROP TABLE IF EXISTS universities;

CREATE TABLE universities (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL,
    city TEXT NOT NULL,
    state TEXT NOT NULL,
    founded_year INTEGER
);

CREATE TABLE departments (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL,
    building TEXT NOT NULL,
    budget REAL,
    university_id INTEGER,
    FOREIGN KEY (university_id) REFERENCES universities(id)
);
EOF