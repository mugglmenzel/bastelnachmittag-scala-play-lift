Bastelnachmittag mit Scala, Play!, Lift
=======================================

Dieser Bastelnachmittag steht im Zeichen zweier Web Frameworks, die auf der Programmiersprache Scala basieren. Vorkenntnisse sind keine besonderen nötig, als Absolvent eines Informatikstudiengangs sollte jeder Teilnehmer ausreichendes Vorwissen haben.

## Vorbereitung ##

Voraussetzung ist lediglich [Java JDK+JRE](//www.java.com) sind installiert und dieses Repo wurde mit [git](http://git-scm.com/downloads) geklont.

Außerdem gibt es einige Vorbereitungen zu treffen, die unnötige Aufgaben aus dem Bastelnachmittag fern halten. 
Als IDE schlage ich IntelliJ vor. Wer es aber mit Eclipse versuchen will sollte auch glücklich werden. Daher ist der letzte Schritt optional.


1. Scala Compiler + Libraries herunterladen (http://scala-lang.org)
2. Play Framework Console herunterladen und installieren (http://playframework.com)
3. Maven herunterladen und installieren (http://maven.apache.org)
4. Play Musterprojekt herunterladen (in diesem Repo)
5. Lift Musterprojekt herunterladen (in diesem Repo)
6. (Optional) IntelliJ installieren (http://jetbrains.com/idea)


Um die Vorbereitungen zu treffen nun folgend eine Anleitung, die die nötigen Schritte erklärt, um die 5 zuvor genannten Aufgaben zu erledigen.


### 1. Scala

Nutzt die Downloads auf der offiziellen [Scala Download][scala-download] Webseite, um euch die passende Version für euer Betriebssystem herunterzuladen. Das Archiv solltet ihr am besten in euren Nutzerordner entpacken (bspw. ~/ oder /Users/ohaicat/).

Dieser Schritt ist nur zur Absicherung, da die IDEs meist einen Ordner mit dem Compiler und den Libraries (wie bei Java) genannt bekommen wollen. Maven zieht die nötigen Libraries und den Compiler aber selbstständig. 


### 2. Play! Framework

Für Play! muss ein Archiv heruntergeladen werden von der [Play! Framework Download][play-download] Seite. Wir einigen uns auf Version 2.1.1. Das heruntergeladene Archiv soll in den Nuterordner entpackt werden (bspw. ~/ oder /Users/nicolascage/). 

Außerdem muss die Play!-Konsole in den Path des Betriebssystems eingetragen werden. Für Windows steht eine .bat zur Verfügung und der Ordner kann ebenfalls einfach eingetragen werden. Dazu am besten den Schritten in der Anleitung auf der Play! Webseite im  [Play! Installation Guide][play-install] folgen.
Letzendlich muss der Befehl `play` auf der Konsole verfügbar sein.

Der *Getting Started* Guide in der [Play! Documentation][play-docs] kann ebenfalls bereits durchgelesen werden, um sich vorab ein wenig mit Play! vertraut zu machen.

Wir werden Play! hauptsächlich in Java implementieren und durch die Views langsam an Scala herantasten. Erst in Lift lassen wir uns ganz und gar auf Scala ein.


### 3. Maven

Bitte ladet euch die neueste Version von Maven herunter und installiert dieses. Die Downloads findet ihr auf der Maven-Webseite unter [Maven Download and Installation Guide][maven-install]. Weiter unten auf der Downloadsseite findet sich eine Anleitung zum Installieren von Maven für Windows- und Unix-Systeme. 

Bitte stellt sicher, dass ihr `mvn --version` erfolgreich auf der Konsole ausführen könnt.


### 4. Musterprojekt Play

Im Hauptordner dieses Repos findet ihr ein [Musterprojekt für das Play! Framework](/play-sample-project), dass wir als Grundlage nutzen werden. Dieses werden wir zunächst betrachten und dann einige Neuerungen implementieren.


### 5. Musterprojekt Lift

Im Hauptordner dieses Repos findet ihr ein [Musterprojekt für das Lift Framework](/lift-sample-project), dass wir als Grundlage nutzen werden. Dieses werden wir zunächst betrachten und dann mit der Scala Programmierung in Lift starten.

Weitere Beispielprojekte findet man im Download des [Lift Frameworks][lift-download].


### 6. IntelliJ IDE

IntelliJ ist eine IDE, die als lizenzierte Software oder als kostenlose community edition angeboten wird. Letzteres lässt sich von [IntelliJ IDEA Download][idea-download] herunterladen und installieren.

Wichtig ist es die passenden Plugins vorab zu installieren. Wichtig ist vorallem das Scala Plugin. Dieses findet ihr im Plugin Repository in der IDE ( *Preferences* -> *Plugins* ). Dieses sollte zumindest installiert sein. Hilfreich ist auch das Maven Plug-In, um Befehle direkt aus der IDE anstarten zu können.

Sollte dies alles vorhanden sein, ist auch die IDE einsatzbereit. Wer möchte kann bereits versuchen die beiden Projekte in IntelliJ zu importieren. Das geht mit der Maven-Datei beim Lift Musterprojekt oder bei Play! lässt sich die vollständige Projektbeschreibung mit dem Befehl "idea" auf der Konsole erstellen.



## Ziel & Aufgabe

Wir programmieren eine kleine Todo-Listen-Webanwendung.



* * *

## Links ##
* [Scala Download][scala-download]
* [Play! Download][play-download]
* [Play! Installation Guide][play-install]
* [Play! Documentation][play-docs]
* [Maven Download and Installation Guide][maven-install]
* [IntelliJ IDEA Download][idea-download]


[scala-download]: http://www.scala-lang.org/downloads "Scala Download"
[play-download]: http://www.playframework.com/download "Play! Framework Download"
[play-install]: http://www.playframework.com/documentation/2.1.1/Installing "Play! Installation Guide"
[play-docs]: http://www.playframework.com/documentation/2.1.1/Home "Play! Documentation"
[lift-download]: http://liftweb.net/download "Lift Download"
[maven-install]: http://maven.apache.org/download.cgi "Maven Download and Installation Guide"
[idea-download]: http://www.jetbrains.com/idea/download/index.html "IntelliJ IDEA Community Edition Download"
