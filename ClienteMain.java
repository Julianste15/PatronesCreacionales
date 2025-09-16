public class ClienteMain {
    public static void main(String[] args){
        ProjectDirector projectDirector = new ProjectDirector();
        //Proyecto de Investigación
        ProjectBuilder resProjectBuilder = new ResearchProjectBuilder();
        projectDirector.setProjectBuilder(resProjectBuilder);
        projectDirector.construirProyecto();
        Project researchProject = projectDirector.getProject();
        System.out.println("=== Proyecto de Investigación ===");
        System.out.println(researchProject);
        //Proyecto de Práctica Profesional
        ProjectBuilder profProjectBuilder = new ProfessionProjectBuilder();
        projectDirector.setProjectBuilder(profProjectBuilder);
        projectDirector.construirProyecto();
        Project professionProject = projectDirector.getProject();
        System.out.println("=== Proyecto de Práctica Profesional ===");
        System.out.println(professionProject);
        //Proyecto de Plan Coterminal
        ProjectBuilder cotermProjectBuilder = new CoterminalPlanProjectBuilder();
        projectDirector.setProjectBuilder(cotermProjectBuilder);
        projectDirector.construirProyecto();
        Project coterminalProject = projectDirector.getProject();
        System.out.println("=== Proyecto Plan Coterminal ===");
        System.out.println(coterminalProject);
    }
}
