package clases;

public class pronosticosP {
    private int fecha;
    private int numeroPartido;
    private String pronostico1;

    public pronosticosP(int fecha, int numeroPartido, String pronostico1){
        setFecha(fecha);
        setNumeroPartido(numeroPartido);
        setPronostico1(pronostico1);
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
    public int getFecha() {
        return fecha;
    }

    public void setNumeroPartido(int numeroPartido) {
        this.numeroPartido = numeroPartido;
    }

    public int getNumeroPartido() {
        return numeroPartido;
    }

    public void setPronostico1(String pronostico) {
        this.pronostico1 = pronostico1;
    }

    public String getPronostico() {
        return pronostico1;
    }
}
