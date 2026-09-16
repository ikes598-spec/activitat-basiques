# ACT-BUCLES — Activitats de Programació amb Bucles

Cada activitat és un programa Java amb un `main`. La majoria llegeixen dades del teclat
(amb `Scanner`) i repeteixen una acció amb bucles `for`, `while` o `do-while`. Els fitxers
són a `src/main/java/`.

Algunes activitats **no tenen una sortida fixa** perquè depenen de números generats a
l'atzar amb `Random` (02). En aquestes, el professor revisarà que la **lògica** sigui
correcta llegint el codi, no que la sortida coincideixi exactament amb cap exemple.

## Com treballar

1. Obre la carpeta a **VS Code** (accepta instal·lar les extensions recomanades).
2. Implementa cada programa.
3. Prova'l:
   - **A VS Code** (més fàcil): prem ▶ *Run* just a sobre del mètode `main` de la classe.
   - **Per consola** (no cal tenir Maven instal·lat, només el JDK):
     - Només la classe que estiguis provant (més ràpid):
       ```
       javac -d target/classes src/main/java/NomClasse.java
       java -cp target/classes NomClasse
       ```
     - Totes les classes de cop:
       ```
       javac -d target/classes src/main/java/*.java
       java -cp target/classes NomClasse
       ```
     (substitueix `NomClasse` pel nom de la classe que vulguis provar).
4. Fes `commit` i `push` quan vulguis desar la teva feina (pots fer-ho tantes vegades
   com vulguis). No hi ha cap correcció automàtica: el professor revisarà el teu codi
   més endavant. Abans d'entregar, comprova tu mateix cada programa (▶ *Run* a VS Code)
   amb diferents valors d'entrada, no només amb l'exemple de l'enunciat.

## Categories

Les activitats es reparteixen en 6 categories, però es numeren seqüencialment des de la
01 (la numeració **no torna a començar** a cada categoria nova).

1. Comptadors
2. _(pendent)_
3. _(pendent)_
4. _(pendent)_
5. _(pendent)_
6. _(pendent)_

## Activitats (_puntuació pendent de tancar_)

### Categoria 1 — Comptadors

| #  | Classe | Puntuació |
|----|--------|-----------|
| 01 | `TemperaturaBucle` | _pendent_ |
| 02 | `NumerosAleatoris` | _pendent_ |
| 03 | `PositiuNegatiuZeroBucle` | _pendent_ |
| 04 | `TemperaturaBucleN` | _pendent_ |

### Categoria 2 — _(pendent)_

_(pendent)_

### Categoria 3 — _(pendent)_

_(pendent)_

### Categoria 4 — _(pendent)_

_(pendent)_

### Categoria 5 — _(pendent)_

_(pendent)_

### Categoria 6 — _(pendent)_

_(pendent)_

## Enunciats

### Categoria 1 — Comptadors

#### 01 — Temperatures en bucle (`TemperaturaBucle`)
Escriu un programa que demani a l'usuari, per teclat, el valor de 5 temperatures en
graus Fahrenheit (una per una, amb un bucle) i mostri per cadascuna l'equivalent en
graus Celsius:

```java
temperatureC = ((temperatureF - 32) * 5) / 9;
```

```
Introdueix la temperatura en Fahrenheit (1/5):
212
212.0 °F equivalen a 100.0 °C
Introdueix la temperatura en Fahrenheit (2/5):
32
32.0 °F equivalen a 0.0 °C
Introdueix la temperatura en Fahrenheit (3/5):
-40
-40.0 °F equivalen a -40.0 °C
Introdueix la temperatura en Fahrenheit (4/5):
68
68.0 °F equivalen a 20.0 °C
Introdueix la temperatura en Fahrenheit (5/5):
176
176.0 °F equivalen a 80.0 °C
```

#### 02 — Números aleatoris (`NumerosAleatoris`)
Genera 50 números aleatoris entre 1 i 15 (tots dos inclosos) i mostra'ls per pantalla,
un per línia.

> Aquesta activitat fa servir `Random`, no té una sortida fixa per provar.

```
6
14
1
9
...
```
(50 línies en total — sortida diferent cada vegada que s'executa.)

#### 03 — Positiu, negatiu o zero, en bucle (`PositiuNegatiuZeroBucle`)
Entra per teclat 8 números i, per cadascun, mostra si és positiu, negatiu o zero.

```
Entra el número 1: 6
és positiu
Entra el número 2: -5
és negatiu
Entra el número 3: 0
és un zero
Entra el número 4: 4
és positiu
Entra el número 5: 0
és un zero
Entra el número 6: -1
és negatiu
Entra el número 7: 10
és positiu
Entra el número 8: -3
és negatiu
```

#### 04 — Temperatures en bucle, quantitat per teclat (`TemperaturaBucleN`)
Escriu un programa que demani a l'usuari quantes temperatures vol convertir (N) i,
amb un bucle, li demani N temperatures en graus Fahrenheit i mostri per cadascuna
l'equivalent en graus Celsius:

```java
temperatureC = ((temperatureF - 32) * 5) / 9;
```

```
Quantes temperatures vols convertir?
3
Entra la temperatura:
212
212.0 °F equivalen a 100.0 °C
Entra la temperatura:
32
32.0 °F equivalen a 0.0 °C
Entra la temperatura:
68
68.0 °F equivalen a 20.0 °C
```
