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
  // @LINE:25
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    Application_0: controllers.Application,
    // @LINE:25
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fetchRepositoriesWS""", """controllers.Application.fetchRepositoriesWS()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fetchIssuesWS""", """controllers.Application.fetchIssuesWS()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fetchCommitsWS""", """controllers.Application.fetchCommitsWS()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fetchPullsWS""", """controllers.Application.fetchPullsWS()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """navToRepositoryDetails""", """controllers.Application.navToRepositoryDetails(issuesUrl:String, commitsUrl:String, pullsUrl:String, login:String, name:String, description:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fetchIssues""", """controllers.Application.fetchIssues()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fetchCommits""", """controllers.Application.fetchCommits()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fetchPulls""", """controllers.Application.fetchPulls()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """back""", """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """topics""", """controllers.Application.topics(query:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/""" + "$" + """user<[^/]+>""", """controllers.Application.fetchUsers(user:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/""" + "$" + """user<[^/]+>/repos""", """controllers.Application.fetchUsersRepos(user:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """navToRepositoryDetailsWS/""" + "$" + """login<[^/]+>/""" + "$" + """name<[^/]+>/""" + "$" + """description<[^/]+>""", """controllers.Application.navToRepositoryDetailsWS(login:String, name:String, description:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(file:String)"""),
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
  private[this] lazy val controllers_Application_fetchRepositoriesWS2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fetchRepositoriesWS")))
  )
  private[this] lazy val controllers_Application_fetchRepositoriesWS2_invoker = createInvoker(
    Application_0.fetchRepositoriesWS(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "fetchRepositoriesWS",
      Nil,
      "GET",
      this.prefix + """fetchRepositoriesWS""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_fetchIssuesWS3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fetchIssuesWS")))
  )
  private[this] lazy val controllers_Application_fetchIssuesWS3_invoker = createInvoker(
    Application_0.fetchIssuesWS(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "fetchIssuesWS",
      Nil,
      "GET",
      this.prefix + """fetchIssuesWS""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_fetchCommitsWS4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fetchCommitsWS")))
  )
  private[this] lazy val controllers_Application_fetchCommitsWS4_invoker = createInvoker(
    Application_0.fetchCommitsWS(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "fetchCommitsWS",
      Nil,
      "GET",
      this.prefix + """fetchCommitsWS""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Application_fetchPullsWS5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fetchPullsWS")))
  )
  private[this] lazy val controllers_Application_fetchPullsWS5_invoker = createInvoker(
    Application_0.fetchPullsWS(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "fetchPullsWS",
      Nil,
      "GET",
      this.prefix + """fetchPullsWS""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Application_navToRepositoryDetails6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("navToRepositoryDetails")))
  )
  private[this] lazy val controllers_Application_navToRepositoryDetails6_invoker = createInvoker(
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

  // @LINE:14
  private[this] lazy val controllers_Application_fetchIssues7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fetchIssues")))
  )
  private[this] lazy val controllers_Application_fetchIssues7_invoker = createInvoker(
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

  // @LINE:15
  private[this] lazy val controllers_Application_fetchCommits8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fetchCommits")))
  )
  private[this] lazy val controllers_Application_fetchCommits8_invoker = createInvoker(
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

  // @LINE:16
  private[this] lazy val controllers_Application_fetchPulls9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fetchPulls")))
  )
  private[this] lazy val controllers_Application_fetchPulls9_invoker = createInvoker(
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

  // @LINE:17
  private[this] lazy val controllers_Application_index10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("back")))
  )
  private[this] lazy val controllers_Application_index10_invoker = createInvoker(
    Application_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      this.prefix + """back""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_topics11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("topics")))
  )
  private[this] lazy val controllers_Application_topics11_invoker = createInvoker(
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

  // @LINE:19
  private[this] lazy val controllers_Application_fetchUsers12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("user", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_fetchUsers12_invoker = createInvoker(
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

  // @LINE:20
  private[this] lazy val controllers_Application_fetchUsersRepos13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("user", """[^/]+""",true), StaticPart("/repos")))
  )
  private[this] lazy val controllers_Application_fetchUsersRepos13_invoker = createInvoker(
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

  // @LINE:21
  private[this] lazy val controllers_Application_navToRepositoryDetailsWS14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("navToRepositoryDetailsWS/"), DynamicPart("login", """[^/]+""",true), StaticPart("/"), DynamicPart("name", """[^/]+""",true), StaticPart("/"), DynamicPart("description", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_navToRepositoryDetailsWS14_invoker = createInvoker(
    Application_0.navToRepositoryDetailsWS(fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "navToRepositoryDetailsWS",
      Seq(classOf[String], classOf[String], classOf[String]),
      "GET",
      this.prefix + """navToRepositoryDetailsWS/""" + "$" + """login<[^/]+>/""" + "$" + """name<[^/]+>/""" + "$" + """description<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Assets_versioned15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned15_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path
GET     /assets/*file               controllers.Assets.versioned(path="/public", file: Asset)""",
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
    case controllers_Application_fetchRepositoriesWS2_route(params@_) =>
      call { 
        controllers_Application_fetchRepositoriesWS2_invoker.call(Application_0.fetchRepositoriesWS())
      }
  
    // @LINE:10
    case controllers_Application_fetchIssuesWS3_route(params@_) =>
      call { 
        controllers_Application_fetchIssuesWS3_invoker.call(Application_0.fetchIssuesWS())
      }
  
    // @LINE:11
    case controllers_Application_fetchCommitsWS4_route(params@_) =>
      call { 
        controllers_Application_fetchCommitsWS4_invoker.call(Application_0.fetchCommitsWS())
      }
  
    // @LINE:12
    case controllers_Application_fetchPullsWS5_route(params@_) =>
      call { 
        controllers_Application_fetchPullsWS5_invoker.call(Application_0.fetchPullsWS())
      }
  
    // @LINE:13
    case controllers_Application_navToRepositoryDetails6_route(params@_) =>
      call(params.fromQuery[String]("issuesUrl", None), params.fromQuery[String]("commitsUrl", None), params.fromQuery[String]("pullsUrl", None), params.fromQuery[String]("login", None), params.fromQuery[String]("name", None), params.fromQuery[String]("description", None)) { (issuesUrl, commitsUrl, pullsUrl, login, name, description) =>
        controllers_Application_navToRepositoryDetails6_invoker.call(Application_0.navToRepositoryDetails(issuesUrl, commitsUrl, pullsUrl, login, name, description))
      }
  
    // @LINE:14
    case controllers_Application_fetchIssues7_route(params@_) =>
      call { 
        controllers_Application_fetchIssues7_invoker.call(Application_0.fetchIssues())
      }
  
    // @LINE:15
    case controllers_Application_fetchCommits8_route(params@_) =>
      call { 
        controllers_Application_fetchCommits8_invoker.call(Application_0.fetchCommits())
      }
  
    // @LINE:16
    case controllers_Application_fetchPulls9_route(params@_) =>
      call { 
        controllers_Application_fetchPulls9_invoker.call(Application_0.fetchPulls())
      }
  
    // @LINE:17
    case controllers_Application_index10_route(params@_) =>
      call { 
        controllers_Application_index10_invoker.call(Application_0.index)
      }
  
    // @LINE:18
    case controllers_Application_topics11_route(params@_) =>
      call(params.fromQuery[String]("query", None)) { (query) =>
        controllers_Application_topics11_invoker.call(Application_0.topics(query))
      }
  
    // @LINE:19
    case controllers_Application_fetchUsers12_route(params@_) =>
      call(params.fromPath[String]("user", None)) { (user) =>
        controllers_Application_fetchUsers12_invoker.call(Application_0.fetchUsers(user))
      }
  
    // @LINE:20
    case controllers_Application_fetchUsersRepos13_route(params@_) =>
      call(params.fromPath[String]("user", None)) { (user) =>
        controllers_Application_fetchUsersRepos13_invoker.call(Application_0.fetchUsersRepos(user))
      }
  
    // @LINE:21
    case controllers_Application_navToRepositoryDetailsWS14_route(params@_) =>
      call(params.fromPath[String]("login", None), params.fromPath[String]("name", None), params.fromPath[String]("description", None)) { (login, name, description) =>
        controllers_Application_navToRepositoryDetailsWS14_invoker.call(Application_0.navToRepositoryDetailsWS(login, name, description))
      }
  
    // @LINE:25
    case controllers_Assets_versioned15_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_Assets_versioned15_invoker.call(Assets_1.versioned(file))
      }
  }
}
