import java.util.Comparator;

public class EstadoComparator implements Comparator<Estado> {

    @Override
    public int compare(Estado e1, Estado e2) {
        // Comparar pelo número de títulos (decrescente)
        if (e2.getTitulos() != e1.getTitulos()) {
            return Integer.compare(e2.getTitulos(), e1.getTitulos());
        }

        // Em caso de empate, comparar pelo número de vice-títulos (decrescente)
        if (e2.getViceTitulos() != e1.getViceTitulos()) {
            return Integer.compare(e2.getViceTitulos(), e1.getViceTitulos());
        }

        // Em caso de empate, comparar pelo número de terceiros lugares (decrescente)
        return Integer.compare(e2.getTerceirosLugares(), e1.getTerceirosLugares());
    }
}

