package desafioProgramacao;

public class Registro {
    //Atributos
    private String nomeAnuncio;
    private String nomeCliente;
    private int dataInicio;
    private int dataFim;
    private double quantInvestimento;

    //Métodos
    public Registro (String nome, String nome1, int data, int data1, double inv){
        this.nomeAnuncio = nome;
        this.nomeCliente = nome1;
        this.dataInicio = data;
        this.dataFim = data1;
        this.quantInvestimento = inv;
    }
}