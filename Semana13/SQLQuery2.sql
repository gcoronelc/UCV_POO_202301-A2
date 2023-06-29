
select * from Empleado;
go

sp_help empleado;
go


select chr_emplcodigo codigo, vch_emplpaterno paterno, vch_emplmaterno materno,
vch_emplnombre nombre, vch_emplciudad ciudad, vch_empldireccion direccion,
vch_emplusuario usuario, '*****' clave from empleado 
where vch_emplusuario=? and vch_emplclave = ? 




