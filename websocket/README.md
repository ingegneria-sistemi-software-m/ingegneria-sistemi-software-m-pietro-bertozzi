# WebSocket

WebSocket è una tecnologia che consente la comunicazione bidirezionale e persistente tra client e server. A differenza delle tradizionali richieste HTTP, che sono per natura unidirezionali e richiedono di rinviare l'intera pagina per aggiornamenti, WebSocket (o HTTP 2.0) permette uno scambio continuo di dati con una connessione stabile e aperta. Questo superamento delle tecnologie precedenti, come l'uso di AJAX, riduce il carico di rete e accelera la trasmissione dei dati. L'adozione di WebSocket consente agli sviluppatori di aggiornare dinamicamente solo i dati necessari in tempo reale, senza bisogno di ricaricare l'intera pagina, migliorando così l'esperienza utente.

## Asincronicità e Cambiamento di Iniziativa

Una delle caratteristiche più potenti di WebSocket è l'asincronicità, resa possibile dalle librerie WebSocket. In questo modello, non è più il client a decidere quando ricevere i dati, ma è il server a inviarli in modo imprevedibile, come un geyser che sbuffa acqua senza preavviso. Questo cambiamento di iniziativa consente una comunicazione dinamica e reattiva. Grazie all'asincronia, WebSocket migliora le performance e apre nuove opportunità, ma comporta anche delle sfide. In particolare, il coordinamento tra client e server può diventare complesso, e il debugging di un sistema articolato risulta più difficile.

## Implementazione Client Passivo

``` java
@ClientEndpoint
public class WebSocketClient {
    @OnOpen
    public void onOpen(Session session) { System.out.println("Connessione aperta"); }
    
    @OnMessage
    public void onMessage(String message) { System.out.println("Messaggio ricevuto: " + message); }
    
    @OnClose
    public void onClose(Session session, CloseReason reason) { System.out.println("Connessione chiusa: " + reason); }
    
    @OnError
    public void onError(Session session, Throwable error) { System.err.println("Errore: " + error.getMessage()); }
}

```