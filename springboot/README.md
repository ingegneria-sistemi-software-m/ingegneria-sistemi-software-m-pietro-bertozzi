# Spring Boot

Un framework per costruire applicazioni modulari
Spring Boot è un framework che semplifica lo sviluppo di applicazioni Java, fornendo configurazioni predefinite e strumenti per gestire il backend in modo efficiente. Grazie all'autoconfigurazione e alla gestione delle dipendenze, permette di creare rapidamente servizi web senza doversi occupare di dettagli complessi, lasciando agli sviluppatori il focus sulla logica applicativa.

## Il Principio di Iron Man: separare backend e interfaccia

Nel corso, un’idea chiave è quella di sviluppare prima un'applicazione senza interfaccia grafica e successivamente dotarla di una GUI con minimo sforzo. Spring Boot rende questo possibile, fornendo un’infrastruttura che permette di esporre le funzionalità tramite API REST. In questo modo, **l’interfaccia utente può essere aggiunta e modificata senza dover riscrivere il codice dell’applicazione sottostante**.

## Controller REST e gestione delle richieste

Uno degli elementi chiave di Spring Boot è il controller, il componente che riceve le richieste dal frontend e le instrada verso la logica di business. I controller possono essere RESTful, consentendo la comunicazione con un’interfaccia web o altre applicazioni, oppure più tradizionali, servendo direttamente pagine HTML. Questa flessibilità permette di adattare l’applicazione a diversi scenari, mantenendo il codice ben organizzato.

## Collaborazione tra componenti e sviluppo scalabile

Spring Boot favorisce un’architettura in cui ogni parte dell’applicazione può collaborare con le altre senza dipendenze rigide. Questo è fondamentale in uno sviluppo iterativo e incrementale, come quello promosso dalle metodologie agili. La possibilità di aggiungere nuove funzionalità senza stravolgere il sistema esistente rende Spring Boot uno strumento essenziale per costruire applicazioni scalabili e modulari.