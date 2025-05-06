public class ClasseLivro {

    //Atributos
    String Titulo;
    String Autor;
    int NumPaginas;

    ClasseLivro (String Titulo, String Autor, int NumPaginas){
        this.Autor = Autor;
        this.Titulo = Titulo;
        this.NumPaginas = NumPaginas;
    }

    public ClasseLivro (String Titulo, String Autor){
        this(Titulo, Autor, 100);
    }

    public ClasseLivro (String Titulo){
        this(Titulo, "Desconhecido", 50);
    }


    public void resumir(){
        System.out.println("Livro");
        System.out.println("Título -> " + Titulo);
        System.out.println("Autor -> " + Autor);
        System.out.println("Nº de Páginas -> " + NumPaginas);
    }
    
}
