/** ConcreteBuilder */
import java.util.Date;
class ProfessionProjectBuilder extends ProjectBuilder{
    @Override
    public void buildTitulo() {
        project.setTitulo("Sistema de gestión de inventarios para empresa local");
    }

    @Override
    public void buildModalidad() {
        project.setModalidad("Práctica Profesional");
    }

    @Override
    public void buildEstudiante1() {
        project.setNomEstudiante1("Estudiante C");
    }

    @Override
    public void buildEstudiante2() {
        // No aplica (solo un estudiante permitido)
    }

    @Override
    public void buildFechaCreacion() {
        project.setFechaCreacion(new Date());
    }

    @Override
    public void buildDirector() {
        project.setDirector("Ing. Laura Gómez");
    }

    @Override
    public void buildCodirector1() {
        // Opcional
    }

    @Override
    public void buildCodirector2() {
        // Opcional
    }

    @Override
    public void buildObjetivoGeneral() {
        project.setObjetivoGeneral("Optimizar los procesos de inventario en la empresa.");
    }

    @Override
    public void buildObjetivosEspecificos() {
        project.setObjetivosEspecificos("Levantamiento de requerimientos");
        project.setObjetivosEspecificos("Diseño del sistema");
        project.setObjetivosEspecificos("Implementación de la solución");
    }
}
