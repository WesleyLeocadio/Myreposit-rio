
package modelo;


public class Produto {
    private int id_produto;
    private double valor;
    private String descricao;
    private double preco_custo, preco_venda;

    public Produto(int id_produto, double valor, String descricao, double preco_custo, double preco_venda) {
        this.id_produto = id_produto;
        this.valor = valor;
        this.descricao = descricao;
        this.preco_custo = preco_custo;
        this.preco_venda = preco_venda;
    }
    public Produto(double valor, String descricao, double preco_custo, double preco_venda) {
        this.valor = valor;
        this.descricao = descricao;
        this.preco_custo = preco_custo;
        this.preco_venda = preco_venda;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco_custo() {
        return preco_custo;
    }

    public void setPreco_custo(double preco_custo) {
        this.preco_custo = preco_custo;
    }

    public double getPreco_venda() {
        return preco_venda;
    }

    public void setPreco_venda(double preco_venda) {
        this.preco_venda = preco_venda;
    }
    
    
}
