
-- create
CREATE TABLE MOVIE (
  id INTEGER primary key AUTO_INCREMENT,
  title VARCHAR(255) NOT NULL,
  category VARCHAR(255) NOT NULL,
  length INTEGER NOT NULL,
  description MEDIUMTEXT NOT NULL
);

-- insert
INSERT INTO MOVIE (title, category, length, description) VALUES
('The Silent Echo', 'Drama', 118, 'A gripping tale of a mute composer who finds his voice through music in post-war Vienna.');

INSERT INTO MOVIE (title, category, length, description) VALUES
('Galactic Drift', 'Science Fiction', 142, 'A team of misfit astronauts must save humanity after Earth is thrown off its orbit by a rogue planet.');

INSERT INTO MOVIE (title, category, length, description) VALUES
('Midnight Heist', 'Action', 105, 'An elite thief returns from retirement for one last job: breaking into the world\'s most secure vault.');

INSERT INTO MOVIE (title, category, length, description) VALUES
('Laugh Out Loud', 'Comedy', 97, 'A struggling comedian accidentally becomes a viral sensation when a prank goes wildly out of control.');

INSERT INTO MOVIE (title, category, length, description) VALUES
('The Forgotten Grove', 'Fantasy', 130, 'In a mystical forest hidden from the world, a young orphan discovers her destiny to protect ancient magic.');

-- fetch 
SELECT * FROM MOVIE;
