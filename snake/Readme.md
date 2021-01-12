# 0 Thorben

# 2 Definition

Eine Schlange ist eine weiterer Datentyp Daten zu speichern. Es besitzt die Eigenschaften einer aus dem Alltag bekannten Warteschlange. So kann nur auf das erste Element in der Schlange zu gegriffen werden, welches auch als einziges aus jener entfernt werden kann.
Wird ein neues Element dieser Datenstruktur hinzugefügt, so wird es der Schlange hinten angefügt. Des Weiteren kann dementsprechend nur das erste hinzugefügte Element als erstes entfernt werden.
Dieses Prinzip heißt FIFO (first in, first out).
Damit die Datenstruktur Schlange funktioniert, besitzt sie ein Attribut, welches auf den Kopf der Schlange zeigt.
Außerdem besitzt jedes Objekt „Knoten“ in der Schlange neben einer Referenz auf die zugehörigen Daten noch eine Referenz auf die vorherigen Knoten. Über diese Verkettung ist es nur möglich vom Kopf der Schlange zum Ende zu gelangen, welches schlussendlich auf „null“ zeigen muss.
Um die Datenstruktur Schlange zu bearbeiten, gibt es hauptsächlich vier Methoden. Zum einen die Methode „isEmpty()“, welche überprüft, ob jene leer ist. Ist dies der Fall so ist es möglich, per Methode „first()“ das erste Schlangenelement hinzuzufügen. Mit „add(e)“ lassen sich dann weitere übergebene Elemente der Schlange anhängen. Und über die die Methode „remove()“ kann der Benutzer wieder das erste Schlangenelement entfernen, solange die Methode „isEmpty()“ die Schlange nicht als leer bestätigt.

# 3

## a

Bei der fügeHinzu Methode schwanz auf den nächsten Knoten gesetzt.

## b

- Eine for Schleife eingebaut zum testen.
- GibLänge Methode hinzugefügt.
- Datentyp auf int gesetzt.
- Gibkopfdaten augegeben.

# 4 Snake

## Funktionsweise

1. Wenn die Schlange grünes Essen findet erhöht sich ihre Länge.
2. Wenn die Schlange rotes Essen findet verringert sich ihre Länge.
3. Wenn die Schlange sich selber, den Rand oder eine andere Schlange berührt ist das Spiel vorbei.

## Umsetzung

Mit einer Schlange könnte die 1. Anforderung erfüllt werden: Es wird ein Körperteil an die
Schlange gehängt. Die 2. Anforderung ist jedoch schwieriger. So würde der Kopf der Snake beim
berühren des roten Essens entfernt werden. Ein nicht gewünschtes Verhalten. Eine mögliche Lösung wäre es einen Stack/Stapel zu benutzen. Bei dem wird das zuletzt hinzugefügte Element wieder entfernt. Ein Verhalten, das so erwünscht wäre. Anforderung 3 ist trivial, da sie mit beiden Datenstrukturen umgesetzt werden kann.

```

            Stack                                         Schlange


             ++ ++ ++ ++ ++ +------+                     ++ ++ ++ ++ ++ +------+
   +-------> || || || || || |      |                     || || || || || |      |
             || || || || || | Kopf |            +------> || || || || || | Kopf | +-------->
   <-------+ || || || || || |      |                     || || || || || |      |
             ++ ++ ++ ++ ++ +------+                     ++ ++ ++ ++ ++ +------+


```
