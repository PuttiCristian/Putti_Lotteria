<h1 align="center">Lotteria</h1>

<p align="center" style="font-family: monospace">Monica Ciuchetti <a href="https://github.com/mciuchetti">@mciuchetti</a></p>
<p align="center" style="font-family: monospace">Corso TPSIT <a href="https://www.avoltapg.edu.it/">ITTS A. Volta (PG)</a></p>
<p align="center" style="font-family: monospace">Template del file README.md ispirato da <a href="https://github.com/matbagnoletti">@matbagnoletti</a></p>

## Descrizione
Applicazione Java per simulare l'estrazione di numeri random da inserire in una matrice e il successivo gioco di indovinare uno dei numeri estratti.

## Obiettivi
- Diagramma degli stati di un thread e transizioni	
- Variabili di classe e thread safety
- Realizzazione di un thread user-level
- Gestione eccezioni
- Documentazione del codice in Java
- Diagramma UML delle classi e dei casi d’uso

## classi usate:
1) Estrazione
   - attributi:
      - int numero: numero estratto
      - int vincitori[]: vettore contenente gli id dei giocatori che hanno vinto
      - int N: numero di elementi del vettore
      - Random random: oggetto di tipo Random per generare numeri casuali
      - int matriceNumeri[][]: matrice contenente i numeri estratti
    - metodi:
      - Estrazione(int N): costruttore
      - StampaMatrice(): stampa riga per riga i numeri estratti casualmente nella matrice
      - stampaVincitori(): stampa gli id dei giocatori vincenti contenuti nel vettore Vincitori()
      - verifica(int numero, int idGiocatore): se numero passato come parametro è uguale a all'attributo numero della classe Estrazione, viene stampato un messaggio in cui si afferma che il giocatore con l'id passato come parametro ha vinto, viene inserito il suo id nel vettore Vincitori e viene incrementato un contatore
      - run(): metodo per eseguire il thread, in cui viene riempita la matrice con valori casuali e viene richiamato il metodo StampaMatrice() per visualizzarla
3) Giocatore
4) Lotteria

## Osservazioni
Il progetto è stato scritto per scopi didattici e ha solo lo scopo di far comprendere le proprietà della classe Thread. 
Ad esso è associato il corrispondente <a href="https://drive.google.com/file/d/1DT6W73QeMnYEYUodcQ1hVpVY1DD0xCNv/view?usp=drive_link">diagramma delle classi</a>.
