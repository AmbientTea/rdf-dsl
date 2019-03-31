package rdf_dsl.entity

import rdf_dsl.namespace.Namespace
import rdf_dsl.namespaces._

class Class(name: String)(implicit namespace: Namespace) extends UriEntity(name) {
  self =>
  override def triples: Seq[Triple] = Seq(
    (this, a, rdfs.Class)
  )
}