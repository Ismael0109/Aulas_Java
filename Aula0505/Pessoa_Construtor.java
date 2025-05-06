public class Pessoa_Construtor {
    
    //Atributos
    String Nome;
    int Idade;
    double Altura;

    //Criando Construtores
    Pessoa_Construtor(String Nome, int Idade, double Altura){
        this.Nome = Nome;
        this.Idade = Idade;
        this.Altura = Altura;
    }

    //Métodos
    void Mostrar(){
        System.out.println("Olá " + Nome);
        System.out.println("Idade " + Idade + " anos");
        System.out.println("Altura -> " + Altura + "m");
    }
}
