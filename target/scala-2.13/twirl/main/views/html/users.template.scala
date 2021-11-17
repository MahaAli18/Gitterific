
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
"""),_display_(/*35.2*/for(d <- data) yield /*35.16*/{_display_(Seq[Any](format.raw/*35.17*/("""
	"""),format.raw/*36.2*/("""<h2>"""),_display_(/*36.7*/d/*36.8*/.name),format.raw/*36.13*/(""" """),format.raw/*36.14*/("""Profile</h2>
	<img src=""""),_display_(/*37.13*/d/*37.14*/.avatar_url),format.raw/*37.25*/("""" alt="alternatetext" style="width: 56px; margin-top: -44px;">
""")))}),format.raw/*38.2*/("""
		"""),format.raw/*39.3*/("""<table style="width:100%">
			"""),_display_(/*40.5*/for(d <- data) yield /*40.19*/{_display_(Seq[Any](format.raw/*40.20*/("""
			"""),format.raw/*41.4*/("""<tr>
				<th>Id</th>
				<td>"""),_display_(/*43.10*/d/*43.11*/.id),format.raw/*43.14*/("""</td>
			</tr>
			<tr>
				<th>Login</th>
				<td>"""),_display_(/*47.10*/d/*47.11*/.login),format.raw/*47.17*/("""</td>
			</tr>
			<tr>
				<th>Name</th>
				<td>"""),_display_(/*51.10*/d/*51.11*/.name),format.raw/*51.16*/("""</td>
			</tr>
			<tr>
				<th>Repository</th>
				<td><a href=""""),_display_(/*55.19*/d/*55.20*/.login),format.raw/*55.26*/("""/repos">"""),_display_(/*55.35*/d/*55.36*/.repository),format.raw/*55.47*/("""</td>
			</tr>
			<tr>
				<th>Followers</th>
				<td>"""),_display_(/*59.10*/d/*59.11*/.followers),format.raw/*59.21*/("""</td>
			</tr>
			
		    <tr>
				<th>Following</th>
				<td>"""),_display_(/*64.10*/d/*64.11*/.following),format.raw/*64.21*/("""</td>
			</tr>
			
			
			<tr>
				<th>Organization</th>
				<td>"""),_display_(/*70.10*/d/*70.11*/.organization),format.raw/*70.24*/("""</td>
			</tr>
			
			<tr>
				<th>Subscription</th>
				<td>"""),_display_(/*75.10*/d/*75.11*/.subscription),format.raw/*75.24*/("""</td>
			</tr>
			
			<tr>
				<th>Public Repositories</th>
				<td>"""),_display_(/*80.10*/d/*80.11*/.public_repos),format.raw/*80.24*/("""</td>
			</tr>
			""")))}),format.raw/*82.5*/("""
		"""),format.raw/*83.3*/("""</table>
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
                  HASH: 0ad9b8a3d444841c014f7bff62c2d9fd84077832
                  MATRIX: 922->1|1046->30|1074->32|1123->55|1150->56|1179->59|1304->158|1331->159|1362->163|1396->170|1424->171|1454->174|1547->240|1575->241|1606->245|1653->264|1682->265|1712->268|1767->296|1795->297|1826->301|1855->303|1883->304|1915->309|2124->491|2152->492|2181->494|2228->515|2258->529|2297->530|2327->533|2358->538|2367->539|2393->544|2422->545|2475->571|2485->572|2517->583|2612->648|2643->652|2701->684|2731->698|2770->699|2802->704|2861->736|2871->737|2895->740|2977->795|2987->796|3014->802|3095->856|3105->857|3131->862|3227->931|3237->932|3264->938|3300->947|3310->948|3342->959|3428->1018|3438->1019|3469->1029|3563->1096|3573->1097|3604->1107|3703->1179|3713->1180|3747->1193|3841->1260|3851->1261|3885->1274|3986->1348|3996->1349|4030->1362|4081->1383|4112->1387
                  LINES: 27->1|32->1|33->2|35->4|35->4|36->5|40->9|40->9|42->11|42->11|42->11|43->12|46->15|46->15|48->17|48->17|48->17|49->18|50->19|50->19|52->21|52->21|52->21|53->22|62->31|62->31|63->32|66->35|66->35|66->35|67->36|67->36|67->36|67->36|67->36|68->37|68->37|68->37|69->38|70->39|71->40|71->40|71->40|72->41|74->43|74->43|74->43|78->47|78->47|78->47|82->51|82->51|82->51|86->55|86->55|86->55|86->55|86->55|86->55|90->59|90->59|90->59|95->64|95->64|95->64|101->70|101->70|101->70|106->75|106->75|106->75|111->80|111->80|111->80|113->82|114->83
                  -- GENERATED --
              */
          