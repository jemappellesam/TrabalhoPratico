package services;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class Personalizacao {
    private int id;
    private String detalhes;
    private static Map<Integer, String> idMap = new HashMap<>();
    private static Random generator = new Random();


    public Personalizacao(String detalhes) {
        this.id = generateId();
        this.detalhes = detalhes;
    }


    public int getId() {
        return id;
    }


    public String getDetalhes() {
        return detalhes;
    }


    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }


    @Override
    public String toString() {
        return "Personalização: " + detalhes;
    }
    private static int generateId() {
        int id = generator.nextInt(1000);
        while (idMap.containsKey(id)) {
            id = generator.nextInt(1000);
        }
        idMap.put(id, "");
        return id;
    }
}