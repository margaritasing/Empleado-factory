package ar.com.bbva.Entidades.SubEntidades;

import ar.com.bbva.Entidades.Empleado;
import ar.com.bbva.Enum.TipoDeEmpleado;
import ar.com.bbva.Interface.IEmpleado;

public class EmpleadoBaseMasComision extends Empleado implements IEmpleado {


    @Override
    public String getNombre() {
        return null;
    }

    @Override
    public String getApellido() {
        return null;
    }

    @Override
    public int getEdad() {
        return 0;
    }

    @Override
    public double getVentasBrutas() {
        return 0;
    }

    @Override
    public double getTarifaDeDomision() {
        return 0;
    }

    @Override
    public String getNumeroDeSeguroSocial() {
        return null;
    }

    @Override
    public TipoDeEmpleado getCargo() {
        return null;
    }

    @Override
    public void actualizarDatos(TipoDeEmpleado tipoDeEmpleado, String nombre, String apellido, int edad, double ventasbrutas, double tarifadeComision, String numeroDeSeguroSocial) {

    }
}
