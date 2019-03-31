package rdf_dsl.namespace

abstract class Namespace(
                          val alias: String,
                          val scheme: String,
                          val authority: String,
                          val path: List[String]) {
  self =>

  implicit val namespace: Namespace = self

  def fullString: String = s"$scheme://$authority/${path mkString "/"}"
}