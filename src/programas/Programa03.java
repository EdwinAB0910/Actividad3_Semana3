package programas;
import java.util.Scanner;
public class Programa03 {
    public static void main(String[] args) {
    //declarar variables
    String mensaje;
    double p1;
    Scanner lectura=new Scanner(System.in);
    //ingreso de datos
    System.out.print("Ingresar el puntaje del estudiante: ");
    p1=lectura.nextDouble();
    //proceso de datos
    if(p1>15){
    mensaje=("Excelente");
    }else if(p1>10){
    mensaje=("Bien");
    }else if(p1>5){
    mensaje=("Ya falta poco");
    }else{
    mensaje=("Esfuérzate más");
    }
    System.out.println(mensaje);
    }
}
