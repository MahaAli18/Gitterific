
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


Seq[Any](format.raw/*2.1*/("""<html>
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
				<th>Pulls</th>
			</tr>
			"""),_display_(/*50.5*/for(d <- data) yield /*50.19*/{_display_(Seq[Any](format.raw/*50.20*/("""
			"""),format.raw/*51.4*/("""<tr>
				<td><a href="users/"""),_display_(/*52.25*/d/*52.26*/.login),format.raw/*52.32*/("""" target="_blank">"""),_display_(/*52.51*/d/*52.52*/.login),format.raw/*52.58*/("""</a></td>
				<td><a href=""""),_display_(/*53.19*/routes/*53.25*/.Application.navToRepositoryDetails(d.issues_url, d.commits_url, d.pulls_url, d.login, d.name, d.description)),format.raw/*53.134*/("""">"""),_display_(/*53.137*/d/*53.138*/.name),format.raw/*53.143*/("""</a></td>
				<td>"""),_display_(/*54.10*/d/*54.11*/.issues_url),format.raw/*54.22*/("""</td>
				<td style="width:8%">"""),_display_(/*55.27*/d/*55.28*/.visibility),format.raw/*55.39*/("""</td>
				<td>"""),_display_(/*56.10*/d/*56.11*/.commits_url),format.raw/*56.23*/("""</td>
				<td>"""),_display_(/*57.10*/d/*57.11*/.pulls_url),format.raw/*57.21*/("""</td>
			</tr>
			""")))}),format.raw/*59.5*/("""
		"""),format.raw/*60.3*/("""</table>
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
                  HASH: 7cd2501583d13d63e4e17f056d21612724b6dea1
                  MATRIX: 929->1|1059->38|1106->59|1133->60|1161->62|1260->135|1287->136|1316->138|1350->145|1378->146|1407->148|1521->235|1549->236|1578->238|1625->257|1654->258|1683->260|1737->287|1765->288|1793->289|1827->296|1855->297|1883->298|2018->406|2046->407|2074->408|2548->856|2578->870|2617->871|2648->875|2704->904|2714->905|2741->911|2787->930|2797->931|2824->937|2879->965|2894->971|3025->1080|3056->1083|3067->1084|3094->1089|3140->1108|3150->1109|3182->1120|3241->1152|3251->1153|3283->1164|3325->1179|3335->1180|3368->1192|3410->1207|3420->1208|3451->1218|3500->1237|3530->1240
                  LINES: 27->1|32->2|34->4|34->4|35->5|38->8|38->8|40->10|40->10|40->10|41->11|45->15|45->15|47->17|47->17|47->17|48->18|49->19|49->19|50->20|50->20|50->20|51->21|56->26|56->26|57->27|80->50|80->50|80->50|81->51|82->52|82->52|82->52|82->52|82->52|82->52|83->53|83->53|83->53|83->53|83->53|83->53|84->54|84->54|84->54|85->55|85->55|85->55|86->56|86->56|86->56|87->57|87->57|87->57|89->59|90->60
                  -- GENERATED --
              */
          