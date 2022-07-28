/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete02;

/**
 *
 * @author spart
 */
public class PlanPostPagoMegas extends PlanCelular {

    private double megasGB;
    private double costoGB;
    private double tarifaBase;

    public PlanPostPagoMegas(double nMGB, double cGB, double tB, String nU, String ceU,
            String ciU, String maM, String moM, String nM) {
        super(nU, ceU, ciU, maM, moM, nM);
        megasGB = nMGB;
        costoGB = cGB;
        tarifaBase = tB;
    }

    public void establecerNumeroMegasGB(double n) {
        megasGB = n;
    }

    public double obtenerNumeroMegasGB() {
        return megasGB;
    }

    public void establecerCostoGB(double n) {
        costoGB = n;
    }

    public double obtenerCostoGB() {
        return costoGB;
    }

    public void establecerTarifaBase(double n) {
        tarifaBase = n;
    }

    public double obtenerTarifaBase() {
        return tarifaBase;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = tarifaBase + (megasGB * costoGB);
    }

    @Override
    public double obtenerPagoMensual() {
        return pagoMensual;
    }

    @Override
    public String toString() {
        String cadena = String.format("\nPlan PostPago Megas\n"
                + super.toString() + "\nReporte\n"
                + "Numero de Megas (GB): %d\n"
                + "Costo por cada GB: %.2f\n"
                + "Tarifa base: %.2f\n"
                + "Pago mensual: %.2f\n",
                obtenerNumeroMegasGB(),
                obtenerCostoGB(),
                obtenerTarifaBase(),
                obtenerPagoMensual());
        return cadena;
    }
}
