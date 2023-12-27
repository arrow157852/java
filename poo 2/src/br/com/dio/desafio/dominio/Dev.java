package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoComcluidos = new LinkedHashSet<>();

    public  void  inscreverBootcamp(Bootcamp bootcamp){
        this.conteudoInscritos.addAll(bootcamp.getConteudos());
    }

    public void progredir(){}

    public void calcularTotalXp(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscritos() {
        return conteudoInscritos;
    }

    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
        this.conteudoInscritos = conteudoInscritos;
    }

    public Set<Conteudo> getConteudoComcluidos() {
        return conteudoComcluidos;
    }

    public void setConteudoComcluidos(Set<Conteudo> conteudoComcluidos) {
        this.conteudoComcluidos = conteudoComcluidos;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Dev dev = (Dev) object;
        return java.util.Objects.equals(nome, dev.nome) && java.util.Objects.equals(conteudoInscritos, dev.conteudoInscritos) && java.util.Objects.equals(conteudoComcluidos, dev.conteudoComcluidos);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), nome, conteudoInscritos, conteudoComcluidos);
    }
}
