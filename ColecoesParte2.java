package ListaParte2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColecoesParte2 {

    public static void main(String[] args) {
        listaDeNomes();
    }

    private static void listaDeNomes() {
        List<String> nomes = new ArrayList<>();

        nomes.add("Adriana - F, Pâmela - F, Karina - F, Beatriz - F, Isa - F, Gustavo - M, Felipe - M");

        String[] nomesArray = nomes.get(0).split(", ");

        List<String> nomesFemininos = new ArrayList<>();
        List<String> nomesMasculinos = new ArrayList<>();

        for (String nome : nomesArray) {
            if (nome.endsWith("- F")) {
                nomesFemininos.add(nome);
            } else if (nome.endsWith("- M")) {
                nomesMasculinos.add(nome);
            }
        }

        Collections.sort(nomesFemininos);
        Collections.sort(nomesMasculinos);

        System.out.println("---NOMES FEMININOS---");
        for (String nome : nomesFemininos) {
            System.out.println(nome);
        }

        System.out.println("\n---NOMES MASCULINOS---");
        for (String nome : nomesMasculinos) {
            System.out.println(nome);
        }
    }
}


