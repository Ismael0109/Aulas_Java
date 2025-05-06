import util.Teclado;

public class Exemplo1_Construtores {
    
    public static void main(String[] args) {
        String Nome = Teclado.lerTexto("Digite o Nome");
        int Idade = Teclado.lerInt("Digite a Idade");
        double Altura = Teclado.lerDouble("Digite a Altura");

        Pessoa_Construtor Ver = new Pessoa_Construtor(Nome, Idade, Altura);
        
        
        Ver.Mostrar();
    }
}
