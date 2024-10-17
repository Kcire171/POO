package bar.java;

import java.util.Scanner;

public class Bar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sexo (M ou F): ");
        char sexo = sc.next().charAt(0);

        System.out.print("Quantidade de cervejas: ");
        int qtdeCervejas = sc.nextInt();

        System.out.print("Quantidade de refrigerantes: ");
        int qtdeRefrigerantes = sc.nextInt();

        System.out.print("Quantidade de espetinhos: ");
        int qtdeEspetinhos = sc.nextInt();

        double precoIngresso = (sexo == 'M') ? 10.00 : 8.00;
        double consumoCervejas = qtdeCervejas * 5.00;
        double consumoRefrigerantes = qtdeRefrigerantes * 3.00;
        double consumoEspetinhos = qtdeEspetinhos * 7.00;
        
        double consumoTotal = consumoCervejas + consumoRefrigerantes + consumoEspetinhos;

        double couvert = (consumoTotal > 30) ? 0 : 4;

        double valorTotal = consumoTotal + couvert + precoIngresso;

        System.out.println("RELATÓRIO:");
        System.out.printf("Consumo = R$ %.2f\n", consumoTotal);
        if (couvert == 0) {
            System.out.println("Isento de Couvert");
        } else {
            System.out.printf("Couvert = R$ %.2f\n", couvert);
        }
        System.out.printf("Ingresso = R$ %.2f\n", precoIngresso);
        System.out.printf("Valor a pagar = R$ %.2f\n", valorTotal);

        sc.close();
    }
}
