package views;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import Models.Cliente;
import Models.Orcamento;
import Models.Projeto;
import Models.Modulo;
import Models.Endereco;
import services.Personalizacao;
import services.Relatorio;

public class interfaceGerenciamento {
    public void executar() throws ParseException  {
        interfaceExibição main = new interfaceExibição();
        interfaceInfo menu = new interfaceInfo();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            menu.exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado

            switch (opcao) {
                case 1:
                    // Adicionar Projeto
                    if (main.Cliente.isEmpty()) {
                        System.out.println("Nenhum cliente cadastrado. Adicione um cliente primeiro.\n");
                        break;
                    }

                    // Selecionar um cliente existente
                    System.out.println("Selecione um cliente:");

                    for (int i = 0; i < main.Cliente.size(); i++) {
                        Cliente cliente = main.Cliente.get(i);
                        System.out.println((i + 1) + ". " + cliente.getNome());
                    }

                    int clienteIndex = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer do teclado

                    Cliente clienteSelecionado = main.Cliente.get(clienteIndex - 1);

                    // Criar objetos para o relatório
                    System.out.println("Informe os dados do projeto:");
                    System.out.print("Descrição do Projeto: ");
                    String projetoDescricao = scanner.nextLine();



                    System.out.println("Informe os dados do orçamento:");
                    System.out.print("Custo de Materiais: R$");
                    double custoMateriais = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer do teclado
                    System.out.print("Custo de Mão de Obra: R$");
                    double custoMaoDeObra = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer do teclado

                    Orcamento orcamento = new Orcamento(custoMateriais, custoMaoDeObra);



                    System.out.println("Informe os detalhes do modulo:");
                    System.out.print("Nome do modulo: ");
                    String Nome = scanner.nextLine();
                    System.out.print("Tipo do modulo: ");
                    String Tipo = scanner.nextLine();
                    Modulo modulo = new Modulo(Nome, Tipo);

                    System.out.println("Quantas personalizações vão ser feitas?");
                    int valor = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer do teclado
                    for(int i =0;i<valor;i++) {
                        System.out.println("Informe os dados da personalização:");
                        System.out.print("Detalhes da Personalização: ");
                        ArrayList<Personalizacao> personalizacoes = new ArrayList<>();
                        Personalizacao personalizacao1 = new Personalizacao(scanner.nextLine());
                        personalizacoes.add(personalizacao1);
                        modulo.adicionarPersonalizacao(personalizacao1);
                    }



                    // Criar o projeto

                    Projeto projeto = new Projeto(projetoDescricao, clienteSelecionado, orcamento, modulo);



                    // Adicionar o relatório à lista
                    Relatorio relatorio1 = new Relatorio(projeto);
                    main.adicionarRelatorio(relatorio1);


                    System.out.println("Relatório adicionado com sucesso.\n");
                    break;
                case 2:
                    // Criar objeto de Relatorio e exibir todas as informações
                    main.exibirRelatorios();
                    break;

                case 3:

                    // Adicionar Cliente
                    System.out.print("Nome do Cliente: ");
                    String nomeCliente = scanner.nextLine();
                    System.out.print("Contato do Cliente: ");
                    String contatoCliente = scanner.nextLine();
                    System.out.print("CPF do Cliente: ");
                    String cpf = scanner.nextLine();
                    scanner.nextLine(); // Limpar o buffer do teclado

                    System.out.println("Informe os dados do endereço:");
                    System.out.print("Rua: ");
                    String rua = scanner.nextLine();
                    System.out.print("Bairro: ");
                    String Bairro = scanner.nextLine();
                    System.out.print("Cidade: ");
                    String cidade = scanner.nextLine();
                    System.out.print("CEP: ");
                    String cep = scanner.nextLine();
                    System.out.print("Numero: ");
                    int numero = scanner.nextInt();

                    Endereco endereco = new Endereco(rua, Bairro, cidade, cep, numero);

                    Cliente novoCliente = new Cliente(nomeCliente, contatoCliente,cpf);

                    novoCliente.setEndereco(endereco);

                    main.adicionarCliente(novoCliente);




                    System.out.println("Cliente adicionado com sucesso.\n");
                    break;
                case 0:
                    // Sair
                    System.out.println("Encerrando o programa...");
                    break;
                case 4:
                System.out.println();
                default:
                    System.out.println("Opção inválida!\n");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
