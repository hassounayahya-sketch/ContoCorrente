/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hassounayahyacontocorrente;

/**
 * La classe Persona rappresenta il titolare anagrafico del conto corrente.
 * Gestisce le informazioni relative al nome e al cognome della persona.
 * 
 * @author Hassouna Yahya
 * @version 1.0
 */
public class Persona 
{

    /** Indica il nome della persona. */
    private String nome;

    /** Indica il cognome della persona. */
    private String cognome;

    /**
     * Costruttore della classe Persona.
     * Inizializza un nuovo oggetto Persona con nome e cognome.
     * 
     * @param nome Il nome del titolare
     * @param cognome Il cognome del titolare
     */
    public Persona(String nome, String cognome) 
    {
        this.nome = nome;
        this.cognome = cognome;
    }

    /**
     * Restituisce il nome della persona.
     * 
     * @return Il nome del titolare
     */
    public String getNome() 
    {
        return nome;
    }

    /**
     * Imposta un nuovo nome per la persona.
     * 
     * @param nome Il nuovo nome da assegnare
     */
    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    /**
     * Restituisce il cognome della persona.
     * 
     * @return Il cognome del titolare
     */
    public String getCognome() 
    {
        return cognome;
    }

    /**
     * Imposta un nuovo cognome per la persona.
     * 
     * @param cognome Il nuovo cognome da assegnare
     */
    public void setCognome(String cognome) 
    {
        this.cognome = cognome;
    }

    /**
     * Restituisce la rappresentazione in testo della persona.
     * 
     * @return Nome e cognome del titolare separati da uno spazio
     */
    @Override
    public String toString() 
    {
        return nome + " " + cognome;
    }
}