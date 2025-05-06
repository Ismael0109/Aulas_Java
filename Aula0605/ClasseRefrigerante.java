public class ClasseRefrigerante {

    /*
     * 1. Máquina de Refrigerante
 
        Descrição: Crie a classe Refrigerante com os atributos marca, sabor e volume (em ml).
        Objetivo: Usar sobrecarga de construtores:
	    •	Um construtor completo.
	    •	Um construtor só com marca e sabor (volume padrão: 350 ml).
	    •	Um construtor vazio que define valores genéricos.
 
        Desafio Extra: Crie um método exibirInfo() que imprime as informações da lata de refrigerante.
     */
    //Atributos
    String Marca;
    String Sabor;
    double Volume;

    //Construtor
    ClasseRefrigerante(String Marca, String Sabor, double Volume)
    {
        this.Marca = Marca;
        this.Sabor = Sabor;
        this.Volume = Volume;

    }

    public ClasseRefrigerante(String Marca, String Sabor){
        this(Marca, Sabor, 350);
    }
    public ClasseRefrigerante(){
        this("Fanta", "Guaraná", 2000);
    }
}
