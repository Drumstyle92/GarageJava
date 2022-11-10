package it.comproveicoli.www;

/**
 *
 */
public class Auto extends VeicoloAMotore{
    /**
     *
     */
    private int porte;
    /**
     *
     */
    private String alimentazione;

    /**
     *
     * @param marca
     * @param anno
     * @param cilindrata
     * @param porte
     * @param alimentazione
     */
    public Auto(String marca, int anno, int cilindrata, int porte,String alimentazione) {
        super(marca, anno, cilindrata);
        setPorte(porte);
        setAlimentazione(alimentazione);
    }

    /**
     *
     * @return
     */
    public int getPorte() {
        return this.porte;
    }

    /**
     *
     * @param porte
     */
    public void setPorte(int porte) {
        this.porte = porte;
    }

    /**
     *
     * @return
     */
    public String getAlimentazione() {
        return this.alimentazione;
    }
/**
 *
 */
    public void setAlimentazione(String alimentazione) {
        this.alimentazione = alimentazione;
    }

    /**
     *
     * @return
     */
    @Override
    public String info() {
        final String tipoVeicolo = "Auto";
        return "\n======================\n" + "Veicolo: " + tipoVeicolo + super.info() + "\nPorte: " + getPorte() + "\nAlimentazione: " + getAlimentazione();
    }
}
