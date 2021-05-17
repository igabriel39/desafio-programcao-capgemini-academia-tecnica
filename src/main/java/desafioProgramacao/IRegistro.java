package desafioProgramacao;

public interface IRegistro <T>{
    void Registrar(T objeto);
    int BuscaNome(String nome);
    int BuscaData(int data, int data1);
}