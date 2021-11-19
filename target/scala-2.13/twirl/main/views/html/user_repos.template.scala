
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

object user_repos extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[model.UserRepos],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(data: List[model.UserRepos]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import java.math.BigInteger; var count=0


Seq[Any](format.raw/*1.31*/(""" 
"""),format.raw/*3.1*/("""<html>
<style>
table """),format.raw/*5.7*/("""{"""),format.raw/*5.8*/("""
	"""),format.raw/*6.2*/("""font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
	margin-top: 50px;
"""),format.raw/*10.1*/("""}"""),format.raw/*10.2*/("""

"""),format.raw/*12.1*/("""td, th """),format.raw/*12.8*/("""{"""),format.raw/*12.9*/("""
	"""),format.raw/*13.2*/("""border: 2px solid #e0b0918f;
	text-align: left;
	padding: 8px;
"""),format.raw/*16.1*/("""}"""),format.raw/*16.2*/("""

"""),format.raw/*18.1*/("""tr:nth-child(even) """),format.raw/*18.20*/("""{"""),format.raw/*18.21*/("""
	"""),format.raw/*19.2*/("""background-color: #dddddd;
"""),format.raw/*20.1*/("""}"""),format.raw/*20.2*/("""

"""),format.raw/*22.1*/("""h2 """),format.raw/*22.4*/("""{"""),format.raw/*22.5*/("""
	"""),format.raw/*23.2*/("""display: flex;
	justify-content: center;
	color: burlywood;
	background-color: black;
	margin-bottom: 50px;
	margin: -15px;
	padding: 16px;
	font-size: 35px;
"""),format.raw/*31.1*/("""}"""),format.raw/*31.2*/("""
"""),format.raw/*32.1*/("""</style>

<body>
	<h2>User Repositories</h2>

	<table style="width: 100%">
		<tr>
		    <th>Repository Id</th>
			<th>Repository Name</th>
			<th>Repository Description</th>
		</tr>
		"""),_display_(/*43.4*/for(d <- data) yield /*43.18*/{_display_(Seq[Any](format.raw/*43.19*/("""
		"""),format.raw/*44.3*/("""<tr>
		    <td>"""),_display_(/*45.12*/d/*45.13*/.id),format.raw/*45.16*/("""</td>
			<td><a href=""""),_display_(/*46.18*/routes/*46.24*/.Application.navToRepositoryDetails(d.issues_url, d.commits_url, d.pulls_url, d.login, d.name, d.description)),format.raw/*46.133*/("""">"""),_display_(/*46.136*/d/*46.137*/.name),format.raw/*46.142*/("""</a></td>
            <td>"""),_display_(/*47.18*/d/*47.19*/.description),format.raw/*47.31*/("""</td>
		</tr>
		""")))}),format.raw/*49.4*/("""
	"""),format.raw/*50.2*/("""</table>
</body>
</html>"""))
      }
    }
  }

  def render(data:List[model.UserRepos]): play.twirl.api.HtmlFormat.Appendable = apply(data)

  def f:((List[model.UserRepos]) => play.twirl.api.HtmlFormat.Appendable) = (data) => apply(data)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/user_repos.scala.html
                  HASH: 5b58eebb7fcaf5c4e293e68b31e73062f0db8c75
                  MATRIX: 927->1|1029->34|1099->30|1128->76|1177->99|1204->100|1233->103|1357->200|1385->201|1416->205|1450->212|1478->213|1508->216|1601->282|1629->283|1660->287|1707->306|1736->307|1766->310|1821->338|1849->339|1880->343|1910->346|1938->347|1968->350|2161->516|2189->517|2218->519|2440->715|2470->729|2509->730|2540->734|2584->751|2594->752|2618->755|2669->779|2684->785|2815->894|2846->897|2857->898|2884->903|2939->931|2949->932|2982->944|3031->963|3061->966
                  LINES: 27->1|30->2|33->1|34->3|36->5|36->5|37->6|41->10|41->10|43->12|43->12|43->12|44->13|47->16|47->16|49->18|49->18|49->18|50->19|51->20|51->20|53->22|53->22|53->22|54->23|62->31|62->31|63->32|74->43|74->43|74->43|75->44|76->45|76->45|76->45|77->46|77->46|77->46|77->46|77->46|77->46|78->47|78->47|78->47|80->49|81->50
                  -- GENERATED --
              */
          