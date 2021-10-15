/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ej4;

/**
 * @author MandraKeeTo
 * Sebastián Encina
 * 3dProDesign Enterprise
 * creaciones3dpro@gmail.com.ar
 */
public class Vehiculo {
private String descripcion;
private String marca;
private String modelo;
private String anio;

    public Vehiculo() {
    }

    public Vehiculo(String descripcion, String marca, String modelo, String anio) {
        this.descripcion = descripcion;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }


}
