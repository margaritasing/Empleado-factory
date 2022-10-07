import ar.com.bbva.EmpleadoFactory.EmpleadoFactory;
import ar.com.bbva.Enum.TipoDeEmpleado;
import ar.com.bbva.Interface.IEmpleado;

public class Main {
    public static void main(String[] args) {

        TipoDeEmpleado tipoDeEmpleado = TipoDeEmpleado.EMPLEADOASALARIADO;
        String nombre ="Libia";
        String apellido = "Freites";
        int  edad = 44;
        double  ventasbrutas = 142.25;
        double tarifadeComision = 100.2;
        String numeroDeSeguroSocial = "heyfkyi";

        IEmpleado empleado = EmpleadoFactory.getEmpleado(tipoDeEmpleado, nombre, apellido, edad, ventasbrutas, tarifadeComision, numeroDeSeguroSocial);
        System.out.println("Soy" + empleado.getNombre() + empleado.getApellido());
        System.out.println(empleado);


    }
}