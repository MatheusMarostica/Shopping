import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Loja loja = null;
        Produto produto = null;

        int opcao = 0;
        while (opcao != 3) {
            System.out.println("\nMENU:");
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Nome da loja: ");
                String nome = scanner.nextLine();
                
                System.out.print("Quantidade máxima de produtos na loja: ");
                int qtdProdutos = scanner.nextInt();

                System.out.print("Quantidade de funcionários: ");
                int qtdFunc = scanner.nextInt();

                System.out.print("Salário base: ");
                double salario = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Rua: ");
                String rua = scanner.nextLine();
                System.out.print("Número: ");
                String numero = scanner.nextLine();
                System.out.print("Complemento: ");
                String complemento = scanner.nextLine();
                System.out.print("Cidade: ");
                String cidade = scanner.nextLine();
                System.out.print("Estado: ");
                String estado = scanner.nextLine();
                System.out.print("País: ");
                String pais = scanner.nextLine();
                System.out.print("CEP: ");
                String cep = scanner.nextLine();

                Endereco endereco = new Endereco(rua, cidade, estado, pais, cep, numero, complemento);

                System.out.print("Dia de fundação: ");
                int dia = scanner.nextInt();
                System.out.print("Mês de fundação: ");
                int mes = scanner.nextInt();
                System.out.print("Ano de fundação: ");
                int ano = scanner.nextInt();

                Data dataFundacao = new Data(dia, mes, ano);

                loja = new Loja(nome, qtdFunc, salario, endereco, dataFundacao, qtdProdutos);

            } else if (opcao == 2) {
                System.out.print("Nome do produto: ");
                String nome = scanner.nextLine();
                System.out.print("Preço: ");
                double preco = scanner.nextDouble();
                System.out.print("Dia de validade: ");
                int dia = scanner.nextInt();
                System.out.print("Mês de validade: ");
                int mes = scanner.nextInt();
                System.out.print("Ano de validade: ");
                int ano = scanner.nextInt();

                Data validade = new Data(dia, mes, ano);
                produto = new Produto(nome, preco, validade);

                Data dataComparacao = new Data(20, 10, 2023);
                if (produto.estaVencido(dataComparacao)) {
                    System.out.println("\nPRODUTO VENCIDO");
                } else {
                    System.out.println("\nPRODUTO NÃO VENCIDO");
                }

                if (loja != null) {
                    System.out.println("\nInformações da loja:");
                    System.out.println(loja.toString());
                } else {
                    System.out.println("\nLoja ainda não foi criada.");
                }

            } else if (opcao != 3) {
                System.out.println("Opção inválida.");
            }
        }

        System.out.println("Encerrando programa...");
        scanner.close();
    }
}
