package it.comproveicoli.www;

/**
 * classe furgone che estende classe generica veicolo a motore
 */
public class Furgone extends VeicoloAMotore {
    /**
     *
     */
    private int capacita;

    /**
     *
     * @param marca
     * @param anno
     * @param cilindrata
     * @param capacita
     */
    public Furgone(String marca, int anno, int cilindrata, int capacita) {
        super(marca, anno, cilindrata);
        setCapacita(capacita);
    }

    /**
     *
     * @return capacita
     */
    public int getCapacita() {
        return this.capacita;
    }

    /**
     *
     * @param capacita
     */
    public void setCapacita(int capacita) {
        this.capacita = capacita;
    }


    /**
     *
     * @return info furgone
     */
    @Override
    public String info() {
        String tipo = "Furgone";
        return "\n======================\n"+"Veicolo: "+ tipo + super.info() + "\nCapacità: " + getCapacita() + " Kg";
    }
}

