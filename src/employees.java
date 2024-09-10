import java.time.LocalDate;

/* A classe funcionarios herda todos os atributos e métodos da classe pessoa; */

public class employees extends person{
    private int idFuncionario;
    private String Cargo;
    private LocalDate dataDeAdmissao;
    private float salario;

    /* A classe funcionarios adiciona atributos e métodos específicos para funcionários,
    como ID do funcionário, cargo, data de admissão e salário; */

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public LocalDate getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public void setDataDeAdmissao(LocalDate dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public employees(String primeiroNome, String segundoNome, String email, String telefone, Character genero, LocalDate dataDeNascimento, address Endereco, int idFuncionario, String Cargo, LocalDate dataDeAdmissao, float salario){
        super(primeiroNome, segundoNome, email, telefone, genero, dataDeNascimento, Endereco);
        this.idFuncionario = idFuncionario;
        this.Cargo = Cargo;
        this.dataDeAdmissao = dataDeAdmissao;
        this.salario = salario;
    }

    /* O método abaixo pode foi sobrescrito para apresentar informações específicas. */

    @Override
    public void exibirInformacoes(){
        System.out.println("Id do Funcionario " + idFuncionario );
        System.out.println("Primeiro Nome: " + primeiroNome );
        System.out.println("Segundo Nome: " + segundoNome );
        System.out.println("Cargo: " + Cargo );
        System.out.println("Admissão: " + dataDeAdmissao );
        System.out.println("Sálario: R$" + salario );
        System.out.println("email: " + email );
        System.out.println("Telefone: " + telefone );
        System.out.println("Gênero: " + genero );
        System.out.println("Data de Nascimento: " + dataDeNascimento );
        Endereco.exibirEndereco();
    }





}
