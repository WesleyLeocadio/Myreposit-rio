package modelo;

public class Gerente {

    private int id;
    private String nome;
    private String rua;
    private String numero, bairro;
    private String sexo;
    private String telefone;
    private String cidade;
    private String rg;
    private String cpf;
    private String data_nascimento;
    private String complemento;

    public Gerente(int id, String nome, String rua, String numero, String bairro, String sexo, String telefone, String cidade, String rg, String cpf, String data_nascimento, String complemento) {
        this.id = id;
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.sexo = sexo;
        this.telefone = telefone;
        this.cidade = cidade;
        this.rg = rg;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.complemento = complemento;
    }
    public Gerente(String nome, String rua, String numero, String bairro, String sexo, String telefone, String cidade, String rg, String cpf, String data_nascimento, String complemento) {
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.sexo = sexo;
        this.telefone = telefone;
        this.cidade = cidade;
        this.rg = rg;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.complemento = complemento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

}
