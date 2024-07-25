package processo_seletivo.candidatura;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JONAS"};

        ArrayList<String> candidatosSelecionados = new ArrayList<>();

        double salarioBase = 3000.0;

        for (String candidato : candidatos) {
            double salarioPretendido = valorPretendido();

            // System.out.println("O candidato " + candidato + " solicitou " + salarioPretendido);
            if (salarioPretendido <= salarioBase) {
                // System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados.add(candidato);
            }
        }
        System.out.println(candidatosSelecionados);
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(2800, 3500);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
