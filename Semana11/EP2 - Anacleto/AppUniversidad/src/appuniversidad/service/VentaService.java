package appuniversidad.service;

import appuniversidad.dto.VentaCursoDTO;
import java.text.DecimalFormat;

public class VentaService {

    DecimalFormat df = new DecimalFormat("#####.##");

    public VentaCursoDTO agregarVenta(int cat, String desc, int part) {
        VentaCursoDTO venta = new VentaCursoDTO(cat, desc, part);
        calcularPrecioCurso(venta);
        realizarDemasCalculos(venta);
        return venta;
    }

    private void calcularPrecioCurso(VentaCursoDTO venta) {
        switch (venta.getCategoria()) {
            case 1 -> {
                venta.setPrecio(950);
                venta.setNom_categoria("Programacion");
            }
            case 2 -> {
                venta.setPrecio(720);
                venta.setNom_categoria("Ofimatica");
            }
            case 3 -> {
                venta.setPrecio(1850);
                venta.setNom_categoria("Administracion");
            }
            case 4 -> {
                venta.setPrecio(1200);
                venta.setNom_categoria("Otros");
                break;
            }
        }
    }

    private void realizarDemasCalculos(VentaCursoDTO venta) {
        //Obtener el total
        venta.setTotal(venta.getPrecio() * venta.getParticipantes());
        //Obtener el impuesto
        venta.setImpuesto(venta.getTotal() * 0.18);
        //Obtener el importe de venta
        venta.setImporte(venta.getTotal() - venta.getImpuesto());
        //Obtener la comision
        switch (venta.getCategoria()) {
            case 1 -> {
                if (venta.getParticipantes() > 12) {
                    venta.setComision(venta.getImporte() * 0.07);
                } else {
                    venta.setComision(venta.getImporte() * 0.05);
                }
            }
            case 2 -> {
                if (venta.getParticipantes() > 12) {
                    venta.setComision(venta.getImporte() * 0.05);
                } else {
                    venta.setComision(venta.getImporte() * 0.03);
                }
            }
            case 3 -> {
                if (venta.getParticipantes() > 12) {
                    venta.setComision(venta.getImporte() * 0.10);
                } else {
                    venta.setComision(venta.getImporte() * 0.08);
                }
            }
            case 4 -> {
                if (venta.getParticipantes() > 12) {
                    venta.setComision(venta.getImporte() * 0.06);
                } else {
                    venta.setComision(venta.getImporte() * 0.04);
                }
            }
        }
    }

    public void imprimirDatos(VentaCursoDTO venta) {
        System.out.println("Categoria del curso: \t" + venta.getNom_categoria());
        System.out.println("Descripcion del curso: \t" + venta.getDescripcion());
        System.out.println("Participantes: \t\t" + venta.getParticipantes());
        System.out.println("Precio del curso: \t" + df.format(venta.getPrecio()) + " soles");
        System.out.println("Importe de venta: \t" + df.format(venta.getImporte()) + " soles");
        System.out.println("Impuesto: \t\t" + df.format(venta.getImpuesto()) + " soles");
        System.out.println("Total: \t\t\t" + df.format(venta.getTotal()) + " soles");
        System.out.println("Comision: \t\t" + df.format(venta.getComision()) + " soles");
    }

    public String devolverString(VentaCursoDTO venta) {
        String datos = "Categoria del curso: \t" + venta.getNom_categoria()
                + "\nDescripcion del curso: \t" + venta.getDescripcion()
                + "\nParticipantes: \t\t" + venta.getParticipantes()
                + "\nPrecio del curso: \t" + df.format(venta.getPrecio()) + " soles"
                + "\nImporte de venta: \t" + df.format(venta.getImporte()) + " soles"
                + "\nImpuesto: \t\t" + df.format(venta.getImpuesto()) + " soles"
                + "\nTotal: \t\t" + df.format(venta.getTotal()) + " soles"
                + "\nComision: \t\t" + df.format(venta.getComision()) + " soles";

        return datos;
    }

}
