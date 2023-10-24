package supermercado;

import java.util.Scanner;

public class Supermercado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        UtensiliosDomesticos u = new UtensiliosDomesticos();
        Caixa c = new Caixa();

        int qtdVassouras, qtdPanelas, qtdPratos, kgDeBoi, kgDeFrango, kgDePorco;
        System.out.println("Quantas vassouras deseja comprar? ");
        qtdVassouras = teclado.nextInt();

        System.out.println("Quantas panelas deseja comprar? ");
        qtdPanelas = teclado.nextInt();

        System.out.println("Quantas pratos deseja comprar? ");
        qtdPratos = teclado.nextInt();

        System.out.println("Quantos KG de boi deseja comprar? ");
        kgDeBoi = teclado.nextInt();

        System.out.println("Quantos KG de frango deseja comprar? ");
        kgDeFrango = teclado.nextInt();

        System.out.println("Quantos KG de porco deseja comprar? ");
        kgDePorco = teclado.nextInt();

        c.exibirSaldoDoMercado(qtdVassouras, qtdPanelas, qtdPratos,kgDeBoi,kgDeFrango,kgDePorco);

    }

}
