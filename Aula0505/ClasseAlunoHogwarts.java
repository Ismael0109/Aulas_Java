import util.Teclado;

public class ClasseAlunoHogwarts {
    
    //Atributos
    String Casa;
    String Aluno;
    int NumAdvertencias;
    boolean MatriculaAtiva;
    String Matricula;
    String Patrono;

    //Construtores
    ClasseAlunoHogwarts(String Casa, String Aluno, int NumAdvertencias, boolean MatriculaAtiva, String Matricula, String Patrono){
        this.Aluno = Aluno;
        this.Casa = Casa;
        this.Matricula = Matricula;
        this.MatriculaAtiva = true;
        this.NumAdvertencias = NumAdvertencias;
        this.Patrono = Patrono;

    }

    //Métodos
    void VerificacaoDeMatricula(){
        String opcao;
        do{
            opcao = Teclado.lerTexto("A Matrícula do Aluno está Ativa? (S / N)");
            switch (opcao) {
                case "S":
                MatriculaAtiva = true;
                System.out.println("Ok! Registramos sua Resposta");
                break;
                case "s":
                    MatriculaAtiva = true;
                    System.out.println("Ok! Registramos sua Resposta");
                    break;
                case "n":
                    MatriculaAtiva = false;
                    System.out.println("Ok! Registramos sua Resposta");
                    break;
                case "N":
                    MatriculaAtiva = false;
                    System.out.println("Ok! Registramos sua Resposta");
                    break;
        
                default:
                    System.out.println("Digite uma Opção Válida!");
                    break;
            }
        }while ((!(opcao.equalsIgnoreCase("s"))) && (!(opcao.equalsIgnoreCase("n"))) );
    }

    void Detalhar(){
        System.out.println("Aluno(a) -> " + Aluno);
        System.out.println("Matricula -> " + Matricula);
        System.out.println("Casa de Hogwarts -> " + Casa);
        System.out.println("Patrono -> " + Patrono);
        System.out.println("Número de Advertências -> " + NumAdvertencias);
        if (MatriculaAtiva == true) {
        System.out.println("A Matrícula está Ativa? -> SIM");
            
        } else{
        System.out.println("A Matrícula está Ativa? -> NÃO");
        }
    }
}
