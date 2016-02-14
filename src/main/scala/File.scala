import java.nio.file.{Files, Paths}

import scala.io.Source

/**
  * Created by nasimsalmani on 2/14/16.
  */
class File {
  def readFile(path: String) = {
    val filename = "play-list"
    val lines = Source.fromFile("/Users/nasimsalmani/Desktop/PlayList/play-list.rtf").getLines.toList
    for (line <- Source.fromFile(filename).getLines) {
      processFileLineByLine(line)
    }
  }

  def processFileLineByLine(line: String) = {
    val newLine = line.replace(" ", "")
    val newPath = "/Users/nasimsalmani/Desktop/copyPlayList/new-play-list"
    copyFile(newLine, newPath)
  }

  def copyFile(from: String, to: String) {
    val out = new java.io.BufferedWriter(new java.io.FileWriter(to));
    io.Source.fromFile(from).getLines.foreach(s => out.write(s, 0, s.length));
    out.close()
  }


}
