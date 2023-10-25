package supermercado;

import java.util.Scanner;

public class Supermercado {

    public static void main(String[] args) {
        Scanner tecladoInt = new Scanner(System.in);
        Scanner tecladoString = new Scanner(System.in);
        UtensiliosDomesticos u = new UtensiliosDomesticos();
        Mercado mercado1 = new Mercado();

        int qtdVassouras, qtdPanelas, qtdPratos, kgDeBoi, kgDeFrango, kgDePorco;
        System.out.println("Qual o nome do mercado?");
        mercado1.setNome(tecladoString.next());

        System.out.println("Mercado " + mercado1.getNome());
        System.out.println("--------------------------");
        System.out.println("Quantas vassouras deseja comprar? ");
        qtdVassouras = tecladoInt.nextInt();

        System.out.println("Quantas panelas deseja comprar? ");
        qtdPanelas = tecladoInt.nextInt();

        System.out.println("Quantas pratos deseja comprar? ");
        qtdPratos = tecladoInt.nextInt();

        System.out.println("Quantos KG de boi deseja comprar? ");
        kgDeBoi = tecladoInt.nextInt();

        System.out.println("Quantos KG de frango deseja comprar? ");
        kgDeFrango = tecladoInt.nextInt();

        System.out.println("Quantos KG de porco deseja comprar? ");
        kgDePorco = tecladoInt.nextInt();

        mercado1.exibirSaldoDoMercado(qtdVassouras, qtdPanelas, qtdPratos, kgDeBoi, kgDeFrango, kgDePorco);

    }

}
