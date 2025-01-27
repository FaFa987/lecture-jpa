-- **************************************
-- Insert Statements for Sample Data.   *
-- **************************************

-- Removing all existing data before Seeding new data
SET FOREIGN_KEY_CHECKS = 0; -- Disable foreign key checks
TRUNCATE TABLE course_instructor;
TRUNCATE TABLE instructor;
TRUNCATE TABLE course;
TRUNCATE TABLE student;
TRUNCATE TABLE address;
SET FOREIGN_KEY_CHECKS = 1; -- Re-enable foreign key checks

-- Addresses

INSERT INTO address (id, city, street, zip_code)
VALUES
    (1, 'New York', '123 Main St', 12345),
    (2, 'Los Angeles', '456 Elm St', 54321),
    (3, 'Chicago', '789 Oak St', 67890),
    (4, 'Houston', '1011 Pine St', 9876),
    (5, 'Miami', '1213 Maple St', 13579),
    (6, 'San Francisco', '1415 Cedar St', 24680),
    (7, 'Seattle', '1617 Birch St', 97531),
    (8, 'Boston', '1819 Pineapple St', 86420),
    (9, 'Houston', '1025 Pine St', 9876),
    (10, 'Dallas', '2223 Cherry St', 27182);

-- ********************************************************************

-- Students
INSERT INTO student (id, first_name, last_name, email, is_active, create_date, address_id)
VALUES
    (1, 'John', 'Doe', 'john.doe@example.com', 1, NOW(), 1),
    (2, 'Jane', 'Smith', 'jane.smith@example.com', 1,NOW(), 2),
    (3, 'Michael', 'Johnson', 'michael.johnson@example.com', 1,NOW(), 3),
    (4, 'Emily', 'Brown', 'emily.brown@example.com', 1,NOW(), 4),
    (5, 'Christopher', 'Wilson', 'christopher.wilson@example.com', 1,NOW(), 5),
    (6, 'Sarah', 'Martinez', 'sarah.martinez@example.com', 1,NOW(), 6),
    (7, 'Matthew', 'Anderson', 'matthew.anderson@example.com', 1,NOW(), 7),
    (8, 'Jessica', 'Taylor', 'jessica.taylor@example.com', 0,NOW(), 8),
    (9, 'Daniel', 'Thomas', 'daniel.thomas@example.com', 0,NOW(), 9),
    (10, 'Amanda', 'Hernandez', 'amanda.hernandez@example.com', 1,NOW(), 10);

-- ********************************************************************

-- Instructors
INSERT INTO instructor (id, name)
VALUES
    (1, 'John Smith'),
    (2, 'Emily Johnson'),
    (3, 'Michael Davis'),
    (4, 'Jessica Brown'),
    (5, 'David Martinez'),
    (6, 'Sarah Wilson'),
    (7, 'Christopher Taylor'),
    (8, 'Amanda Anderson'),
    (9, 'Ryan Thompson'),
    (10, 'Rachel Garcia'),
    (11, 'Sofia Neilson'),
    (12, 'Jessica Forsberg');

-- ********************************************************************


-- Courses
-- Assign Courses to students

