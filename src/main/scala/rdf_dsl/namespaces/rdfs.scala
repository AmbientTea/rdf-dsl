package rdf_dsl.namespaces

import rdf_dsl.entity
import rdf_dsl.entity.{Entity, Property}
import rdf_dsl.namespace.Namespace

object rdfs extends Namespace(
  alias = "rdfs",
  scheme = "http",
  authority = "www.w3.org",
  path = "2000/01/rdf-schema".split("/").toList) {

  object Resource extends entity.Class("Resource")

  object Class extends entity.Class("Class")

  object Literal extends entity.Class("Literal")

  object Datatype extends entity.Class("Datatype")

  object subClassOf extends Property[entity.Class, entity.Class]("subClassOf")

  object subPropertyOf extends Property[Property[_, _], Property[_, _]]("subPropertyOf")


  object domain extends Property[Property[_, _], Entity]("domain")

  object range extends Property[Property[_, _], Entity]("range")

  object seeAlso extends Property("seeAlso")

  object label extends Property("label")

  object comment extends Property("comment")

}