package org.example;

public class DadosPlanilha {
    private int id;
    private String material;
    private float valor;
    private float quantidade;  // Adicionando a variável quantidade

    // Construtor
    public DadosPlanilha(int id, String material, float valor) {
        this.id = id;
        this.material = material;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    // Métodos getter
    public int getId() {
        return id;
    }

    public String getMaterial() {
        return material;
    }

    public int getValor() {
        return (int) valor;
    }

    public float getQuantidade() {
        return quantidade;
    }
}
