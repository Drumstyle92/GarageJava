package it.comproveicoli.www;

import java.util.Scanner;

/**
 * @author Drumstyle92 , Jupivter, Christian-Carollo, giuseppesorrentino11290.
 * Classe che contiene il metodo principale del programma.
 */
public class Garage {
    /**
     * @param args Parametro fondamentale del main.
     *
     *
     */
    public static void main(String[] args) {
        //
        VeicoloAMotore veicoloAMotore = new VeicoloAMotore();
        Scanner scanner = new Scanner(System.in);
        int posto = 15
        String scannerWhile;
        //
        do {
            for (int i = 0; i < posto; i++) {
                System.out.println("\nPosto: " + (i) + veicolo.getGarage().get(i));
            }
            //
            System.out.println("Benvenuto nel garage! Registrazione veicolo, dettagli:");
            System.out.println("");
            System.out.println("Marca:");
            String scannerMarca = scanner.nextLine();
            System.out.println("Anno:");
            int scannerAnno = scanner.nextInt();
            System.out.println("Cilindrata:");
            int scannerCilindrata = scanner.nextInt();
            scanner.nextLine();
            System.out.println("nel nostro garage possiamo introdurre solo tre tipi di veicoli:" +
            "\nATTENZIONE *in caso di altri veicoli contattare il numero nel sito www.comproveicoli.it*" +
            "\n(1) furgone " +
            "\n(2) moto" +
            "\n(3) auto" +"\nPremere il numero di riferimento del tipo di veicolo:" );
            int scannerscelta = scanner.nextInt();
            scanner.nextLine();
            switch (scannerscelta) {
                // FURGONE
                case 1 -> {
                    System.out.println("Capacita del carico");
                    int scannerCapacita = scanner.nextInt();
                    scanner.nextLine();
                    Furgone furgone = new Furgone(scannerMarca, scannerAnno, scannerCilindrata, scannerCapacita);
                    String id = furgone.info() ;
                        System.out.println("-Quale posto desiderate? La grandezza del garage è di 15 posti-"+
                                "\nSelezionate il posto:");
                        int scannerPostoGarage = scanner.nextInt();
                        scanner.nextLine();
                        if(veicolo.getGarage().toArray()[scannerPostoGarage] == null){
                            veicolo.getGarage().set(scannerPostoGarage, id );
                        } else if(veicolo.getGarage().toArray()[scannerPostoGarage] != null ){
                            System.out.println("Il posto scelto è occupato"+
                                    "\ncon un piccolo extra possiamo liberare il posto e mettere la tua." +
                                    "\nprendere posto(s)/cambio posto(n)");
                            char scannerPostoOccupato = scanner.next().charAt(0);
                            scanner.nextLine();
                            if(scannerPostoOccupato == 's'){
                                veicolo.getGarage().set(scannerPostoGarage, id );
                                System.out.println("Il veicolo si è parcheggiato nel " + scannerPostoGarage +
                                        " togliendo il veicolo precedente");
                            }else if ( scannerPostoOccupato == 'n'){

                                for (int i = 0; i < veicolo.getGarage().size(); i++) {
                                    if (veicolo.getGarage().toArray()[i] != null) {
                                        System.out.println("\nOccupato " + i);
                                    } else if (veicolo.getGarage().toArray()[i] == null) {
                                        break;
                                    } else {
                                        System.out.println("Ci dispiace ma al momento è tutto occupato, riprovi più tardi");
                                        scanner.close();
                                    }
                                }

                                for (int i = 0; i < veicolo.getGarage().size(); i++) {
                                    if(veicolo.getGarage().toArray()[i] == null){
                                        veicolo.getGarage().set(i,id);
                                        System.out.println("Il posto disponibile è " + i
                                                + " ed è stata parcheggiato il veicolo.");
                                        break;
                                    }
                                }
                            }
                        }
                }
                case 2 -> {
                    System.out.println("è una moto a?");
                    int scannerTempi = scanner.nextInt();
                    scanner.nextLine();
                    Moto moto = new Moto(scannerMarca, scannerAnno, scannerCilindrata, scannerTempi);
                    String id = moto.info();
                        System.out.println("-Quale posto desiderate? La grandezza del garage è di 15 posti-"+
                                "\nSelezionate il posto:");
                    int scannerPostoGarage = scanner.nextInt();
                    scanner.nextLine();
                    if(veicolo.getGarage().toArray()[scannerPostoGarage] == null){
                        veicolo.getGarage().set(scannerPostoGarage, id );
                    } else if(veicolo.getGarage().toArray()[scannerPostoGarage] != null ){
                        System.out.println("Il posto scelto è occupato"+
                                "\ncon un piccolo extra possiamo liberare il posto e mettere la tua." +
                                "\nprendere posto(s)/cambio posto(n)");
                        char scannerPostoOccupato = scanner.next().charAt(0);
                        scanner.nextLine();
                        if(scannerPostoOccupato == 's'){
                            veicolo.getGarage().set(scannerPostoGarage, id );
                            System.out.println("Il veicolo si è parcheggiato nel " + scannerPostoGarage +
                                    " togliendo il veicolo precedente");
                        }else if ( scannerPostoOccupato == 'n'){

                            for (int i = 0; i < veicolo.getGarage().size(); i++) {
                                if (veicolo.getGarage().toArray()[i] != null) {
                                    System.out.println("\nOccupato" + i);
                                } else if (veicolo.getGarage().toArray()[i] == null) {
                                    break;
                                } else {
                                    System.out.println("Ci dispiace ma al momento è tutto occupato, riprovi più tardi");
                                    scanner.close();
                                }
                            }

                            for (int i = 0; i < veicolo.getGarage().size(); i++) {
                                if(veicolo.getGarage().toArray()[i] == null){
                                    veicolo.getGarage().set(i,id);
                                    System.out.println("Il posto disponibile è " + i
                                            + " ed è stata parcheggiato il veicolo.");
                                    break;
                                }
                            }
                        }
                    }

                }
                case 3 -> {
                    System.out.println("quante porte ha?");
                    int scannerPorte = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("è una macchina a disel o benzina?");
                    String scannerAlimentazione = scanner.nextLine();
                    if(scannerAlimentazione.equalsIgnoreCase("DISEL") || scannerAlimentazione.equalsIgnoreCase("BENZINA")){
                        Auto auto = new Auto(scannerMarca, scannerAnno, scannerCilindrata, scannerPorte, scannerAlimentazione);
                        String id = auto.info();
                        System.out.println("-Quale posto desiderate? La grandezza del garage è di 15 posti-" +
                                "\nSelezionate il posto:");
                        int scannerPostoGarage = scanner.nextInt();
                        scanner.nextLine();
                        if(veicolo.getGarage().toArray()[scannerPostoGarage] == null){
                            veicolo.getGarage().set(scannerPostoGarage, id );
                        } else if(veicolo.getGarage().toArray()[scannerPostoGarage] != null ){
                            System.out.println("Il posto scelto è occupato"+
                                    "\ncon un piccolo extra possiamo liberare il posto e mettere la tua." +
                                    "\nprendere posto(s)/cambio posto(n)");
                            char scannerPostoOccupato = scanner.next().charAt(0);
                            scanner.nextLine();
                            if(scannerPostoOccupato == 's'){
                                veicolo.getGarage().set(scannerPostoGarage, id );
                                System.out.println("Il veicolo si è parcheggiato nel " + scannerPostoGarage +
                                        " togliendo il veicolo precedente");
                            }else if ( scannerPostoOccupato == 'n'){

                                for (int i = 0; i < veicolo.getGarage().size(); i++) {
                                    if (veicolo.getGarage().toArray()[i] != null) {
                                        System.out.println("\nOccupato " + i);
                                    } else if (veicolo.getGarage().toArray()[i] == null) {
                                        break;
                                    } else {
                                        System.out.println("Ci dispiace ma al momento è tutto occupato, riprovi più tardi");
                                        scanner.close();
                                    }
                                }

                                for (int i = 0; i < veicolo.getGarage().size(); i++) {
                                    if(veicolo.getGarage().toArray()[i] == null){
                                        veicolo.getGarage().set(i,id);
                                        System.out.println("Il posto disponibile è " + i
                                                + " ed è stata parcheggiato il veicolo.");
                                        break;
                                    }
                                }
                            }
                        }
                    }else{
                        System.out.println("ERRORE");
                        scanner.close();
                    }

                        }
                default -> {
                    System.out.println("ERRORE");
                    scanner.close();
                }
            }
            System.out.println("CONTROLLO GARAGE?");
            String scannerControlloGarage = scanner.nextLine();
            switch (scannerControlloGarage.toUpperCase()) {
                case "SI" -> {
                    for (int i = 0; i < posto; i++) {
                        System.out.println("\nPosto: " + i + veicolo.getGarage().get(i));
                    }
                }
                case "NO" -> System.out.println("--------------------");
                default -> {
                    System.out.println("ERRORE");
                    scanner.close();
                }
            }
            System.out.println(posto);
            System.out.println("Immettere un nuovo veicolo?");
            scannerWhile = scanner.nextLine();
        } while (scannerWhile.equalsIgnoreCase("si"));
    }
    }

