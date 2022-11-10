package it.comproveicoli.www;

import java.util.Arrays;
import java.util.List;

/**
 * classe generica veicolo a motore
 */
public class VeicoloAMotore {
    /**
     *
     */
    private String marca;
    /**
     *
     */
    private int anno;
    /**
     *
     */
    private int cilindrata;
    /**
     *
     */
    private final String[] garageArray = new String[15];
    /**
     *
     */
     private final List<String> garage = Arrays.asList(garageArray);

    /**
     *
     */
    public VeicoloAMotore(){}

    /**
     * costruttore
     * @param marca
     * @param anno
     * @param cilindrata
     */
    public VeicoloAMotore(String marca, int anno, int cilindrata) {
        setMarca(marca);
        setAnno(anno);
        setCilindrata(cilindrata);
    }

    /**
     *
     * @return marca
     */
    public String getMarca() {
        return this.marca;
    }

    /**
     *
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *
     * @return anno
     */
    public int getAnno() {
        return this.anno;
    }

    /**
     *
     * @param anno
     */
    public void setAnno(int anno) {
        this.anno = anno;
    }

    /**
     *
     * @return cilindrata
     */
    public int getCilindrata() {
        return this.cilindrata;
    }

    /**
     *
     * @param cilindrata
     */
    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    /**
     *
     * @return garage
     */
    public List<String> getGarage() {
        return this.garage;
    }

    /**
     *
     * @return info veicolo a motore
     */
    public String info() {
        return "\nMarca: " + getMarca() +
                "\nAnno: " + getAnno() +
                "\nCilindrata: " + getCilindrata() + " cc";
    }
}
