public class Automobile {

    private String marca;

    private String modello;

    private String cilindrata;

    private String targa;

    public Automobile(String marca, String modello, String cilindrata, String targa) {
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.targa = targa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public String getCilindrata() {
        return cilindrata;
    }

    public String getTarga() {
        return targa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setCilindrata(String cilindrata) {
        this.cilindrata = cilindrata;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    @Override
    public String toString() {
        return "Automobile: " +
                "marca= " + marca +
                ", modello= " + modello +
                ", cilindrata= " + cilindrata +
                ", targa= " + targa;
    }
}