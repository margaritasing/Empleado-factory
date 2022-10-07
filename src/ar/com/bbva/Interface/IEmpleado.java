package ar.com.bbva.Interface;
import ar.com.bbva.Enum.TipoDeEmpleado;

public interface IEmpleado {

    String getNombre();
    String getApellido();
    int getEdad();
    double getVentasBrutas();
    double getTarifaDeDomision();
    String getNumeroDeSeguroSocial();

    TipoDeEmpleado getCargo();

    void actualizarDatos(TipoDeEmpleado tipoDeEmpleado, String nombre, String apellido, int edad, double ventasbrutas, double tarifadeComision, String numeroDeSeguroSocial);

}
