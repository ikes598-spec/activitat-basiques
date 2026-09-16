# ACT-BUCLES — Activitats de Programació amb Bucles

Cada activitat és un programa Java amb un `main`. La majoria llegeixen dades del teclat
(amb `Scanner`) i repeteixen una acció amb bucles `for`, `while` o `do-while`. Els fitxers
són a `src/main/java/`.

Algunes activitats **no tenen una sortida fixa** perquè depenen de números generats a
l'atzar amb `Random` (02, 11, 12, 14 i 20). En aquestes, el professor revisarà que la **lògica** sigui
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
2. Condicions d'acabament simples
3. For
4. Acumuladors
5. Condicions d'acabament complexes
6. _(pendent)_

## Activitats (_puntuació pendent de tancar_)

### Categoria 1 — Comptadors

| #  | Classe | Puntuació |
|----|--------|-----------|
| 01 | `TemperaturaBucle` | _pendent_ |
| 02 | `NumerosAleatoris` | _pendent_ |
| 03 | `PositiuNegatiuZeroBucle` | _pendent_ |
| 04 | `TemperaturaBucleN` | _pendent_ |
| 05 | `HoresMinutsSegons` | _pendent_ |
| 06 | `NumerosDe1aN` | _pendent_ |
| 07 | `TaulaDel6` | _pendent_ |
| 08 | `TaulaMultiplicar` | _pendent_ |
| 09 | `MajusculaMinuscula` | _pendent_ |
| 10 | `NumerosDeNa1` | _pendent_ |
| 11 | `CaraCreu` | _pendent_ |
| 12 | `ParellsISenarsAleatoris` | _pendent_ |
| 13 | `TaulaMultiplicarErrors` | _pendent_ |

### Categoria 2 — Condicions d'acabament simples

| #  | Classe | Puntuació |
|----|--------|-----------|
| 14 | `GeneraFinsAl12` | _pendent_ |
| 15 | `SequenciaDe3en3` | _pendent_ |
| 16 | `PositiuNegatiuFinsZero` | _pendent_ |
| 17 | `GranIPetit` | _pendent_ |
| 18 | `NombreDeXifres` | _pendent_ |

### Categoria 3 — For

| #  | Classe | Puntuació |
|----|--------|-----------|
| 19 | `TaulaMultiplicarErrorsFor` | _pendent_ |
| 20 | `CaraCreuFor` | _pendent_ |

### Categoria 4 — Acumuladors

| #  | Classe | Puntuació |
|----|--------|-----------|
| 21 | `SumaFinsZero` | _pendent_ |
| 22 | `MitjanaNotes` | _pendent_ |
| 23 | `SumaMesDe21` | _pendent_ |
| 24 | `MultiplicarAmbSumes` | _pendent_ |
| 25 | `MesGranIMesPetit` | _pendent_ |
| 26 | `NotesMitjanaMaxMin` | _pendent_ |

### Categoria 5 — Condicions d'acabament complexes

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

#### 05 — Hores, minuts i segons, en bucle (`HoresMinutsSegons`)
Repeteix 4 vegades: demana per teclat un número de segons i mostra les hores, els
minuts i els segons restants que representa.

```
Entra els segons:
41668
Hores: 11
Minuts: 34
Segons: 28
Entra els segons:
3661
Hores: 1
Minuts: 1
Segons: 1
Entra els segons:
7325
Hores: 2
Minuts: 2
Segons: 5
Entra els segons:
90000
Hores: 25
Minuts: 0
Segons: 0
```

#### 06 — Números d'1 fins a N (`NumerosDe1aN`)
Entra un número enter per teclat i mostra tots els valors que van d'1 fins al número
entrat, un per línia.

```
Entra un número:
15
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
```

#### 07 — Taula de multiplicar del 6 (`TaulaDel6`)
Imprimeix la taula de multiplicar del 6, de l'1 al 10, amb el format següent:

```
6 × 1 = 6
6 × 2 = 12
6 × 3 = 18
6 × 4 = 24
6 × 5 = 30
6 × 6 = 36
6 × 7 = 42
6 × 8 = 48
6 × 9 = 54
6 × 10 = 60
```

#### 08 — Taula de multiplicar d'un número, per teclat (`TaulaMultiplicar`)
Imprimeix la taula de multiplicar d'un número introduït per teclat, de l'1 al 10.

```
Entra un número:
7
7 × 1 = 7
7 × 2 = 14
7 × 3 = 21
7 × 4 = 28
7 × 5 = 35
7 × 6 = 42
7 × 7 = 49
7 × 8 = 56
7 × 9 = 63
7 × 10 = 70
```

#### 09 — Majúscula, minúscula o no és una lletra (`MajusculaMinuscula`)
Escriu un programa que demani 10 cops a l'usuari, per teclat, un caràcter, i
determini si el caràcter entrat és una lletra majúscula, una lletra minúscula, o no
és una lletra.

Recorda: els caràcters (`char`) tenen assignat un codi numèric i, per tant, es poden
comparar amb els operadors `<`, `>`, `==`... Per exemple:
```java
char lletra = 'd';
if (lletra > 'a') { ... }
```

