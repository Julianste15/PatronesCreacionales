class ProjectDirector {
    private ProjectBuilder projectBuilder;

    public void setProjectBuilder(ProjectBuilder pb){
        projectBuilder=pb;
    }

    public Project getProject(){
        return projectBuilder.getProyecto();
    }

    public void construirProyecto(){
        projectBuilder.crearNuevoProyecto();
        projectBuilder.buildTitulo();
        projectBuilder.buildObjetivoGeneral();
        projectBuilder.buildObjetivosEspecificos();
        projectBuilder.buildDirector();     // obligatorio
        projectBuilder.buildCodirector1();  // opcional
        projectBuilder.buildCodirector2();  // opcional
        projectBuilder.buildEstudiante1();
        projectBuilder.buildEstudiante2();  // puede ser opcional según modalidad
        projectBuilder.buildFechaCreacion();
        projectBuilder.buildModalidad();
    }
}
