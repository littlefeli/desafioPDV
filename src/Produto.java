import java.awt.*;
import java.util.Scanner;

public class Produto {
    private String codigo;
    private String nome;
    private int estoque;
    private double preco;
    private List<String> codigosBarras;
    Scanner teclado = new Scanner(System.in);

    // Construtor
    Produto(String codigo, String nome, int estoque, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
        this.codigosBarras = new ArrayList<>();
    }



    // Métodos getters e setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public List<String> getCodigosBarras() {
        return codigosBarras;
    }

    public void setCodigosBarras(List<String> codigosBarras) {
        this.codigosBarras = codigosBarras;
    }

    // Método para realizar a venda de produtos
    public void venderProduto(int quantidade) {
        if (quantidade <= estoque) {
            estoque -= quantidade;
            System.out.println("Venda realizada com sucesso!");
        } else {
            System.out.println("Estoque insuficiente para a venda.");
        }
    }

    // Método para exibir o valor total de um produto em estoque
    public double calcularValorTotalEstoque() {
        return estoque * preco;
    }

    // Método para adicionar um código de barras ao produto
    public void adicionarCodigoBarras(String codigoBarras) {
        codigosBarras.add(codigoBarras);
    }

    // Método para alterar o preço do produto
    public void alterarPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    // Método para alterar o estoque do produto
    public void alterarEstoque(int novoEstoque) {
        this.estoque = novoEstoque;
    }

    // Método para exibir os detalhes do produto
    public void exibirDetalhes() {
        System.out.println("Detalhes do Produto:");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Estoque: " + estoque);
        System.out.println("Preço: " + preco);
        System.out.println("Códigos de Barras: " + codigosBarras);
        System.out.println("---------------------------");
    }
}
