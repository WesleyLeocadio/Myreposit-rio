
package modelo;

public class Produto_Orcamento {
    
    private int id_produto_orcamento;
    private Produto id_produto;
    private Orcamento id_orcamento;

    public Produto_Orcamento(int id_produto_orcamento, Produto id_produto, Orcamento id_orcamento) {
        this.id_produto_orcamento = id_produto_orcamento;
        this.id_produto = id_produto;
        this.id_orcamento = id_orcamento;
    }
    public Produto_Orcamento(Produto id_produto, Orcamento id_orcamento) {
        this.id_produto = id_produto;
        this.id_orcamento = id_orcamento;
    }
    public int getId_produto_orcamento() {
        return id_produto_orcamento;
    }

    public void setId_produto_orcamento(int id_produto_orcamento) {
        this.id_produto_orcamento = id_produto_orcamento;
    }

    public Produto getId_produto() {
        return id_produto;
    }

    public void setId_produto(Produto id_produto) {
        this.id_produto = id_produto;
    }

    public Orcamento getId_orcamento() {
        return id_orcamento;
    }

    public void setId_orcamento(Orcamento id_orcamento) {
        this.id_orcamento = id_orcamento;
    }
    
}
