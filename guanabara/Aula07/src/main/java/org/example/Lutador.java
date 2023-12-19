package org.example;

public class Lutador implements possibilidades {
    private String nome;

    private String nacionalidade;

    private int idade;

    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String na,int id,float al,float pe,int vi,int de,int em) {
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);


    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.getPeso()<52.2){
            this.categoria="invalido";
        } else if (getPeso()<=70.3) {
            this.categoria="Leve";

        } else if (this.getPeso()<=83.9) {
            this.categoria="Medio";
        } else if (this.getPeso()<=120.2) {
            this.categoria="pesado";
        }else {
            this.categoria="invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    @Override
    public void apresentar() {
        System.out.println("Lutador: "+this.getNome());
        System.out.println("Origem: "+this.getNacionalidade());
        System.out.println("Idade: "+ this.getIdade()+" anos");
        System.out.println(this.getAltura()+" m de altura");
        System.out.println("Pesando: "+ this.getPeso()+" Kg");
        System.out.println("Ganhou: "+this.getVitorias());
        System.out.println("Perdeu: "+this.getDerrotas());
        System.out.println("Empatou: "+this.getEmpates());
        System.out.println("------------------------------------------");

    }

    @Override
    public void status() {
        System.out.println(this.getNome());
        System.out.println("É um peso "+ this.getCategoria());
        System.out.println(this.getVitorias()+" vitórias");
        System.out.println(this.getEmpates()+" empates");
        System.out.println(this.getDerrotas()+" Derrotas");

    }

    @Override
    public void ganharLuta() {
        this.setVitorias((this.getVitorias()+1));

    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas()+1);

    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates()+1);

    }
}
