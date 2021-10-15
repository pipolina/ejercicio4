/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4.entidades;

/**
 *
 * @author FLAMA
 */
public class Pajaro {
   private String tipoDeAve;
   private Double envergaduraalas;
   private Double peso;
   private String fauna;

    public Pajaro() {
    }

    public Pajaro(String tipoDeAve, Double envergaduraalas, Double peso, String fauna) {
        this.tipoDeAve = tipoDeAve;
        this.envergaduraalas = envergaduraalas;
        this.peso = peso;
        this.fauna = fauna;
    }

    public String getTipoDeAve() {
        return tipoDeAve;
    }

    public void setTipoDeAve(String tipoDeAve) {
        this.tipoDeAve = tipoDeAve;
    }

    public Double getEnvergaduraalas() {
        return envergaduraalas;
    }

    public void setEnvergaduraalas(Double envergaduraalas) {
        this.envergaduraalas = envergaduraalas;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getFauna() {
        return fauna;
    }

    public void setFauna(String fauna) {
        this.fauna = fauna;
    }
   
   
}