-- Java Courses
INSERT INTO course (id, course_name, student_id)
VALUES
    (1, 'Java SE Programming Fundamentals', 1),
    (2, 'Java SE Programming Fundamentals', 2),
    (3, 'Java SE Programming Fundamentals', 3),
    (4, 'Advanced Java SE Development', 1),
    (5, 'Advanced Java SE Development', 2),
    (6, 'Advanced Java SE Development', 3),
    (7, 'Introduction to Java EE with Spring Framework', 1),
    (8, 'Introduction to Java EE with Spring Framework', 2),
    (9, 'Introduction to Java EE with Spring Framework', 3),
    (10, 'Introduction to Java EE with Spring Framework', 4),
    (11, 'Introduction to Java EE with Spring Framework', 5),
    (12, 'Introduction to Java EE with Spring Framework', 6),
    (13, 'JPA with Hibernate ORM Framework', 2),
    (14, 'JPA with Hibernate ORM Framework', 4),
    (15, 'JPA with Hibernate ORM Framework', 5),
    (16, 'JPA with Hibernate ORM Framework', 1),
    (17, 'JPA with Hibernate ORM Framework', 7),
    (18, 'Spring Data JPA', 3),
    (19, 'Spring Data JPA', 6),
    (20, 'Spring Data JPA', 2),
    (21, 'Spring Data JPA', 4),
    (22, 'Spring Data JPA', 5),
    (23, 'Spring Data JPA', 1),
    (24, 'Spring RESTful Web Services', 4),
    (25, 'Spring RESTful Web Services', 5),
    (26, 'Spring RESTful Web Services', 6),
    (27, 'Spring RESTful Web Services', 7),
    (28, 'Spring RESTful Web Services', 2),
    (29, 'Spring RESTful Web Services', 3),
    (30, 'Spring Testing Techniques', 7),
    (31, 'Spring Testing Techniques', 3),
    (32, 'Spring Testing Techniques', 5),
    (33, 'Spring Testing Techniques', 6),
    (34, 'Spring Batch for Batch Processing', 1),
    (35, 'Spring Batch for Batch Processing', 4),
    (36, 'Spring Batch for Batch Processing', 2),
    (37, 'Spring Batch for Batch Processing', 6),
    (38, 'Spring Batch for Batch Processing', 7),
    (39, 'Spring Cloud for Microservices', 3),
    (40, 'Spring Cloud for Microservices', 5),
    (41, 'Spring Cloud for Microservices', 6),
    (42, 'Spring Cloud for Microservices', 7);

-- FrontEnd Courses
INSERT INTO course (id, course_name, student_id)
VALUES
    (43, 'HTML5 and CSS3 Fundamentals', 2),
    (44, 'HTML5 and CSS3 Fundamentals', 4),
    (45, 'HTML5 and CSS3 Fundamentals', 5),
    (46, 'HTML5 and CSS3 Fundamentals', 6),
    (47, 'HTML5 and CSS3 Fundamentals', 7),
    (48, 'Build Responsive Websites with Flexbox and Grid', 3),
    (49, 'Build Responsive Websites with Flexbox and Grid', 4),
    (50, 'Build Responsive Websites with Flexbox and Grid', 5),
    (51, 'Build Responsive Websites with Flexbox and Grid', 7),
    (52, 'CSS Frameworks (Bootstrap, Tailwind CSS)', 2),
    (53, 'CSS Frameworks (Bootstrap, Tailwind CSS)', 3),
    (54, 'CSS Frameworks (Bootstrap, Tailwind CSS)', 6),
    (55, 'CSS Frameworks (Bootstrap, Tailwind CSS)', 7),
    (56, 'JavaScript Basics', 2),
    (57, 'JavaScript Basics', 3),
    (58, 'JavaScript Basics', 5),
    (59, 'JavaScript Basics', 7),
    (60, 'JavaScript Basics', 1),
    (61, 'Advanced JavaScript: ES6+', 4),
    (62, 'Advanced JavaScript: ES6+', 5),
    (63, 'Advanced JavaScript: ES6+', 6),
    (64, 'Advanced JavaScript: ES6+', 2),
    (65, 'Front-End Web Development with React', 1),
    (66, 'Front-End Web Development with React', 3),
    (67, 'Front-End Web Development with React', 4),
    (68, 'Front-End Web Development with React', 6);


-- ********************************************************************

