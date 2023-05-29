import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int opcao;
        Scanner teclado = new Scanner(System.in);
        Produto produto = new Produto("1456", "Arroz", 20, 21.99);
        ArrayList<produto>Lista = new ArrayList<produto>();
        Caixa caixa = new Caixa();

        //determine o saldo inicial do seu caixa:
        caixa.definirSaldoInicial();

        public void menuzinho() {
            while (true)
                try {
                    switch (nextInt("Selecione a opção desejada:\n1: Cadastrar produto\n2: Alterar produto\n3: Remover conta\n4: Sair")){
                        case 1:
                            addConta();
                            break;
                        case 2:
                            consultarConta();
                            break;
                        case 3:
                            removerConta();
                            break;
                        case 4:
                            System.out.println("Saindo....");
                            return;
                        default:
                            System.out.println("Opção inválida\n");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Opção inválida\n");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.out.println();
                }
        }
        switch (opcao){
            case 1:
            System.out.print("Digite o código do produto: ");
            int codigo = teclado.nextInt();
            teclado.nextLine();

            System.out.print("Digite o nome do produto: ");
            String nome = teclado.nextLine();

            System.out.print("Digite a quantidade em estoque: ");
            int estoque = teclado.nextInt();

            System.out.print("Digite o preço do produto: ");
            double preco = teclado.nextDouble();

            System.out.print("Digite código de barras do produto: ");
            int codigoBarra = teclado.nextInt();

            // Criar um novo produto com os dados informados
            Produto novoProduto = new Produto(codigo, nome, estoque, preco, codigoBarra);
        }

    }
}