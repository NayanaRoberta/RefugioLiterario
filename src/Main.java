import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main { //classe para testar o código;
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //define o formato da data;
        Loan loan = new Loan(1, 50.00f,1, 2345); //cria um novo objeto do tipo Loan(Empréstimo);
        loan.dateDelivery();
        loan.receipt();
        loan.devolucao(sdf.parse("20/09/2024")); //chama a função "devolução" passando uma data do tipo string como parâmetro e a converte em milissegundos, para que possa ser utilizada na operação matemática 
        //da função.
    }

}
