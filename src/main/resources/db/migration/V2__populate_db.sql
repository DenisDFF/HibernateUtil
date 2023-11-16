INSERT INTO Client (name) VALUES
('Client 1'),
('Client 2'),
('Client 3'),
('Client 4'),
('Client 5'),
('Client 6'),
('Client 7'),
('Client 8'),
('Client 9'),
('Client 10');

INSERT INTO Planet (id, name) VALUES
('MARS', 'Mars'),
('VENUS', 'Venus'),
('EARTH', 'Earth'),
('JUPITER', 'Jupiter'),
('SATURN', 'Saturn');

INSERT INTO Ticket (client_id, from_planet_id, to_planet_id) VALUES
(1, 'MARS', 'VENUS'),
(2, 'VENUS', 'EARTH'),
(3, 'EARTH', 'MARS'),
(4, 'JUPITER', 'SATURN'),
(5, 'SATURN', 'MARS'),
(6, 'MARS', 'EARTH'),
(7, 'VENUS', 'JUPITER'),
(8, 'EARTH', 'SATURN'),
(9, 'JUPITER', 'VENUS'),
(10, 'SATURN', 'JUPITER');