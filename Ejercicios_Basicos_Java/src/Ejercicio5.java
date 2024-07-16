import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dime un numero");
        int numero1=scanner.nextInt();
        for (int i=1;i<11;i++){
            System.out.println(numero1+" * "+i+" = "+numero1*i);
        }
    }
}
