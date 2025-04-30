import java.util.Scanner;

public class FaturaTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a fatura:");
        String numero = scanner.nextLine();

        System.out.println("Digite a descrição:");
        String descricao = scanner.nextLine();

        System.out.println("Digite a quantidade:");
        int quantidade = scanner.nextInt();

        System.out.println("Digite o preço por item:");
        double precoPorItem = scanner.nextDouble();

        Fatura fatura = new Fatura(numero, descricao, quantidade, precoPorItem);

        System.out.println("Número da Fatura: " + fatura.getNumero());
        System.out.println("Descrição: " + fatura.getDescricao());
        System.out.println("Quantidade: " + fatura.getQuantidade());
        System.out.println("Preço por item: R$" + fatura.getPrecoPorItem());
        System.out.println("Total da fatura: R$" + fatura.getTotalFatura());

        scanner.close();
    }
}
