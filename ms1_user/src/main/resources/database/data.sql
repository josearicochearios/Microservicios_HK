DROP TABLE IF EXISTS user

-- CREAR TABLA institute
CREATE TABLE user (
	id SERIAL PRIMARY KEY NOT NULL,
	username VARCHAR(20) NOT NULL,
	password VARCHAR(15) NOT NULL,
	level CHAR(1) NOT NULL,
	active boolean NOT NULL
);


-- INSERTAR REGISTROS
INSERT INTO user
(username,password,level,active)
VALUES
('pepito','contrasena36','1','true'),
('jaimito','micontra25','2','true'),
('joaquin','masgrande65','1','true'),
('caillu','pelado12','2','true');


SELECT * FROM "user";