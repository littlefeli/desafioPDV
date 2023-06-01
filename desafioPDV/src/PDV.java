import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PDV {
    Scanner teclado = new Scanner(System.in);
    List<Produto> lista = new ArrayList<>();
    Produto produto = null;
    Caixa caixa = new Caixa();
    historicoVendas = new ArrayList<>();

    public void menuInicial() {
        String menu = """
                  Selecione a opção desejada:\n
                  1: Cadastrar produto
                  2: Consultar produtos cadastrados
                  3: Alterar produto\n
                  4: Mostrar saldo
                  5: Alterar saldo do caixa\n
                  6: Realizar vendas
                  7: Histórico de vendas
                  8: Histórico de cupons
                  0: Sair\n
                """;
        System.out.println(menu);
    }

    //1 Método para cadastrar o produto
    public void cadastrarProduto() {
        Scanner teclado = new Scanner(System.in);
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
        lista.add(novoProduto);
        System.out.println("\nProduto cadastrado com sucesso!\n");
    }

    //2 Método para consultar o produto
    public void consultaProduto() {
        for (Produto produto : lista) {
            System.out.println("---------------------------");
            System.out.println("Detalhes do Produto:");
            System.out.println("Código: " + produto.getCodigo());
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Estoque: " + produto.getEstoque());
            System.out.println("Preço: R$" + produto.getPreco());
            System.out.println("Código de Barras: " + produto.getCodigoDeBarras());
            System.out.println("---------------------------\n");
        }
    }

    //3 Método para alterar o preço e estoque do produto
    public void alterarProduto() {
        System.out.println("Digite o código do produto que deseja alterar:");
        int codigo = teclado.nextInt();
        teclado.nextLine();

        boolean produtoEncontrado = false;

        for (Produto produto : lista) {
            if (codigo == produto.getCodigo()) {
                System.out.println("Deseja alterar o produto: " + produto.getNome() + " ? (S/N)");
                String resposta = teclado.nextLine();

                if (resposta.equalsIgnoreCase("S")) {
                    System.out.println("Digite o novo preço do produto:");
                    double novoPreco = teclado.nextDouble();
                    teclado.nextLine();
                    System.out.println("Digite o novo estoque do produto:");
                    int novoEstoque = teclado.nextInt();
                    teclado.nextLine();

                    produto.setPreco(novoPreco);
                    produto.setEstoque(novoEstoque);
                    System.out.println("Produto alterado com sucesso!\n");
                    produtoEncontrado = true;
                    break;
                } else {
                    System.out.println("Alteração de produto cancelada.\n");
                    produtoEncontrado = true;
                    break;
                }
            }
        }

        if (!produtoEncontrado) {
            System.out.println("Produto não encontrado.");
        }
    }

    //4 Método para realizar a venda de produtos
    public void realizarVenda() {
        System.out.println("Digite o código do produto que deseja vender:");
        int codigo = teclado.nextInt();
        teclado.nextLine();

        boolean produtoEncontrado = false;

        for (Produto produto : lista) {
            if (codigo == produto.getCodigo()) {
                System.out.println("Digite a quantidade a ser vendida deste produto:");
                int quantidade = teclado.nextInt();
                if (quantidade <= produto.getEstoque()) {
                    produto.setEstoque(produto.getEstoque() - quantidade);
                    double venda = quantidade * produto.getPreco();
                    caixa.setSaldo(caixa.getSaldo() + venda);
                    System.out.println("Venda realizada com sucesso!\n");
                    caixa.mostrarSaldo();
                } else {
                    System.out.println("Estoque insuficiente para a venda.\n");
                }
                produtoEncontrado = true;
                break;
            }
        }

        if (!produtoEncontrado) {
            System.out.println("Produto não encontrado.\n");
        }
    }

    public Caixa getCaixa() {
        return caixa;
    }
}