package rdf_dsl.namespaces

import rdf_dsl.entity
import rdf_dsl.entity.Property
import rdf_dsl.namespace.Namespace

object rdfs extends Namespace(
  alias = "rdfs",
  scheme = "http",
  authority = "www.w3.org",
  path = "2000/01/rdf-schema".split("/").toList) {

  object Class extends entity.Class("Class")

  object subClassOf extends Property[entity.Class, entity.Class]("subClassOf")

  object subPropertyOf extends Property[Property[_, _], Property[_, _]]("subPropertyOf")

}