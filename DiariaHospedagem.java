package diariahospedagem;
import java.util.Scanner;

public class DiariaHospedagem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo;
        int quantidadeDiarias;
        double valorTotal = 0;

        System.out.println("1- Simples");
        System.out.println("2- Duplo");
        System.out.println("3- Triplo");
        codigo = scanner.nextInt();

        System.out.println("Informe a quantidade de diarias desejada:");
        quantidadeDiarias = scanner.nextInt();

        if (codigo == 1) {
            valorTotal = quantidadeDiarias * 255.50;
        } else if (codigo == 2) {
            valorTotal = quantidadeDiarias * 305.50;
        } else if (codigo == 3) {
            valorTotal = quantidadeDiarias * 360.50;
        } else {
            System.out.println("Código inválido!");
          return;
        }

        System.out.printf("O valor total a pagar é: R$ %.2f%n", valorTotal);
        scanner.close();
      
 }
}