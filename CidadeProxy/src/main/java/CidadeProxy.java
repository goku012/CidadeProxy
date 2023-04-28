public class CidadeProxy {
    private Cidade cidade;

    private String nome;

    public CidadeProxy(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPopulacao() {
        if (this.cidade == null) {
            this.cidade = CidadeBD.getCidade(this.nome);
        }
        return this.cidade.getPopulacao();
    }

    public Double getArea() {
        if (this.cidade == null) {
            this.cidade = CidadeBD.getCidade(this.nome);
        }
        return this.cidade.getArea();
    }

    public String getEstado() {
        if (this.cidade == null) {
            this.cidade = CidadeBD.getCidade(this.nome);
        }
        return this.cidade.getEstado();
    }
}