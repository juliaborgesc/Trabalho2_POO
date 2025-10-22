import java.util.ArrayList;

public class Sistema {
    private ArrayList<Veiculo> veiculos;
    private ArrayList<Vendedor> vendedores;
    private ArrayList<Gerente> gerentes;
    private ArrayList<Cliente> clientes;

    public Sistema() {
        this.veiculos = new ArrayList<>();
        this.vendedores = new ArrayList<>();
        this.gerentes = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }
    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }
    public ArrayList<Gerente> getGerentes() {
        return gerentes;
    }
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void adicionar(Veiculo veiculo){
        this.veiculos.add(veiculo);
    }
    public void adicionar(Vendedor vendedor){
        this.vendedores.add(vendedor);
    }
    public void adicionar(Gerente gerente){
        this.gerentes.add(gerente);
    }
    public void adicionar(Cliente cliente){
        this.clientes.add(cliente);
    }

    public void listarClientes() {
        System.out.println("Clientes cadastrados:");

        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado");
        }
        else {
            for (Cliente c : this.clientes) {
                System.out.println(c);
            }
        }
    }

    public void listarVendedores() {
        System.out.println("Vendedores cadastrados:");

        if (vendedores.isEmpty()) {
            System.out.println("Nenhum vendedor cadastrado");
        }
        else {
            for (Vendedor v : this.vendedores) {
                System.out.println(v);
            }
        }
    }

    public void listarGerentes() {
        System.out.println("Gerentes cadastrados:");

        if (gerentes.isEmpty()) {
            System.out.println("Nenhum gerente cadastrado");
        }
        else {
            for (Gerente g : this.gerentes) {
                System.out.println(g);
            }
        }
    }

    public void listarVeiculos() {
        System.out.println("Veiculos cadastrados:");

        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veiculo cadastrado");
        }
        else {
            for (Veiculo veic : this.veiculos) {
                System.out.println(veic);
            }
        }
    }

    public Cliente localizarCliente(String cpf) {
        for (Cliente c : this.clientes) {
            if (c.getCpf().equals(cpf)) {
                return c;
            }
        }
        return null;
    }

    public Gerente localizarGerente(String cpf) {
        for (Gerente g : this.gerentes) {
            if (g.getCpf().equals(cpf)) {
                return g;
            }
        }
        return null;
    }

    public Vendedor localizarVendedor(String cpf) {
        for (Vendedor v : this.vendedores) {
            if (v.getCpf().equals(cpf)) {
                return v;
            }
        }
        return null;
    }

    public void atribuirVendaVendedor(Venda venda, Vendedor vendedor) {
        vendedor.addVenda(venda);
    }

    public  void relatorio(int mes, int ano) {

    }

    public  void relatorio(int ano) {

    }

    public  void relatorio(Vendedor vendedor) {
        for (Venda venda : vendedor.getVendidos()) {
            System.out.println("Vendas do vendedor " + vendedor.nome + ":");
        System.out.println("Veiculo:" + venda.getVeiculo().getMarca());
        }
    }

}
