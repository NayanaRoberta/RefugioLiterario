import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Loan { //criação da classe Empréstimo
    private int loan_id;
    private Date date_loan;
    private Date date_delivery;
    private Date devolution;
    private float total_amount;
    private int customer_id;
    private int id_book;

    public Loan(int loan_id, float total_amount, int customer_id, int id_book){ //método construtor da classe;
        this.loan_id = loan_id;
        this.date_loan = new Date(); //inicializa a variável date_loan com a data atual;
        this.date_delivery = date_loan; //inicializa com a data atual para receber outra mais à frente;
        this.total_amount = total_amount;
        this.customer_id = customer_id;
        this.id_book = id_book;
        dateDelivery(); //chama a função que definirá a data de entrega prevista;
    }
    //Função para calcular a data prevista de entrega
    public void dateDelivery(){
        Date delivery = new Date(this.date_loan.getTime()); //cria uma data em milissegundos;
        delivery.setDate(delivery.getDate() + 7); //incrementa 7 dias à data atual;
        this.date_delivery = delivery; //atualiza o valor da variável date_delivery;
    }

    public void receipt(){ //função para imprimir o recibo do livro no momento do empréstimo, implantá-la como uma função é mais simples do que criar uma nova classe; 
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //define o formato da data;
        System.out.println("Recibo: ");
        System.out.println(" ");
        System.out.print("Código do livro: "+ this.id_book);
        System.out.println(" ");
        System.out.print("Código do cliente: "+ this.customer_id);
        System.out.println(" ");
        System.out.print("Data prevista para entrega: "+ sdf.format(this.date_delivery)); //imprime a data no formato definido anteriormente;
        System.out.println(" ");
        System.out.print("Valor total do empréstimo: "+ this.total_amount);
        System.out.println(" ");
    }
    public Date devolucao(Date devolution, int customer_id, int id_book){ //função para devolução do livro;
        this.devolution = devolution;
        long atrasoEmMilissegundos = this.devolution.getTime() - this.date_delivery.getTime(); //compara a data de devolução com a data prevista de entrega para verificar se houve atraso;
        long diasAtrasados = TimeUnit.MILLISECONDS.toDays(atrasoEmMilissegundos); //converte a data de milissegundos para dias;
        if (diasAtrasados <= 0){ //se não houve atraso, faça: 
            System.out.println("__________________");
            System.out.println("Código do livro devolvido: " +this.id_book);
            System.out.print("Código do cliente: "+ this.customer_id);
            System.out.print("Parabéns! Sem multa por atraso!");
        }else{ //se houve atraso, faça:
            float multa = diasAtrasados * 0.70f; //define a muta de 70 centavos por dia de atraso;
            System.out.println("__________________");
            System.out.println("Código do livro devolvido: " +this.id_book);
            System.out.print("Código do cliente: "+ this.customer_id);
            System.out.println(" ");
            System.out.print("Multa por atraso: "+ multa);
        }
        return this.devolution; //retorno da função.
    }
}
