
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
/*1.33*/import java.math.BigInteger; var count=0


Seq[Any](format.raw/*1.31*/(""" """),format.raw/*2.1*/("""<html>
<style>
table """),format.raw/*4.7*/("""{"""),format.raw/*4.8*/("""
	"""),format.raw/*5.2*/("""font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
	margin-top: 50px;
"""),format.raw/*9.1*/("""}"""),format.raw/*9.2*/("""

"""),format.raw/*11.1*/("""td, th """),format.raw/*11.8*/("""{"""),format.raw/*11.9*/("""
	"""),format.raw/*12.2*/("""border: 2px solid #e0b0918f;
	text-align: left;
	padding: 8px;
"""),format.raw/*15.1*/("""}"""),format.raw/*15.2*/("""

"""),format.raw/*17.1*/("""tr:nth-child(even) """),format.raw/*17.20*/("""{"""),format.raw/*17.21*/("""
	"""),format.raw/*18.2*/("""background-color: #dddddd;
"""),format.raw/*19.1*/("""}"""),format.raw/*19.2*/("""

"""),format.raw/*21.1*/("""h2 """),format.raw/*21.4*/("""{"""),format.raw/*21.5*/("""
	"""),format.raw/*22.2*/("""display: flex;
	justify-content: center;
	color: burlywood;
	background-color: black;
	margin-bottom: 50px;
	margin: -15px;
	padding: 16px;
	font-size: 35px;
"""),format.raw/*30.1*/("""}"""),format.raw/*30.2*/("""
"""),format.raw/*31.1*/("""</style>

<body>
	<h2>User Repositories</h2>

	<table style="width: 100%">
		<tr>
			<th>Repository Name</th>
			<th>Repository Lists</th>
		</tr>
		"""),_display_(/*41.4*/for(d <- data) yield /*41.18*/{_display_(Seq[Any](format.raw/*41.19*/("""
		"""),format.raw/*42.3*/("""<tr>
			<td>"""),_display_(/*43.9*/d/*43.10*/.name),format.raw/*43.15*/("""</td>
			<td>"""),_display_(/*44.9*/d/*44.10*/.repos_url),format.raw/*44.20*/("""</td>

		</tr>
		""")))}),format.raw/*47.4*/("""
	"""),format.raw/*48.2*/("""</table>
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
                  HASH: f82264bafdb6a259140624e5e7d02aa3c3d452f1
                  MATRIX: 927->1|1030->32|1100->30|1127->74|1176->97|1203->98|1232->101|1355->198|1382->199|1413->203|1447->210|1475->211|1505->214|1598->280|1626->281|1657->285|1704->304|1733->305|1763->308|1818->336|1846->337|1877->341|1907->344|1935->345|1965->348|2158->514|2186->515|2215->517|2401->677|2431->691|2470->692|2501->696|2541->710|2551->711|2577->716|2618->731|2628->732|2659->742|2710->763|2740->766
                  LINES: 27->1|30->1|33->1|33->2|35->4|35->4|36->5|40->9|40->9|42->11|42->11|42->11|43->12|46->15|46->15|48->17|48->17|48->17|49->18|50->19|50->19|52->21|52->21|52->21|53->22|61->30|61->30|62->31|72->41|72->41|72->41|73->42|74->43|74->43|74->43|75->44|75->44|75->44|78->47|79->48
                  -- GENERATED --
              */
          