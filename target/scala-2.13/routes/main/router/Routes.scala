// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  Application_0: controllers.Application,
  // @LINE:19
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    Application_0: controllers.Application,
    // @LINE:19
    Assets_1: controllers.Assets
  ) = this(errorHandler, Application_0, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fetch""", """controllers.Application.fetch(query:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """navToRepositoryDetails""", """controllers.Application.navToRepositoryDetails(issuesUrl:String, commitsUrl:String, pullsUrl:String, login:String, name:String, description:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fetchIssues""", """controllers.Application.fetchIssues()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fetchCommits""", """controllers.Application.fetchCommits()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fetchPulls""", """controllers.Application.fetchPulls()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """back""", """controllers.Application.back()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """topics""", """controllers.Application.topics(query:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/""" + "$" + """user<[^/]+>""", """controllers.Application.fetchUsers(user:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/""" + "$" + """user<[^/]+>/repos""", """controllers.Application.fetchUsersRepos(user:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page
 An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_fetch1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fetch")))
  )
  private[this] lazy val controllers_Application_fetch1_invoker = createInvoker(
    Application_0.fetch(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "fetch",
      Seq(classOf[String]),
      "GET",
      this.prefix + """fetch""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_navToRepositoryDetails2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("navToRepositoryDetails")))
  )
  private[this] lazy val controllers_Application_navToRepositoryDetails2_invoker = createInvoker(
    Application_0.navToRepositoryDetails(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "navToRepositoryDetails",
      Seq(classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String]),
      "GET",
      this.prefix + """navToRepositoryDetails""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_fetchIssues3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fetchIssues")))
  )
  private[this] lazy val controllers_Application_fetchIssues3_invoker = createInvoker(
    Application_0.fetchIssues(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "fetchIssues",
      Nil,
      "GET",
      this.prefix + """fetchIssues""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_fetchCommits4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fetchCommits")))
  )
  private[this] lazy val controllers_Application_fetchCommits4_invoker = createInvoker(
    Application_0.fetchCommits(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "fetchCommits",
      Nil,
      "GET",
      this.prefix + """fetchCommits""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Application_fetchPulls5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fetchPulls")))
  )
  private[this] lazy val controllers_Application_fetchPulls5_invoker = createInvoker(
    Application_0.fetchPulls(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "fetchPulls",
      Nil,
      "GET",
      this.prefix + """fetchPulls""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Application_back6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("back")))
  )
  private[this] lazy val controllers_Application_back6_invoker = createInvoker(
    Application_0.back(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "back",
      Nil,
      "GET",
      this.prefix + """back""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Application_topics7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("topics")))
  )
  private[this] lazy val controllers_Application_topics7_invoker = createInvoker(
    Application_0.topics(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "topics",
      Seq(classOf[String]),
      "GET",
      this.prefix + """topics""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Application_fetchUsers8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("user", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_fetchUsers8_invoker = createInvoker(
    Application_0.fetchUsers(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "fetchUsers",
      Seq(classOf[String]),
      "GET",
      this.prefix + """users/""" + "$" + """user<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Application_fetchUsersRepos9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("user", """[^/]+""",true), StaticPart("/repos")))
  )
  private[this] lazy val controllers_Application_fetchUsersRepos9_invoker = createInvoker(
    Application_0.fetchUsersRepos(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "fetchUsersRepos",
      Seq(classOf[String]),
      "GET",
      this.prefix + """users/""" + "$" + """user<[^/]+>/repos""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Assets_versioned10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned10_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_Application_index0_route(params@_) =>
      call { 
        controllers_Application_index0_invoker.call(Application_0.index)
      }
  
    // @LINE:8
    case controllers_Application_fetch1_route(params@_) =>
      call(params.fromQuery[String]("query", None)) { (query) =>
        controllers_Application_fetch1_invoker.call(Application_0.fetch(query))
      }
  
    // @LINE:9
    case controllers_Application_navToRepositoryDetails2_route(params@_) =>
      call(params.fromQuery[String]("issuesUrl", None), params.fromQuery[String]("commitsUrl", None), params.fromQuery[String]("pullsUrl", None), params.fromQuery[String]("login", None), params.fromQuery[String]("name", None), params.fromQuery[String]("description", None)) { (issuesUrl, commitsUrl, pullsUrl, login, name, description) =>
        controllers_Application_navToRepositoryDetails2_invoker.call(Application_0.navToRepositoryDetails(issuesUrl, commitsUrl, pullsUrl, login, name, description))
      }
  
    // @LINE:10
    case controllers_Application_fetchIssues3_route(params@_) =>
      call { 
        controllers_Application_fetchIssues3_invoker.call(Application_0.fetchIssues())
      }
  
    // @LINE:11
    case controllers_Application_fetchCommits4_route(params@_) =>
      call { 
        controllers_Application_fetchCommits4_invoker.call(Application_0.fetchCommits())
      }
  
    // @LINE:12
    case controllers_Application_fetchPulls5_route(params@_) =>
      call { 
        controllers_Application_fetchPulls5_invoker.call(Application_0.fetchPulls())
      }
  
    // @LINE:13
    case controllers_Application_back6_route(params@_) =>
      call { 
        controllers_Application_back6_invoker.call(Application_0.back())
      }
  
    // @LINE:14
    case controllers_Application_topics7_route(params@_) =>
      call(params.fromQuery[String]("query", None)) { (query) =>
        controllers_Application_topics7_invoker.call(Application_0.topics(query))
      }
  
    // @LINE:15
    case controllers_Application_fetchUsers8_route(params@_) =>
      call(params.fromPath[String]("user", None)) { (user) =>
        controllers_Application_fetchUsers8_invoker.call(Application_0.fetchUsers(user))
      }
  
    // @LINE:16
    case controllers_Application_fetchUsersRepos9_route(params@_) =>
      call(params.fromPath[String]("user", None)) { (user) =>
        controllers_Application_fetchUsersRepos9_invoker.call(Application_0.fetchUsersRepos(user))
      }
  
    // @LINE:19
    case controllers_Assets_versioned10_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned10_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
