/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hassounayahyacontocorrente;

/**
 *
 * @author hasso
 */
public class HassounaYahyaContoCorrente {

    /**
     * Metodo main per testare il funzionamento della classe ContoCorrente.
     * 
     * @param args Argomenti da linea di comando
     */
    public static void main(String[] args) 
    {
        // 1. creazione oggetto persona
        Persona mario = new Persona("Beacci", "Francesco");

        // 2. si apre conto corrente e si associa sul capitale iniziale 1000 euro
        ContoCorrente conto = new ContoCorrente(mario, 1000.0f);

        // 3. stampa stato inizialw
        System.out.println("--- STATO INIZIALE CONTO ---");
        System.out.println(conto.toString());

        // 4. versamento 500 euro
        System.out.println("\n--- VERSAMENTO ---");
        conto.effettuaVersamento(500.0f);
        System.out.println("Nuovo Saldo: " + conto.getSaldo() + " €");

        // 5. prelievo 300 euro
        System.out.println("\n--- PRELIEVO VALIDO ---");
        conto.effettuaPrelievo(300.0f);
        System.out.println("Nuovo Saldo: " + conto.getSaldo() + " €");

        // 6. prova del prelievo che supera il saldo
        // evita al conto di andare in negativo
        System.out.println("\n--- PRELIEVO ECCESSIVO ---");
        conto.effettuaPrelievo(2000.0f);

        // 7.stampa lo stato finale
        System.out.println("\n--- CONTO FINALE  ---");
        System.out.println(conto.toString());
    }
    
}
