package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Livro
        System.out.println("Escreva o nome do livro: ");
        String livroNome = scanner.nextLine();

        System.out.println("Escreva o preço do livro: ");
        double livroPreco = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Escreva o autor do livro: ");
        String livroAutor = scanner.nextLine();

        Livro livro = new Livro(livroNome, livroPreco, livroAutor);


        //CD
        System.out.println("Escreva o nome do CD: ");
        String cdNome = scanner.nextLine();

        System.out.println("Escreva o preço do CD: ");
        double cdPreco = scanner.nextDouble();
        scanner.nextLine(); // limpar buffer

        System.out.println("Escreva o número de faixas do CD ");
        int cdFaixas = scanner.nextInt();

        CD cd = new CD(cdNome, cdPreco, cdFaixas);

        cd.exibeInformacoes();

    }
}