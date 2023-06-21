select chr_sucucodigo, dtt_asigfechabaja from dbo.Asignado
where chr_emplcodigo='0005' and dtt_asigfechabaja is null
go

select int_sucucontcuenta from sucursal 
where chr_sucucodigo = '001';
go

update dbo.Sucursal set int_sucucontcuenta = ?
where chr_sucucodigo = ?
go

select * from cuenta order by 1 desc;
GO

insert into cuenta(chr_cuencodigo,chr_monecodigo,chr_sucucodigo,
chr_emplcreacuenta,chr_cliecodigo,dec_cuensaldo,dtt_cuenfechacreacion,
vch_cuenestado,int_cuencontmov,chr_cuenclave)
values(?,?,?,?,?,?,GETDATE(),'ACTIVO',?)
GO

select * from movimiento order by 1 desc;
go

insert into movimiento(chr_cuencodigo,int_movinumero,dtt_movifecha,
chr_emplcodigo,chr_tipocodigo,dec_moviimporte,chr_cuenreferencia)
values(?,1,GETDATE(),?,'001',?,NULL)
GO


SELECT * FROM TipoMovimiento order by 1 desc;
GO


