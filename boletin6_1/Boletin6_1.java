
package boletin6_1;
import java.util.Scanner;
public class Boletin6_1 {


    public static void main(String[] args) {
        // TODO code application logic here
   System.out.println("Escribe un número");
        Scanner sc = new Scanner(System.in);
        Numero a = new Numero(sc.nextFloat());
        System.out.println(a.convertirPositivo()+" e positivo");
    }
    
}