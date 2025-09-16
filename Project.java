import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Project {
    //atributos
    private String titulo = "";
    private String modalidad = "";
    private String nomEstudiante1 = "";
    private String nomEstudiante2 = "";
    private Date fechaCreacion = new Date();
    private String director = "";
    private String codirector1 = "";
    private String codirector2 = "";
    private String objetivoGeneral = "";
    private List<String> objetivosEspecificos = new ArrayList<>();
    //setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }
    public void setNomEstudiante1(String nomEstudiante1) {
        this.nomEstudiante1 = nomEstudiante1;
    }
    public void setNomEstudiante2(String nomEstudiante2) {
        this.nomEstudiante2 = nomEstudiante2;
    }
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setCodirector1(String codirector1) {
        this.codirector1 = codirector1;
    }
    public void setCodirector2(String codirector2) {
        this.codirector2 = codirector2;
    }
    public void setObjetivoGeneral(String objetivoGeneral) {
        this.objetivoGeneral = objetivoGeneral;
    }
    public void setObjetivosEspecificos(String newObjetivosEspecificos) {
        if(objetivosEspecificos.size()< 4){
            this.objetivosEspecificos.add(newObjetivosEspecificos);
        }else{
            System.out.println("No se pueden agregar mas de cuatros objetivos especificos");
        }
        
    }
    @Override
    public String toString() {
        return "Proyecto: " + titulo + "\n" +
               "Modalidad: " + modalidad + "\n" +
               "Estudiante 1: " + nomEstudiante1 + "\n" +
               "Estudiante 2: " + nomEstudiante2 + "\n" +
               "Fecha: " + fechaCreacion + "\n" +
               "Director: " + director + "\n" +
               "Codirector1: " + codirector1 + "\n" +
               "Codirector2: " + codirector2 + "\n" +
               "Objetivo General: " + objetivoGeneral + "\n" +
               "Objetivos Específicos: " + objetivosEspecificos + "\n";
    }
}
