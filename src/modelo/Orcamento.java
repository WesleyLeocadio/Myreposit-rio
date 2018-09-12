package modelo;

public class Orcamento {

    private int id_orcamento;
    private Cliente id_cliente;
    private Gerente id_gerente;
    private double valor;
    private String data_venda;
    private String status;
    private double desconto;
    private double valor_descontado;
    private Venda id_venda;

    public Orcamento(int id_orcamento, double valor, String data_venda, String status, double desconto, double valor_descontado) {
        this.id_orcamento = id_orcamento;
        this.valor = valor;
        this.data_venda = data_venda;
        this.status = status;
        this.desconto = desconto;
        this.valor_descontado = valor_descontado;
    }
    public Orcamento(double valor, String data_venda, String status, double desconto, double valor_descontado) {
        this.valor = valor;
        this.data_venda = data_venda;
        this.status = status;
        this.desconto = desconto;
        this.valor_descontado = valor_descontado;
    }

    public int getId_orcamento() {
        return id_orcamento;
    }

    public void setId_orcamento(int id_orcamento) {
        this.id_orcamento = id_orcamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData_venda() {
        return data_venda;
    }

    public void setData_venda(String data_venda) {
        this.data_venda = data_venda;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getValor_descontado() {
        return valor_descontado;
    }

    public void setValor_descontado(double valor_descontado) {
        this.valor_descontado = valor_descontado;
    }

}
