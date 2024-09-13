package entidade;

public class Produto {
    //Declarações de campo de instância
    private String nome;
    private double preco;
    private int quantidade;
    private int codigo;

    private boolean ativo = true;

    public Produto(String nome, double preco, int quantidade, int codigo) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo){
        this.ativo = ativo;
    }

    public double getValor() {
        return quantidade * preco;
    }

    @Override
    public String toString() {
        return "Nome do produto: " + nome + '\n' +
                "Preço: " + preco + '\n' +
                "Quantidade: " + quantidade + '\n' +
                "Codigo: " + codigo + '\n' +
                "Valor do estoque: " + getValor() + '\n' +
                "Status: " + (this.ativo ? "Produto ainda em estoque" : "Produto fora de estoque");
    }
}
