import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dime un numero");
        int numero1=scanner.nextInt();
        System.out.println("Dime otro numero");
        int numero2=scanner.nextInt();
        System.out.println("El resultado es "+numero1*numero2);
    }
}
