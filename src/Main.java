import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Miguel Angel Rojas Rodriguez
         Estructura de datos
         Ejercicio HashMap
        */
        Scanner input = new Scanner(System.in);
        HashMap<String, Empleado> empleados = new HashMap<>();
        Empleado empleado = null;
        String codEmp=null;
        cicloW:
        while (true){
            System.out.println("(1)Quieres agregar un empleado\n(2)Quieres ver la lista de empleados\n(3)Quieres eliminar un empleado\n(4)Quieres eliminar todos los empleados\n(5)Quieres encontrar un empleado\n(6)Salir");
            switch (input.nextInt()){
                case 1:
                    empleado = new Empleado();
                    System.out.println("A que area pertenece el empleado");
                    empleado.setArea(input.next());
                    System.out.println("Cual es el documento de identidad del empleado");
                    empleado.setDni(input.next());
                    System.out.println("Ingresa el nombre del empleado");
                    empleado.setNombre(input.next());
                    System.out.println("Ingre el sueldo del empleado");
                    empleado.setSueldo(input.nextInt());
                    System.out.println("Ingresa el codigo de empleado");
                    empleados.put(input.next(),empleado);
                    break;
                case 2:
                    if (empleados.isEmpty()) {
                        System.out.println("Lista de empleados vacia");
                        continue cicloW;
                    }
                    for(String clave : empleados.keySet()){
                        System.out.println("Codigo Empleado: "+clave+"| info del empleado: ");
                        empleados.get(clave).mostrarInfo();
                    }
                    break;
                case 3:
                    System.out.println("Ingresa el codigo de empleado del que desea eliminar: ");
                    codEmp = input.next();
                    if (empleados.containsKey(codEmp)){
                        empleados.remove(codEmp);
                        System.out.println("Se elimino del sistema correctamente");
                    }else System.out.println("Codigo de usuario no existe");
                    break;
                case 4:
                    empleados.clear();
                    System.out.println("Se eliminaron todos los usuarios correctamente");
                    break;
                case 5:
                    System.out.println("Ingresa el codigo de empleado del que desea ver: ");
                    codEmp = input.next();
                    if (empleados.containsKey(codEmp)) empleados.get(codEmp).mostrarInfo();
                    else System.out.println("Codigo de usuario no existe");
                    break;
                case 6:
                    System.out.println("Adios...");
                    break cicloW;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        }
    }
}