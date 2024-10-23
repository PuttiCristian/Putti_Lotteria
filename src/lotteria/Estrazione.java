/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteria;

import java.util.Random;

/**
 *
 * @author Putti Cristian
 */
public class Estrazione extends Thread {
    private int numero;  // numero estratto
    private int vincitori[];
    private int N; // numero di elementi del vettore
    private Random random;
    private int matriceNumeri[][];
    
    
    
    /**
     * 
     * Metodo costruttore
     * @param N numero elementi del vettore e della matrice
     */   
    public Estrazione(int N) {
        this.N=N;
        numero=0;
        matriceNumeri = new int[N][N];
        vincitori = new int[N];
        random = new Random();
    }

    /**
    * 
    * Metodo per visualizzare la matrice dei numeri estratti
    */
    public void stampaMatrice() {
        int i=0;
        int j=0;
        
        for(i=0; i<N; i++){
            for(j=0; j<N; j++){
                System.out.println(matriceNumeri[i][j] + " ");
            }
            System.out.println();
        }
 
    }
    
    /**
    * 
    * Metodo per visualizzare i vincitori dell'estrazione
    */
    public void stampaVincitori() {
        // stampa array dei vincitori
        for(int i=0; i<3; i++) {
            System.out.println(vincitori[i]);
        }
        }

    /**
    * 
    * Metodo per verificare il numero scelto dal giocatore e determinare i vincitori
    * @param numero numero scelto dal giocatore
    * @param idGiocatore id del giocatore
    */
    public void verifica(int numero, int idGiocatore) {
        int i=0;
        System.out.println("HO VERIFICATO IL NUMERO INSERITO");
           if(numero==this.numero){
               System.out.println("IL GIOCATORE "+idGiocatore+" HA SCELTO IL NUMERO "+numero+" E HA VINTO");
               vincitori[i]=idGiocatore;
               i++;
           }
    }

    /**
    * 
    * Metodo per eseguire il thread
    */
    public void run() {
        int i=0;
        int j=0;
        // stampa iniziale
        
        // estrazione dei numeri
        for(i=0; i<N; i++){
            for(j=0; j<N; j++){
                matriceNumeri[i][j] = random.nextInt(90) + 1;
            }
        }
        // stampa matrice
        stampaMatrice();
        // stampa finale
    }
}


