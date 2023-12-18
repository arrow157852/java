package org.example;

public class Planilha {
    private String[] material;
    private float[] valor;

    private float[] quantidade;
    private String tipoServico;


    public Planilha(String[] material,float[] valor,float[] quantidade,String tipoServico) {
        this.quantidade = quantidade;
        this.material=material;
        this.valor=valor;
        this.tipoServico=tipoServico;

    }

    public String[] getMaterial() {
        return material;
    }

    public void setMaterial(String[] material) {
        this.material = material;
    }

    public float[] getValor() {
        return valor;
    }

    public void setValor(float[] valor) {
        this.valor = valor;
    }

    public float[] getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float[] quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }
}
