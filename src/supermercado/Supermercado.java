package supermercado;

import java.util.ArrayList;
import java.util.Scanner;

public class Supermercado {

    public static void main(String[] args) {
        ArrayList<Mercado> supermercados = new ArrayList();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos mercados deseja registrar?");
        int n = teclado.nextInt();

        //esse loop recebe a variavel n como numero de vezes que vai rodar
        //coloca as respostas dentro das variaveis
        //instancia um objeto recebendo essas variaveis como parametros
        for (int i = 0; i < n; i++) {
            System.out.println("Qual o nome do mercado " + (i + 1) + "?");
            String nome = teclado.next();
            System.out.println("Quantas vassouras foram vendidas? ");
            int qtdVassouras = teclado.nextInt();
            System.out.println("Quantas panelas foram vendidas? ");
            int qtdPanelas = teclado.nextInt();
            System.out.println("Quantos pratos foram vendidas? ");
            int qtdPratos = teclado.nextInt();
            System.out.println("Quantos KG de boi foram vendidos? ");
            int qtdBoi = teclado.nextInt();
            System.out.println("Quantos KG de frango foram vendidos? ");
            int qtdFrango = teclado.nextInt();
            System.out.println("Quantos KG de Porco foram vendidos? ");
            int qtdPorco = teclado.nextInt();

            supermercados.add(new Mercado(nome, qtdVassouras, qtdPanelas, qtdPratos, qtdBoi, qtdFrango, qtdPorco));
        }

        for (int i = 0; i < supermercados.size(); i++) {
            System.out.println("-------------------------------------------------");
            System.out.println("Supermercado " + supermercados.get(i).getNome());
            System.out.println("-------------------------------------------------");
            System.out.println("Saldo da sessao de utensilios domesticos R$: " + supermercados.get(i).getSaldoUtensilios());
            System.out.println("Saldo do acougue R$: " + supermercados.get(i).getSaldoAcougue());
            System.out.println("Saldo total do mercado R$: " + supermercados.get(i).getSaldoTotal());

        }

    }
}
