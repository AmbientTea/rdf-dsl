package rdf_dsl.entity

import _root_.rdf_dsl.entity.TestEntities._
import org.scalatest.{Matchers, WordSpec}
import rdf_dsl.namespaces._

class ClassTest extends WordSpec with Matchers {

  object namespace extends ExampleNamespace {

    object SomeClass extends Class("SomeClass")

  }

  import namespace._

  "classes" should {
    "translate to triples" in {
      SomeClass.triples should contain theSameElementsAs List(
        (SomeClass, rdf.typ, rdfs.Class)
      )
    }
  }

}
