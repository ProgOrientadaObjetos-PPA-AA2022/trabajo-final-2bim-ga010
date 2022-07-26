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

    private double minutos;
    private double costoMinuto;
    private double numeroMegasGB;
    private double costoGB;
    private double porcentajeDescuento;

    public PlanPostPagoMinutosMegasEconomico(int m, double cM, int nMGB, double cGB, double pD,
            String nom, String ced, String ciu, String mar, String mod, String numeroCe) {
        super(nom, ced, ciu, mar, mod, numeroCe);
        minutos = m;
        costoMinuto = cM;
        numeroMegasGB = nMGB;
        costoGB = cGB;
        porcentajeDescuento = pD;
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

    public void establecerPorcentajeDescuento(double n) {
        porcentajeDescuento = n / 100;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = 0;
    }

    @Override
    public double obtenerPagoMensual() {
        return pagoMensual;
    }

    public double obtenerMinutos() {
        return minutos;
    }

    public double obtenerCostoMinuto() {
        return costoMinuto;
    }

    public double obtenerCostoGB() {
        return costoGB;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public double obtenerNumeroMegasGB() {
        return numeroMegasGB;
    }

    @Override
    public String toString() {
        String cadena = String.format("Plan PostPago MinutosMegas Economico\n"
                + super.toString() + "\nReporte\n"
                + "Minutos: %s\n"
                + "Costo minuto : %.2f\n"
                + "Numero de Megas (GB): %s\n"
                + "Costo del GB: %.2f\n"
                + "Porcentage Descuento: %.2f\n"
                + "Pago mensual: %.2f\n",
                obtenerMinutos(), obtenerCostoMinuto(),
                obtenerNumeroMegasGB(),
                obtenerCostoGB(), obtenerPorcentajeDescuento(),
                obtenerPagoMensual());
        return cadena;
    }
}
