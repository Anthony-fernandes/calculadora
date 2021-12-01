package br.edu.fafic;

public class App {
    public static void main(String[] args) {

        dividir dividir = new dividir();
        subtrair subtrair = new subtrair();
        multiplicar multiplicar = new multiplicar();
        somar somar = new somar();

        dividir.dividir(12, 2);
        subtrair.subtrair(10 , 3);
        multiplicar.multiplicar(9, 3);
        somar.somar(2, 5);

        System.out.println(
                "valor da divisão: " + dividir + "\n"
                + "valor da subtração: " + subtrair + "\n"
                + "valor da multiplicação: " + multiplicar + "\n"
                + "valor da soma: " + somar + "\n"
        );

    }
}
