package ar.com.bbva.EmpleadoFactory;

import ar.com.bbva.Entidades.SubEntidades.EmpleadoAsalariado;
import ar.com.bbva.Entidades.SubEntidades.EmpleadoBaseMasComision;
import ar.com.bbva.Entidades.SubEntidades.EmpleadoPorComision;
import ar.com.bbva.Entidades.SubEntidades.EmpleadoPorHora;
import ar.com.bbva.Enum.TipoDeEmpleado;
import ar.com.bbva.Interface.IEmpleado;

public abstract class EmpleadoFactory {

    public static IEmpleado getEmpleado(TipoDeEmpleado tipoDeEmpleado, String nombre, String apellido, int edad, double ventasbrutas, double tarifadeComision, String numeroDeSeguroSocial){
        IEmpleado empleado = switch (tipoDeEmpleado){
            case EMPLEADOPORHORA -> new EmpleadoPorHora();
            case EMPLEADOPORCOMISION -> new EmpleadoPorComision();
            case EMPLEADOBASEMASCOMISION -> new EmpleadoBaseMasComision();
            case EMPLEADOASALARIADO -> new EmpleadoAsalariado();
        };
        empleado.actualizarDatos(tipoDeEmpleado, nombre,apellido,edad, ventasbrutas, tarifadeComision,numeroDeSeguroSocial);
        return empleado;
    }
}
