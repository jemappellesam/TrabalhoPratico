package Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import services.Personalizacao;

public class Modulo {
    private String nome;
    private String tipo;
    private int id;
    private static Random generator = new Random();
    private static Map<Integer, String> idMap = new HashMap<>();
    private List<Personalizacao> personalizacoes = new ArrayList<>();


    public Modulo(String nome, String tipo) {
        setTipo(tipo);
        setNome(nome);
        setId();
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public int getId() {
        return id;
    }


    public void setId() {
        this.id = generateId();
    }


    private int generateId() {
        int id = generator.nextInt(1000);
        while (idMap.containsKey(id)) {
            id = generator.nextInt(1000);
        }
        idMap.put(id, "");
        return id;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Módulo:\n");
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Tipo: ").append(tipo).append("\n");
        sb.append("ID: ").append(id).append("\n");
        return sb.toString();
    }


    //metodos implementados para que a personalização ocorra de maneira adequada
    public void adicionarPersonalizacao(Personalizacao personalizacao) {
        personalizacoes.add(personalizacao);
    }
    public List<Personalizacao> getPersonalizacoes() {
        return personalizacoes;
    }
}