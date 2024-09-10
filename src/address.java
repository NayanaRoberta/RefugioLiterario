public class address {
    public String CEP;
    public String Rua;
    public int Numero;
    public String Bairro;
    public String Cidade;
    public String Estado;

    public address(String CEP, String Rua, int Numero, String Bairro, String Cidade, String Estado) {

        
        if (CEP.length() != 8 || !CEP.matches("\\d+")) {
            throw new IllegalArgumentException(" O CEP deve conter 9 dígitos. Exemplo: 10101101");
        }

        this.CEP = CEP;
        this.Rua = Rua;
        this.Numero = Numero;
        this.Bairro = Bairro;
        this.Cidade = Cidade;
        this.Estado = Estado;
    }

    public void exibirEndereco() {
            System.out.println("Rua " + Rua + ", " + Numero + " - " + Bairro + " (" + Cidade + "/" + Estado + ")");
    }
}