-- Tabla de roles
CREATE TABLE IF NOT EXISTS role (
    id_role SERIAL PRIMARY KEY,
    name_role VARCHAR(50) NOT NULL,
    description TEXT
);

-- Tabla de usuarios
CREATE TABLE IF NOT EXISTS users (
    id_users SERIAL PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    pass_key VARCHAR(100) NOT NULL,
    names VARCHAR(100),
    first_surname VARCHAR(50),
    second_surname VARCHAR(50),
    type_document VARCHAR(20),
    document_number VARCHAR(20),
    id_role INTEGER REFERENCES role(id_role)
);

-- Tabla de cursos
CREATE TABLE IF NOT EXISTS course (
    id_course SERIAL PRIMARY KEY,
    name_course VARCHAR(100) NOT NULL,
    description TEXT
);

-- Tabla de aulas/salones
CREATE TABLE IF NOT EXISTS classroom (
    id_classroom SERIAL PRIMARY KEY,
    grade VARCHAR(20) NOT NULL,
    section VARCHAR(20) NOT NULL
);

-- Tabla de profesores
CREATE TABLE IF NOT EXISTS teacher (
    id_teacher SERIAL PRIMARY KEY,
    id_users INTEGER REFERENCES users(id_users) NOT NULL,
    names VARCHAR(100),
    first_surname VARCHAR(50),
    second_surname VARCHAR(50),
    type_document VARCHAR(20),
    document_number VARCHAR(20)
);

-- Tabla de estudiantes
CREATE TABLE IF NOT EXISTS student (
    id_student SERIAL PRIMARY KEY,
    id_users INTEGER REFERENCES users(id_users) NOT NULL,
    names VARCHAR(100),
    first_surname VARCHAR(50),
    second_surname VARCHAR(50),
    type_document VARCHAR(20),
    id_classroom INTEGER REFERENCES classroom(id_classroom)
);

-- Tabla de relación entre aulas y cursos (relación muchos a muchos)
CREATE TABLE IF NOT EXISTS classroom_course (
    id_classroom INTEGER REFERENCES classroom(id_classroom),
    id_course INTEGER REFERENCES course(id_course),
    id_teacher INTEGER REFERENCES teacher(id_teacher),
    PRIMARY KEY (id_classroom, id_course)
);

-- Tabla de notas
CREATE TABLE IF NOT EXISTS notes (
    id_note SERIAL PRIMARY KEY,
    id_student INTEGER REFERENCES student(id_student) NOT NULL,
    id_course INTEGER REFERENCES course(id_course) NOT NULL,
    note NUMERIC(5,2),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    term VARCHAR(20)
);

