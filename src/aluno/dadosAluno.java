package aluno;

public class dadosAluno {
    public String aluno;

    public double calcularNota(double nota1, double nota2, double nota3) {
        double notaFinal = nota1 + nota2 + nota3;
        System.out.printf("NOTA FINAL = %.2f%n", notaFinal);
        if (notaFinal > 60) {
            System.out.println("PASSOU!!");
        } else {
            double falta = 60 - notaFinal;
            System.out.println("REPROVOU");
            System.out.printf("FALTA %.2f POINTS", falta);

        }
        return 0.0;
    }
}