-- Assigning tailored instructors to each course where students are participating in.
INSERT INTO course_instructor (course_id, instructor_id)
VALUES
    (1, 1), (1, 2),     -- Java SE Programming Fundamentals
    (2, 1), (2, 11),    -- Java SE Programming Fundamentals
    (3, 2), (3, 12),    -- Java SE Programming Fundamentals

    (4, 1), (4, 2), (4, 3), (4, 4),     -- Advanced Java SE Development
    (5, 1), (5, 2), (5, 3), (5, 4),     -- Advanced Java SE Development
    (6, 1), (2, 2), (2, 3), (2, 4),     -- Advanced Java SE Development

    (7, 3),  (7, 4), (7, 11),                        -- Introduction to Java EE with Spring Framework
    (8, 3),  (8, 4), (8, 11),                        -- Introduction to Java EE with Spring Framework
    (9, 3),  (9, 4), (9, 12),                        -- Introduction to Java EE with Spring Framework
    (10, 3), (10, 4), (10, 12),                      -- Introduction to Java EE with Spring Framework
    (11, 3), (11, 4), (11, 12),                      -- Introduction to Java EE with Spring Framework
    (12, 3), (12, 4), (12, 11),                      -- Introduction to Java EE with Spring Framework
    (13, 5), (13, 6), (13, 12),                      -- JPA with Hibernate ORM Framework
    (14, 5), (14, 6),                                                       -- JPA with Hibernate ORM Framework
    (15, 5), (15, 6), (15, 12),                      -- JPA with Hibernate ORM Framework
    (16, 5), (16, 6), (16, 12),                      -- JPA with Hibernate ORM Framework
    (17, 5), (17, 6), (17, 12),                      -- JPA with Hibernate ORM Framework
    (18, 7), (18, 8), (18, 12),                      -- Spring Data JPA
    (19, 7), (19, 8), (19, 11),                      -- Spring Data JPA
    (20, 7), (20, 8), (20, 12),                      -- Spring Data JPA
    (21, 7), (21, 8),                                                      -- Spring Data JPA
    (22, 7), (22, 8), (22, 12),                     -- Spring Data JPA
    (23, 7), (23, 8), (23, 12),                     -- Spring Data JPA
    (24, 5), (24, 6), (24, 11),                     -- Spring RESTful Web Services
    (25, 5), (25, 6),                                                      -- Spring RESTful Web Services
    (26, 5), (26, 6), (26, 11),                     -- Spring RESTful Web Services
    (27, 5), (27, 6), (27, 11),                      -- Spring RESTful Web Services
    (28, 5), (28, 6),                                                      -- Spring RESTful Web Services
    (29, 5), (29, 6), (29, 11),                      -- Spring RESTful Web Services
    (30, 5), (30, 6),                                                      -- Spring Testing Techniques
    (31, 5), (31, 6),                                                      -- Spring Testing Techniques
    (32, 5), (32, 6), (32, 12),                      -- Spring Testing Techniques
    (33, 5), (33, 6),                                                      -- Spring Testing Techniques
    (34, 5), (34, 6),                                                      -- Spring Batch for Batch Processing
    (35, 5), (35, 6),                                                      -- Spring Batch for Batch Processing
    (36, 5), (36, 6), (36, 12),                      -- Spring Batch for Batch Processing
    (37, 5), (37, 6),                                                      -- Spring Batch for Batch Processing
    (38, 5), (38, 6),                                                      -- Spring Batch for Batch Processing
    (39, 5), (39, 6), (39, 12),                      -- Spring Cloud for Microservices
    (40, 5), (40, 6),                                                    -- Spring Cloud for Microservices
    (41, 5), (41, 6), (41, 12),                     -- Spring Cloud for Microservices
    (42, 5), (42, 6), (42, 12),                     -- Spring Cloud for Microservices
    (43, 7), (43, 8),                                                    -- HTML5 and CSS3 Fundamentals
    (44, 7), (44, 8),                                                    -- HTML5 and CSS3 Fundamentals
    (45, 7), (45, 8), (45, 11),                     -- HTML5 and CSS3 Fundamentals
    (46, 7), (46, 8),                                                    -- HTML5 and CSS3 Fundamentals
    (47, 7), (47, 8), (47, 11),                     -- HTML5 and CSS3 Fundamentals
    (48, 7), (48, 8),                                                    -- Build Responsive Websites with Flexbox and Grid
    (49, 7), (49, 8),                                                    -- Build Responsive Websites with Flexbox and Grid
    (50, 7), (50, 8),                                                    -- Build Responsive Websites with Flexbox and Grid
    (51, 7), (51, 8), (51, 11),                     -- Build Responsive Websites with Flexbox and Grid
    (52, 7), (52, 8),                                                    -- CSS Frameworks (Bootstrap, Tailwind CSS)
    (53, 7), (53, 8),                                                    -- CSS Frameworks (Bootstrap, Tailwind CSS)
    (54, 7), (54, 8), (54, 11),                     -- CSS Frameworks (Bootstrap, Tailwind CSS)
    (55, 7), (55, 8),                                                       -- CSS Frameworks (Bootstrap, Tailwind CSS)
    (56, 9), (56, 10),                                                      -- JavaScript Basics
    (57, 9), (57, 10),                                                      -- JavaScript Basics
    (58, 9), (58, 10),                                                      -- JavaScript Basics
    (59, 9), (59, 10),                                                      -- JavaScript Basics
    (60, 9), (60, 10),                                                      -- JavaScript Basics
    (61, 9), (61, 10),                                                      -- Advanced JavaScript: ES6+
    (62, 9), (62, 10),                                                      -- Advanced JavaScript: ES6+
    (63, 9), (63, 10),                                                      -- Advanced JavaScript: ES6+
    (64, 9), (64, 10),                                                      -- Advanced JavaScript: ES6+
    (65, 9), (65, 10),                                                      -- Front-End Web Development with React
    (66, 9), (66, 10),                                                      -- Front-End Web Development with React
    (67, 9), (67, 10),                                                      -- Front-End Web Development with React
    (68, 9), (68, 10);                                                      -- Front-End Web Development with React


