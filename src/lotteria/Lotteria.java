/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

/**
 *
 * @author Putti Cristian
 */
public class Lotteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Scanner scanner = new Scanner(System.in);
       System.out.print("Inserisci il numero vincente: ");
        int numeroSelezionato = scanner.nextInt();
        System.out.print("Inserisci il numero di colonne  e di righe della tabella di estrazione: ");
        int N = scanner.nextInt();
//        BufferedReader br = new BufferedReader(
//                new InputStreamReader(System.in)
//        );
//        try {
//            N = Integer.parseInt(br.readLine());
//        } catch (IOException ex) {
//            Logger.getLogger(Lotteria.class.getName()).log(Level.SEVERE, null, ex);
//            System.err.println("errore");
//        }
        
        
        Estrazione e=new Estrazione(N);
        Giocatore g=new Giocatore(1, "g1", e);
        Giocatore g1=new Giocatore(2, "g2", e);
        Giocatore g2=new Giocatore(3, "g3", e);
        Giocatore g3=new Giocatore(4, "g4", e);
        
        System.out.println("INIZIO DELL'ESTRAZIONE!!!");
        e.start();
        g.start();
        g1.start();
        g2.start();
        g3.start();
        
        try {
            e.join();
            g.join();
            g1.join();
            g2.join();
            g3.join();
      
        } catch (InterruptedException ex) {
            Logger.getLogger(Lotteria.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Istanza ed avvio del thread Estrazione
        System.out.println("FINE DELL'ESTRAZIONE!!!");
        // Istanza di alcuni thread Giocatore
       
        // Avvio dei thread Giocatori
       
        // Comunicazione fine gioco
    }
}
   