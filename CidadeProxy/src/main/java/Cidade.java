import java.util.Arrays;
import java.util.List;

public class Cidade {
    private String nome;
    private Integer populacao;
    private Double area;
    private String estado;

    public Cidade(String nome, Integer populacao, Double area, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.area = area;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPopulacao() {
        return populacao;
    }

    public Double getArea() {
        return area;
    }

    public String getEstado() {
        return estado;
    }
}