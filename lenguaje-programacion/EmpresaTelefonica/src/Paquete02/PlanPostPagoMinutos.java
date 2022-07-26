/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete02;

/**
 *
 * @author spart
 */
public class PlanPostPagoMinutos extends PlanCelular {

    private int minutosNacionales;
    private double costoMinutoNacional;
    private int minutosInternacionales;
    private double costoMinutoInternacional;

    public PlanPostPagoMinutos(int mN, double cMN, int mI, String nU, String ceU,
            String ciU, String maM, String moM, String nM) {
        super(nU, ceU, ciU, maM, moM, nM);
        minutosNacionales = mN;
        costoMinutoNacional = cMN;
        minutosInternacionales = mI;
    }
    

    public void establecerMinutosNacionales(int n) {
        minutosNacionales = n;
    }

    public int obtenerMinutosNacionales() {
        return minutosNacionales;
    }

    public void establecerCostoMinutoNacional(double n) {
        costoMinutoNacional = n;
    }

    public double obtenerCostoMinutoNacional() {
        return costoMinutoNacional;
    }

    public void establecerMinutosInternacionales(int n) {
        minutosInternacionales = n;
    }

    public int obtenerMinutosInternacionales() {
        return minutosInternacionales;
    }

    public void establecerCostoMinutoInternacional(double n) {
        costoMinutoInternacional = n;
    }

    public double obtenerCostoMinutoInternacional() {
        return costoMinutoInternacional;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = (minutosNacionales * costoMinutoNacional)
                + (minutosInternacionales * costoMinutoInternacional);
    }

    @Override
    public double obtenerPagoMensual() {
        return pagoMensual;
    }

    @Override
    public String toString() {
        String cadena = String.format("\nPlan PostPago Minutos\n"
                + super.toString() + "\nReporte\n"
                + "Minutos nacionales: %d\n"
                + "Costo minuto nacional: %.2f\n"
                + "Minutos internacionales: %d\n"
                + "Costo minutos internacionales: %.2f\n"
                + "Pago mensual: %.2f\n",
                obtenerMinutosNacionales(),
                obtenerCostoMinutoNacional(),
                obtenerMinutosInternacionales(),
                obtenerCostoMinutoInternacional(),
                obtenerPagoMensual());
        return cadena;
    }
}
