import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Loan loan = new Loan(1, 50.00f,1, 2345);
        String returnDate = "20/09/2024";
        Date date = sdf.parse(returnDate);
        loan.dateDelivery();
        loan.receipt();
        loan.devolucao(date);
    }

}