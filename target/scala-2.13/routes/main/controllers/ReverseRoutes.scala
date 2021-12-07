// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers {

  // @LINE:25
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def versioned(file:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:7
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def topics(query:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "topics" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("query", query)))))
    }
  
    // @LINE:11
    def fetchCommitsWS(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "fetchCommitsWS")
    }
  
    // @LINE:16
    def fetchPulls(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "fetchPulls")
    }
  
    // @LINE:8
    def fetch(query:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "fetch" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("query", query)))))
    }
  
    // @LINE:12
    def fetchPullsWS(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "fetchPullsWS")
    }
  
    // @LINE:19
    def fetchUsers(user:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "users/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("user", user)))
    }
  
    // @LINE:20
    def fetchUsersRepos(user:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "users/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("user", user)) + "/repos")
    }
  
    // @LINE:15
    def fetchCommits(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "fetchCommits")
    }
  
    // @LINE:9
    def fetchRepositoriesWS(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "fetchRepositoriesWS")
    }
  
    // @LINE:14
    def fetchIssues(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "fetchIssues")
    }
  
    // @LINE:21
    def navToRepositoryDetailsWS(login:String, name:String, description:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "navToRepositoryDetailsWS/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("login", login)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("description", description)))
    }
  
    // @LINE:10
    def fetchIssuesWS(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "fetchIssuesWS")
    }
  
    // @LINE:13
    def navToRepositoryDetails(issuesUrl:String, commitsUrl:String, pullsUrl:String, login:String, name:String, description:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "navToRepositoryDetails" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("issuesUrl", issuesUrl)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("commitsUrl", commitsUrl)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("pullsUrl", pullsUrl)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("login", login)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("name", name)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("description", description)))))
    }
  
    // @LINE:7
    def index: Call = {
    
      () match {
      
        // @LINE:7
        case ()  =>
          
          Call("GET", _prefix)
      
      }
    
    }
  
  }


}
