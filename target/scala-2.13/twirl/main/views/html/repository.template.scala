
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

object repository extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[List[model.ListRepoDetails],String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(data: List[model.ListRepoDetails], login: String, name: String, description: String, title: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<html>
    <style>
            table """),format.raw/*4.19*/("""{"""),format.raw/*4.20*/("""
                """),format.raw/*5.17*/("""font-family: arial, sans-serif;
                border-collapse: collapse;
                width: 90%;
            """),format.raw/*8.13*/("""}"""),format.raw/*8.14*/("""

            """),format.raw/*10.13*/("""td, th """),format.raw/*10.20*/("""{"""),format.raw/*10.21*/("""
                """),format.raw/*11.17*/("""border: 1px solid #dddddd;
                text-align: left;
                padding: 8px;
                overflow-wrap: anywhere;
            """),format.raw/*15.13*/("""}"""),format.raw/*15.14*/("""

            """),format.raw/*17.13*/("""tr:nth-child(even) """),format.raw/*17.32*/("""{"""),format.raw/*17.33*/("""
                """),format.raw/*18.17*/("""background-color: #dddddd;
            """),format.raw/*19.13*/("""}"""),format.raw/*19.14*/("""

            """),format.raw/*21.13*/(""".header """),format.raw/*21.21*/("""{"""),format.raw/*21.22*/("""
                """),format.raw/*22.17*/("""background-color: #171616;
                color: bisque;
                margin: -15px;
                margin-bottom: 50px;
                padding: 6px;
            """),format.raw/*27.13*/("""}"""),format.raw/*27.14*/("""
    """),format.raw/*28.5*/("""</style>

    <body>
        <center class="header">
            <div>
                <h1 class="center">Repository Name: """),_display_(/*33.54*/name),format.raw/*33.58*/("""</h1>
            </div>
            <div>
                <h1 class="center">Owner Name: """),_display_(/*36.49*/login),format.raw/*36.54*/("""</h1>
            </div>
            <div>
                <h1 class="center">Description: """),_display_(/*39.50*/description),format.raw/*39.61*/("""</h1>
            </div>
        </center>

        <div>
            <a href=""""),_display_(/*44.23*/routes/*44.29*/.Application.fetchIssues()),format.raw/*44.55*/("""">Issues</a>
        </div>

        <div>
            <a href=""""),_display_(/*48.23*/routes/*48.29*/.Application.fetchCommits()),format.raw/*48.56*/("""">Commits</a>
        </div>

        <div>
            <a href=""""),_display_(/*52.23*/routes/*52.29*/.Application.fetchPulls()),format.raw/*52.54*/("""">Pulls</a>
        </div>
        
        <div>
            <a href=""""),_display_(/*56.23*/routes/*56.29*/.Application.back()),format.raw/*56.48*/("""">Back</a>
        </div>

        <center>
            <table>
                <tr>
                    <th>"""),_display_(/*62.26*/title),format.raw/*62.31*/("""</th>
                </tr>
                """),_display_(/*64.18*/for(d <- data) yield /*64.32*/ {_display_(Seq[Any](format.raw/*64.34*/("""
                    """),format.raw/*65.21*/("""<tr>
                        <td>"""),_display_(/*66.30*/d/*66.31*/.title),format.raw/*66.37*/("""</td>
                    </tr>
                """)))}),format.raw/*68.18*/("""
            """),format.raw/*69.13*/("""</table>
        </center>
    </body>
</html>"""))
      }
    }
  }

  def render(data:List[model.ListRepoDetails],login:String,name:String,description:String,title:String): play.twirl.api.HtmlFormat.Appendable = apply(data,login,name,description,title)

  def f:((List[model.ListRepoDetails],String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (data,login,name,description,title) => apply(data,login,name,description,title)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/repository.scala.html
                  HASH: e07cf948ed53b0cc31c2035de58072866bcb89b4
                  MATRIX: 961->1|1155->102|1219->139|1247->140|1291->157|1433->272|1461->273|1503->287|1538->294|1567->295|1612->312|1784->456|1813->457|1855->471|1902->490|1931->491|1976->508|2043->547|2072->548|2114->562|2150->570|2179->571|2224->588|2420->756|2449->757|2481->762|2632->886|2657->890|2775->981|2801->986|2920->1078|2952->1089|3059->1169|3074->1175|3121->1201|3213->1266|3228->1272|3276->1299|3369->1365|3384->1371|3430->1396|3529->1468|3544->1474|3584->1493|3721->1603|3747->1608|3819->1653|3849->1667|3889->1669|3938->1690|3999->1724|4009->1725|4036->1731|4116->1780|4157->1793
                  LINES: 27->1|32->2|34->4|34->4|35->5|38->8|38->8|40->10|40->10|40->10|41->11|45->15|45->15|47->17|47->17|47->17|48->18|49->19|49->19|51->21|51->21|51->21|52->22|57->27|57->27|58->28|63->33|63->33|66->36|66->36|69->39|69->39|74->44|74->44|74->44|78->48|78->48|78->48|82->52|82->52|82->52|86->56|86->56|86->56|92->62|92->62|94->64|94->64|94->64|95->65|96->66|96->66|96->66|98->68|99->69
                  -- GENERATED --
              */
          