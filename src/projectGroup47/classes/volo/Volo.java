package volo;

import java.util.Date;
public class Volo {

    enum Stato_Volo {
        Programmato,
        Decollato,
        Ritardo,
        Cacellato
    };

    protected int codice_Volo;
    protected String compagnia;
    protected Date data;
    protected String orario_Previsto;
    protected int ritardo = 0;
    protected Stato_Volo stato;
    protected String origine;
    protected String destinazione;

}
