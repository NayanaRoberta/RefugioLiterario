import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class customers extends person {
    private int matricula;
    private List<loan> historicoEmprestimos;

    public customers(String primeiroNome, String segundoNome, String email, String telefone, Character genero, LocalDate dataDeNascimento, address Endereco, int matricula) {
        super(primeiroNome, segundoNome, email, telefone, genero, dataDeNascimento, Endereco);
        this.matricula = matricula;
        this.historicoEmprestimos = new ArrayList<>();
    }

    // Adiciona um novo empréstimo ao histórico
    public void adicionarEmprestimo(loan emprestimo) {
        historicoEmprestimos.add(emprestimo);
    }

    // Remover um empréstimo do histórico baseado no ID do empréstimo
    public void removerEmprestimo(int idEmprestimo) {
        // lógica para encontrar e remover o empréstimo com o ID especifica com uso do loop para percorrer a lista)
        for (int i = 0; i < historicoEmprestimos.size(); i++) {
            if (historicoEmprestimos.get(i).getId() == idEmprestimo) {
                historicoEmprestimos.remove(i);
                break;
            }
        }
    }

    // Obter o histórico de empréstimos
    public List<loan> getHistoricoEmprestimos() {
        return historicoEmprestimos;
    }
}