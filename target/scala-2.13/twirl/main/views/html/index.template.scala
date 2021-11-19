
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
				<th>Topic</th>
			</tr>
			"""),_display_(/*49.5*/for(d <- data) yield /*49.19*/{_display_(Seq[Any](format.raw/*49.20*/(""" 
			"""),_display_(/*50.5*/if(count%10 != 0)/*50.22*/{_display_(Seq[Any](format.raw/*50.23*/("""
			"""),format.raw/*51.4*/("""<tr>
				<td><a href="users/"""),_display_(/*52.25*/d/*52.26*/.login),format.raw/*52.32*/("""" target="_blank">"""),_display_(/*52.51*/d/*52.52*/.login),format.raw/*52.58*/("""</a></td>
				<td><a href=""""),_display_(/*53.19*/routes/*53.25*/.Application.navToRepositoryDetails(d.issues_url, d.commits_url, d.pulls_url, d.login, d.name, d.description)),format.raw/*53.134*/("""">"""),_display_(/*53.137*/d/*53.138*/.name),format.raw/*53.143*/("""</a></td>
				<td><a href="topics?query="""),_display_(/*54.32*/d/*54.33*/.topicword),format.raw/*54.43*/("""" target="_blank">"""),_display_(/*54.62*/d/*54.63*/.topicword),format.raw/*54.73*/("""</a></td>
				
			</tr>
			""")))}/*57.5*/else/*57.9*/{_display_(Seq[Any](format.raw/*57.10*/("""
			"""),format.raw/*58.4*/("""<tr>
				<td style="height: 40; background-color: white; border: white"></td>
			</tr>
			""")))}),format.raw/*61.5*/("""
			"""),_display_(/*62.5*/{count = count+1}),format.raw/*62.22*/(""" 
			""")))}),format.raw/*63.5*/("""
		"""),format.raw/*64.3*/("""</table>
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
                  HASH: 08e0719b0fc1cec2028c8b82185ef2bed33908c9
                  MATRIX: 929->1|1038->41|1108->37|1137->83|1186->106|1213->107|1242->110|1344->186|1371->187|1402->191|1436->198|1464->199|1494->202|1612->293|1640->294|1671->298|1718->317|1747->318|1777->321|1832->349|1860->350|1891->354|1926->362|1955->363|1985->366|2113->467|2141->468|2170->470|2596->870|2626->884|2665->885|2698->892|2724->909|2763->910|2795->915|2852->945|2862->946|2889->952|2935->971|2945->972|2972->978|3028->1007|3043->1013|3174->1122|3205->1125|3216->1126|3243->1131|3312->1173|3322->1174|3353->1184|3399->1203|3409->1204|3440->1214|3489->1245|3501->1249|3540->1250|3572->1255|3696->1349|3728->1355|3766->1372|3803->1379|3834->1383
                  LINES: 27->1|30->2|33->1|34->3|36->5|36->5|37->6|40->9|40->9|42->11|42->11|42->11|43->12|47->16|47->16|49->18|49->18|49->18|50->19|51->20|51->20|53->22|53->22|53->22|54->23|59->28|59->28|60->29|80->49|80->49|80->49|81->50|81->50|81->50|82->51|83->52|83->52|83->52|83->52|83->52|83->52|84->53|84->53|84->53|84->53|84->53|84->53|85->54|85->54|85->54|85->54|85->54|85->54|88->57|88->57|88->57|89->58|92->61|93->62|93->62|94->63|95->64
                  -- GENERATED --
              */
          