import java.util.ArrayList;

public class Vendedor extends Funcionario {
    private double comissao;
    private ArrayList<Venda> vendidos;

    public Vendedor(String nome, String cpf, int dia, int mes, int ano, double salario, double comissao) {
        super(nome, cpf, dia, mes, ano, salario);
        this.comissao = comissao;
        this.vendidos = new ArrayList<Venda>();
    }

    public void addVenda(Venda v) {
        vendidos.add(v);
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double comissaoTotal(int mes, int ano) {
        double total = 0;
        for (Venda v : vendidos) {
            if (v.getData().getMes() == mes && v.getData().getAno() == ano) {
                total += v.valor() * comissao;
            }
        }
        return total;
    }

    public double comissaoTotal(int ano) {
        double total = 0;
        for (Venda v : vendidos) {
            if (v.getData().getAno() == ano) {
                total += v.valor() * comissao;
            }
        }
        return total;
    }

    public double getSalario(int mes, int ano) {
        return salario + comissaoTotal(mes, ano);
    }

    public String toString() {
        return nome + " - CPF: " + cpf + " - Comissão: " + comissao;
    }
}
