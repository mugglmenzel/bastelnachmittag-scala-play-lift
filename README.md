Bastelnachmittag mit Scala, Play, Lift
======================================

Dieser Bastelnachmittag steht im Zeichen zweier Web Frameworks, die auf der Programmiersprache Scala basieren. Vorkenntnisse sind keine besonderen nötig, als Absolvent eines Informatikstudiengangs sollte jeder Teilnehmer ausreichendes Vorwissen haben.
Also IDE schlage ich IntelliJ vor. Wer es aber mit Eclipse versuchen will sollte auch glücklich werden.

Allerdings gibt es einige Vorbereitungen zu treffen, die unnötige Aufgaben aus dem Bastelnachmittag fern halten. 

[X] Java JDK+JRE installiert haben (java.com)

1. Scala Compiler + Libraries herunterladen (scala-lang.org)

2. Play Framework Console herunterladen und installieren (playframework.com)

3. Maven herunterladen und installieren (maven.apache.org)

4. Play Musterprojekt herunterladen (in diesem Repo)

5. Lift Musterprojekt herunterladen (in diesem Repo)

6. (Optional) IntelliJ installieren (jetbrains.com/idea)


Um die Vorbereitungen zu treffen nun folgend eine Anleitung, die die nötigen Schritte erklärt, um die 5 zuvorgenannten Aufgaben zu erledigen.

1. Scala
--------

Nutzt die Downloads auf der offiziellen Scala Webseite unter http://www.scala-lang.org/downloads, um euch die passende Version für euer Betriebssystem herunterzuladen. Das Archiv solltet ihr am besten in euren Nutzerordner entpacken (bspw. ~/ oder /Users/ohaicat/).

Dieser Schritt ist nur zur Absicherung, da die IDEs meist einen Ordner mit dem Compiler und den Libraries (wie bei Java) genannt bekommen wollen. Maven zieht die nötigen Libraries und den Compiler aber selbstständig. 

2. Play! Framework
-----------------

Für Play! muss ein Archiv heruntergeladen werden von http://www.playframework.com/download. Wir einigen uns auf Version 2.1.1. Das heruntergeladene Archiv soll in den Nuterordner entpackt werden (bspw. ~/ oder /Users/nicolascage/). 

Außerdem muss die Play!-Konsole in den Path des Betriebssystems eingetragen werden. Für Windows steht eine .bat zur Verfügung und der Ordner kann ebenfalls einfach eingetragen werden. Dazu am besten den Schritten in der Anleitung auf der Play! Webseite folgen: http://www.playframework.com/documentation/2.1.1/Installing

Der "Getting Started" Guide kann ebenfalls bereits durchgelesen werden, um sich vorab ein wenig mit Play! vertraut zu machen: http://www.playframework.com/documentation/2.1.1/Home

Wir werden Play! hauptsächlich in Java implementieren und durch die Views langsam an Scala herantasten. Erst in Lift lassen wir uns ganz und gar auf Scala ein.

3. Maven
--------

Bitte ladet euch die neueste Version von Maven herunter und installiert dieses. Die Downloads findet ihr unter http://maven.apache.org/download.cgi. Weiter unten auf der Downloadsseite findet sich eine Anleitung zum Installieren von Maven für Windows- und Unix-Systeme. 

Bitte stellt sicher, dass ihr "mvn --version erfolgreich auf der Konsole ausführen könnt.

4. Musterprojekt Play
---------------------

Im Hauptordner dieses Repos findet ihr ein Musterprojekt für das Play! Framework, dass wir als Grundlage nutzen werden. Dieses werden wir zunächst betrachten und dann einige Neuerungen implementieren.

5. Musterprojekt Lift
---------------------

Im Hauptordner dieses Repos findet ihr ein Musterprojekt für das Lift Framework, dass wir als Grundlage nutzen werden. Dieses werden wir zunächst betrachten und dann mit der Scala Programmierung in Lift starten.

6. IntelliJ IDE
---------------

IntelliJ ist eine IDE, die als lizenzierte Software oder als kostenlose community edition angeboten wird. Letzteres lässt sich von http://www.jetbrains.com/idea/download/index.html herunterladen und installieren.

Wichtig ist es die passenden Plu-Ins vorab zu installieren. Wichtig ist vorallem das Scala Plugin. Dieses findet ihr im Plug-In Repository in der IDE (File -> Plug-Ins). Dieses sollte zumindest installiert sein. Hilfreich ist auch das Maven Plug-In, um Befehle direkt aus der IDE anstarten zu können.

Sollte dies alles vorhanden sein, ist auch die IDE einsatzbereit. Wer möchte kann bereits versuchen die beiden Projekte in IntelliJ zu importieren. Das geht mit der Maven-Datei beim Lift Musterprojekt oder bei Play! lässt sich die vollständige Projektbeschreibung mit dem Befehl "idea" auf der Konsole erstellen.

