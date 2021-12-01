package br.edu.fafic;

public class App {
    public static void main(String[] args) {

        dividir dividir = new dividir();
        subtrair subtrair = new subtrair();
        multiplicar multiplicar = new multiplicar();
        somar somar = new somar();

        float divisao = dividir.dividir(30, 2);
        float subtrai = subtrair.subtrair(10 , 3);
        float multiplica = multiplicar.multiplicar(9, 3);
        float soma = somar.somar(2, 5);

        System.out.println(
                "valor da divisão: " + divisao + "\n"
                + "valor da subtração: " + subtrai + "\n"
                + "valor da multiplicação: " + multiplica + "\n"
                + "valor da soma: " + soma + "\n"
        );

    }
}
