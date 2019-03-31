package rdf_dsl.entity

import rdf_dsl.namespace.{Namespace, Uri}

trait Entity
abstract class UriEntity(val name: String)(implicit namespace: Namespace) extends Uri(name) with Entity {
  def triples: Seq[Triple] = Seq.empty

  override def toString: String = short
}

abstract class LiteralEntity extends Entity {
  def literalString: String
}