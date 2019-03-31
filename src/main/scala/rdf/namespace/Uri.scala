package rdf.namespace

class Uri(fragment: String)(implicit namespace: Namespace) {
  def uriString: String = s"${namespace.fullString}#$fragment"

  def short: String = s"${namespace.alias}:$fragment"
}
