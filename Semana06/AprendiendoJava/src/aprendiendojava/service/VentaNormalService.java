/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendiendojava.service;

import aprendiendojava.service.spec.VentaSpec;

/**
 *
 * @author AULA-320
 */
public class VentaNormalService implements VentaSpec {

    @Override
    public double calcVenta(double precio, int cantidad) {
        return (precio * cantidad);
    }

}
