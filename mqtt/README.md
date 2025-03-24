# MQTT

MQTT (Message Queuing Telemetry Transport) è un protocollo di messaggistica leggero progettato per la comunicazione tra dispositivi in scenari di Internet delle Cose (IoT); è ideale per l'uso in ambienti con larghezza di banda limitata e dispositivi con risorse hardware ridotte. MQTT si distingue per il suo modello di comunicazione pub/sub, che disaccoppia i produttori di messaggi dai consumatori, migliorando la scalabilità e la flessibilità nella gestione della comunicazione tra i dispositivi.

## Il ruolo del Broker e dei Topic

Il broker in MQTT funge da intermediario tra i client, gestendo la pubblicazione e la distribuzione dei messaggi sui topic. È responsabile per inoltrare i messaggi ai client iscritti e per garantire la qualità del servizio (QoS) durante la consegna. Grazie al broker, la comunicazione tra i dispositivi è decoupled, permettendo una gestione scalabile delle connessioni e dei messaggi. **Questo disaccoppiamoneto apre la strada nell'evoluzione verso i microservizi**.

## Livelli di Quality of Service

MQTT offre diversi livelli di Quality of Service (QoS) che consentono di regolare il comportamento del protocollo in base alle necessità specifiche dell'applicazione. 
- QoS 0: il messaggio viene inviato una sola volta senza garanzie di consegna.
- QoS 1: garantisce che il messaggio venga ricevuto almeno una volta, ma potrebbe esserci il rischio che venga duplicato.
- QoS 2: è il livello più affidabile, assicurando che ogni messaggio venga consegnato esattamente una volta, evitando duplicazioni.

## Costruire Astrazioni sopra MQTT

Una delle sfide del corso è creare astrazioni su MQTT per rendere la comunicazione più naturale. **È fondamentale comprendere l'importanza del linguaggio: non si tratta solo di come esprimiamo i nostri pensieri, ma anche di come li formuliamo. Scegliere il linguaggio giusto per risolvere un problema è un passo cruciale nel processo di soluzione.** Creare un linguaggio riutilizzabile significa catturare le analogie tra il problema attuale e quelli futuri, e metterle in relazione con il nostro modo di pensare. Questo è un processo complesso, ma necessario per affrontare in modo efficace le sfide future.

### Comunicazione Request-Response

Per implementare un pattern request-response, possiamo usare due topic distinti: uno per la richiesta e uno per la risposta. In questo modo, possiamo gestire la comunicazione senza preoccuparci del funzionamento interno del protocollo, semplificando l'interazione tra client e server.