
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
"""),format.raw/*21.1*/(""".header"""),format.raw/*21.8*/("""{"""),format.raw/*21.9*/("""
"""),format.raw/*22.1*/("""background-color: #171616;
    color: bisque;
    margin: -15px;
    margin-bottom: 50px;
    padding: 6px;
"""),format.raw/*27.1*/("""}"""),format.raw/*27.2*/("""
"""),format.raw/*28.1*/("""</style>

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
			"""),_display_(/*50.5*/for(d <- data) yield /*50.19*/{_display_(Seq[Any](format.raw/*50.20*/("""
			
			"""),_display_(/*52.5*/if(count%10 != 0)/*52.22*/{_display_(Seq[Any](format.raw/*52.23*/("""
			"""),format.raw/*53.4*/("""<tr>
				<td><a href="users/"""),_display_(/*54.25*/d/*54.26*/.login),format.raw/*54.32*/("""" target="_blank">"""),_display_(/*54.51*/d/*54.52*/.login),format.raw/*54.58*/("""</a></td>
				<td>"""),_display_(/*55.10*/d/*55.11*/.name),format.raw/*55.16*/("""</td>
				<td>"""),_display_(/*56.10*/d/*56.11*/.issues_url),format.raw/*56.22*/("""</td>
				<td style="width:8%">"""),_display_(/*57.27*/d/*57.28*/.visibility),format.raw/*57.39*/("""</td>
				<td>"""),_display_(/*58.10*/d/*58.11*/.commits_url),format.raw/*58.23*/("""</td>
			</tr>
			""")))}/*60.5*/else/*60.9*/{_display_(Seq[Any](format.raw/*60.10*/("""
			  """),format.raw/*61.6*/("""<tr>
			    <td style="height:40; background-color:white; border:white"></td>
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
                  HASH: 3dd7c667d42e15d6ed8cd9e273c78be43433a935
                  MATRIX: 929->1|1038->40|1108->37|1136->82|1185->105|1212->106|1241->109|1343->185|1370->186|1401->190|1435->197|1463->198|1493->201|1611->292|1639->293|1670->297|1717->316|1746->317|1776->320|1831->348|1859->349|1888->351|1922->358|1950->359|1979->361|2119->474|2147->475|2176->477|2653->928|2683->942|2722->943|2759->954|2785->971|2824->972|2856->977|2913->1007|2923->1008|2950->1014|2996->1033|3006->1034|3033->1040|3080->1060|3090->1061|3116->1066|3159->1082|3169->1083|3201->1094|3261->1127|3271->1128|3303->1139|3346->1155|3356->1156|3389->1168|3428->1189|3440->1193|3479->1194|3513->1201|3639->1297|3671->1303|3709->1320|3745->1326|3776->1330
                  LINES: 27->1|30->2|33->1|34->3|36->5|36->5|37->6|40->9|40->9|42->11|42->11|42->11|43->12|47->16|47->16|49->18|49->18|49->18|50->19|51->20|51->20|52->21|52->21|52->21|53->22|58->27|58->27|59->28|81->50|81->50|81->50|83->52|83->52|83->52|84->53|85->54|85->54|85->54|85->54|85->54|85->54|86->55|86->55|86->55|87->56|87->56|87->56|88->57|88->57|88->57|89->58|89->58|89->58|91->60|91->60|91->60|92->61|95->64|96->65|96->65|97->66|98->67
                  -- GENERATED --
              */
          