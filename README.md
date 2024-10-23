<h1 align="center">Lotteria</h1>

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
2) Giocatore
   - attributi:
      - int idGiocatore: identificativo univoco del giocatore.
      - String nomeGiocatore: nome del giocatore.
      - Estrazione estrazione: riferimento all'oggetto Estrazione, che contiene i numeri estratti e gestisce la verifica delle vincite.
   - metodi:
      - Giocatore(int idGiocatore, String nomeGiocatore, Estrazione estrazione): costruttore
      - run() sovrascrive quello della classe Thread e rappresenta l'esecuzione del thread del giocatore. Viene stampato il nome del giocatore. Un ciclo for conta alla rovescia da 3 a 1, aspettando un secondo tra un'iterazione e l'altra (metodo sleep). Al termine del conto alla rovescia, il giocatore chiama il metodo verifica(int numero, int idGiocatore) dell'oggetto Estrazione, passando un numero estratto e l'ID del giocatore. Se il thread viene interrotto, viene catturata un'eccezione InterruptedException e viene stampato un messaggio di errore.
3) Lotteria
   - metodi:
      - main: chiede in input il numero di righe e di colonne della matrice che dovrà contenere i numeri estratti casualmente e il numero vincente dell'estrazione. Crea 4 oggetti di tipo Giocatore e un oggetto di tipo Estrazione. Segnala l'inizio dell'estrazione con un output. Avvia i thread chiamado la funzione Start() su ogni oggetto Giocatore. Il programma attende che tutti i thread completino la loro esecuzione usando il metodo join() per evitare che il programma termini prima che tutti i processi siano completati. Segnala il termine dell'estrazione
    
## librerie

- import java.util.Random: per creare oggetti di tipo Random su cui invocare il metodo nextInt() per generare numeri casuali
- import java.util.logging.Level: La classe Level fa parte del pacchetto java.util.logging ed è utilizzata per definire i diversi livelli di gravità per i messaggi di log
- import java.util.logging.Logger: La classe Logger è utilizzata per registrare messaggi di log in un'applicazione Java. Consente di tracciare eventi e informazioni, come errori, avvisi e informazioni utili per il debugging e il monitoraggio del sistema
- import java.io.BufferedReader: La classe BufferedReader è utilizzata per leggere testo da un flusso di input
- import java.io.IOException: La classe IOException è un'eccezione che viene lanciata quando si verifica un errore di input/output
- import java.io.InputStreamReader: La classe InputStreamReader è un ponte tra flussi di byte e flussi di caratteri. Converte i byte letti da uno InputStream(flusso) in caratteri, consentendo la lettura del testo
- import java.util.Scanner: La classe Scanner fa parte del pacchetto java.util ed è utilizzata per leggere l'input da diverse sorgenti, come la tastiera, file, stringhe, e altri flussi di input

## descrizione 

1) L'utente inserisce il numero vincente da cercare e le dimensioni della matrice dei numeri casuali che verranno generati casualmente e inseriti in essa con l'estrazione.

2) Il thread principale crea una matrice di numeri casuali compresi tra 1 e 90. Questa matrice rappresenta l'estrazione della lotteria.

3) Vengono creati diversi giocatori nel metodo main della classe Lotteria, ciascuno con un identificatore univoco. I giocatori partecipano alla lotteria selezionando un numero e cercando di indovinare uno dei numeri estratti.

4) Utilizzando i thread, ogni giocatore verifica i numeri estratti contemporaneamente e, se trova una corrispondenza con quelli della matrice, viene dichiarato vincitore e il suo id viene inserito nell'array dei vincitori.

5) Una volta completata l'estrazione e la verifica di tutti i giocatori, il gioco termina e vengono annunciati i risultati. I numeri estratti e i vincitori vengono stampati a schermo.


## Osservazioni
Il progetto è stato scritto per scopi didattici e ha solo lo scopo di far comprendere le proprietà della classe Thread. 
