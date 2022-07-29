/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete02;

/**
 *
 * @author spart
 */
public abstract class PlanCelular {

    protected String nombresUsuario;
    protected String cedulaUsuario;
    protected String ciudadUsuario;
    protected String marcaMovil;
    protected String modeloMovil;
    protected String numeroMovil;
    protected double pagoMensual;

    public PlanCelular(String nU, String ceU, String ciU, String maM,
            String moM, String nM) {
        nombresUsuario = nU;
        cedulaUsuario = ceU;
        ciudadUsuario = ciU;
        marcaMovil = maM;
        modeloMovil = moM;
        numeroMovil = nM;
    }

    public void establecerNombresUsuario(String n) {
        nombresUsuario = n;
    }

    public String obtenerNombresUsuario() {
        return nombresUsuario;
    }

    public void establecerCedulaUsuario(String n) {
        cedulaUsuario = n;
    }

    public String obtenerCedulaUsuario() {
        return cedulaUsuario;
    }

    public void establecerCiudadUsuario(String n) {
        ciudadUsuario = n;
    }

    public String obtenerCiudadUsuario() {
        return ciudadUsuario;
    }

    public void establecerMarcaMovil(String n) {
        marcaMovil = n;
    }

    public String obtenerMarcaMovil() {
        return marcaMovil;
    }

    public void establecerModeloMovil(String n) {
        modeloMovil = n;
    }

    public String obtenerModeloMovil() {
        return modeloMovil;
    }

    public void establecerNumeroMovil(String n) {
        numeroMovil = n;
    }

    public String obtenerNumeroMovil() {
        return numeroMovil;
    }

    public abstract void calcularPagoMensual();

    public double obtenerPagoMensual() {
        return pagoMensual;
    }

    
    @Override
    public String toString() {
        String cadena = String.format("--------------------\n"
                + "Propietario\n"
                + "Nombres del Usuario: %s\n"
                + "Cedula del Usuario: %s\n"
                + "Ciudad del Usuario: %s\n"
                + "Celular: \n"
                + "Marca del Movil: %s\n"
                + "Modelo del Movil: %s\n"
                + "Numero del Movil: %s\n",
                obtenerNombresUsuario(),
                obtenerCedulaUsuario(),
                obtenerCiudadUsuario(),
                obtenerMarcaMovil(),
                obtenerModeloMovil(),
                obtenerNumeroMovil());

        return cadena;
    }
}
