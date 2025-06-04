public class Produto {
    private String nome;
    private double preco;
    private Data dataGarantia;


    // Construtor
    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataGarantia = dataGarantia;
    }


    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
    
    public Data getDataGarantia() { return dataGarantia; }
    public void setDataGarantia(Data dataGarantia) { this.dataGarantia = dataGarantia; }
    
    

    // toString
    public String toString() {
        return "Produto: " + nome + ", Preço: R$" + preco + ", Validade: " + dataGarantia.toString();
    }
    
    public boolean estaVencido(Data dataComparacao) {
    if (dataGarantia.getAno() < dataComparacao.getAno()) return true;
    if (dataGarantia.getAno() == dataComparacao.getAno()) {
        if (dataGarantia.getMes() < dataComparacao.getMes()) return true;
        if (dataGarantia.getMes() == dataComparacao.getMes()) {
            if (dataGarantia.getDia() < dataComparacao.getDia()) return true;
        }
    }
    return false;
}


}
