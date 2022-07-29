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
    private int numeroMegasGB;
    private double costoGB;

    public PlanPostPagoMinutosMegas(String nU, String ceU, String ciU, String maM, String moM, String nM , int m, double cM, int nMGB, double cGB) {
        super(nU, ceU, ciU, maM, moM, nM);
        minutos = m;
        costoMinuto = cM;
        numeroMegasGB = nMGB;
        costoGB = cGB;
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

    @Override
    public void calcularPagoMensual() {
        pagoMensual = (minutos * costoMinuto) + (numeroMegasGB * costoGB);
    }

    @Override
    public double obtenerPagoMensual() {
        return pagoMensual;
    }

    @Override
    public String toString() {
        String cadena = String.format("\nPlan PostPago MinutosMegas\n"
                + super.toString() + "\nReporte\n"
                + "Minutos: %d\n"
                + "Costo minuto : %.2f\n"
                + "Numero de Megas (GB): %d\n"
                + "Costo del GB: %.2f\n"
                + "Pago mensual: %.2f\n",
                obtenerMinutos(),
                obtenerCostoMinuto(),
                obtenerNumeroMegasGB(),
                obtenerCostoGB(),
                obtenerPagoMensual());
        return cadena;
    }
}