-- ********************************************************************

-- Courses Assigned to Instructors

-- John Smith:
--   Java SE Programming Fundamentals (1, 2)
--   Advanced Java SE Development (4, 5, 6)

-- Emily Johnson:
--   Java SE Programming Fundamentals (1, 3)
--   Advanced Java SE Development (4, 5, 6)

-- Michael Davis:
--   Java SE Programming Fundamentals (3)
--   Advanced Java SE Development (4, 5, 6)
--   Introduction to Java EE with Spring Framework (7, 8, 9, 10, 11, 12)

-- Jessica Brown:
--   Advanced Java SE Development (4, 5, 6)
--   Introduction to Java EE with Spring Framework (7, 8, 9, 10, 11, 12)

-- David Martinez:
--   JPA with Hibernate ORM Framework (13, 14, 15, 16, 17)
--   Spring RESTful Web Services (24, 25, 26, 27, 28)
--   Spring Testing Techniques (30, 31, 32, 33)
--   Spring Batch for Batch Processing (34, 35, 36, 37, 38)
--   Spring Cloud for Microservices (39, 40, 41, 42)

-- Sarah Wilson:
--   JPA with Hibernate ORM Framework (13, 14, 15, 16, 17)
--   Spring RESTful Web Services (24, 25, 26, 27, 28)
--   Spring Testing Techniques (30, 31, 32, 33)
--   Spring Batch for Batch Processing (34, 35, 36, 37, 38)
--   Spring Cloud for Microservices (39, 40, 41, 42)

-- Christopher Taylor:
--   Spring Data JPA (18, 19, 20, 21, 22, 23)
--   HTML5 and CSS3 Fundamentals (43, 44, 45, 46, 47)
--   Build Responsive Websites with Flexbox and Grid (48, 49, 50, 51)
--   CSS Frameworks (Bootstrap, Tailwind CSS) (52, 53, 54, 55)

-- Amanda Anderson:
--   Spring Data JPA (18, 19, 20, 21, 22, 23)
--   HTML5 and CSS3 Fundamentals (43, 44, 45, 46, 47)
--   Build Responsive Websites with Flexbox and Grid (48, 49, 50, 51)
--   CSS Frameworks (Bootstrap, Tailwind CSS) (52, 53, 54, 55)

-- Ryan Thompson:
--   JavaScript Basics (56, 57, 58, 59, 60)
--   Advanced JavaScript: ES6+ (61, 62, 63, 64)

-- Rachel Garcia:
--   JavaScript Basics (56, 57, 58, 59, 60)
--   Advanced JavaScript: ES6+ (61, 62, 63, 64)

-- Sofia Neilson:
--   Introduction to Java EE with Spring Framework (7, 8, 9, 10, 11, 12)
--   HTML5 and CSS3 Fundamentals (43, 44, 45, 46, 47)
--   CSS Frameworks (Bootstrap, Tailwind CSS) (52, 53, 54, 55)

-- Jessica Forsberg:
--   Introduction to Java EE with Spring Framework (9, 10, 11, 12)
--   JPA with Hibernate ORM Framework (13, 15, 16, 17)
--   Spring Batch for Batch Processing (36)
--   Spring Cloud for Microservices (39, 41, 42)

