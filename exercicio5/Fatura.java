public class Fatura {
    private String numero;
    private String descricao;
    private int quantidade;
    private double precoPorItem;

    public Fatura(String numero, String descricao, int quantidade, double precoPorItem) {
        this.numero = numero;
        this.descricao = descricao;
        
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;
        }

        if (precoPorItem > 0) {
            this.precoPorItem = precoPorItem;
        } else {
            this.precoPorItem = 0.0;
        }
    }

    public double getTotalFatura() {
        return quantidade * precoPorItem;
    }
}
