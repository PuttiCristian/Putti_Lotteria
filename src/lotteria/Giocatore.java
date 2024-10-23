/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteria;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Putti Cristian
 */
public class Giocatore extends Thread{
    private int idGiocatore;
    private String nomeGiocatore;
    private Estrazione estrazione;
  
    public Giocatore(int idGiocatore, String nomeGiocatore, Estrazione estrazione){
        this.idGiocatore=idGiocatore;
        this.nomeGiocatore=nomeGiocatore;
        this.estrazione=estrazione;
    }

    /**
    * 
    * Metodo per eseguire il thread
    */
    public void run() {
       // verifica del risutlato
       int numeroSelezionato=0;
       System.out.println("NOME GIOCATORE: "+this.nomeGiocatore);
        for(int i=3; i>0; i--){
            System.out.println(i);
            try {
                this.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Giocatore.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println("Errore sleep");
            }
        }
        estrazione.verifica(numeroSelezionato, idGiocatore);
        
    }
    
    
}
