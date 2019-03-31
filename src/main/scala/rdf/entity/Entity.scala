package rdf.entity

import rdf.namespace.{Namespace, Uri}

trait Entity
abstract class UriEntity(val name: String)(implicit namespace: Namespace) extends Uri(name) with Entity {
  def triples: Seq[Triple] = Seq.empty
}

abstract class LiteralEntity extends Entity {
  def literalString: String
}