public class clsAcople {
    private String nombre;
    private boolean permanente;
    private String uso;

    public clsAcople() {
    }

    public clsAcople(String nombre, boolean permanente, String uso) {
        this.nombre = nombre;
        this.permanente = permanente;
        this.uso = uso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isPermanente() {
        return permanente;
    }

    public void setPermanente(boolean permanente) {
        this.permanente = permanente;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    @Override
    public String toString() {
        return "Acople: " + nombre + " Permanente: " + permanente + " Uso: " + uso;
    }
}
