package rdf.namespace

import org.scalatest.{Matchers, WordSpec}

class NamespaceTest extends WordSpec with Matchers {
  object namespace extends Namespace(
    alias = "n",
    scheme = "http",
    authority = "example.com",
    path = List("path")
  ) {
    object uri1 extends Uri("uri1")
    object uri2 extends Uri("uri2")
  }

  import namespace._

  "Uris within namespace" should {
    "have valid uri strings" in {
      uri1.uriString shouldBe "http://example.com/path#uri1"
      uri2.uriString shouldBe "http://example.com/path#uri2"
    }

    "have valid short forms using namespace's alias" in {
      uri1.short shouldBe "n:uri1"
      uri2.short shouldBe "n:uri2"
    }
  }
}
