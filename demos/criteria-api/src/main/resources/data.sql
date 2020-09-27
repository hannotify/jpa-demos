insert into Department (id, name)
values (0, 'Kenniscentrum'),
       (1, 'Consultancy'),
       (2, 'Managed Services'),
       (3, 'Staf'),
       (4, 'Management');

insert into Employee (id, name, salary, department_id)
values (0, 'Hanno Embregts', 1750, 1),
       (1, 'Maarten Mulders', 2000, 1),
       (2, 'Marco Pil', 2500, 0),
       (3, 'Guido Hanegraaf', 1750, 3),
       (4, 'Bas Meerman', 3000, 4),
       (5, 'Tom Cools', 2000, 1),
       (6, 'Xander Buffart', 2750, 2),
       (7, 'Willem van Lent', 1500, 2);

insert into Programmer (id, favorite_language)
values (0, 'Java'),
       (1, 'Scala'),
       (2, 'C#'),
       (5, 'Java'),
       (7, 'C#');
