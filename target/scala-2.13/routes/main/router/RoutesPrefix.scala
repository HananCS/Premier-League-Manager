// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Benhanan/Desktop/play-samples-play-java-hello-world-tutorial/conf/routes
// @DATE:Thu Jan 14 19:59:49 IST 2021


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
