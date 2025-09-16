import java.util.Date;

class Project {

    private String titulo = "";
    private String modalidad = "";
    private String nomEstudiante1 = "";
    private String nomEstudiante2 = "";
    private Date fechaCreacion = new Date();
    private String director = "";
    private String codirector1 = "";
    private String codirector2 = "";
    private String objetivoGeneral = "";
    private String objetivosEspecificos = "";

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
    public void setObjetivosEspecificos(String objetivosEspecificos) {
        this.objetivosEspecificos = objetivosEspecificos;
    }
    @Override
    public String toString() {
        return "project [titulo=" + titulo + ", modalidad=" + modalidad + ", nomEstudiante1=" + nomEstudiante1
                + ", nomEstudiante2=" + nomEstudiante2 + ", fechaCreacion=" + fechaCreacion + ", director=" + director
                + ", codirector1=" + codirector1 + ", codirector2=" + codirector2 + ", objetivoGeneral="
                + objetivoGeneral + ", objetivosEspecificos=" + objetivosEspecificos + "]";
    }
}
