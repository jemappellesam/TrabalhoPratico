package views;


import services.Relatorio;


import java.util.ArrayList;
import java.util.List;


public class interfaceExibição {
    private List<Relatorio> relatorios;
    List<Models.Cliente> Cliente;

    public interfaceExibição() {
        relatorios = new ArrayList<>();
        Cliente = new ArrayList<>();
    }

    public void adicionarRelatorio(Relatorio relatorio) {
        relatorios.add(relatorio);
    }

    public void adicionarCliente(Models.Cliente cliente) {
        Cliente.add(cliente);
    }

    public void exibirRelatorios() {
        if (relatorios.isEmpty()) {
            System.out.println("Nenhum relatório encontrado.");
        } else {
            for (Relatorio relatorio : relatorios) {
                System.out.println(relatorio.toString());
                System.out.println("------------------------");
            }
        }
    }


}


