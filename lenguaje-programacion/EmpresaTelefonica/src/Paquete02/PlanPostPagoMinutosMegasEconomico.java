/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete02;

/**
 *
 * @author spart
 */
public class PlanPostPagoMinutosMegasEconomico extends PlanCelular {

    private int minutos;
    private double costoMinuto;
    private int numeroMegasGB;
    private double costoGB;
    private double porcentajeDescuento;

    public PlanPostPagoMinutosMegasEconomico(int m, double cM, int nMGB, double cGB, double pD,
            String nU, String ceU, String ciU, String maM, String moM, String nM) {
        super(nU, ceU, ciU, maM, moM, nM);
        minutos = m;
        costoMinuto = cM;
        numeroMegasGB = nMGB;
        costoGB = cGB;
        porcentajeDescuento = pD;
    }
    
    public void establecerMinutos(int n) {
        minutos = n;
    }

    public int obtenerMinutos() {
        return minutos;
    }

    public void establecerCostoMinuto(double n) {
        costoMinuto = n;
    }

    public double obtenerCostoMinuto() {
        return costoMinuto;
    }

    public void establecerNumeroMegasGB(int n) {
        numeroMegasGB = n;
    }

    public int obtenerNumeroMegasGB() {
        return numeroMegasGB;
    }

    public void establecerCostoGB(double n) {
        costoGB = n;
    }

    public double obtenerCostoGB() {
        return costoGB;
    }

    public void establecerPDescuento(double n) {
        porcentajeDescuento = n / 100;
    }

    public double obtenerPDescuento() {
        return porcentajeDescuento;
    }

    @Override
    public void calcularPagoMensual() {
        double subtotal = (minutos * costoMinuto) + (numeroMegasGB * costoGB);
        pagoMensual = subtotal - (porcentajeDescuento * subtotal);
    }

    @Override
    public double obtenerPagoMensual() {
        return pagoMensual;
    }

    @Override
    public String toString() {
        String cadena = String.format("\nPlan PostPago MinutosMegas Economico\n"
                + super.toString() + "\nReporte\n"
                + "Minutos: %d\n"
                + "Costo minuto : %.2f\n"
                + "Numero de Megas (GB): %d\n"
                + "Costo del GB: %.2f\n"
                + "Porcentage Descuento: %.2f\n"
                + "Pago mensual: %.2f\n",
                obtenerMinutos(), 
                obtenerCostoMinuto(),
                obtenerNumeroMegasGB(),
                obtenerCostoGB(), 
                obtenerPDescuento() * 100,
                obtenerPagoMensual());
        return cadena;
    }
}
