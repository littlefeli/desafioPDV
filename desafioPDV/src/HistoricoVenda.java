public class HistoricoVenda {

    private Produto produto;
    private int quantidade;
    private double valorTotal;

    public RegistroVenda(Produto produto, int quantidade, double valorTotal) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}



//Método para adicionar venda ao histórico e para calcular a quantidade vendida e o valor total vendido por produto


    //Método para visualizar detalhadamente as vendas, quantidade e valor.


