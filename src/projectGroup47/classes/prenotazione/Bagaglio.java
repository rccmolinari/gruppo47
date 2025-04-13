package prenotazione;

public class Bagaglio {
    enum Stato_Bagaglio {
        caricato,
        disponibile
    }
    protected int codice_Bagaglio;
     protected Stato_Bagaglio stato_Bagaglio;
}
