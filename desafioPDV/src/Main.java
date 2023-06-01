import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        PDV PDV = new PDV();
        Caixa caixa = PDV.getCaixa();
        HistoricoVenda historico = new HistoricoVenda();

        //determine o saldo inicial do seu caixa:
        System.out.println("Bem vindo ao Sistema PDV!\nComece adicionando o saldo inicial do seu caixa:");
        double saldoInicial = teclado.nextDouble();
        caixa.setSaldo(saldoInicial);
        System.out.println("Perfeito!");

        int opcao;
        do{
            PDV.menuInicial();
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    PDV.cadastrarProduto();
                    break;
                case 2:
                    PDV.consultaProduto();
                    break;
                case 3:
                    PDV.alterarProduto();
                    break;
                case 4:
                    caixa.mostrarSaldo();
                    break;
                case 5:
                    caixa.alterarSaldo();
                    break;
                case 6:
                    PDV.realizarVenda();
                    break;
                case 7:
//                    historico.mostrarHistorico();
                    break;
                case 0:
                    System.out.println("Saindo....");
                    return;
                default:
                    System.out.println("Opção inválida\n");
            }
        } while (opcao != 0);


    }
}
