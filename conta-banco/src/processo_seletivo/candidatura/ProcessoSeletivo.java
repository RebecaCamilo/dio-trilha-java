package processo_seletivo.candidatura;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        List<String> candidatosSelecionados = selecaoCandidatos();
        for (String candidato : candidatosSelecionados) {
            entrarEmContatoComCandidato(candidato);
        }
    }

    static void entrarEmContatoComCandidato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO!");

        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM O " + candidato + " NA " + tentativasRealizadas + "ª tentativa");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM O CANDIDATO " + candidato);
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static List<String> selecaoCandidatos() {
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
        return candidatosSelecionados;
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(2800, 3200);
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
