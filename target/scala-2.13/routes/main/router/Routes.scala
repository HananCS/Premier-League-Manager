// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Benhanan/Desktop/play-samples-play-java-hello-world-tutorial/conf/routes
// @DATE:Thu Dec 31 18:16:37 IST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  FrontendController_2: controllers.FrontendController,
  // @LINE:7
  ClubMatchController_0: controllers.ClubMatchController,
  // @LINE:16
  HomeController_1: controllers.HomeController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    FrontendController_2: controllers.FrontendController,
    // @LINE:7
    ClubMatchController_0: controllers.ClubMatchController,
    // @LINE:16
    HomeController_1: controllers.HomeController
  ) = this(errorHandler, FrontendController_2, ClubMatchController_0, HomeController_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, FrontendController_2, ClubMatchController_0, HomeController_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.FrontendController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clubs""", """controllers.ClubMatchController.getClubs()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clubs2""", """controllers.ClubMatchController.getClubs2()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clubs3""", """controllers.ClubMatchController.getClubs3()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """matches""", """controllers.ClubMatchController.getMatches()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/postTest""", """controllers.HomeController.postTest()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_FrontendController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_FrontendController_index0_invoker = createInvoker(
    FrontendController_2.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FrontendController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_ClubMatchController_getClubs1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clubs")))
  )
  private[this] lazy val controllers_ClubMatchController_getClubs1_invoker = createInvoker(
    ClubMatchController_0.getClubs(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClubMatchController",
      "getClubs",
      Nil,
      "GET",
      this.prefix + """clubs""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_ClubMatchController_getClubs22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clubs2")))
  )
  private[this] lazy val controllers_ClubMatchController_getClubs22_invoker = createInvoker(
    ClubMatchController_0.getClubs2(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClubMatchController",
      "getClubs2",
      Nil,
      "GET",
      this.prefix + """clubs2""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ClubMatchController_getClubs33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clubs3")))
  )
  private[this] lazy val controllers_ClubMatchController_getClubs33_invoker = createInvoker(
    ClubMatchController_0.getClubs3(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClubMatchController",
      "getClubs3",
      Nil,
      "GET",
      this.prefix + """clubs3""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ClubMatchController_getMatches4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("matches")))
  )
  private[this] lazy val controllers_ClubMatchController_getMatches4_invoker = createInvoker(
    ClubMatchController_0.getMatches(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClubMatchController",
      "getMatches",
      Nil,
      "GET",
      this.prefix + """matches""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_postTest5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/postTest")))
  )
  private[this] lazy val controllers_HomeController_postTest5_invoker = createInvoker(
    HomeController_1.postTest(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "postTest",
      Nil,
      "POST",
      this.prefix + """api/postTest""",
      """ Test post request""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_FrontendController_index0_route(params@_) =>
      call { 
        controllers_FrontendController_index0_invoker.call(FrontendController_2.index())
      }
  
    // @LINE:7
    case controllers_ClubMatchController_getClubs1_route(params@_) =>
      call { 
        controllers_ClubMatchController_getClubs1_invoker.call(ClubMatchController_0.getClubs())
      }
  
    // @LINE:9
    case controllers_ClubMatchController_getClubs22_route(params@_) =>
      call { 
        controllers_ClubMatchController_getClubs22_invoker.call(ClubMatchController_0.getClubs2())
      }
  
    // @LINE:11
    case controllers_ClubMatchController_getClubs33_route(params@_) =>
      call { 
        controllers_ClubMatchController_getClubs33_invoker.call(ClubMatchController_0.getClubs3())
      }
  
    // @LINE:13
    case controllers_ClubMatchController_getMatches4_route(params@_) =>
      call { 
        controllers_ClubMatchController_getMatches4_invoker.call(ClubMatchController_0.getMatches())
      }
  
    // @LINE:16
    case controllers_HomeController_postTest5_route(params@_) =>
      call { 
        controllers_HomeController_postTest5_invoker.call(HomeController_1.postTest())
      }
  }
}
