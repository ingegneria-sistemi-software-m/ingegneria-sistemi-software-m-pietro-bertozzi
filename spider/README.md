# Local HTML Spider

| **Problema**  | **Il sito del prfessore è una Ragnatela** |
| ------------- | ----------------------------------------- |
| **Soluzione** | **Usiamo un Ragno per non perderci**      |

### Creare un ambiente virtuale

Crea un ambiente virtuale chiamato "spider". Questo comando creerà una cartella con l'ambiente virtuale nella directory corrente.

```bash 
python3 -m venv spider
```

### Attivare l'ambiente virtuale

Attiva l'ambiente virtuale. Una volta attivato, il prompt del terminale mostrerà il nome dell'ambiente attivo.

```bash
source venv/bin/activate
```

### Installare le dipendenze

Installare tutte le librerie elencate nel file `requirements.txt`. Assicurati di essere nell'ambiente virtuale prima di eseguire questo comando.

```bash
pip install -r requirements.txt
```

### Eseguire lo script Python con argomenti

Eseguire lo script `local.py`, dove puoi passare la directory da esplorare e le parole chiave da cercare.

```bash
python3 local.py -d directory -k keyword1 keyword2
```

### Disattivare l'ambiente virtuale

Quando hai finito di lavorare, disattivare l'ambiente virtuale. Questo ti riporterà all'ambiente di sistema.

```bash
deactivate
```
