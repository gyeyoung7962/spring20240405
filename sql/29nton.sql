use mydb1;

#n to n : 다 대 다 관계

create table board
(
    id      int primary key auto_increment,
    title   varchar(20),
    content varchar(20)
);

create table member
(
    id    int primary key auto_increment,
    email varchar(20),
    info  varchar(20)
);

# 다대다 관계의 테이블의 중간테이블 생성
create table board_like
(
    board_id  int references board (id),
    member_id int references member (id),
    primary key (board_id, member_id)
);


desc board_like;

drop table board_like;


