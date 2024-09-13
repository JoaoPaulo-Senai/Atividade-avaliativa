package aplicacao;

import entidade.Produto;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o nome do produto: ");
        String nome = scanner.next();
        System.out.println("Qual o preço do produto: ");
        double preco = scanner.nextDouble();
        System.out.println("Qual a quantidade do produto: ");
        int quantidade = scanner.nextInt();
        while (quantidade<0){
            System.out.println("Quantidade inválida. Informe um número positivo: ");
            quantidade = scanner.nextInt();
        }
        System.out.println("Qual o código do produto: ");
        int codigo = scanner.nextInt();

        Produto produto1 = new Produto (nome, preco, quantidade, codigo);
        produto1.setAtivo(false);


        String info1 = produto1.toString();
        System.out.println(produto1);
        System.out.println();
    }
}
