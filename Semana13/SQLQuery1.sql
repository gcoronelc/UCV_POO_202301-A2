
declare @cuenta varchar(20);
set @cuenta='00400006';
select * from cuenta where chr_cuencodigo=@cuenta;
select * from movimiento where chr_cuencodigo=@cuenta;
go

select * from Cliente;
go

insert into Cliente
values('45785','Casas','Castillo','Marcia',
'77777','Los Olivos','Los Olivos','99989989','mcasver@alfa.com');
go