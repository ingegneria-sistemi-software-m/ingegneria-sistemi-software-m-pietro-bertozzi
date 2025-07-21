# Local HTML Spider

| **Problema**  | **Il sito del prfessore è una Ragnatela** |
| ------------- | ----------------------------------------- |
| **Soluzione** | **Usiamo un Ragno per non perderci**      |

### Storia e Progresso

Purtroppo lo spider e stato usato solo per poche settimane.  
L'intelligenza artificiale lo superato e reso obloseto.  
Il prodotto in questione è [notebooklm](https://notebooklm.google.com/) di Google.

### Creare un ambiente virtuale

Crea un ambiente virtuale chiamato "spider". Questo comando creerà una cartella con l'ambiente virtuale nella directory corrente.

```bash
python3 -m venv spider
cd spider
```

### Attivare l'ambiente virtuale

Attiva l'ambiente virtuale. Una volta attivato, il prompt del terminale mostrerà il nome dell'ambiente attivo.

```bash
source bin/activate
```

### Installare le dipendenze

Installare tutte le librerie elencate nel file `requirements.txt`. Assicurati di essere nell'ambiente virtuale prima di eseguire questo comando.

```bash
pip install -r requirements.txt
```

### Eseguire lo script Python con argomenti

Eseguire lo script `local.py`, dove puoi passare la directory da esplorare e le parole chiave da cercare.

```bash
python3 local.py --help
python3 local.py -k keyword1 keyword2 -d directory -a
```

### Disattivare l'ambiente virtuale

Quando hai finito di lavorare, disattivare l'ambiente virtuale. Questo ti riporterà all'ambiente di sistema.

```bash
deactivate
```

## Accesso rapido alle istruzioni

In qualsiasi momento puoi accedere rapidamente a queste istruzioni. Utilizza:

```bash
chmod +x instructions.sh
./instructions.sh
```
