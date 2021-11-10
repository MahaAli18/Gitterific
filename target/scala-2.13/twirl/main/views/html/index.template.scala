
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[model.ListRepositories],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(data: List[model.ListRepositories]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.38*/("""
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
"""),format.raw/*25.1*/("""}"""),format.raw/*25.2*/("""
"""),format.raw/*26.1*/("""</style>

<body>
	<center class="header">
			<div>
				<h1 class="center">Welcome to Gitterific</h1>
			</div>
		<form method="GET" action="fetch">
			<input name="query" placeholder="enter search term(s)"> </input> 
			<input type="submit" value="Go">
		</form>
	</center>

	<center>
		<table>
			<tr>
				<th>Users</th>
				<th>Repository Name</th>
				<th>Issues</th>
				<th>Topics</th>
				<th>Commits</th>
			</tr>
			"""),_display_(/*48.5*/for(d <- data) yield /*48.19*/{_display_(Seq[Any](format.raw/*48.20*/("""
			"""),format.raw/*49.4*/("""<tr>
				<td><a href="users/"""),_display_(/*50.25*/d/*50.26*/.login),format.raw/*50.32*/("""" target="_blank">"""),_display_(/*50.51*/d/*50.52*/.login),format.raw/*50.58*/("""</a></td>
				<td>"""),_display_(/*51.10*/d/*51.11*/.name),format.raw/*51.16*/("""</td>
				<td>"""),_display_(/*52.10*/d/*52.11*/.issues_url),format.raw/*52.22*/("""</td>
				<td>Topics</td>
				<td>Link</td>
			</tr>
			""")))}),format.raw/*56.5*/("""
		"""),format.raw/*57.3*/("""</table>
	</center>
</body>
</html>"""))
      }
    }
  }

  def render(data:List[model.ListRepositories]): play.twirl.api.HtmlFormat.Appendable = apply(data)

  def f:((List[model.ListRepositories]) => play.twirl.api.HtmlFormat.Appendable) = (data) => apply(data)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: 226918d1e004419d5f660240b9880947ca5f101e
                  MATRIX: 929->1|1060->37|1088->39|1137->62|1164->63|1193->66|1296->143|1323->144|1354->148|1388->155|1416->156|1446->159|1537->223|1565->224|1596->228|1643->247|1672->248|1702->251|1757->279|1785->280|1814->282|1848->289|1876->290|1905->292|2045->405|2073->406|2102->408|2575->855|2605->869|2644->870|2676->875|2733->905|2743->906|2770->912|2816->931|2826->932|2853->938|2900->958|2910->959|2936->964|2979->980|2989->981|3021->992|3112->1053|3143->1057
                  LINES: 27->1|32->1|33->2|35->4|35->4|36->5|39->8|39->8|41->10|41->10|41->10|42->11|45->14|45->14|47->16|47->16|47->16|48->17|49->18|49->18|50->19|50->19|50->19|51->20|56->25|56->25|57->26|79->48|79->48|79->48|80->49|81->50|81->50|81->50|81->50|81->50|81->50|82->51|82->51|82->51|83->52|83->52|83->52|87->56|88->57
                  -- GENERATED --
              */
          