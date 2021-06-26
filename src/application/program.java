package application;

import java.util.Locale;
import java.util.Scanner;

import aluno.dadosAluno;

public class program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        dadosAluno dados = new dadosAluno();

        System.out.print("alino: ");
        dados.aluno = sc.nextLine();
        System.out.print("nota max 30: ");
        double nota1 = sc.nextDouble();
        System.out.print("nota max 35: ");
        double nota2 = sc.nextDouble();
        System.out.print("nota max 35: ");
        double nota3 = sc.nextDouble();
        dados.calcularNota(nota1, nota2, nota3);
        //System.out.println(dados.calcularNota(nota1, nota2, nota3));

    }

}
