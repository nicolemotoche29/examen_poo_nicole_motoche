import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class cajero {
    private int id;
    private String nombre;
    private String apellido;
    private int retiro;
    private int deposito;

    public cajero(int id, String nombre, String apellido, int retiro, int deposito) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.retiro = retiro;
        this.deposito = deposito;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getRetiro() {
        return retiro;
    }

    public void setRetiro(int retiro) {
        this.retiro = retiro;
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }

    public static void guardar() {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el numero de clientes deseados: ");
        int n = entrada.nextInt();
        cajero clie [] = new cajero[n];
        int id=0 ;
        String nombre = "";
        String apellido = "";
        int retiro=0;
        int deposito=0;

        for (int i = 0; i < clie.length; i++) {
            System.out.print("Ingrese cedula de identidad: ");
            id = entrada.nextInt();
            System.out.print("Ingrese el nombre: ");
            nombre = entrada.next();
            System.out.print("Ingrese la apellido: ");
            apellido = entrada.next();
            System.out.print("Ingrese la cantida de retiro: ");
            retiro = entrada.nextInt();
            System.out.print("Ingrese la cantidad del deposito: ");
            deposito = entrada.nextInt();


            clie[i] = new cajero (id,nombre, apellido, retiro, deposito);
        }
        try {
            PrintWriter linea = new PrintWriter("clientes.txt");

            for (int i = 0; i < clie.length; i++) {
                linea.println((clie[i].getId() + "   " + clie[i].getNombre() + "   " + clie[i].getApellido() + "   "+clie[i].getRetiro() + "  "+clie[i].getDeposito() + "   "));
                linea.print("\n");
            }
            linea.close();

        } catch (Exception e) {
            e.printStackTrace();  //decir los errores
        }
    }


    public static void leer(){
        FileReader archivo;
        BufferedReader lector;
        try {
            archivo = new FileReader("clientes.txt");
            if (archivo.ready()) {
                lector = new BufferedReader(archivo);
                String cadena;
                while ((cadena = lector.readLine()) != null) {
                    System.out.println(cadena);
                }
            } else {
                System.out.println("El archivo no esta listo para leer");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