```
Entra un caràcter: D
és una lletra majúscula
Entra un caràcter: x
és una lletra minúscula
Entra un caràcter: 5
no és una lletra
Entra un caràcter: ?
no és una lletra
Entra un caràcter: M
és una lletra majúscula
Entra un caràcter: z
és una lletra minúscula
Entra un caràcter: @
no és una lletra
Entra un caràcter: a
és una lletra minúscula
Entra un caràcter: Z
és una lletra majúscula
Entra un caràcter: 1
no és una lletra
```

#### 10 — Números de N fins a 1 (`NumerosDeNa1`)
Entra un número enter per teclat i mostra els valors que van des del número entrat
fins a l'1, un per línia.

```
Entra un número:
15
15
14
13
12
11
10
9
8
7
6
5
4
3
2
1
```

#### 11 — Cara o creu, 100 llançaments (`CaraCreu`)
Simula el llançament d'una moneda 100 vegades (cara = 0, creu = 1) i compta quantes
cares i quantes creus han sortit (n'hi ha prou amb una variable que compti les cares
o les creus i s'incrementi ella mateixa d'un en un).

> Aquesta activitat fa servir `Random`, no té una sortida fixa per provar.

```
Cares: 46
Creus: 54
```
(el total sempre suma 100 — la sortida concreta varia cada execució.)

#### 12 — Parells i senars, aleatoris (`ParellsISenarsAleatoris`)
Genera un número de números aleatoris (entre 1 i 100) segons indiqui l'usuari per
teclat, i compta quants són parells i quants són senars.

> Aquesta activitat fa servir `Random`, no té una sortida fixa per provar.

```
Quants números vols generar?
15
Han sortit 7 números parells i 8 senars
```
(el total de parells + senars sempre suma N — la sortida concreta varia cada execució.)

#### 13 — Taula de multiplicar, amb comptador d'errors (`TaulaMultiplicarErrors`)
Demana la taula de multiplicar (de l'1 al 10) d'un número entrat per teclat: per
cada multiplicació, l'usuari escriu el resultat i el programa diu si és correcte o
incorrecte. Compta els errors comesos.

```
Entra un número:
6
6 × 1 = 6
correcte!
6 × 2 = 10
incorrecte!
6 × 3 = 18
correcte!
6 × 4 = 24
correcte!
6 × 5 = 30
correcte!
6 × 6 = 30
incorrecte!
6 × 7 = 42
correcte!
6 × 8 = 48
correcte!
6 × 9 = 54
correcte!
6 × 10 = 60
correcte!
Has comès 2 errors!
```

### Categoria 2 — Condicions d'acabament simples

#### 14 — Genera fins al 12 (`GeneraFinsAl12`)
Genera un número aleatori entre 0 i 15. Repeteix-ho fins que aquest número sigui el
12: per cada número generat (que no sigui el 12), imprimeix-lo, així com la
distància (en valor absolut) respecte al 12. Quan finalment surti el 12 (sense
imprimir-lo), el programa acaba mostrant quantes iteracions s'han necessitat per
assolir l'objectiu.

> Aquesta activitat fa servir `Random`, no té una sortida fixa per provar.

```
El número generat és: 5, falten 7 per assolir l'objectiu.
El número generat és: 4, falten 8 per assolir l'objectiu.
El número generat és: 4, falten 8 per assolir l'objectiu.
El número generat és: 7, falten 5 per assolir l'objectiu.
El número generat és: 8, falten 4 per assolir l'objectiu.
Objectiu assolit en: 6 iteracions
```
(sortida diferent cada vegada que s'executa; el nombre de línies sempre és
`iteracions - 1`, ja que el 12 que tanca el bucle no s'imprimeix.)

#### 15 — Seqüència de 3 en 3, amb final per teclat (`SequenciaDe3en3`)
Mostra per pantalla la seqüència 2, 5, 8, 11, 14, 17, 20... (de 3 en 3), fins a un
final que marca l'usuari per teclat (sense superar-lo).

```
Quin ha de ser el final de la seqüència?
30
2, 5, 8, 11, 14, 17, 20, 23, 26, 29
```

#### 16 — Positiu o negatiu, fins al 0 (`PositiuNegatiuFinsZero`)
Entra per teclat una seqüència de números acabada en 0 i, per cadascun (excepte el
0 final), mostra si és positiu o negatiu. Quan s'entri el 0, acomiada't de
l'usuari.

```
Introdueix un número: 11
És positiu
Introdueix un número: -2
És negatiu
Introdueix un número: 7
És positiu
Introdueix un número: 0
Adeu!
```

#### 17 — Gran i petit, apropant-se (`GranIPetit`)
Entra per teclat dos números: un de gran (`gran`) i un de petit (`petit`). Amb un
bucle `while`, mentre `gran` sigui més gran que `petit`, imprimeix els dos valors;
a cada iteració, divideix `gran` entre 2 i multiplica `petit` per 2.

```
Entra el número gran:
2345
Entra el número petit:
2
Gran = 2345   Petit = 2
Gran = 1172   Petit = 4
Gran = 586   Petit = 8
Gran = 293   Petit = 16
Gran = 146   Petit = 32
Gran = 73   Petit = 64
```

#### 18 — Nombre de xifres (`NombreDeXifres`)
Entra un número enter positiu i mostra quantes xifres té. Per saber-ho, dividim el
número successivament entre 10 (prenent la part sencera) i repetim el procés fins
obtenir un quocient 0; el nombre de divisions fetes és el nombre de xifres.

Per exemple, amb `1234`:
```
1234/10 = 123
123/10 = 12
12/10 = 1
1/10 = 0
```
S'han fet 4 divisions fins obtenir un quocient 0, per tant el número té 4 xifres.

```
Entra un número enter positiu:
1234
El número 1234 té 4 xifres.
```

### Categoria 3 — For

#### 19 — Taula de multiplicar amb comptador d'errors, amb for (`TaulaMultiplicarErrorsFor`)
Igual que l'activitat 13 (demanar la taula de multiplicar d'un número entrat per
teclat i comptar els errors), però implementat fent servir un bucle `for`.

```
Entra un número:
6
6 × 1 = 6
correcte!
6 × 2 = 10
incorrecte!
6 × 3 = 18
correcte!
6 × 4 = 24
correcte!
6 × 5 = 30
correcte!
6 × 6 = 30
incorrecte!
6 × 7 = 42
correcte!
6 × 8 = 48
correcte!
6 × 9 = 54
correcte!
6 × 10 = 60
correcte!
Has comès 2 errors!
```

#### 20 — Cara o creu, 100 llançaments, amb for (`CaraCreuFor`)
Igual que l'activitat 11 (simula 100 llançaments d'una moneda i compta cares i
creus), però implementat fent servir un bucle `for`.

