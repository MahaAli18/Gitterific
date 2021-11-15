
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
		<form method="GET" action="topics">
			<input name="query" placeholder="enter search term(s)"> </input> 
			<input type="submit" value="Go">
		</form>
		<h5><i>Temporarily added, will be removed</i></h5>
	</center>

	<center>
		<table>
			<tr>
				<th>Users</th>
				<th>Repository Name</th>
				<th>Link</th>
				<th>Topics</th>
			</tr>
			"""),_display_(/*52.5*/for(d <- data) yield /*52.19*/{_display_(Seq[Any](format.raw/*52.20*/("""
			"""),format.raw/*53.4*/("""<tr>
				<td><a href="users/"""),_display_(/*54.25*/d/*54.26*/.login),format.raw/*54.32*/("""" target="_blank">"""),_display_(/*54.51*/d/*54.52*/.login),format.raw/*54.58*/("""</a></td>
				<td>"""),_display_(/*55.10*/d/*55.11*/.name),format.raw/*55.16*/("""</td>
				<td><a href="""),_display_(/*56.18*/d/*56.19*/.html_url),format.raw/*56.28*/(""" """),format.raw/*56.29*/("""target="">"""),_display_(/*56.40*/d/*56.41*/.html_url),format.raw/*56.50*/("""</a>
				<td><a href="topics?query="""),_display_(/*57.32*/d/*57.33*/.topicword),format.raw/*57.43*/("""" target="_blank">"""),_display_(/*57.62*/d/*57.63*/.topicword),format.raw/*57.73*/("""</a></td>
			</tr>
			""")))}),format.raw/*59.5*/("""
		"""),format.raw/*60.3*/("""</table>
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
                  HASH: c03b59cfb34582fe4efbc2c8b8a9ccb8a6b06e46
                  MATRIX: 929->1|1059->36|1087->38|1136->61|1163->62|1192->65|1295->142|1322->143|1353->147|1387->154|1415->155|1445->158|1536->222|1564->223|1595->227|1642->246|1671->247|1701->250|1756->278|1784->279|1813->281|1847->288|1875->289|1904->291|2065->425|2093->426|2122->428|2611->891|2641->905|2680->906|2712->911|2769->941|2779->942|2806->948|2852->967|2862->968|2889->974|2936->994|2946->995|2972->1000|3023->1024|3033->1025|3063->1034|3092->1035|3130->1046|3140->1047|3170->1056|3234->1093|3244->1094|3275->1104|3321->1123|3331->1124|3362->1134|3417->1159|3448->1163
                  LINES: 27->1|32->1|33->2|35->4|35->4|36->5|39->8|39->8|41->10|41->10|41->10|42->11|45->14|45->14|47->16|47->16|47->16|48->17|49->18|49->18|50->19|50->19|50->19|51->20|60->29|60->29|61->30|83->52|83->52|83->52|84->53|85->54|85->54|85->54|85->54|85->54|85->54|86->55|86->55|86->55|87->56|87->56|87->56|87->56|87->56|87->56|87->56|88->57|88->57|88->57|88->57|88->57|88->57|90->59|91->60
                  -- GENERATED --
              */
          