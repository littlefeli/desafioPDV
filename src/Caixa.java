import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Caixa {
    private double saldoInicial;
    private List<Cedula> cedulas;
    private List<Moeda> moedas;
    private List<Produto> produtosCadastrados;

    public Caixa() {
        produtosCadastrados = new ArrayList<>();
        cedulas = new ArrayList<>();
        moedas = new ArrayList<>();
    }

    public void definirSaldoInicial(double valorInicial) {
        saldoInicial = valorInicial;

        // Cálculo e adição das cédulas
        int quantidadeCem = (int) (saldoInicial / 100);
        cedulas.add(new Cedula(100, quantidadeCem));
        saldoInicial %= 100;

        int quantidadeCinquenta = (int) (saldoInicial / 50);
        cedulas.add(new Cedula(50, quantidadeCinquenta));
        saldoInicial %= 50;

        int quantidadeVinte = (int) (saldoInicial / 20);
        cedulas.add(new Cedula(20, quantidadeVinte));
        saldoInicial %= 20;

        int quantidadeDez = (int) (saldoInicial / 10);
        cedulas.add(new Cedula(10, quantidadeDez));
        saldoInicial %= 10;

        int quantidadeCinco = (int) (saldoInicial / 5);
        cedulas.add(new Cedula(5, quantidadeCinco));
        saldoInicial %= 5;

        int quantidadeDois = (int) (saldoInicial / 2);
        cedulas.add(new Cedula(2, quantidadeDois));
        saldoInicial %= 2;

        // Cálculo e adição das moedas
        int quantidadeUmReal = (int) (saldoInicial);
        moedas.add(new Moeda(1, quantidadeUmReal));
        saldoInicial -= quantidadeUmReal;

        int quantidadeCinquentaCentavos = (int) (saldoInicial / 0.50);
        moedas.add(new Moeda(0.50, quantidadeCinquentaCentavos));
        saldoInicial %= 0.50;

        int quantidadeVinteCincoCentavos = (int) (saldoInicial / 0.25);
        moedas.add(new Moeda(0.25, quantidadeVinteCincoCentavos));
        saldoInicial %= 0.25;

        int quantidadeDezCentavos = (int) (saldoInicial / 0.10);
        moedas.add(new Moeda(0.10, quantidadeDezCentavos));
        saldoInicial %= 0.10;

        int quantidadeCincoCentavos = (int) (saldoInicial / 0.05);
        moedas.add(new Moeda(0.05, quantidadeCincoCentavos));
        saldoInicial %= 0.05;





//    public double alterarSaldoInicial(double novoSaldoInicial) {
//        this.saldoInicial = novoSaldoInicial;
//    }

    // Métodos getter e setter

//    public double getSaldoInicial() {
//        return saldoInicial;
//    }
//
//    public void setSaldoInicial(double saldoInicial) {
//        this.saldoInicial = saldoInicial;
//    }




//    public HistoricoVenda getHistoricoVenda() {
//        return historicoVenda;
//    }
//
//    public void setHistoricoVenda(HistoricoVenda historicoVenda) {
//        this.historicoVenda = historicoVenda;
//    }
}
