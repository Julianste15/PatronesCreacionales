class ProjectDirector {
    private ProjectBuilder projectBuilder;

    public void setProjectBuilder(ProjectBuilder pb){
        projectBuilder=pb;
    }

    public Project getProject(){
        return projectBuilder.getProyecto();
    }

    public void construirProyecto(){
        projectBuilder.buildTitulo();
        projectBuilder.buildObjetivoGeneral();
        projectBuilder.buildObjetivosEspecificos();
        projectBuilder.buildCodirector1();
        projectBuilder.buildCodirector2();
        projectBuilder.buildDirector();
        projectBuilder.buildEstudiante1();
        projectBuilder.buildEstudiante2();
        projectBuilder.buildFechaCreacion();
        projectBuilder.buildModalidad();
    }
}
