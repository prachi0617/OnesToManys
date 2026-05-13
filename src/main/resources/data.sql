cat > src/main/resources/data.sql <<'EOF'
INSERT INTO universities (name, city, state, founded_year)
VALUES
('University of Delaware', 'Newark', 'DE', 1743),
('Temple University', 'Philadelphia', 'PA', 1884),
('Drexel University', 'Philadelphia', 'PA', 1891);

INSERT INTO departments (name, building, budget, university_id)
VALUES
('Computer Science', 'Smith Hall', 250000.00, 1),
('Business Administration', 'Business Center', 300000.00, 1),
('Engineering', 'Engineering Hall', 450000.00, 2),
('Biology', 'Science Building', 180000.00, 2),
('Data Science', 'Tech Center', 220000.00, 3);
EOF