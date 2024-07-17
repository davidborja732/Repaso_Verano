import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        List<Integer> lista=new ArrayList<>();
        int cuenta=0;
        Scanner scanner=new Scanner(System.in);
        while (cuenta<31){
            System.out.println("Dime un numero: ");
            int numero= scanner.nextInt();
            lista.add(numero);
            cuenta++;
        }
        //la funcion stream hace que podamos interactuar con cada elemento de la lista
        //mientras que en reduce 0 es el valor iniciar Integer cada elemento de la lista y ::sum
        //nos permite elegir que operacion queremos hacer
        int suma=lista.stream().reduce(0,Integer::sum);
        System.out.println("El resultado es "+suma);
    }
}
