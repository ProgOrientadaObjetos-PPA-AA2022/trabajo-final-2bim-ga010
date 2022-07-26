/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete02;

/**
 *
 * @author spart
 */
public class PlanPostPagoMinutosMegas extends PlanCelular {
    private int minutos;
    private double costoMinuto;
    private double numeroMegasGB;
    private double costoGB;

    public PlanPostPagoMinutosMegas(int m, double cM, double nM, double cGB,
            String nom, String ced, String ciu, String mar, String mod, String numeroCe) {
        super(nom, ced, ciu, mar, mod, numeroCe);
        minutos = m;
        costoMinuto = cM;
        numeroMegasGB = nM;
        costoGB = cGB;
    }
    
    public void establecerMinutos(int n) {
        minutos = n;
    }

    public void establecerCostoMinuto(double n) {
        costoMinuto = n;
    }
  
    public void establecerNumeroMegasGB(int n) {
        numeroMegasGB = n;
    }

    public void establecerCostoGB(double n) {
        costoGB = n;
    }
    
    @Override
    public void calcularPagoMensual() {
        pagoMensual = 0;
    }
    
    @Override
    public double obtenerPagoMensual(){
        return pagoMensual;
    }
    
    public int obtenerMinutos() {
        return minutos;
    }
    
    public double obtenerCostoMinuto() {
        return costoMinuto;
    }
    
    public double obtenerNumeroMegasGB() {
        return numeroMegasGB;
    }
    
    public double obtenerCostoGB() {
        return costoGB;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Plan PostPago MinutosMegas\n"
                + super.toString()
                + "Minutos: %d\n"
                + "Costo minuto : %.2f\n"
                + "Numero de Megas (GB): %d\n"
                + "Costo del GB: %.2f\n"
                + "Pago mensual: %.2f\n", 
                obtenerMinutos(),obtenerCostoMinuto(),
                obtenerNumeroMegasGB(),
                obtenerCostoGB(),
                obtenerPagoMensual());
        return cadena;
    }
}
