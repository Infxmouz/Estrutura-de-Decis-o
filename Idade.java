package idade;
import java.util.Scanner;
public class Idade {

    public static void main(String[] args) {
        int idade;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = leia.nextInt();
        if(idade >= 18){
            System.out.println("Maior de idade!! ");
        }
        else {
                System.out.println("Menor de idade!! ");
                }
    }
    
}
