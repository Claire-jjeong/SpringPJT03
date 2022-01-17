--board table
create table board(
	idx int not null auto_increment,
	memId varchar(20) not null, -- 추가
	title varchar(100) not null,
	contents varchar(2000) not null,
	writer varchar(20) not null, -- memName
	indate datetime default now(), 
	count int default 0,
	primary key(idx)
);

drop table board;

insert into board(title,contents,writer)
values ('스프링게시판','스프링게시판','관리자');
insert into board(title,contents,writer)
values ('스프링게시판','스프링게시판','김정미');

select * from board;

create table member(
	memId varchar(20) not null, -- 아이디 
	memPass varchar(20) not null, -- 패스워드 
	memName varchar(20) not null, -- 이름 
	primary key(memId)
)

insert into member values('smhrd1','smhrd1','김정미');
insert into member values('smhrd2','smhrd2','최한글');
insert into member values('smhrd3','smhrd3','김현정');

select * from member;
select * from board;