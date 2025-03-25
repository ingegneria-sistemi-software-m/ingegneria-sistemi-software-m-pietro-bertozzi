# Ingegneria dei Sistemi Software M

## Professor Antonio Natali

Anno Accademico: 2024/2025

## Organizzazione

Nella sezione [Argomenti Principali](#argomenti-principali) ho raccolto le informazioni teoriche tratte da libri e fonti accademiche, mentre nella sezione [Riflessioni sul Lavoro Svolto](riflessioni) ho aggiunto le mie riflessioni e considerazioni personali sugli argomenti trattati e sugli insegnamenti che ne derivano. La sezione "Pensieri" raccoglie gli elaborati da consegnare al termine di ciascuna delle tre parti del corso.

Il corso si suddivide in tre parti fondamentali.
Di seguito vengono presentati i dettagli di ciascuna parte, con i vari progetti pratici inclusi in ogni sezione.
- [Dai Programmi ai Microservizi](#progetti-parte-a---dai-programmi-ai-microservizi)
- [Sviluppo di Applicazioni Distribuite e IOT](#progetti-parte-b---sviluppo-di-applicazioni-distribuite-e-iot)
- [Dai Requisiti al Prodotto con Processi Agili e Incrementali basati su Modelli](#progetti-parte-c---dai-requisiti-al-prodotto-con-processi-agili-e-incrementali-basati-su-modelli)

Infine, è presente un’ultima sezione dedicata a progetti praticipensati per migliorare l’efficienza del lavoro o semplificarlo, automatizzandone alcuni aspetti. Questi [Progetti Ausiliari](#progetti-ausiliari), pur essendo utili, non producono risultati rilevanti ai fini del corso e non sarebbero stati strettamente necessari.

## Argomenti Principali

In questa sezione sono raccolte le informazioni riguardanti diverse tecnologie e metodologie utilizzate nei progetti.

- [Scrum](scrum): metodo agile per la gestione dei progetti, focalizzato sulla iterazione continua. 
- [Gradle](gradle): strumento di automazione per la gestione delle build, utilizzato per semplificare e accelerare il processo di sviluppo, senza perdersi in dettagli puramente implementativi.
- [Docker](docker): piattaforma per sviluppare, spedire ed eseguire applicazioni in container.
- [Spring Boot](spring-boot): framework Java per la creazione di applicazioni web e microservizi.
- [WebSocket](websocket): protocollo di comunicazione che consente la comunicazione bidirezionale in tempo reale tra client e server.
- [MQTT](mqtt): protocollo di messaggistica leggero.

## Progetti Parte A - Dai Programmi ai Microservizi

- [conway25JavaScript](conway25javascript): rapida realizzazione delle funzionalità che realizzano la parte core del game Life di Conway
- [conway25Java](conway25java): Classi Java che realizzano la parte core del game Life di Conway
- [conwaygui](conwaygui): Sistema SpringBoot che ingloba [conway25Java](conway25java) offrendo una GUI come dispositivo di I/O
- [conway25JavaMqtt](conway25javamqtt): GameLife standalone che interagisce via MQTT con il mondo esterno
- [conwayguialone](conwayguialone): Servizio SpringBoot che offre la GUI per intergasice via MQTT con [conway25JavaMqtt](#conway25javamqtt)

## Progetti Parte B - Sviluppo di Applicazioni Distribuite e IOT

## Progetti Parte C - Dai Requisiti al Prodotto con Processi Agili e Incrementali basati su Modelli

## Progetti Ausiliari

Ho sviluppato un piccolo [spider](spider) per esplorare le pagine del sito del professore, consentendo di trovare rapidamente la pagina desiderata tramite parole chiave.