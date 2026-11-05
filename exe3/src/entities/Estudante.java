package entities;

public class Estudante {
    String name;
    double n1;
    double n2;
    double n3;

    public Estudante(String name, double n1, double n2, double n3) {
        this.name = name;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public double NotaFinal() {
        if(n1 <= 30 && n2 <=35 && n3 <= 35) {
        return n1 + n2 +n3;
        } else {
            return 0.0;
        }
    }

    public String Resultado() {
        if(NotaFinal() >= 60) {
            return "Aprovado";
        } else {
            return "Reprovado ";
        }
    }

    public double Faltante() {
        return 60 - NotaFinal();

    }

}
