package controller;

import java.util.Scanner;

public class OrdenaProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] productNames = new String[10];
        double[] productPrices = new double[10];

        System.out.println("Enter the name and price of 10 products:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Product name " + (i + 1) + ": ");
            productNames[i] = scanner.nextLine();
            System.out.print("Product price " + (i + 1) + ": ");
            productPrices[i] = scanner.nextDouble();
            scanner.nextLine(); // Consumir quebra de linha pendente
        }
        

        // Ordenando com Bubble Sort baseado nos preços (ordem decrescente)
        for (int i = 0; i < productPrices.length - 1; i++) {
            for (int j = 0; j < productPrices.length - i - 1; j++) {
                if (productPrices[j] < productPrices[j + 1]) {
                    // Troca preços
                    double tempPrice = productPrices[j];
                    productPrices[j] = productPrices[j + 1];
                    productPrices[j + 1] = tempPrice;

                    // Troca nomes para manter a associação
                    String tempName = productNames[j];
                    productNames[j] = productNames[j + 1];
                    productNames[j + 1] = tempName;
                }
            }
        }

        // Exibindo produtos ordenados do mais caro para o mais barato
        System.out.println("\nProducts sorted from most expensive to cheapest:");
        for (int i = 0; i < 10; i++) {
            System.out.println(productNames[i] + " - $" + String.format("%.2f", productPrices[i]));
        }

        scanner.close();
    }
}
