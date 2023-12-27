package br.com.dio.desafio.dominio;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial= LocalDate.now();
    private final nome = dataInicial.plusDays(45);
    private set<Dev> devsInscritos= new HashSet<>();
    private set<Conteudo> conteudos= new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Bootcamp bootcamp = (Bootcamp) object;
        return java.util.Objects.equals(nome, bootcamp.nome) && java.util.Objects.equals(descricao, bootcamp.descricao) && java.util.Objects.equals(dataInicial, bootcamp.dataInicial) && java.util.Objects.equals(devsInscritos, bootcamp.devsInscritos) && java.util.Objects.equals(conteudos, bootcamp.conteudos);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), nome, descricao, dataInicial, devsInscritos, conteudos);
    }
}
