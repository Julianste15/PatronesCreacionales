public class ClienteMain {
    public static void main(String[] args){
        ProjectDirector projectDirector = new ProjectDirector();
        ProjectBuilder resProjectBuilder = new ResearchProjectBuilder();
        projectDirector.setProjectBuilder(resProjectBuilder);
        projectDirector.construirProyecto();

        
    }
}
