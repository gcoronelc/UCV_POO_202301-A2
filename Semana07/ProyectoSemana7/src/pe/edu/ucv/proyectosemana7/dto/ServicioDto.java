package pe.edu.ucv.proyectosemana7.dto;

public class ServicioDto {
    
    private String dni;
    private String nombre;
	 private String plan;
	 private String tipo;
	 private int duracion;
	 private double costoMin;
	 private double importe;
	 private double impuesto;
	 private double total;

	public ServicioDto() {
	}

	public ServicioDto(String dni, String nombre, String plan, String tipo, int duracion) {
		this.dni = dni;
		this.nombre = nombre;
		this.plan = plan;
		this.tipo = tipo;
		this.duracion = duracion;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public double getCostoMin() {
		return costoMin;
	}

	public void setCostoMin(double costoMin) {
		this.costoMin = costoMin;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	 
	 
    
}
