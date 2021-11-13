
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
	width: 90%;
"""),format.raw/*8.1*/("""}"""),format.raw/*8.2*/("""

"""),format.raw/*10.1*/("""td, th """),format.raw/*10.8*/("""{"""),format.raw/*10.9*/("""
	"""),format.raw/*11.2*/("""border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
	overflow-wrap: anywhere;
"""),format.raw/*15.1*/("""}"""),format.raw/*15.2*/("""

"""),format.raw/*17.1*/("""tr:nth-child(even) """),format.raw/*17.20*/("""{"""),format.raw/*17.21*/("""
	"""),format.raw/*18.2*/("""background-color: #dddddd;
"""),format.raw/*19.1*/("""}"""),format.raw/*19.2*/("""
"""),format.raw/*20.1*/(""".header"""),format.raw/*20.8*/("""{"""),format.raw/*20.9*/("""
"""),format.raw/*21.1*/("""background-color: #171616;
    color: bisque;
    margin: -15px;
    margin-bottom: 50px;
    padding: 6px;
"""),format.raw/*26.1*/("""}"""),format.raw/*26.2*/("""
"""),format.raw/*27.1*/("""</style>

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
				<th>Visibility</th>
				<th>Commits</th>
			</tr>
			"""),_display_(/*49.5*/for(d <- data) yield /*49.19*/{_display_(Seq[Any](format.raw/*49.20*/("""
			"""),format.raw/*50.4*/("""<tr>
				<td><a href="users/"""),_display_(/*51.25*/d/*51.26*/.login),format.raw/*51.32*/("""" target="_blank">"""),_display_(/*51.51*/d/*51.52*/.login),format.raw/*51.58*/("""</a></td>
				<td>"""),_display_(/*52.10*/d/*52.11*/.name),format.raw/*52.16*/("""</td>
				<td>"""),_display_(/*53.10*/d/*53.11*/.issues_url),format.raw/*53.22*/("""</td>
				<td style="width:8%">"""),_display_(/*54.27*/d/*54.28*/.visibility),format.raw/*54.39*/("""</td>
				<td>"""),_display_(/*55.10*/d/*55.11*/.commits_url),format.raw/*55.23*/("""</td>
			</tr>
			""")))}),format.raw/*57.5*/("""
		"""),format.raw/*58.3*/("""</table>
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
                  HASH: 283d1b155596d44d6be79b3ed2fd920ea4ce0697
                  MATRIX: 929->1|1060->37|1088->39|1137->62|1164->63|1193->66|1295->142|1322->143|1353->147|1387->154|1415->155|1445->158|1563->249|1591->250|1622->254|1669->273|1698->274|1728->277|1783->305|1811->306|1840->308|1874->315|1902->316|1931->318|2071->431|2099->432|2128->434|2605->885|2635->899|2674->900|2706->905|2763->935|2773->936|2800->942|2846->961|2856->962|2883->968|2930->988|2940->989|2966->994|3009->1010|3019->1011|3051->1022|3111->1055|3121->1056|3153->1067|3196->1083|3206->1084|3239->1096|3290->1117|3321->1121
                  LINES: 27->1|32->1|33->2|35->4|35->4|36->5|39->8|39->8|41->10|41->10|41->10|42->11|46->15|46->15|48->17|48->17|48->17|49->18|50->19|50->19|51->20|51->20|51->20|52->21|57->26|57->26|58->27|80->49|80->49|80->49|81->50|82->51|82->51|82->51|82->51|82->51|82->51|83->52|83->52|83->52|84->53|84->53|84->53|85->54|85->54|85->54|86->55|86->55|86->55|88->57|89->58
                  -- GENERATED --
              */
          