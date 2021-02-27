// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Benhanan/Desktop/play-samples-play-java-hello-world-tutorial/conf/routes
// @DATE:Thu Jan 14 19:59:49 IST 2021

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers {

  // @LINE:16
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def postTest(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/postTest")
    }
  
  }

  // @LINE:5
  class ReverseFrontendController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:7
  class ReverseClubMatchController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def getClubs2(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "clubs2")
    }
  
    // @LINE:11
    def getClubs3(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "clubs3")
    }
  
    // @LINE:7
    def getClubs(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "clubs")
    }
  
    // @LINE:13
    def getMatches(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "matches")
    }
  
  }


}
