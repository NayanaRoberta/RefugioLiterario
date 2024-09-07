import java.text.NumberFormat;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Loan {
    private int loan_id;
    private Date date_loan;
    private Date date_delivery;
    private Date devolution;
    private float total_amount;
    private int customer_id;
    private int id_book;

    public Loan(int loan_id, float total_amount, int customer_id, int id_book){
        this.loan_id = loan_id;
        this.date_loan = new Date();
        this.date_delivery = date_loan;
        this.total_amount = total_amount;
        this.customer_id = customer_id;
        this.id_book = id_book;
        dateDelivery();
    }
    //Função para calcular a data prevista de entrega
    public void dateDelivery(){
        Date delivery = new Date(this.date_loan.getTime());
        delivery.setDate(delivery.getDate() + 7);
        this.date_delivery = delivery;
    }

    public void receipt(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Recibo: ");
        System.out.println(" ");
        System.out.print("Código do livro: "+ this.id_book);
        System.out.println(" ");
        System.out.print("Código do cliente: "+ this.customer_id);
        System.out.println(" ");
        System.out.print("Data prevista para entrega: "+ sdf.format(this.date_delivery));
        System.out.println(" ");
        System.out.print("Valor total do empréstimo: "+ this.total_amount);
        System.out.println(" ");
    }
    public Date devolucao(Date devolution){
        this.devolution = devolution;
        long atrasoEmMilissegundos = this.devolution.getTime() - this.date_delivery.getTime();
        long diasAtrasados = TimeUnit.MILLISECONDS.toDays(atrasoEmMilissegundos);
        if (diasAtrasados <= 0){
            System.out.println("__________________");
            System.out.println("Código do livro devolvido: " +this.id_book);
            System.out.print("Código do cliente: "+ this.customer_id);

            System.out.print("Parabéns! Sem multa por atraso!");
        }else{
            float multa = diasAtrasados * 0.70f;
            System.out.println("__________________");
            System.out.println("Código do livro devolvido: " +this.id_book);
            System.out.print("Código do cliente: "+ this.customer_id);
            System.out.println(" ");
            System.out.print("Multa por atraso: "+ multa);
        }
        return this.devolution;
    }
}
