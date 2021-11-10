
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

object users extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[model.UsersList],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(data: List[model.UsersList]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.31*/("""
"""),format.raw/*2.1*/("""<html>
<style>
table """),format.raw/*4.7*/("""{"""),format.raw/*4.8*/("""
	"""),format.raw/*5.2*/("""font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
    margin-top:50px;
"""),format.raw/*9.1*/("""}"""),format.raw/*9.2*/("""

"""),format.raw/*11.1*/("""td, th """),format.raw/*11.8*/("""{"""),format.raw/*11.9*/("""
	"""),format.raw/*12.2*/("""border: 2px solid #e0b0918f;
	text-align: left;
	padding: 8px;
"""),format.raw/*15.1*/("""}"""),format.raw/*15.2*/("""

"""),format.raw/*17.1*/("""tr:nth-child(even) """),format.raw/*17.20*/("""{"""),format.raw/*17.21*/("""
	"""),format.raw/*18.2*/("""background-color: #dddddd;
"""),format.raw/*19.1*/("""}"""),format.raw/*19.2*/("""

"""),format.raw/*21.1*/("""h2"""),format.raw/*21.3*/("""{"""),format.raw/*21.4*/("""
   """),format.raw/*22.4*/("""display:flex;
   justify-content:center;
   color: burlywood;
   background-color: black;
   margin-bottom:50px;
   margin: -15px;
   padding: 16px;
   font-size: 35px;
   
"""),format.raw/*31.1*/("""}"""),format.raw/*31.2*/("""
"""),format.raw/*32.1*/("""</style>

<body>
	<h2>User Profile</h2>

		<table style="width:100%">
			"""),_display_(/*38.5*/for(d <- data) yield /*38.19*/{_display_(Seq[Any](format.raw/*38.20*/("""
			"""),format.raw/*39.4*/("""<tr>
				<th>Id</th>
				<td>"""),_display_(/*41.10*/d/*41.11*/.id),format.raw/*41.14*/("""</td>
			</tr>
			<tr>
				<th>Login</th>
				<td>"""),_display_(/*45.10*/d/*45.11*/.login),format.raw/*45.17*/("""</td>
			</tr>
			<tr>
				<th>Name</th>
				<td>"""),_display_(/*49.10*/d/*49.11*/.name),format.raw/*49.16*/("""</td>
			</tr>
			<tr>
				<th>Repository</th>
				<td>"""),_display_(/*53.10*/d/*53.11*/.repository),format.raw/*53.22*/("""</td>
			</tr>
			<tr>
				<th>Followers</th>
				<td>"""),_display_(/*57.10*/d/*57.11*/.followers),format.raw/*57.21*/("""</td>
			</tr>
			
		    <tr>
				<th>Following</th>
				<td>"""),_display_(/*62.10*/d/*62.11*/.following),format.raw/*62.21*/("""</td>
			</tr>
			
			<tr>
				<th>Organization</th>
				<td>"""),_display_(/*67.10*/d/*67.11*/.organization),format.raw/*67.24*/("""</td>
			</tr>
			
			<tr>
				<th>Subscription</th>
				<td>"""),_display_(/*72.10*/d/*72.11*/.subscription),format.raw/*72.24*/("""</td>
			</tr>
			""")))}),format.raw/*74.5*/("""
		"""),format.raw/*75.3*/("""</table>
</body>
</html>"""))
      }
    }
  }

  def render(data:List[model.UsersList]): play.twirl.api.HtmlFormat.Appendable = apply(data)

  def f:((List[model.UsersList]) => play.twirl.api.HtmlFormat.Appendable) = (data) => apply(data)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/users.scala.html
                  HASH: 43952f149ff164e14008114e71731545bc1d2429
                  MATRIX: 922->1|1046->30|1074->32|1123->55|1150->56|1179->59|1304->158|1331->159|1362->163|1396->170|1424->171|1454->174|1547->240|1575->241|1606->245|1653->264|1682->265|1712->268|1767->296|1795->297|1826->301|1855->303|1883->304|1915->309|2124->491|2152->492|2181->494|2287->574|2317->588|2356->589|2388->594|2447->626|2457->627|2481->630|2563->685|2573->686|2600->692|2681->746|2691->747|2717->752|2804->812|2814->813|2846->824|2932->883|2942->884|2973->894|3067->961|3077->962|3108->972|3202->1039|3212->1040|3246->1053|3340->1120|3350->1121|3384->1134|3435->1155|3466->1159
                  LINES: 27->1|32->1|33->2|35->4|35->4|36->5|40->9|40->9|42->11|42->11|42->11|43->12|46->15|46->15|48->17|48->17|48->17|49->18|50->19|50->19|52->21|52->21|52->21|53->22|62->31|62->31|63->32|69->38|69->38|69->38|70->39|72->41|72->41|72->41|76->45|76->45|76->45|80->49|80->49|80->49|84->53|84->53|84->53|88->57|88->57|88->57|93->62|93->62|93->62|98->67|98->67|98->67|103->72|103->72|103->72|105->74|106->75
                  -- GENERATED --
              */
          