> Aquesta activitat fa servir `Random`, no té una sortida fixa per provar.

```
Cares: 53
Creus: 47
```
(el total sempre suma 100 — la sortida concreta varia cada execució.)

### Categoria 4 — Acumuladors

#### 21 — Suma acumulada, fins al 0 (`SumaFinsZero`)
Entra per teclat una seqüència de números acabada en 0 i vés-los sumant. Per cada
número (que no sigui el 0), mostra la suma acumulada fins ara. Quan s'entri el 0,
mostra la suma total.

```
Introdueix un número: 5
La suma fins ara és 5
Introdueix un número: 2
La suma fins ara és 7
Introdueix un número: 3
La suma fins ara és 10
Introdueix un número: 0
La suma total dels números introduïts és: 10
```

#### 22 — Mitjana de notes (`MitjanaNotes`)
Demana per teclat el número d'alumnes del grup i, per a cadascun, la seva nota.
Acumula les notes en una variable `suma` i, en acabar, calcula i mostra la mitjana
(la suma dividida entre el nombre d'alumnes).

```
Quants alumnes hi ha al grup?
4
Entra la nota de l'alumne 1:
5
Entra la nota de l'alumne 2:
7
Entra la nota de l'alumne 3:
8
Entra la nota de l'alumne 4:
6
La mitjana de les notes és: 6.5
```

#### 23 — Suma fins a més de 21 (`SumaMesDe21`)
L'usuari ha d'introduir enters positius entre 1 i 5. El programa avisa quan la suma
dels números introduïts passi de 21, mostrant la suma i el missatge "més de 21".
Si el número introduït no està entre 1 i 5, no se suma i es mostra "El número no
és correcte!".

```
Entra número: 3
Entra número: 5
Entra número: 2
Entra número: 8
El número no és correcte!
Entra número: 5
Entra número: 4
Entra número: 3
Més de 21! La suma dels números entrats és 22
```

#### 24 — Multiplicar amb sumes successives (`MultiplicarAmbSumes`)
Multiplica dos números enters positius entrats per teclat mitjançant sumes
successives (sumant el primer operand tantes vegades com indiqui el segon).

```
Operand 1:
5
Operand 2:
4
5 + 5 + 5 + 5 = 20
```

#### 25 — Més gran i més petit (`MesGranIMesPetit`)
Entra per teclat 20 números i troba'n el valor més gran i el més petit, comparant
cada número llegit amb els valors trobats fins ara.

```
Introdueix un número:
5
Introdueix un número:
2
Introdueix un número:
3
...
El número més gran és: 15 i el més petit: 2
```

#### 26 — Mitjana, nota més gran i nota més petita (`NotesMitjanaMaxMin`)
Demana per teclat el número d'alumnes del grup i, per a cadascun, la seva nota.
Calcula i mostra la mitjana de les notes, la nota més gran i la nota més petita
(combinant l'acumulador de la suma amb la comparació de màxim i mínim).

```
Quants alumnes hi ha al grup?
4
Entra la nota de l'alumne 1:
5
Entra la nota de l'alumne 2:
7
Entra la nota de l'alumne 3:
8
Entra la nota de l'alumne 4:
6
La mitjana de les notes és: 6.5
La nota més gran és: 8.0
La nota més petita és: 5.0
```
