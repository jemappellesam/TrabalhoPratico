package services;

import Models.*;

public class Relatorio {
    private Projeto projeto;


    public Relatorio(Projeto projeto) {
        this.projeto = projeto;
    }

    @Override
    public String toString() {
        StringBuilder relatorio = new StringBuilder();

        relatorio.append("Relatório do Projeto\n");
        relatorio.append("ID do Projeto: ").append(projeto.getId()).append("\n");
        relatorio.append("Descrição: ").append(projeto.getDescricao()).append("\n\n");

        relatorio.append("Informações do Cliente:\n");
        relatorio.append(projeto.getCliente().toString()).append("\n\n");

        relatorio.append("Informações do Orçamento:\n");
        relatorio.append(projeto.getOrcamento().toString()).append("\n\n");

        relatorio.append("Informações dos Módulos:\n");
        for (Modulo modulo : projeto.getModulos()) {
            relatorio.append(modulo.toString()).append("\n");

            relatorio.append("Personalizações do Módulo:\n");
            for (Personalizacao personalizacao : modulo.getPersonalizacoes()) {
                relatorio.append("Personalização: ").append(personalizacao.getDetalhes()).append("\n");
            }

            relatorio.append("\n");
        }

        return relatorio.toString();
    }
}