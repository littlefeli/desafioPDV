import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Caixa {
    private double saldo;
    Scanner teclado = new Scanner(System.in);


    public void mostrarSaldo(){
        System.out.println("Seu saldo atual é de: R$" + saldo + "\n");
    }

    public void alterarSaldo() {
        System.out.println("Defina o saldo do seu caixa:");
        double valor = teclado.nextDouble();
        setSaldo(valor);
        System.out.println("Saldo alterado com sucesso!");
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
