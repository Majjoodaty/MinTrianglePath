package suprnation

import scala.io.Source
import scala.util.{Failure, Success, Using}

object MinTrianglePathApp extends App {

  import MinTrianglePath._

  private val fileName = args.headOption.getOrElse("")

  private val lines = Using(Source.fromFile(fileName)) { source =>
    source.getLines().toList
  } match {
    case Success(res) => res
    case Failure(ex) => println(s"Failed with exception: ${ex.getMessage}"); List()
  }

  buildTriangle(lines) match {
    case Success(t) =>
      findMinTrianglePath(t) match {
        case Some(path) => println(path.prettyText())
        case _ => println("No minimum path were found")
      }
    case Failure(e) => println(e)
  }
}
