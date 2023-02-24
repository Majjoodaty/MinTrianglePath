package suprnation

import scala.util.Try

object MinTrianglePath {
  type Row = Vector[Int]
  type Triangle = Vector[Row]

  case class Path(total: Int, nodes: List[Int])

  implicit class PathEnrichment(path: Path) {
    def prettyText(): String = s"Minimal path is: ${path.nodes.mkString(" + ")} = ${path.total}"
  }

  def findMinTrianglePath(t: Triangle): Option[Path] = t.foldRight(Vector[Path]())(merge).headOption

  def buildTriangle(rows: List[String]): Try[Triangle] =
    Try(rows.toVector.map(_.split(' ').map(x => x.toInt).toVector))

  private def merge(t: Row, paths: Vector[Path]): Vector[Path] =
    for {i <- t.indices.toVector} yield {
      val selectedNode: Path = if (paths.isEmpty) Path(0, Nil) else List(paths(i), paths(i + 1)).minBy(_.total)
      val newTotal = t(i) + selectedNode.total
      Path(total = newTotal, nodes = t(i) +: selectedNode.nodes)
    }
}
