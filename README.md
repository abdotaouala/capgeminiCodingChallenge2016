# Capgemini Coding Challenge 2016
## Problèmes
### problème 1 :

Il est demandé de créer un code pour extraire un ensemble de caractères d’une phrase. 

Le programme traitera 3 lignes, chaque ligne contient la position de début de l’extraction, un espace, la position de fin d’extraction, un espace et pui une phrase. Le programme écrit l’ensemble des caractères extraits.

Pour la ligne suivante : "2 4 La maison du livre"

Étant "a" est dans la position 2, et "m" étant à la position 4, il faut extraire "a m".

Spécifications de l'entrée:

Le programme traitera 3 lignes, chaque ligne contient la position de début de l’extraction, un espace, la position de fin d’extraction, un espace et puis une phrase. 

Spécifications de la sortie:

Pour chaque ligne de l'entrée, le programme doit afficher l’ensemble des caractères extraits dans une ligne séparée.
```html
#### STDIN
2 4 La maison du livre
1 1 Surnomme "le roi de la pop"
1 100 Il a donne plus de 400 millions.

### STDOUT

Your solution should produce a similar result.
a m
S
Il a donne plus de 400 millions.
```
### Problème 2 :

Il est demandé de créer un code qui affiche le résultat de l'opération XOR de deux entiers bit par bit.

Exemple :

Image title

Le programme fait le traitement de deux binaires et retourne le résultat.  

Donc le résultat du programme doit être 111000

Spécifications de l'entrée:

L'entrée contient deux lignes, chacune contient un entier représenté sous le format binaire.

Spécifactions de la sortie:

Afficher une seule ligne contenant le résultat du processing comme expliqué dans l'exemple en haut.
```html
#### STDIN

10101010101010101
11011011011111000
### STDOUT
1110001110101101
```
### Problème 3 :
Division à l’infini  Algorithmic TLE  2 seconds  Start Coding
Il est demandé de créer un code pour afficher le nombre d’opérations de division arrondi à l’entier d’un chiffre par 3 pour avoir la valeur 0. 

Exemple : pour le chiffre 4

4 / 3 = 1, c’est une opération de division

1 / 3 = 0, c’est la seconde opération de division

Donc il faut 2 divisions pour obtenir le résultat 0.
Spécifications de l'entrée:
Le programme prend plusieurs lignes, chaque ligne contient un seul chiffre.
Spécifications de la sortie:
Pour chaque entier, afficher une seule ligne contenant le résultat.
```html
#### STDIN
4
3
10
0
10000000
### STDOUT
2
2
3
0
15
*```
### Problème 5 :
Tri simple  Algorithmic TLE  2 seconds  Start Coding
Il est demandé de créer un code pour ordonner une liste de chiffres du plus grand au plus petit. 

Spécifications de l'entrée:

Le programme prend en entrée deux lignes, chaque ligne contient  5 chiffres qu’il faut ordonner.

Spécifications de la sortie:

Pour chaque ligne de l'entrée, afficher le résultat dans une ligne séparée
```html
#### STDIN
12 45 8765 2 56
654 567 654 789 32

### STDOUT

8765 56 45 12 2
789 654 654 567 32
```
