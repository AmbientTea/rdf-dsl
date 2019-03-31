package rdf_dsl.namespaces

import rdf_dsl.entity
import rdf_dsl.entity.UriEntity
import rdf_dsl.namespace.Namespace

object rdf extends Namespace(
  alias = "rdf",
  scheme = "http",
  authority = "www.w3.org",
  path = "1999/02/22-rdf-syntax-ns".split("/").toList) {

  object Property extends entity.Class("Property")

  object `type` extends entity.Property[UriEntity, entity.Class]("type")

  def typ: `type`.type = `type`
}