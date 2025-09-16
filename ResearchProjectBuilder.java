import java.util.Date;

/** ConcreteBuilder */
class ResearchProjectBuilder extends ProjectBuilder{

    @Override
    public void buildTitulo() {
        project.setTitulo("Proyecto de Investigación en Sistemas");
    }
    @Override
    public void buildModalidad() {
        project.setModalidad("Investigación");
    }
    @Override
    public void buildEstudiante1() {
        project.setNomEstudiante1("Estudiante A");
    }
    @Override
    public void buildEstudiante2() {
        project.setNomEstudiante2("Estudiante B"); // solo aplica en investigación
    }
    @Override
    public void buildFechaCreacion() {
        project.setFechaCreacion(new Date());
    }
    @Override
    public void buildDirector() {
        project.setDirector("Dr. Juan Pérez");
    }
    @Override
    public void buildCodirector1() {
        project.setCodirector1("Codirector 1 opcional");
    }
    @Override
    public void buildCodirector2() {
        // opcional, se puede dejar vacío
    }
    @Override
    public void buildObjetivoGeneral() {
        project.setObjetivoGeneral("Desarrollar un sistema para apoyar la investigación.");
    }
    @Override
    public void buildObjetivosEspecificos() {
        project.setObjetivosEspecificos("Analizar el problema");
        project.setObjetivosEspecificos("Diseñar la solución");
        project.setObjetivosEspecificos("Implementar prototipo");
        project.setObjetivosEspecificos("Validar resultados");
    }
}
