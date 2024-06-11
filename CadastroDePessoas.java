import java.util.ArrayList;
import java.util.List;

public class CadastroDePessoas {
    private List<Pessoa> pessoas;

    public CadastroDePessoas() {
        this.pessoas = new ArrayList<>();
    }

    // Método para adicionar uma pessoa
    public void adicionarPessoa(Pessoa pessoa) {
        this.pessoas.add(pessoa);
        System.out.println("Pessoa adicionada: " + pessoa);
    }

    public static void main(String[] args) {
        CadastroDePessoas cadastro = new CadastroDePessoas();

        // Adicionando pessoas
        cadastro.adicionarPessoa(new Pessoa("João", 30));
        cadastro.adicionarPessoa(new Pessoa("Maria", 25));
        cadastro.adicionarPessoa(new Pessoa("José", 40));
    }

    private static class Pessoa {

        public Pessoa(String maria, int i) {
        }

        private Object getNome() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        private void setIdade(int novaIdade) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        private void setNome(String novoNome) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}
