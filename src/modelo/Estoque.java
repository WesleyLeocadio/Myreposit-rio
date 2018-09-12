package modelo;

public class Estoque {

    private int id_produto;
    private int quantidade;
    private String unidade_medida;

    public Estoque(int id_produto, int quantidade, String unidade_medida) {
        this.id_produto = id_produto;
        this.quantidade = quantidade;
        this.unidade_medida = unidade_medida;
    }
      public Estoque(int quantidade, String unidade_medida) {
        this.quantidade = quantidade;
        this.unidade_medida = unidade_medida;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getUnidade_medida() {
        return unidade_medida;
    }

    public void setUnidade_medida(String unidade_medida) {
        this.unidade_medida = unidade_medida;
    }

}
