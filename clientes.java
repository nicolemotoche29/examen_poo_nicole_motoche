import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class clientes {


        public static void main(String[] args) {
            int opci;
            do {
                System.out.println("MOTOCHE NICOLE");
                System.out.println(" ");
                System.out.println("----------------------------------------------------------------");
                System.out.println("                CAJERO AUTOMATICO ");
                System.out.println("----------------------------------------------------------------");
                System.out.println("1) Registrar y guardar clientes");
                System.out.println("2) Leer clientes en archivo");
                System.out.println("0) Salir");
                Scanner opcion = new Scanner(System.in);
                System.out.print("Ingrese la accion que desea: ");
                opci = opcion.nextInt();
                switch (opci) {
                    case 1: {


                        cajero.guardar();
                        break;
                    }
                    case 2: {
                        cajero.leer();
                        break;
                    }
                    case 0: {

                        System.out.println("GRACIAS");
                        break;
                    }
                }
            }while(opci != 0);
        }
    }
