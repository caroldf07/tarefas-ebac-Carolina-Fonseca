create table produto();

alter table produto 
add column id bigint;

drop table produto;

create table produto(
	id bigint,
	nome varchar(255)
);

insert into produto (id,nome) values(1,'Carolina');
insert into produto (id,nome) values(2,'Sofia');
update produto set nome = 'Olivia' where id =1;
delete from produto where id =2;
