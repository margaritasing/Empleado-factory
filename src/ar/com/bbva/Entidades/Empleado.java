package ar.com.bbva.Entidades;


import ar.com.bbva.Enum.TipoDeEmpleado;
import ar.com.bbva.Interface.IEmpleado;

public abstract class Empleado implements IEmpleado {

    private double ventasBrutas;
    private double tarifaComision;
    private String numeroDeSeguroSocial;
    
    private TipoDeEmpleado cargo;

    private String nombre;
    private String apellido;
    private int edad;



    @Override
    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifaComision) {
        this.tarifaComision = tarifaComision;
    }

    @Override
    public String getNumeroDeSeguroSocial() {
        return numeroDeSeguroSocial;
    }

    public void setNumeroDeSeguroSocial(String numeroDeSeguroSocial) {
        this.numeroDeSeguroSocial = numeroDeSeguroSocial;
    }

    @Override
    public TipoDeEmpleado getCargo() {
        return cargo;
    }

    public void setCargo(TipoDeEmpleado cargo) {
        this.cargo = cargo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    void presentarse(){

    }

    boolean esMayorDeEdad(){
        return false;
    }




    double ingresos(){
        return 0;
    }

    @Override
    public String toString() {
        return "Empleado = " +
                "ventasBrutas=" + ventasBrutas +
                ", tarifaComision=" + tarifaComision +
                ", numeroDeSeguroSocial='" + numeroDeSeguroSocial + '\'' +
                '}';
    }
}
