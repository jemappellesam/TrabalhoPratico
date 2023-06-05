package Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Projeto {
    private int id;
    private String descricao;
    private Cliente cliente;
    private Orcamento orcamento;
    private List<Modulo> modulos = new ArrayList<>();

    private Random generator = new Random();
    private HashMap<Integer, String> idMap = new HashMap<>();


    @Override
    public String toString() {
        return "Projeto\n" +
                "id: " + id +
                "\ndescricao: '" + descricao + '\'' +
                "\ncliente: " + cliente.toString() +
                "\norcamento: " + orcamento.toString() +
                "\nmodulos: " + modulos.toString();
    }


    public Projeto(String descricao, Cliente cliente, Orcamento orcamento, Modulo modulo) {
        this.descricao = descricao;
        this.cliente = cliente;
        this.orcamento = orcamento;
        modulos.add(modulo);
        setId();
    }


    public List<Modulo> getModulos() {
        return modulos;
    }


    public void setModulos(List<Modulo> modulos) {
        this.modulos = modulos;
    }


    public int getId() {
        return id;
    }


    public void setId() {
        this.id = generateId();
    }


    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    private int generateId() {
        int id = generator.nextInt(1000);
        while (idMap.containsKey(id)) {
            id = generator.nextInt(1000);
        }
        return id;
    }


    //constructor inseridos para que a classe relatorio funcione corretamente
    public Cliente getCliente() {
        return cliente;
    }


    public Orcamento getOrcamento() {
        return orcamento;
    }

}