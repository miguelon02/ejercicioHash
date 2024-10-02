public class Empleado {
    private String dni;
    private String nombre;
    private int sueldo;
    private String area;

    public Empleado() {

    }
    public Empleado(String dni, String nombre, int sueldo, String area) {
        this.dni = dni;
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.area = area;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                ", area='" + area + '\'' +
                '}';
    }
    public void mostrarInfo() {
        System.out.println("Nombre: "+nombre+", Area: "+area+", dni: "+dni+" y sueldo: $"+sueldo+"\n");
    }
}
