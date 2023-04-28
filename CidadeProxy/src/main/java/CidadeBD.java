import java.util.HashMap;
import java.util.Map;

public class CidadeBD {
    private static Map<String, Cidade> cidades = new HashMap<>();

    public static Cidade getCidade(String nome) {
        return cidades.get(nome);
    }

    public static void addCidade(Cidade cidade) {
        cidades.put(cidade.getNome(), cidade);
    }
}