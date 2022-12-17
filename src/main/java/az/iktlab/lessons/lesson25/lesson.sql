CREATE TABLE sch_q5.person
(
    id      bigint not null,
    name    varchar,
    surname varchar,
    age     int2,
    PRIMARY KEY (id)
);

insert into sch_q5.person(id, name, surname, age)
values ('Ali', 'Mardanov', 98);

update sch_q5.person
set age=11
where id = 2;

DELETE
FROM sch_q5.person
WHERE id = 4;


select *
from sch_q5.person;

select id, name
from sch_q5.person;

select *
from sch_q5.person
where age > 20;

select count(*)
from sch_q5.person;

select max(age)
from sch_q5.person;

select *
from sch_q5.person
where age = (select max(age) from sch_q5.person);