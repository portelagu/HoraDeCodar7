import java.awt.*;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;


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
        float valorTrapezio = ((baseMaiorTrapezio + baseMenorTrapezio) * alturaTrapezio) / 2;
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
        if (numeroInformado > 0) {
            System.out.println("O número que você informou é " + numeroInformado + ", certo? Este é um número positivo.");
        } else if (numeroInformado == 0) {
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

        if (primeiroValor > segundoValor && primeiroValor > terceiroValor) {
            System.out.println("O maior número que você digitou foi: " + primeiroValor);
        } else if (segundoValor > primeiroValor && segundoValor > terceiroValor) {
            System.out.println("O maior número que você digitou foi: " + segundoValor);
        } else if (terceiroValor > primeiroValor && terceiroValor > segundoValor) {
            System.out.println("O maior número que você digitou foi: " + terceiroValor);
        }


        //6.1 - Faça um programa para ler 4 valores (considere que não serão informados valores iguais) e escrever o maior deles.

        System.out.println("Agora vamos escrever o maior valor entre 4 números informados");

        ArrayList<Integer> listaDeValores = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            System.out.println("Por favor informe um número: ");
            int valorNumero = leia.nextInt();
            listaDeValores.add(valorNumero);
        }

        int numeroMaior = listaDeValores.get(0);
        for (int i = 0; i < listaDeValores.size(); i++) {
            if (listaDeValores.get(i) > numeroMaior) {
                numeroMaior = listaDeValores.get(i);
            }
        }
        System.out.println("O maior número informado foi: " + numeroMaior);

        // 7 - Qual o quê?
        //Faça um programa que leia  3 valores (considere que não serão informados valores iguais) e escreva a soma dos 2 maiores.

        System.out.println("Agora, informe três números para ser feito a soma dos dois maiores. Informe o primeiro número: ");
        int primeiroValorSoma = leia.nextInt();
        System.out.println("Informe o segundo número: ");
        int segundoValorSoma = leia.nextInt();
        System.out.println("Informe o terceiro número: ");
        int terceiroValorSoma = leia.nextInt();

        int somaValores = 0;

        if(primeiroValorSoma < segundoValorSoma && primeiroValorSoma < terceiroValorSoma){
            somaValores = segundoValorSoma + terceiroValorSoma;
            System.out.println("O segundo e terceiro valor foram os maiores digitados, a soma é: " + somaValores);
        } else if(segundoValor < primeiroValorSoma && segundoValorSoma < terceiroValorSoma){
            somaValores = primeiroValorSoma + terceiroValorSoma;
            System.out.println("O primeiro e terceiro valor foram os maiores digitados, a soma é: " + somaValores);
        } else if(terceiroValorSoma < primeiroValorSoma && terceiroValorSoma < segundoValorSoma){
            somaValores = primeiroValorSoma + segundoValorSoma;
            System.out.println("O primeiro e segundo valor foram os maiores digitados, a soma é: " + somaValores);
        }

        //7.1 - 5 vezes?
        //Faça um programa que leia 5  valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.

        System.out.println("Digite o primeiro valor");
        int primeiroValorSomaDupla = leia.nextInt();

        System.out.println("Digite o segundo valor");
        int segundoValorSomaDupla = leia.nextInt();

        System.out.println("Digite o terceiro valor");
        int terceiroValorSomaDupla = leia.nextInt();

        System.out.println("Digite o quarto valor");
        int quartoValorSomaDupla = leia.nextInt();

        System.out.println("Digite o quinto valor");
        int quintoValorSomaDupla = leia.nextInt();

        int primeiroValorMaior = primeiroValorSomaDupla;
        int segundoValorMaior = segundoValorSomaDupla;

        if (segundoValorSomaDupla > primeiroValorMaior){
            primeiroValorMaior = segundoValorSomaDupla;
            segundoValorMaior = primeiroValorSomaDupla;
        }

        if (terceiroValorSomaDupla > primeiroValorMaior){
            segundoValorMaior = primeiroValorMaior;
            primeiroValorMaior = terceiroValorSomaDupla;
        } else if (terceiroValorSomaDupla > segundoValorMaior){
            segundoValorMaior = terceiroValorSomaDupla;
        }

        if(quartoValorSomaDupla > primeiroValorMaior){
            segundoValorMaior = primeiroValorMaior;
            primeiroValorMaior = quartoValorSomaDupla;
        } else if (quartoValorSomaDupla > segundoValorMaior){
            segundoValorMaior = quartoValorSomaDupla;
        }

        if (quintoValorSomaDupla > primeiroValorMaior){
            segundoValorMaior = primeiroValorMaior;
            primeiroValorMaior = quintoValorSomaDupla;
        } else if (quintoValorSomaDupla > segundoValorMaior){
            segundoValorMaior = quintoValorSomaDupla;
        }

        int somaNumeros = primeiroValorMaior + segundoValorMaior;
        System.out.println("A soma dos dois maiores numeros é" + somaNumeros);

        //8 - Enquanto isso
        //Faça um programa para ler 2 valores informados pelo usuário e se o segundo valor informado for neutro, deve ser lido um novo valor - ou seja, para o segundo valor não pode ser aceito o valor zero nem um valor negativo. O programa deve imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido.

        System.out.println("Olá, por favor informe o primeiro número: ");
        int primeiroValorInformado = leia.nextInt();
        int segundoValorInformado = 0;

        while(segundoValorInformado < 1){
            System.out.println("Agora, informe o segundo número");
            segundoValorInformado = leia.nextInt();
        }

        int divisaoValores = primeiroValorInformado / segundoValorInformado;
        System.out.println("A divisão do primeiro número pelo segundo é: " + divisaoValores);

        //9 -  Cansar de Digitar
        //Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba os números informados e escreva a média aritmética desses valores lidos.

        ArrayList<Integer> listaValoresUsuario = new ArrayList<>();

        int soma = 0;
        for( int i = 0; i < 10; i++){
            System.out.println("Informe um valor");
            int valorInformado = leia.nextInt();
            listaValoresUsuario.add(valorInformado);
            soma+= valorInformado;
        }

        System.out.println("Os valores informados são:");
        for (int i = 0; i < listaValoresUsuario.size(); i++) {
            System.out.println(listaValoresUsuario.get(i));
        }

        int mediaAritmetica = soma / listaValoresUsuario.size();
        System.out.println("A média aritmética é: " + mediaAritmetica);

        // 10 - Parabéns
        // Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e escrever a média do semestre e a seguinte mensagem: PARABÉNS! Você foi aprovado! somente se o aluno foi aprovado (considere 6.0 a média mínima para aprovação e 4 notas informadas).

        double somaNotas = 0;
        for(int i = 0; i < 4; i++){
            System.out.printf("Informe a nota da avaliação");
            double nota = leia.nextDouble();
            somaNotas+= nota;
        }

        double mediaNotas = somaNotas / 4;
        if (mediaNotas >= 6){
            System.out.println("O aluno está aprovado.");
        } else {
            System.out.println("O aluno está reprovado.");
        }

        //11 - BOOOOMMM
        //Crie uma bomba relógio (usando somente código - para deixar claro!) cuja contagem regressiva vá de 30 a 0. Escreva a contagem em tela e no final da repetição escreva "EXPLOSÃO".

        for(int i = 30; i > 0; i--){
            System.out.println(i);
        }

        System.out.println("Explosão!!!!!!!!!");

        //12 - 10, 9, 8, 7, 6, 5, 4, 3, 2, 1...
        //Escreva um algoritmo para imprimir os números de 1 (inclusive) a 10 (inclusive) em ordem decrescente.

        for(int i = 10; i > 0; i--){
            System.out.println(i);
        }

        //13 - De quanto até quanto?
        //Faça um algoritmo que calcule e escreva a média aritmética dos dois números inteiros informados pelo usuário e todos os números inteiros entre eles. Considere que o primeiro sempre será menor que o segundo.

        System.out.println("Escreva o primeiro numero");
        int primeiroNumeroUsuario = leia.nextInt();

        System.out.println("Escreva o segundo numero");
        int segundoNumeroUsuario = leia.nextInt();

        if (primeiroNumeroUsuario > segundoNumeroUsuario) {
            while(primeiroNumeroUsuario > segundoNumeroUsuario){
                System.out.println("O segundo número deve ser maior que o primeiro, digite novamente o segundo valor.");
                segundoNumeroUsuario = leia.nextInt();
            }
        }

        int mediaNumeroUsuario = (primeiroNumeroUsuario + segundoNumeroUsuario) / 2;
        System.out.println("A média dos números é: " + mediaNumeroUsuario);

        // 14 - Passou no Teste?
        // Escreva um programa para ler 6 notas de um aluno, calcular e imprimir a média final. Considere que a nota de aprovação é 6,5. Logo após escrever a mensagem "Calcular a média de outro aluno Sim/Não?" e solicitar um resposta. Se a resposta for "S", o programa deve ser executado novamente, caso contrário deve ser encerrado exibindo a quantidade de alunos aprovados.

        boolean sairDoLoop = false;
        ArrayList<Integer> listaAlunosAprovados = new ArrayList<>();

        while (sairDoLoop == false){
            double somaMedia = 0;
            for(int i = 0; i < 6; i++){
                System.out.println("Digite a nota do aluno");
                double valorNota = leia.nextInt();
                somaMedia += valorNota;
            }
            double mediaFinal = somaMedia / 6;
            if (mediaFinal > 6.5){
                System.out.println("O aluno está aprovado.");
                listaAlunosAprovados.add((int) mediaFinal);
            } else {
                System.out.println("O aluno está reprovado.");
            }

            System.out.println("Deseja calcular a média de outro aluno? S/N");
            String escolhaDoUsuario = leia.nextLine();

            if (escolhaDoUsuario == "N"){
                sairDoLoop = true;
            }
        }

        System.out.println("A quantidade de alunos aprovados é: " + listaAlunosAprovados.size());

        // 15 - Uma Brincadeira Sobre Alturas
        //Anacleto tem 1,50 metro e cresce 2 centímetros por ano, enquanto Felisberto tem 1,1O metro e cresce 3 centímetros por ano. Construa um algoritmo que calcule e imprima quantos anos serão necessários para que Felisberto seja maior que Anacleto.

        double alturaAnacleto = 1.50;
        double alturaFelisberto = 1.10;
        int anosNecessarios = 0;

        while (alturaAnacleto > alturaFelisberto){
            alturaAnacleto+= 0.02;
            alturaFelisberto+= 0.03;
            anosNecessarios++;
        }

        System.out.println("Será necessário " + anosNecessarios + " anos para Felisberto ser maior que Anacleto");
    }
}
