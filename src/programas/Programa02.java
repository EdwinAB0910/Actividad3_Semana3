package programas;
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args) {
    //declarar variables
    String resultado;
    double n1;
    Scanner lectura=new Scanner(System.in);
    //ingreso de datos
    System.out.print("Ingrese un número: ");
    n1=lectura.nextDouble();
    //proceso de datos
    if(n1>=15) {
    resultado="Correcto";
    }else{
    resultado="Incorrecto";
    }
    //salida de datos
    System.out.println(resultado);
    }
}
