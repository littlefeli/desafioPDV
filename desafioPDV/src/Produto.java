import java.awt.*;
import java.util.ArrayList;

public class Produto {
    private int codigo;
    private String nome;
    private int estoque;
    private double preco;
    private int codigoDeBarras;

    // Construtor
    Produto(int codigo, String nome, int estoque, double preco, int codigoDeBarras) {
        this.codigo = codigo;
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
        this.codigoDeBarras = codigoDeBarras;
    }
    
    //Getters & Setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
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

    public int getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(int codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }
}
