create table produto(
 id bigint primary key not null,
 nome varchar(255) not null

);

create table cliente(
	id varchar primary key not null,
	nome varchar(255) not null
);

create table venda(
	id bigint primary key not null,
	id_produto bigint,
	id_cliente varchar,
	constraint fk_id_produto foreign key(id_produto) references produto(id),
	constraint fk_id_cliente foreign key(id_cliente) references cliente(id)
	
);

alter table produto
add column preco float;

alter table venda
add column quantidade int,
add column total float;

create sequence sq_produto
start 1
increment 1
owned by produto.id;

create sequence sq_venda
start 1
increment 1
owned by venda.id;

insert
	into
	produto (id,
	nome,
	preco)
values (nextval('sq_produto'),
'teclado',
10.0);

insert
	into
	produto (id,
	nome,
	preco)
values (nextval('sq_produto'),
'mouse',
5.00);

insert
	into
	cliente (id,
	nome)
values ('11155544499',
'Carolina');

insert
	into
	cliente (id,
	nome)
values ('22255533346',
'Ariel');

insert
	into
	venda (id,
	id_produto,
	id_cliente)
values(nextval('sq_venda'),
1,
'11155544499');

insert
	into
	venda (id,
	id_produto,
	id_cliente)
values(nextval('sq_venda'),
1,
'22255533346');

insert
	into
	venda (id,
	id_produto,
	id_cliente)
values(nextval('sq_venda'),
2,
'11155544499');

update
	venda
set
	quantidade = 10,
	total = 100.00
where
	id = 1;

update
	venda
set
	quantidade = 5,
	total = 50
where
	id = 2;

update
	venda
set
	quantidade = 1,
	total = 5
where
	id = 3;

select v.* as venda, c.nome as cliente
from venda as v
inner join cliente as c on v.id_cliente = c.id;



