public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;


    // Construtor
    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }


    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
    
    public Data getDataValidade() { return dataValidade; }
    public void setDataValidade(Data dataValidade) { this.dataValidade = dataValidade; }
    
    

    // toString
    public String toString() {
    return "Produto: " + nome + ", Preço: R$" + preco + ", Validade: " + dataValidade;
}

    
    public boolean estaVencido(Data dataComparacao) {
    if (dataValidade.getAno() < dataComparacao.getAno()) return true;
    if (dataValidade.getAno() == dataComparacao.getAno()) {
        if (dataValidade.getMes() < dataComparacao.getMes()) return true;
        if (dataValidade.getMes() == dataComparacao.getMes()) {
            if (dataValidade.getDia() < dataComparacao.getDia()) return true;
        }
    }
    return false;
}


}
