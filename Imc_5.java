package imc_5;
import java.util.Scanner;

public class Imc_5 {

    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        float peso, altura, imc;
        System.out.println("Digite o seu peso: ");
        peso= leia.nextFloat();
        System.out.println("Digite sua altura: ");
        altura = leia.nextFloat();
        imc = peso/(altura*altura);
        System.out.println("Seu IMC é: " + imc );   
        
        if (imc <20){
            System.out.println("Abaixo do peso!!");
        }
        else if(imc <25){
            System.out.println("Peso normal!!");
        }
        else if(imc <30){
            System.out.println("Sobrepeso!!");
        }
        else if(imc <40){
            System.out.println("Obeso!!");
        }
        else{
            System.out.println("Obeso Mórbido!!");
        }
        
    }
}
