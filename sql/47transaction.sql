#transaction : 하나의 업무단위

use mydb2;

create table bank
(
    name  varchar(3) primary key,
    money int not null
);

insert into bank
values ('흥민', 10000),
       ('강인', 10000);

select *
from bank;

#송금 업무
# 강인이 흥민에게 500원 송금
update bank
set money = money - 500
where name = '강인';

update bank
set money = money + 500
where name = '흥민';

# transaction 시작
start transaction;

#모두 성공(반영)
commit;

#transaction 시작
start transaction;

#모두 실패(반영하지 않음, 트랜잭션 시작전으로 돌림)
rollback;
