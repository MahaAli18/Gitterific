
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
/*2.2*/import java.math.BigInteger; var count=0


Seq[Any](format.raw/*1.38*/(""" 
"""),format.raw/*3.1*/("""<html>
<style>
table """),format.raw/*5.7*/("""{"""),format.raw/*5.8*/("""
	"""),format.raw/*6.2*/("""font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 90%;
"""),format.raw/*9.1*/("""}"""),format.raw/*9.2*/("""

"""),format.raw/*11.1*/("""td, th """),format.raw/*11.8*/("""{"""),format.raw/*11.9*/("""
	"""),format.raw/*12.2*/("""border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
	overflow-wrap: anywhere;
"""),format.raw/*16.1*/("""}"""),format.raw/*16.2*/("""

"""),format.raw/*18.1*/("""tr:nth-child(even) """),format.raw/*18.20*/("""{"""),format.raw/*18.21*/("""
	"""),format.raw/*19.2*/("""background-color: #dddddd;
"""),format.raw/*20.1*/("""}"""),format.raw/*20.2*/("""

"""),format.raw/*22.1*/(""".header """),format.raw/*22.9*/("""{"""),format.raw/*22.10*/("""
	"""),format.raw/*23.2*/("""background-color: #171616;
	color: bisque;
	margin: -15px;
	margin-bottom: 50px;
	padding: 6px;
"""),format.raw/*28.1*/("""}"""),format.raw/*28.2*/("""
"""),format.raw/*29.1*/("""</style>

<body>
	<center class="header">
		<div>
			<h1 class="center">Welcome to Gitterific</h1>
		</div>
		<form method="GET" action="fetch">
			<input name="query" placeholder="enter search term(s)"> </input> <input
				type="submit" value="Go">
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
			"""),_display_(/*51.5*/for(d <- data) yield /*51.19*/{_display_(Seq[Any](format.raw/*51.20*/(""" 
			"""),_display_(/*52.5*/if(count%10 != 0)/*52.22*/{_display_(Seq[Any](format.raw/*52.23*/("""
			"""),format.raw/*53.4*/("""<tr>
				<td><a href="users/"""),_display_(/*54.25*/d/*54.26*/.login),format.raw/*54.32*/("""" target="_blank">"""),_display_(/*54.51*/d/*54.52*/.login),format.raw/*54.58*/("""</a></td>
				<td><a href=""""),_display_(/*55.19*/routes/*55.25*/.Application.navToRepositoryDetails(d.issues_url, d.commits_url, d.pulls_url, d.login, d.name, d.description)),format.raw/*55.134*/("""">"""),_display_(/*55.137*/d/*55.138*/.name),format.raw/*55.143*/("""</a></td>
				<td>"""),_display_(/*56.10*/d/*56.11*/.issues_url),format.raw/*56.22*/("""</td>
				<td style="width: 8%">"""),_display_(/*57.28*/d/*57.29*/.visibility),format.raw/*57.40*/("""</td>
				<td>"""),_display_(/*58.10*/d/*58.11*/.commits_url),format.raw/*58.23*/("""</td>
			</tr>
			""")))}/*60.5*/else/*60.9*/{_display_(Seq[Any](format.raw/*60.10*/("""
			"""),format.raw/*61.4*/("""<tr>
				<td style="height: 40; background-color: white; border: white"></td>
			</tr>
			""")))}),format.raw/*64.5*/("""
			"""),_display_(/*65.5*/{count = count+1}),format.raw/*65.22*/(""" 
			""")))}),format.raw/*66.5*/("""
		"""),format.raw/*67.3*/("""</table>
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
                  HASH: be3adcff9fed7ef077265924ef839c7b1e35b618
                  MATRIX: 929->1|1038->41|1108->37|1137->83|1186->106|1213->107|1242->110|1344->186|1371->187|1402->191|1436->198|1464->199|1494->202|1612->293|1640->294|1671->298|1718->317|1747->318|1777->321|1832->349|1860->350|1891->354|1926->362|1955->363|1985->366|2113->467|2141->468|2170->470|2644->918|2674->932|2713->933|2746->940|2772->957|2811->958|2843->963|2900->993|2910->994|2937->1000|2983->1019|2993->1020|3020->1026|3076->1055|3091->1061|3222->1170|3253->1173|3264->1174|3291->1179|3338->1199|3348->1200|3380->1211|3441->1245|3451->1246|3483->1257|3526->1273|3536->1274|3569->1286|3608->1307|3620->1311|3659->1312|3691->1317|3815->1411|3847->1417|3885->1434|3922->1441|3953->1445
                  LINES: 27->1|30->2|33->1|34->3|36->5|36->5|37->6|40->9|40->9|42->11|42->11|42->11|43->12|47->16|47->16|49->18|49->18|49->18|50->19|51->20|51->20|53->22|53->22|53->22|54->23|59->28|59->28|60->29|82->51|82->51|82->51|83->52|83->52|83->52|84->53|85->54|85->54|85->54|85->54|85->54|85->54|86->55|86->55|86->55|86->55|86->55|86->55|87->56|87->56|87->56|88->57|88->57|88->57|89->58|89->58|89->58|91->60|91->60|91->60|92->61|95->64|96->65|96->65|97->66|98->67
                  -- GENERATED --
              */
          