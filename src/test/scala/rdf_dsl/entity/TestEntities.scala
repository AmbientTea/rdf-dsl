package rdf_dsl.entity

import rdf_dsl.namespace.Namespace

object TestEntities {

  class ExampleNamespace extends Namespace(
    alias = "example",
    "http",
    "example.com",
    List("path")
  )

}
