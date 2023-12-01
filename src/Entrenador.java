public class Entrenador extends SeleccionFutbol {
    private String idFederacion;

    public void dirigirPartido(){
    }
    public void dirigirEntrenamiento(){
    }
    public Entrenador() {
    }
    public Entrenador(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    public Entrenador(String idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }
    public String getidFederacion() {
        return idFederacion;
    }
    public void setidFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    @Override
    public String toString() {
        return "Entrenador: "+super.toString() + ", idFederacion=" + idFederacion;
    }
}
