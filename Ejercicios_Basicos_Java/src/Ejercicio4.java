import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dime un numero");
        int numero1=scanner.nextInt();
        System.out.println("Dime otro numero");
        int numero2=scanner.nextInt();
        System.out.println("Dime otro numero");
        int numero3 =scanner.nextInt();
        if (numero1> numero2 & numero1>numero3) {
            System.out.println(numero1);
        }else if (numero2> numero1 & numero2>numero3) {
            System.out.println(numero2);
        }else if (numero3> numero1 & numero3>numero2) {
            System.out.println(numero3);
        }else{
            System.out.println("Hay numeros iguales");
        }
    }
}
