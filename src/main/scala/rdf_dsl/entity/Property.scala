package rdf_dsl.entity

import rdf_dsl.namespace.Namespace
import rdf_dsl.namespaces._

class Property[Subject <: UriEntity, Object <: Entity](name: String)(implicit namespace: Namespace) extends UriEntity(name) {
  def apply(subj: Subject, obj: Object): Triple = (subj, this, obj)

  override def triples: Seq[Triple] = Seq(
    (this, a, rdf.Property)
  )
}