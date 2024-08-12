public class App {
    public static void main(String[] args) throws Exception {
        Eventos artes, jogos, historia;

        artes = new Eventos();
        artes.evNome = "Evento de Artes";
        artes.evData = "25/08/2023";
        artes.evLocal = "IBMEC Barra";
        artes.maxNum = 200;
        artes.info = "O evento de artes mostrará artes de diversas partes do mundo";

        jogos = new Eventos();
        jogos.evNome = "Evento de Jogos";
        jogos.evData = "26/08/2023";
        jogos.evLocal = "IBMEC Centro";
        jogos.maxNum = 200;
        jogos.info = "O evento de jogos será uma exposição de jogos criados por alunos";

        historia = new Eventos();
        historia.evNome = "Evento de história";
        historia.evData = "27/08/2023";
        historia.evLocal = "Ibmec Barra";
        historia.maxNum = 200;
        historia.info = "O evento de história mostrará acontecimentos importantes do passado";
    
    }
}
