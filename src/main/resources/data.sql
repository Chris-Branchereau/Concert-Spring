insert into VENUE(id, name, capacity, address, type) values
  (1, 'Stade Roi Baudoin', 50000, 'Avenue de Marathon, 135/2, 1020 Bruxelles', 'STADIUM'),
  (2, 'Cirque royal', 2000, 'Rue de l''Enseignement 81, 1000 Bruxelles', 'CONCERT_HALL'),
  (3, 'Ancienne Belgique', 2700, 'Boulevard Anspach 110, 1000 Bruxelles', 'CONCERT_HALL'),
  (4, 'AB Club', 370, 'Boulevard Anspach 110, 1000 Bruxelles', 'CLUB'),
  (5, 'La Madeleine', 1500, '14 Rue Duquesnoy, 1000 Bruxelles', 'CONCERT_HALL'),
  (6, 'Forest National', 8400, 'Avenue Victor Rousseau 208, 1190 Forest ', 'CONCERT_HALL'),
  (7, 'Palais 12', 15000, 'Avenue de Miramar, 1020 Bruxelles', 'CONCERT_HALL'),
  (11, 'Paris La Defense Arena', 45000, '99 Jardins De L''Arche, Nanterre, FR 92000', 'STADIUM'),
  (12, 'Le Grand Rex', 2700, '1 Bd Poissonniere, Paris, FR 75002', 'CONCERT_HALL');

insert into TOUR(id, title, artist) values
  (101, 'Marvel Studios Infinity Saga Tour', 'GREENHOUSE TALENT'),
  (102, 'The Eras Tour', 'Taylor Swift'),
  (103, 'Distant Worlds: Music From Final Fantasy Coral', 'Square Enix Music'),
  (104, 'Worlds Collide', 'Within Temptation/Evanescence'),
  (105, 'Disney On Ice 2025', 'Disney');

insert into CONCERT(id, time, tour_id, venue_id) values
  (10101, '2025-05-28 20:00:00.000', 101, 7),
  (10201, '2024-05-02 19:00:00.000', 102, 1),
  (10202, '2024-05-09 18:30:00.000', 102, 11),
  (10203, '2024-05-10 18:30:00.000', 102, 11),
  (10204, '2024-05-11 18:30:00.000', 102, 11),
  (10205, '2024-05-12 18:30:00.000', 102, 11),
  (10301, '2023-03-11 19:00:00.000', 103, 7),
  (10302, '2023-02-25 15:00:00.000', 103, 12),
  (10303, '2023-02-25 20:00:00.000', 103, 12),
  (10401, '2022-05-28 20:00:00.000', 104, 2),
  (10402, '2022-05-28 20:00:00.000', 104, 3),
  (10403, '2022-05-28 20:00:00.000', 104, 6),
  (10404, '2022-05-28 20:00:00.000', 104, 6),
  (10405, '2022-05-28 20:00:00.000', 104, 6),
  (10406, '2022-05-28 20:00:00.000', 104, 7);