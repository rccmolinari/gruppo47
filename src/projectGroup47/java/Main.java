import prenotazione.Bagaglio;
import prenotazione.Passeggero;
import prenotazione.Prenotazione;
import utente.Amministratore;
import utente.Utente;
import utente.Utente_Generico;
import volo.Gate;
import volo.Volo;
import volo.Volo_In_Arrivo;
import volo.Volo_In_Partenza;

public class Main {
    public static void main(String[] args) {
        Passeggero p = new Passeggero();
        Bagaglio b = new Bagaglio();
        Prenotazione p1 = new Prenotazione();
        Utente u1 = new Utente();
        Amministratore a1 = new Amministratore();
        Utente_Generico u2 = new Utente_Generico();
        Gate g = new Gate();
        Volo volo = new Volo();
        Volo_In_Arrivo v1 = new Volo_In_Arrivo();
        Volo_In_Partenza v2 = new Volo_In_Partenza();
        System.out.println("Ciao! non ci sono errori");

    }
}
