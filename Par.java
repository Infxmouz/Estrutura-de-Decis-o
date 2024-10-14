package par;
import java.util.Scanner;

public class Par {

    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        num = teclado.nextInt();
        if(num%2==0){
        System.out.println("O número: " + num + "é par!");
        }
        else{
            System.out.println("Este numero é impar!!");
        }
        
    }
    
}
