Bastelnachmittag mit Scala, Play, Lift
======================================

Dieser Bastelnachmittag steht im Zeichen zweier Web Frameworks, die auf der Programmiersprache Scala basieren. Vorkenntnisse sind keine besonderen nötig, als Absolvent eines Informatikstudiengangs sollte jeder Teilnehmer ausreichendes Vorwissen haben.
Also IDE schlage ich IntelliJ vor. Wer es aber mit Eclipse versuchen will sollte auch glücklich werden.

Allerdings gibt es einige Vorbereitungen zu treffen, die unnötige Aufgaben aus dem Bastelnachmittag fern halten. 

1. Scala Compiler + Libraries herunterladen (scala-lang.org)
2. Play Framework Console herunterladen und installieren (playframework.com)
3. 5. Maven herunterladen und installieren
4. Play Musterprojekt herunterladen (in diesem Repo)
5. Lift Musterprojekt herunterladen (in diesem Repo)


Um die Vorbereitungen zu treffen nun folgend eine Anleitung, die die nötigen Schritte erklären sollte, um die 5 zuvorgenannten Aufgaben zu erledigen.

1. Scala
--------

Nutzt die Downloads auf der offiziellen Scala Webseite unter http://www.scala-lang.org/downloads, um euch die passende Version für euer Betriebssystem herunterzuladen. Das Archiv solltet ihr am besten in euren Nutzerordner entpacken (bspw. ~/ oder /Users/ohaicat/).
Dieser Schritt ist nur zur Absicherung, da die IDEs meist einen Ordner mit dem Compiler und den Libraries (wie bei Java) genannt bekommen wollen. Maven zieht die nötigen Libraries und den Compiler aber selbstständig. 

2. Play! Framework
-----------------

Für Play! muss ein Archiv heruntergeladen werden von http://www.playframework.com/download. Wir einigen uns auf Version 2.1.1. Das heruntergeladene Archiv soll in den Nuterordner entpackt werden (bspw. ~/ oder /Users/nicolascage/). 
Außerdem muss die Play!-Konsole in den Path des Betriebssystems eingetragen werden. Für Windows steht eine .bat zur Verfügung und der Ordner kann ebenfalls einfach eingetragen werden. Dazu am besten den Schritten in der Anleitung auf der Play! Webseite folgen: http://www.playframework.com/documentation/2.1.1/Installing
Der getting Started Guide kann ebenfalls bereits einmal durchgelesen werden, um sich vorab ein wenig mit Play vertraut zu machen: http://www.playframework.com/documentation/2.1.1/Home

Wir werden Play! hauptsächlich in Java implementieren und durch die Views langsam an Scala herantasten. Erst in Lift lassen wir uns ganz und gar auf Scala ein.

3. Maven
--------


4. Musterprojekt Play
---------------------

Im Hauptordner dieses Repos findet ihr ein Musterprojekt für das Play! Framework, dass wir als Grundlage nutzen werden. Dieses werden wir zunächst betrachten und dann einige Neuerungen implementieren.

5. Musterprojekt Lift
---------------------

Im Hauptordner dieses Repos findet ihr ein Musterprojekt für das Lift Framework, dass wir als Grundlage nutzen werden. Dieses werden wir zunächst betrachten und dann mit der Scala Programmierung in Lift starten.



