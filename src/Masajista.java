public class Masajista extends SeleccionFutbol {
    private String titulacion;
    private int añosexperiencia;
    public void darMasaxe(){

    }

    public Masajista() {
    }

    public Masajista(String titulacion, int añosexperiencia) {
        this.titulacion = titulacion;
        this.añosexperiencia = añosexperiencia;
    }

    public Masajista(String titulacion, int añosexperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.añosexperiencia = añosexperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAñosexperiencia() {
        return añosexperiencia;
    }

    public void setAñosexperiencia(int añosexperiencia) {
        this.añosexperiencia = añosexperiencia;
    }

    @Override
    public String toString() {
        return "Masajista{" + "titulacion=" + titulacion + ", añosexperiencia=" + añosexperiencia + '}';
    }

}
