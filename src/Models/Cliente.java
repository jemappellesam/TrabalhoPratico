package Models;


    public class Cliente {
        private String nome;
        private String contato;
        private String cpf;
        private Endereco endereco;


        public Cliente(String nome, String contato, String cpf) {
            setNome(nome);
            setContato(contato);
            setCpf(cpf);
        }


        public String getNome() {
            return nome;
        }


        public void setNome(String nome) {
            this.nome = nome;
        }


        public String getContato() {
            return contato;
        }


        public void setContato(String contato) {
            this.contato = contato;
        }


        public void setEndereco(Endereco endereco) {
            this.endereco = endereco;
        }


        public Endereco getEndereco() {
            return endereco;
        }


        public void setCpf(String cpf) {
            this.cpf = cpf;
        }


        public String getCpf() {
            return cpf;
        }

        @Override
        public String toString() {
            return "Nome: " + nome + "\nContato: " + contato + "\nCPF: " + cpf + "\nEndereço:\n" + endereco.toString();
        }
    }

