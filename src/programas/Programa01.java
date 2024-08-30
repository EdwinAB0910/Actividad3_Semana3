package programas;
import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args) {
    //declarar variables
    String condicion;
    double talla;
    condicion="";
    Scanner lectura=new Scanner(System.in);
    //ingreso de datos
    System.out.print("Ingresar la talla del estudiante en metros:");
    talla=lectura.nextDouble();
    //proceso de datos
    if(talla>1.7) {
        condicion="cumple con el requisito";
    }
    if(talla<1.7) {
        condicion="no cumple con el requisito";
    }
    //salida de datos
    System.out.println("El estudiante " +condicion );
    }
}
