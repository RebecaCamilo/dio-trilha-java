package desafio_explorando_servicos_telefonia;

import java.util.Scanner;

public class VerificarComboCompleto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] servicosContratados = input.split(",");

        String resultado = verificarComboCompleto(servicosContratados);

        System.out.println(resultado);

        scanner.close();
    }

    public static String verificarComboCompleto(String[] servicosContratados) {
        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;

        for (String servico : servicosContratados) {
            if(servico.equals("movel")) {
                movelContratado = true;
            }
            if(servico.equals("banda larga")) {
                bandaLargaContratada = true;
            }
            if(servico.equals("tv")) {
                tvContratada = true;
            }
        }

        if (movelContratado && bandaLargaContratada && tvContratada) {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }
}
