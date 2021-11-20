
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object topics extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[model.ListTopicsRepos],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(data: List[model.ListTopicsRepos]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.37*/("""
"""),format.raw/*2.1*/("""<html>
<style>
table """),format.raw/*4.7*/("""{"""),format.raw/*4.8*/("""
	"""),format.raw/*5.2*/("""font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
"""),format.raw/*8.1*/("""}"""),format.raw/*8.2*/("""

"""),format.raw/*10.1*/("""td, th """),format.raw/*10.8*/("""{"""),format.raw/*10.9*/("""
	"""),format.raw/*11.2*/("""border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
"""),format.raw/*14.1*/("""}"""),format.raw/*14.2*/("""

"""),format.raw/*16.1*/("""tr:nth-child(even) """),format.raw/*16.20*/("""{"""),format.raw/*16.21*/("""
	"""),format.raw/*17.2*/("""background-color: #dddddd;
"""),format.raw/*18.1*/("""}"""),format.raw/*18.2*/("""
"""),format.raw/*19.1*/(""".header"""),format.raw/*19.8*/("""{"""),format.raw/*19.9*/("""
"""),format.raw/*20.1*/("""background-color: #171616;
    color: bisque;
    margin: -15px;
    margin-bottom: 50px;
    padding: 6px;
    
 
    
    
"""),format.raw/*29.1*/("""}"""),format.raw/*29.2*/("""
"""),format.raw/*30.1*/("""</style>

<body>
	<center class="header">
			<div>
				<h1 class="center">Topics</h1>
			</div>
		
	</center>

	<center>
		<table>
			<tr>
				<th>Users</th>
				<th>Repository Name</th>
				<th>Topics</th>
			</tr>
			"""),_display_(/*47.5*/for(d <- data) yield /*47.19*/{_display_(Seq[Any](format.raw/*47.20*/("""
			"""),format.raw/*48.4*/("""<tr>
				<td><a href="users/"""),_display_(/*49.25*/d/*49.26*/.login),format.raw/*49.32*/("""" target="_blank">"""),_display_(/*49.51*/d/*49.52*/.login),format.raw/*49.58*/("""</a></td>
				<td><a href=""""),_display_(/*50.19*/routes/*50.25*/.Application.navToRepositoryDetails(d.issues_url, d.commits_url, d.pulls_url, d.login, d.name, d.description)),format.raw/*50.134*/("""">"""),_display_(/*50.137*/d/*50.138*/.name),format.raw/*50.143*/("""</a></td>				
				<td><a href="topics?query="""),_display_(/*51.32*/d/*51.33*/.topicword),format.raw/*51.43*/("""" target="_blank">"""),_display_(/*51.62*/d/*51.63*/.topicword),format.raw/*51.73*/("""</a></td>
				
				
			</tr>
			""")))}),format.raw/*55.5*/("""
		"""),format.raw/*56.3*/("""</table>
	</center>
</body>
</html>"""))
      }
    }
  }

  def render(data:List[model.ListTopicsRepos]): play.twirl.api.HtmlFormat.Appendable = apply(data)

  def f:((List[model.ListTopicsRepos]) => play.twirl.api.HtmlFormat.Appendable) = (data) => apply(data)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/topics.scala.html
                  HASH: 991e8c5acff33958eef9c8c940c02b651a3bf0b4
                  MATRIX: 929->1|1059->36|1087->38|1136->61|1163->62|1192->65|1295->142|1322->143|1353->147|1387->154|1415->155|1445->158|1536->222|1564->223|1595->227|1642->246|1671->247|1701->250|1756->278|1784->279|1813->281|1847->288|1875->289|1904->291|2065->425|2093->426|2122->428|2385->665|2415->679|2454->680|2486->685|2543->715|2553->716|2580->722|2626->741|2636->742|2663->748|2719->777|2734->783|2865->892|2896->895|2907->896|2934->901|3007->947|3017->948|3048->958|3094->977|3104->978|3135->988|3202->1025|3233->1029
                  LINES: 27->1|32->1|33->2|35->4|35->4|36->5|39->8|39->8|41->10|41->10|41->10|42->11|45->14|45->14|47->16|47->16|47->16|48->17|49->18|49->18|50->19|50->19|50->19|51->20|60->29|60->29|61->30|78->47|78->47|78->47|79->48|80->49|80->49|80->49|80->49|80->49|80->49|81->50|81->50|81->50|81->50|81->50|81->50|82->51|82->51|82->51|82->51|82->51|82->51|86->55|87->56
                  -- GENERATED --
              */
          