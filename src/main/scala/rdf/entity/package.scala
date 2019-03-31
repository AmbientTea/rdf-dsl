package rdf

import rdf.namespace.Uri

package object entity {
  type Triple = (Uri, Property, Uri)
}
