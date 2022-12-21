select *
from sch_q5.person
where upper(name) like '%A';

select *
from sch_q5.person;

select *
from sch_q5.person
where age in (11, 24);

create table sch_q5.user
(
    id        bigint not null primary key,
    username  varchar(10),
    password  varchar(16),
    person_id bigint,
    FOREIGN KEY (person_id) REFERENCES sch_q5.person (id)
--     unique (username) bir username den ikinci defe istifade etmek olmaz
);

insert into sch_q5.user
values (4, 'un3', '86765', 3);

select *
from sch_q5.user;

-- not good way
select *
from sch_q5.user
where person_id = (select id from sch_q5.person where name like '%Khayal%');


select *
from sch_q5.user u
         inner join sch_q5.person p on p.id = u.person_id;
