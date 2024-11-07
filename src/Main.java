import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        //1 - Baby Steps
        //Escreva um programa em Java e crie uma variável chamada "Planeta" e atribua-a um valor "Plutão
        //Exiba o valor para o usuário.

        String planeta = "Plutão";
        System.out.println(planeta);

        //2 -  Hello Clarice
        //Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".

        System.out.println("Qual o seu nome?");
        String nomeDoUsuario = leia.nextLine();
        System.out.println("Olá, " + nomeDoUsuario);

        //3 - A Bit of Information
        //Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário. Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".

        System.out.println("Qual o seu nome?");
        String nomeDoUsuario2 = leia.nextLine();
        System.out.println("Perfeito! Agora, informe a sua idade: ");
        int idadeDoUsuario = leia.nextInt();
        System.out.println("O seu nome é " + nomeDoUsuario2 + " e você tem " + idadeDoUsuario + " anos.");

        //4 - A Bit of Geometry
        //Considerando a figura abaixo, escreva um programa para cada forma que calcule e exiba em tela cada uma de suas respectivas áreas. O usuário irá informar os valores de cada variável.

        // Area Retangulo
        System.out.println("Vamos cálcular a área de um retângulo. Primeiro informe a base: ");
        float baseRetangulo = leia.nextFloat();
        System.out.println("Agora informe a altura: ");
        float alturaRetangulo = leia.nextFloat();
        float areaRetangulo = baseRetangulo * alturaRetangulo;
        System.out.println("A área do retângulo é: " + areaRetangulo);


        // Area Quadrado
        System.out.println("Agora vamos calcular a área de um quadrado. Informe o valor do lado");
        float ladoQuadrado = leia.nextFloat();
        float areaQuadrado = ladoQuadrado * ladoQuadrado;

        // Area Losango
        System.out.println("Agora vamos calcular a área de um lonsago. Primeiro, informe o valor da diagonal maior: ");
        float diagonalMaiorLosango = leia.nextFloat();



    }
}