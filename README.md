sbtstats
========

This repo contains the most bare-bones possible Scala specs2 test. 

`SBT_OPTS="-Xms512M -Xmx1536M -Xss1M -XX:+UseConcMarkSweepGC -XX:PermSize=256M -XX:MaxPermSize=512M"`

```
$ sbt --version
sbt launcher version 0.13.1
```

`scalaVersion := "2.10.3"`

`libraryDependencies ++= Seq("org.specs2" %% "specs2" % "2.3.7" % "test")`

How to reproduce these results in JProfiler 7.2.3 (Build 7172):  
Start Center -> New Session -> Quick Attach -> select `sbt-launch.jar` -> Sampling
