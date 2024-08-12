public class Candidatos {
    String alNome, matricula, curso;
    int idade;

    Candidatos() {
        this.alNome = "...";
    }

    Candidatos(String alNome, String matricula, String curso, int idade) {
        this.alNome = alNome;
        this.matricula = matricula;
        this.curso = curso;
        this.idade = idade;


    }

    void mudarAluno(String novoAlNome, String novaMatricula, String novoCurso, int novaIdade) {
        this.alNome = novoAlNome;
        this.matricula = novaMatricula;
        this.curso = novoCurso;
        this.idade = novaIdade;
    }
    
    
}
