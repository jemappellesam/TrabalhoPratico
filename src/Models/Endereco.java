package Models;

public class Endereco {
    private String rua;
    private String bairro;
    private String cidade;
    private String cep;
    private int numero;


    public Endereco(String rua, String bairro, String cidade, String cep, int numero) {
        setRua(rua);
        setBairro(bairro);
        setCidade(cidade);
        setCep(cep);
        setNumero(numero);
    }

    @Override
    public String toString() {
        return "Rua: " + getRua() + "\nBairro: " + getBairro() + "\nNúmero: " + getNumero() + "\nCidade: " + getCidade() + "\nCEP: " + getCep();
    }

    public String getRua() {
        return this.rua;
    }


    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getCep() {
        return cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
