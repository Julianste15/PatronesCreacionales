/** ConcreteBuilder */
import java.util.Date;
class CoterminalPlanProjectBuilder extends ProjectBuilder{
    @Override
    public void buildTitulo() {
        project.setTitulo("Plan Coterminal en Inteligencia Artificial");
    }

    @Override
    public void buildModalidad() {
        project.setModalidad("Plan Coterminal");
    }

    @Override
    public void buildEstudiante1() {
        project.setNomEstudiante1("Estudiante D");
    }

    @Override
    public void buildEstudiante2() {}// No aplica (solo un estudiante permitido)

    @Override
    public void buildFechaCreacion() {
        project.setFechaCreacion(new Date());
    }

    @Override
    public void buildDirector() {
        project.setDirector("Dra. Ana Rodríguez");
    }

    @Override
    public void buildCodirector1() {}// Opcional
    @Override
    public void buildCodirector2() {}// Opcional

    @Override
    public void buildObjetivoGeneral() {
        project.setObjetivoGeneral("Fortalecer competencias avanzadas en Inteligencia Artificial.");
    }
    
    @Override
    public void buildObjetivosEspecificos() {
        project.setObjetivosEspecificos("Estudiar algoritmos de Machine Learning");
        project.setObjetivosEspecificos("Aplicar modelos a casos reales");
        project.setObjetivosEspecificos("Evaluar impacto académico de la propuesta");
    }
}
