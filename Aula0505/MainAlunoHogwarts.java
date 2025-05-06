import java.lang.classfile.attribute.StackMapFrameInfo.VerificationTypeInfo;

public class MainAlunoHogwarts {
    
    public static void main(String[] args) {
        ClasseAlunoHogwarts Chamar = new ClasseAlunoHogwarts("Corvinal", "Luna Lovegood", 0, true, "4840", "Castor");
        
        Chamar.VerificacaoDeMatricula();
        System.out.println();
        System.out.println();

        Chamar.Detalhar();
    }
}
