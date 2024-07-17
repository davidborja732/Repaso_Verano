import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el primer numero: ");
        int num1= scanner.nextInt();
        System.out.println("Dime el segundo numero: ");
        int num2= scanner.nextInt();
        int producto=0;
        for (int i=0;i<num2;i++){
            producto+=num1;
        }
        System.out.println("El producto de "+num1+" y "+num2+" es "+producto);
    }
}
