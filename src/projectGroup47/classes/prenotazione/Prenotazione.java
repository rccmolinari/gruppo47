package prenotazione;
public class Prenotazione {

    enum Stato_Prenotazione {
        confermata,
        in_Attesa,
        cancellata
    }

    protected int numero_Biglietto;
    protected int numero_Assegnato;
    protected Stato_Prenotazione stato_Prenotazione;

}
