
package modelo;

public class Venda {
     private int id_venda;
     private String data_venda;
     

    public Venda( String data_venda) {
        this.data_venda = data_venda;
    }     

    public Venda(int id_venda, String data_venda) {
        this.id_venda = id_venda;
        this.data_venda = data_venda;
    }
     

    public int getId_venda() {
        return id_venda;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    public String getData_venda() {
        return data_venda;
    }

    public void setData_venda(String data_venda) {
        this.data_venda = data_venda;
    }
}
