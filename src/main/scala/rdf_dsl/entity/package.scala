package rdf_dsl

package object entity {
  type PTriple[S <: UriEntity, O <: Entity] = (S, Property[S, O], O)
  type Triple = PTriple[_, _]
}
