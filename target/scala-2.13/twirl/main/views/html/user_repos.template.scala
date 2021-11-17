
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
    margin-top:50px;
"""),format.raw/*10.1*/("""}"""),format.raw/*10.2*/("""

"""),format.raw/*12.1*/("""td, th """),format.raw/*12.8*/("""{"""),format.raw/*12.9*/("""
	"""),format.raw/*13.2*/("""border: 2px solid #e0b0918f;
	text-align: left;
	padding: 8px;
"""),format.raw/*16.1*/("""}"""),format.raw/*16.2*/("""

"""),format.raw/*18.1*/("""tr:nth-child(even) """),format.raw/*18.20*/("""{"""),format.raw/*18.21*/("""
	"""),format.raw/*19.2*/("""background-color: #dddddd;
"""),format.raw/*20.1*/("""}"""),format.raw/*20.2*/("""

"""),format.raw/*22.1*/("""h2"""),format.raw/*22.3*/("""{"""),format.raw/*22.4*/("""
   """),format.raw/*23.4*/("""display:flex;
   justify-content:center;
   color: burlywood;
   background-color: black;
   margin-bottom:50px;
   margin: -15px;
   padding: 16px;
   font-size: 35px;
   
"""),format.raw/*32.1*/("""}"""),format.raw/*32.2*/("""
"""),format.raw/*33.1*/("""</style>

<body>
	<h2>User Repositories</h2>

		<table style="width:100%">
		<tr>
		     <th>Repository Name</th>
		   <th>Repository Lists</th>
		</tr>
			"""),_display_(/*43.5*/for(d <- data) yield /*43.19*/{_display_(Seq[Any](format.raw/*43.20*/("""
			"""),format.raw/*44.4*/("""<tr>
			    <td>"""),_display_(/*45.13*/d/*45.14*/.name),format.raw/*45.19*/("""</td>
				<td>"""),_display_(/*46.10*/d/*46.11*/.repos_url),format.raw/*46.21*/("""</td>
				
			</tr>
			""")))}),format.raw/*49.5*/("""
		"""),format.raw/*50.3*/("""</table>
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
                  HASH: 5dfd9114c489174a07b1e22eab42986841642f7c
                  MATRIX: 927->1|1029->33|1099->30|1127->75|1176->98|1203->99|1232->102|1358->201|1386->202|1417->206|1451->213|1479->214|1509->217|1602->283|1630->284|1661->288|1708->307|1737->308|1767->311|1822->339|1850->340|1881->344|1910->346|1938->347|1970->352|2179->534|2207->535|2236->537|2429->704|2459->718|2498->719|2530->724|2575->742|2585->743|2611->748|2654->764|2664->765|2695->775|2752->802|2783->806
                  LINES: 27->1|30->2|33->1|34->3|36->5|36->5|37->6|41->10|41->10|43->12|43->12|43->12|44->13|47->16|47->16|49->18|49->18|49->18|50->19|51->20|51->20|53->22|53->22|53->22|54->23|63->32|63->32|64->33|74->43|74->43|74->43|75->44|76->45|76->45|76->45|77->46|77->46|77->46|80->49|81->50
                  -- GENERATED --
              */
          