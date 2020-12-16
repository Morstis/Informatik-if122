# Aufgabe 2

Ein Stack ist eine Liste, die immer den zuletzt hinzugefügten Eintrag zurück gibt.

## push

Fügt der Liste einen Knoten hinzu

## peek

Gibt den zuletzt hinzugefügten Knoten zurück

## pop

Gleiches, wie peek, nur das der Knoten noch gelöscht wird

## isEmpty

Überprüfe, ob Knoten vorhanden sind.

# Aufgabe 3

Die Datenstruktur ist geeignet, da genau wie beim Spiel nur der Letzte Knoten einer Liste
erforderlich ist. So wäre eine normale verkettete Liste ungeeignet, da jedes Mal durch die
gesamte Liste geloopt werden muss, um den letzten Knoten zu erreicht.
Mit der [pop]{#pop} Methode wird außerdem gleichzeitig die Entfernung des obersten
Bausteines bewirkt. Daten unter dem oberen Baustein interessieren uns außerdem nicht,
sodass ein Türm der "Türme von Hanoi" die Definition eines Stacks ist.
