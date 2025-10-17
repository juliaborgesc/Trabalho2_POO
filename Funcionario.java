public class Funcionario extends Pessoa {
    protected double salario;

    public Funcionario(String nome, String cpf, int dia, int mes, int ano, double salario) {
        super(nome, cpf, dia, mes, ano);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario(int mes, int ano) {
        return salario;
    }

    public String toString() {
        return nome + " - CPF: " + cpf + " - Salário base: R$" + salario;
    }
}
