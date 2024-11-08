import java.awt.*;
import java.util.Scanner;
import java.lang.Math;

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
        System.out.println("A área do quadrado é: " + areaQuadrado);

        // Area Losango
        System.out.println("Agora vamos calcular a área de um lonsago. Primeiro, informe o valor da diagonal maior: ");
        float diagonalMaiorLosango = leia.nextFloat();
        System.out.println("Agora, informe o valor da diagonal menor: ");
        float diagonalMenorLosango = leia.nextFloat();
        float areaLosango = (diagonalMaiorLosango * diagonalMenorLosango) / 2;
        System.out.println("A área do losango é: " + areaLosango);

        //Area Trapézio
        System.out.println("Agora vamos calcular a área de um trapézio. Primeiro, informe o valor da base maior: ");
        float baseMaiorTrapezio = leia.nextFloat();
        System.out.println("Perfeito! Agora, informe o valor da base menor");
        float baseMenorTrapezio = leia.nextFloat();
        System.out.println("Agora, digite o valor da altura: ");
        float alturaTrapezio = leia.nextFloat();
        float valorTrapezio = ((baseMaiorTrapezio + baseMenorTrapezio) * alturaTrapezio ) / 2;
        System.out.println("A área do trapézio é: " + valorTrapezio);

        //Area Paralelogramo
        System.out.println("Vamos calcular a área de um paralelogramo. Informe o valor da base:");
        float baseParalelogramo = leia.nextFloat();
        System.out.println("Agora, informe o valor da altura: ");
        float alturaParalelogramo = leia.nextFloat();
        float areaParalelogramo = baseParalelogramo * alturaParalelogramo;
        System.out.println("Á area do paralelogramo é: " + areaParalelogramo);

        //Area Triangulo
        System.out.println("Agora, vamos calcular a área de um triângulo. Informe o valor base");
        float baseTriangulo = leia.nextFloat();
        System.out.println("Informe o valor da altura do triângulo");
        float alturaTriangulo = leia.nextFloat();
        float areaTriangulo = baseTriangulo * alturaTriangulo;
        System.out.println("A área do triângulo é: " + areaTriangulo);

        // Area Ciruclo
        System.out.println("Vamos cálcular a área de um circulo. Informe o raio");
        double raio = leia.nextDouble();
        double areaCirculo = Math.PI * (raio * 2);
        System.out.println("A área do circulo é: " + areaCirculo);

        // 5 - 1, 2 e 3
        //Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou neutro.

        System.out.println("Por favor, informe um número: ");
        int numeroInformado = leia.nextInt();
        if (numeroInformado > 0){
            System.out.println("O número que você informou é " + numeroInformado + ", certo? Este é um número positivo.");
        } else if (NumeroInformado == 0) {
            System.out.println("O número que você informou é " + numeroInformado + ", certo? Este é um número neutro.");
        } else {
            System.out.println("O número que você informou é " + numeroInformado + ", certo? Este é um número negativo.");
        }


        //6 - Qual o maior?
        //Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

        System.out.println("Por favor, Digite um número: ");
        int primeiroValor = leia.nextInt();
        System.out.println("Agora, digite o segundo número: ");
        int segundoValor = leia.nextInt();
        System.out.println("Agora, digite o terceiro número: ");
        int terceiroValor = leia.nextInt();

        if (primeiroValor > segundoValor && primeiroValor > terceiroValor){
            System.out.println("O maior número que você digitou foi: " + primeiroValor);
        } else if (segundoValor > primeiroValor && segundoValor > terceiroValor){
            System.out.println("O maior número que você digitou foi: " + segundoValor);
        } else if (terceiroValor > primeiroValor && terceiroValor > segundoValor){
            System.out.println("O maior número que você digitou foi: " + terceiroValor);
        }



    }
}