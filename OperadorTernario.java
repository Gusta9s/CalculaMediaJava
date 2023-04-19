package br.com.gpacheco.fundamentos.operadores;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        double notaFaltante;
        double nota;

        System.out.print("Digite sua primeira nota: ");
        double a1 = a.nextDouble();
        a.nextLine();

        System.out.print("Digite sua segunda nota: ");
        double a2 = a.nextDouble();
        a.nextLine();

        String result1 = ((a1 + a2) / 2) >= 7.0 ? "aprovado" : "em recuperação";
        nota = ((a1 + a2) / 2);

        System.out.printf("O aluno está %s.%n",result1);

        if(result1 == "em recuperação"){

            notaFaltante = ((a1 + a2) / 2) <= 7.0 ? (10 - nota) : 0;
            System.out.printf("E sua nota faltante equivale há %.2f.%n",notaFaltante);

            System.out.print("Digite sua nota de recuperação: ");
            double a3 = a.nextDouble();
            a.nextLine();

            String result2 = a3 >= notaFaltante ? "aprovado" : "reprovado";

            System.out.printf("O aluno esta %s.%n",result2);
        }

        a.close();
    }
}
