// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers {

  // @LINE:17
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:7
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def fetchPulls(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "fetchPulls")
    }
  
    // @LINE:8
    def fetch(query:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "fetch" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("query", query)))))
    }
  
    // @LINE:11
    def fetchCommits(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "fetchCommits")
    }
  
    // @LINE:10
    def fetchIssues(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "fetchIssues")
    }
  
    // @LINE:9
    def navToRepositoryDetails(issuesUrl:String, commitsUrl:String, pullsUrl:String, login:String, name:String, description:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "navToRepositoryDetails" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("issuesUrl", issuesUrl)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("commitsUrl", commitsUrl)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("pullsUrl", pullsUrl)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("login", login)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("name", name)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("description", description)))))
    }
  
    // @LINE:7
    def index: Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:13
    def back(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "back")
    }
  
  }


}
