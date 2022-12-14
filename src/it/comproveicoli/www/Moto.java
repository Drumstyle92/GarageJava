package it.comproveicoli.www;

/**
 * classe moto che estende classe generica veicolo a motore
 */
public class Moto extends VeicoloAMotore{

     /**
     *
     */
    private int tempi;

    /**
     *
     * @param marca
     * @param anno
     * @param cilindrata
     * @param tempi
     */
    public Moto(String marca, int anno, int cilindrata, int tempi){
        super(marca, anno, cilindrata);
        setTempi(tempi);
    }

    /**
     *
     * @return tempi
     */
    public  int getTempi(){
        return this.tempi;
    }

    /**
     *
     * @param tempi
     */
   public void setTempi(int tempi){
       this.tempi= tempi;
   }

    /**
     *
     * @return info moto
     */
    @Override
    public String info() {
        String tipoVeicolo= "Moto";
        return "\n======================\n"+"Veicolo: " + super.info() + "\nA " + getTempi() + " Tempi";
    }
}
