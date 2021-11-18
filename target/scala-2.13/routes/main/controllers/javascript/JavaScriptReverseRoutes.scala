// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers.javascript {

  // @LINE:19
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def topics: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.topics",
      """
        function(query0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "topics" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("query", query0)])})
        }
      """
    )
  
    // @LINE:12
    def fetchPulls: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.fetchPulls",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fetchPulls"})
        }
      """
    )
  
    // @LINE:8
    def fetch: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.fetch",
      """
        function(query0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fetch" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("query", query0)])})
        }
      """
    )
  
    // @LINE:15
    def fetchUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.fetchUsers",
      """
        function(user0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("user", user0))})
        }
      """
    )
  
    // @LINE:16
    def fetchUsersRepos: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.fetchUsersRepos",
      """
        function(user0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("user", user0)) + "/repos"})
        }
      """
    )
  
    // @LINE:11
    def fetchCommits: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.fetchCommits",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fetchCommits"})
        }
      """
    )
  
    // @LINE:10
    def fetchIssues: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.fetchIssues",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fetchIssues"})
        }
      """
    )
  
    // @LINE:9
    def navToRepositoryDetails: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.navToRepositoryDetails",
      """
        function(issuesUrl0,commitsUrl1,pullsUrl2,login3,name4,description5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "navToRepositoryDetails" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("issuesUrl", issuesUrl0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("commitsUrl", commitsUrl1), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("pullsUrl", pullsUrl2), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("login", login3), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("name", name4), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("description", description5)])})
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:13
    def back: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.back",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "back"})
        }
      """
    )
  
  }


}
