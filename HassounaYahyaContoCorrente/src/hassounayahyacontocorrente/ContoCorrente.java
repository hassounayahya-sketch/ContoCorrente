/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hassounayahyacontocorrente;

/**
 * Permette di gestire il saldo mediante operazioni di versamento e prelievo,
 * garantendo che il conto non vada mai in negativo.
 * 
 * @author Hassouna Yahya
 * @version 1.0
 */
public class ContoCorrente 
{

    /** Indica l'oggetto Persona intestatario del conto corrente. */
    private Persona titolare;

    /** Indica il saldo attuale disponibile sul conto corrente. */
    private float saldo;

    /**
     * Costruttore della classe ContoCorrente.
     * Assegna il titolare e imposta il capitale iniziale come saldo di partenza.
     * 
     * @param titolare L'oggetto Persona intestatario del conto
     * @param capitaleIniziale L'importo iniziale con cui si apre il conto
     */
    public ContoCorrente(Persona titolare, float capitaleIniziale) 
    {
        this.titolare = titolare;
        if (capitaleIniziale >= 0) 
        {
            this.saldo = capitaleIniziale;
        } 
        else 
        {
            this.saldo = 0.0f;
        }
    }

    /**
     * Effettua un versamento incrementando il saldo attuale.
     * 
     * @param versamento L'importo in EUR da depositare sul conto
     */
    public void effettuaVersamento(float versamento) 
    {
        if (versamento > 0) 
        {
            this.saldo += versamento;
            System.out.println("Versamento di " + versamento + " EUR effettuato");
        } 
        else 
        {
            System.out.println("L'importo del versamento deve essere positivo.");
        }
    }

    /**
     * Effettua un prelievo verificando che non superi il saldo disponibile.
     * Impedisce al conto di scendere in negativo.
     * 
     * @param prelievo L'importo in EUR da prelevare dal conto
     * @return true se l'operazione ha successo, false se il saldo e' insufficiente
     */
    public boolean effettuaPrelievo(float prelievo) 
    {
        if (prelievo <= 0) 
        {
            System.out.println("L'importo del prelievo deve essere positivo");
            return false;
        }

        if (prelievo <= this.saldo) 
        {
            this.saldo -= prelievo;
            System.out.println("Prelievo di " + prelievo + " EUR effettuato con successo.");
            return true;
        } 
        else 
        {
            System.out.println("Saldo insufficiente Hai a disposizione " + this.saldo + " EUR");
            return false;
        }
    }

    /**
     * Restituisce l'oggetto Persona titolare del conto.
     * 
     * @return Il titolare del conto corrente
     */
    public Persona getTitolare() 
    {
        return titolare;
    }

    /**
     * Imposta un nuovo titolare per il conto corrente.
     * 
     * @param titolare Il nuovo oggetto Persona da assegnare come titolare
     */
    public void setTitolare(Persona titolare) 
    {
        this.titolare = titolare;
    }

    /**
     * Restituisce il saldo attuale del conto corrente.
     * 
     * @return Il saldo attuale in EUR
     */
    public float getSaldo() 
    {
        return saldo;
    }

    /**
     * Imposta direttamente il saldo del conto corrente.
     * 
     * @param saldo Il nuovo saldo da impostare
     */
    public void setSaldo(float saldo) 
    {
        this.saldo = saldo;
    }

    /**
     * Restituisce le informazioni essenziali dello stato del conto corrente.
     * 
     * @return Dettagli del titolare e saldo attuale formattato
     */
    @Override
    public String toString() 
    {
        return "Titolare: " + titolare.toString() +
               "\nSaldo Attuale: " + saldo + " EUR";
    }

    
}