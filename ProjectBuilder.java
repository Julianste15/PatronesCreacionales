/** Abstract Builder */
abstract class ProjectBuilder {
   protected Project project;
   
   public Project getProyecto() {
      return project;
   }
   
   public void crearNuevoProyecto() {
      project= new Project();
   }
   
   public abstract void buildTitulo();
   public abstract void buildModalidad();
   public abstract void buildEstudiante1();
   public abstract void buildEstudiante2();
   public abstract void buildFechaCreacion();
   public abstract void buildDirector();
   public abstract void buildCodirector1();
   public abstract void buildCodirector2();
   public abstract void buildObjetivoGeneral();
   public abstract void buildObjetivosEspecificos();
}