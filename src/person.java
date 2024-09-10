import java.time.LocalDate;

/* A classe Pessoa é uma  base para  as  classes funcionarios e clientes.
 Ela encapsula as informações comuns entre todas as pessoas,
 como nome, email, telefone, gênero, data de nascimento e endereço. */

public class person {
    protected String primeiroNome;
    protected String segundoNome;
    protected String email;
    protected String telefone;
    protected Character genero;
    protected LocalDate dataDeNascimento;
    protected address Endereco; // Representa o endereço da pessoa.

    /* Os atributos são declarados como protected para serem acessados e
    alterados pelas classes filhas Cliente e Funcionário. */

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;

    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Character getGenero() {
        return genero;
    }

    public void setGenero(Character genero) {
        this.genero = genero;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public address getEndereco() {
        return Endereco;
    }

    public void setEndereco(address endereco) {
        Endereco = endereco;
    }

    /* get e set é usado  para acessar e alterar
    os atributos de forma controlada, encapsulando todo o funcionamento interno. */

    public person(String primeiroNome, String segundoNome, String email, String telefone, Character genero, LocalDate dataDeNascimento, address Endereco){
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.email = email;
        this.telefone = telefone;
        this.genero = genero;
        this.dataDeNascimento = dataDeNascimento;
        this.Endereco = Endereco;
    }

    /* O construtor inicializa os atributos e garante que um objeto
    Pessoa seja criado com todas as informações necessárias.*/

    public void exibirInformacoes(){
        System.out.println("Primeiro Nome: " + primeiroNome );
        System.out.println("Segundo Nome: " + segundoNome );
        System.out.println("email: " + email );
        System.out.println("Telefone: " + telefone );
        System.out.println("Gênero: " + genero );
        System.out.println("Data de Nascimento: " + dataDeNascimento );
        Endereco.exibirEndereco();
    }


}
