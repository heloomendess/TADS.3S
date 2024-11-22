import java.util.ArrayList;
import java.util.List;

public class CampeonatosPorEstado {

    private static List<Estado> estados = new ArrayList<>();

    private static void registrarDados() {
        estados.add(new Estado("São Paulo", 22, 10, 5));
        estados.add(new Estado("Rio de Janeiro", 14, 12, 6));
        estados.add(new Estado("Minas Gerais", 6, 5, 3));
        estados.add(new Estado("Rio Grande do Sul", 8, 6, 4));
        estados.add(new Estado("Pernambuco", 2, 3, 1));
        estados.add(new Estado("Bahia", 2, 2, 0));
        estados.add(new Estado("Paraná", 1, 1, 0));
        estados.add(new Estado("Ceará", 1, 0, 0));
    }

    private static void listarEstadosPorTitulos() {
        estados.sort(new EstadoComparator());

        System.out.println("Estados ordenados por número de títulos, vice-títulos e terceiros lugares:");
        for (Estado estado : estados) {
            estado.exibir();
        }
    }

    public static void main(String[] args) {
        registrarDados();
        listarEstadosPorTitulos();
    }
}

