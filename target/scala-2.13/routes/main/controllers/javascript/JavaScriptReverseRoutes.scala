// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Benhanan/Desktop/play-samples-play-java-hello-world-tutorial/conf/routes
// @DATE:Thu Dec 31 18:16:37 IST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers.javascript {

  // @LINE:16
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def postTest: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.postTest",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/postTest"})
        }
      """
    )
  
  }

  // @LINE:5
  class ReverseFrontendController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FrontendController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseClubMatchController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def getClubs2: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClubMatchController.getClubs2",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clubs2"})
        }
      """
    )
  
    // @LINE:11
    def getClubs3: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClubMatchController.getClubs3",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clubs3"})
        }
      """
    )
  
    // @LINE:7
    def getClubs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClubMatchController.getClubs",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clubs"})
        }
      """
    )
  
    // @LINE:13
    def getMatches: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClubMatchController.getMatches",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "matches"})
        }
      """
    )
  
  }


}
