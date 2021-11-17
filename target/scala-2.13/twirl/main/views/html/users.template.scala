
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
	"""),_display_(/*34.3*/for(d <- data) yield /*34.17*/{_display_(Seq[Any](format.raw/*34.18*/("""
	"""),format.raw/*35.2*/("""<h2>"""),_display_(/*35.7*/d/*35.8*/.name),format.raw/*35.13*/(""" """),format.raw/*35.14*/("""Profile</h2>
	<img src=""""),_display_(/*36.13*/d/*36.14*/.avatar_url),format.raw/*36.25*/("""" alt="alternatetext"
		style="width: 56px; margin-top: -44px;"> """)))}),format.raw/*37.45*/("""
	"""),format.raw/*38.2*/("""<table style="width: 100%">
		"""),_display_(/*39.4*/for(d <- data) yield /*39.18*/{_display_(Seq[Any](format.raw/*39.19*/("""
		"""),format.raw/*40.3*/("""<tr>
			<th>Id</th>
			<td>"""),_display_(/*42.9*/d/*42.10*/.id),format.raw/*42.13*/("""</td>
		</tr>
		<tr>
			<th>Login</th>
			<td>"""),_display_(/*46.9*/d/*46.10*/.login),format.raw/*46.16*/("""</td>
		</tr>
		<tr>
			<th>Name</th>
			<td>"""),_display_(/*50.9*/d/*50.10*/.name),format.raw/*50.15*/("""</td>
		</tr>
		<tr>
			<th>Repository</th>
			<td><a href=""""),_display_(/*54.18*/d/*54.19*/.login),format.raw/*54.25*/("""/repos">"""),_display_(/*54.34*/d/*54.35*/.repository),format.raw/*54.46*/("""</td>
		</tr>
		<tr>
			<th>Followers</th>
			<td>"""),_display_(/*58.9*/d/*58.10*/.followers),format.raw/*58.20*/("""</td>
		</tr>

		<tr>
			<th>Following</th>
			<td>"""),_display_(/*63.9*/d/*63.10*/.following),format.raw/*63.20*/("""</td>
		</tr>


		<tr>
			<th>Organization</th>
			<td>"""),_display_(/*69.9*/d/*69.10*/.organization),format.raw/*69.23*/("""</td>
		</tr>

		<tr>
			<th>Subscription</th>
			<td>"""),_display_(/*74.9*/d/*74.10*/.subscription),format.raw/*74.23*/("""</td>
		</tr>

		<tr>
			<th>Public Repositories</th>
			<td>"""),_display_(/*79.9*/d/*79.10*/.public_repos),format.raw/*79.23*/("""</td>
		</tr>
		""")))}),format.raw/*81.4*/("""
	"""),format.raw/*82.2*/("""</table>
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
                  HASH: 3478d4a75cc4182cd7caa36ccc5e7e780a5378ab
                  MATRIX: 922->1|1046->30|1074->32|1123->55|1150->56|1179->59|1302->156|1329->157|1360->161|1394->168|1422->169|1452->172|1545->238|1573->239|1604->243|1651->262|1680->263|1710->266|1765->294|1793->295|1824->299|1854->302|1882->303|1912->306|2105->472|2133->473|2162->475|2210->497|2240->511|2279->512|2309->515|2340->520|2349->521|2375->526|2404->527|2457->553|2467->554|2499->565|2597->632|2627->635|2685->667|2715->681|2754->682|2785->686|2841->716|2851->717|2875->720|2952->771|2962->772|2989->778|3065->828|3075->829|3101->834|3193->899|3203->900|3230->906|3266->915|3276->916|3308->927|3389->982|3399->983|3430->993|3513->1050|3523->1051|3554->1061|3642->1123|3652->1124|3686->1137|3772->1197|3782->1198|3816->1211|3909->1278|3919->1279|3953->1292|4002->1311|4032->1314
                  LINES: 27->1|32->1|33->2|35->4|35->4|36->5|40->9|40->9|42->11|42->11|42->11|43->12|46->15|46->15|48->17|48->17|48->17|49->18|50->19|50->19|52->21|52->21|52->21|53->22|61->30|61->30|62->31|65->34|65->34|65->34|66->35|66->35|66->35|66->35|66->35|67->36|67->36|67->36|68->37|69->38|70->39|70->39|70->39|71->40|73->42|73->42|73->42|77->46|77->46|77->46|81->50|81->50|81->50|85->54|85->54|85->54|85->54|85->54|85->54|89->58|89->58|89->58|94->63|94->63|94->63|100->69|100->69|100->69|105->74|105->74|105->74|110->79|110->79|110->79|112->81|113->82
                  -- GENERATED --
              */
          