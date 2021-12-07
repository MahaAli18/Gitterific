
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import java.math.BigInteger; var count=0


Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
<style>
table """),format.raw/*7.7*/("""{"""),format.raw/*7.8*/("""
	"""),format.raw/*8.2*/("""font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 90%;
"""),format.raw/*11.1*/("""}"""),format.raw/*11.2*/("""

"""),format.raw/*13.1*/("""td, th """),format.raw/*13.8*/("""{"""),format.raw/*13.9*/("""
	"""),format.raw/*14.2*/("""border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
	overflow-wrap: anywhere;
"""),format.raw/*18.1*/("""}"""),format.raw/*18.2*/("""

"""),format.raw/*20.1*/("""tr:nth-child(even) """),format.raw/*20.20*/("""{"""),format.raw/*20.21*/("""
	"""),format.raw/*21.2*/("""background-color: #dddddd;
"""),format.raw/*22.1*/("""}"""),format.raw/*22.2*/("""

"""),format.raw/*24.1*/(""".header """),format.raw/*24.9*/("""{"""),format.raw/*24.10*/("""
	"""),format.raw/*25.2*/("""background-color: #171616;
	color: bisque;
	margin: -15px;
	margin-bottom: 50px;
	padding: 6px;
"""),format.raw/*30.1*/("""}"""),format.raw/*30.2*/("""
"""),format.raw/*31.1*/("""</style>

<head>
<title>Gitterific</title>
<script type='text/javascript'
	src='https://code.jquery.com/jquery-3.3.1.min.js'></script>
</head>

<body>
	<center class="header">
		<div>
			<h1 class="center">Welcome to Gitterific</h1>
		</div>
		<div>
			<input id="searchKeyword" type="text" placeholder="Enter search key" />
		</div>
		<div>
			<button id="searchButton" type="button">Search</button>
		</div>
	</center>

	<center>
	<div id="searchedResults">
	</div>
	</center>

	<script>
		var sockets = [];
		var searchCount = 0;
		
		document.getElementById("searchButton").addEventListener("click", function() """),format.raw/*61.80*/("""{"""),format.raw/*61.81*/("""
			"""),format.raw/*62.4*/("""searchCount++;
			closeAllSockets();
			let ws = new WebSocket("ws://localhost:9000/fetchRepositoriesWS");
			sockets.push(ws);
			url = "https://api.github.com/search/repositories?per_page=10&q=";
			ws.onopen = () => ws.send(JSON.stringify("""),format.raw/*67.45*/("""{"""),format.raw/*67.46*/("""
				"""),format.raw/*68.5*/(""""uri": url + document.getElementById("searchKeyword").value+"&sort=updated&order=desc"
			"""),format.raw/*69.4*/("""}"""),format.raw/*69.5*/("""));
			generateTable()
			ws.onmessage = function(event) """),format.raw/*71.35*/("""{"""),format.raw/*71.36*/("""
				"""),format.raw/*72.5*/("""console.log("Updating Search");
				table = document.getElementById("table"+searchCount);
				clearTable(table);
				repositories = JSON.parse(event.data).data;
		  		for (itr in repositories) """),format.raw/*76.33*/("""{"""),format.raw/*76.34*/("""
		  			"""),format.raw/*77.8*/("""generateNewRow(table, repositories[itr]);
		  		"""),format.raw/*78.7*/("""}"""),format.raw/*78.8*/("""
			"""),format.raw/*79.4*/("""}"""),format.raw/*79.5*/("""
		"""),format.raw/*80.3*/("""}"""),format.raw/*80.4*/(""");
		
		function closeAllSockets() """),format.raw/*82.30*/("""{"""),format.raw/*82.31*/("""
			"""),format.raw/*83.4*/("""sockets.forEach(function(s) """),format.raw/*83.32*/("""{"""),format.raw/*83.33*/("""
		        """),format.raw/*84.11*/("""s.close();
		    """),format.raw/*85.7*/("""}"""),format.raw/*85.8*/(""");
		"""),format.raw/*86.3*/("""}"""),format.raw/*86.4*/("""
		
		"""),format.raw/*88.3*/("""function generateTable() """),format.raw/*88.28*/("""{"""),format.raw/*88.29*/("""
			"""),format.raw/*89.4*/("""var searchedResults = document.getElementById('searchedResults')
			if(searchCount >=5) """),format.raw/*90.24*/("""{"""),format.raw/*90.25*/("""
				"""),format.raw/*91.5*/("""var select = searchedResults.removeChild(searchedResults.lastChild);
			"""),format.raw/*92.4*/("""}"""),format.raw/*92.5*/("""
			"""),format.raw/*93.4*/("""var table = document.createElement("TABLE");
			table.setAttribute("id", "table"+searchCount);
			table.style.marginTop = "50px";
			generateHeader(table);
			searchedResults.prepend(table);
			return table;
		"""),format.raw/*99.3*/("""}"""),format.raw/*99.4*/("""
		
		"""),format.raw/*101.3*/("""function generateHeader(table) """),format.raw/*101.34*/("""{"""),format.raw/*101.35*/("""
			"""),format.raw/*102.4*/("""var head = table.createTHead();
			var row = head.insertRow(0);
			row.insertCell(0).innerHTML = "<b>User</b>";
			row.insertCell(1).innerHTML = "<b>Repository Name</b>";
			row.insertCell(2).innerHTML = "<b>Topic</b>";
		"""),format.raw/*107.3*/("""}"""),format.raw/*107.4*/("""
		
		"""),format.raw/*109.3*/("""function generateNewRow(table, repository) """),format.raw/*109.46*/("""{"""),format.raw/*109.47*/("""
			"""),format.raw/*110.4*/("""var row = table.insertRow(1);
  			
  			var user = row.insertCell(0);
  			user.innerHTML = repository.login;
  			
  			var name = row.insertCell(1);
  			var a = document.createElement('a');
  			a.appendChild(document.createTextNode(repository.name));
  			a.href = "http://localhost:9000/navToRepositoryDetailsWS/" + repository.login + "/" + repository.name + "/description";
  			name.appendChild(a);
  			
  			var topics = row.insertCell(2);
  			topics.innerHTML = repositories[itr].topicword;
		"""),format.raw/*123.3*/("""}"""),format.raw/*123.4*/("""
		
		"""),format.raw/*125.3*/("""function clearTable(resultsTable) """),format.raw/*125.37*/("""{"""),format.raw/*125.38*/("""
			"""),format.raw/*126.4*/("""while (resultsTable.hasChildNodes()) """),format.raw/*126.41*/("""{"""),format.raw/*126.42*/("""
					"""),format.raw/*127.6*/("""resultsTable.removeChild(resultsTable.lastChild);
		    """),format.raw/*128.7*/("""}"""),format.raw/*128.8*/("""
			"""),format.raw/*129.4*/("""generateHeader(table);
		"""),format.raw/*130.3*/("""}"""),format.raw/*130.4*/("""
	"""),format.raw/*131.2*/("""</script>

</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: b9207cef5833b8d738759a798406c09b0d4fdeee
                  MATRIX: 900->1|975->6|1044->3|1072->48|1140->90|1167->91|1196->94|1299->170|1327->171|1358->175|1392->182|1420->183|1450->186|1568->277|1596->278|1627->282|1674->301|1703->302|1733->305|1788->333|1816->334|1847->338|1882->346|1911->347|1941->350|2069->451|2097->452|2126->454|2799->1099|2828->1100|2860->1105|3135->1352|3164->1353|3197->1359|3315->1450|3343->1451|3430->1510|3459->1511|3492->1517|3717->1714|3746->1715|3782->1724|3858->1773|3886->1774|3918->1779|3946->1780|3977->1784|4005->1785|4070->1822|4099->1823|4131->1828|4187->1856|4216->1857|4256->1869|4301->1887|4329->1888|4362->1894|4390->1895|4425->1903|4478->1928|4507->1929|4539->1934|4656->2023|4685->2024|4718->2030|4818->2103|4846->2104|4878->2109|5121->2325|5149->2326|5185->2334|5245->2365|5275->2366|5308->2371|5563->2598|5592->2599|5628->2607|5700->2650|5730->2651|5763->2656|6309->3174|6338->3175|6374->3183|6437->3217|6467->3218|6500->3223|6566->3260|6596->3261|6631->3268|6716->3325|6745->3326|6778->3331|6832->3357|6861->3358|6892->3361
                  LINES: 27->1|30->2|33->1|34->3|38->7|38->7|39->8|42->11|42->11|44->13|44->13|44->13|45->14|49->18|49->18|51->20|51->20|51->20|52->21|53->22|53->22|55->24|55->24|55->24|56->25|61->30|61->30|62->31|92->61|92->61|93->62|98->67|98->67|99->68|100->69|100->69|102->71|102->71|103->72|107->76|107->76|108->77|109->78|109->78|110->79|110->79|111->80|111->80|113->82|113->82|114->83|114->83|114->83|115->84|116->85|116->85|117->86|117->86|119->88|119->88|119->88|120->89|121->90|121->90|122->91|123->92|123->92|124->93|130->99|130->99|132->101|132->101|132->101|133->102|138->107|138->107|140->109|140->109|140->109|141->110|154->123|154->123|156->125|156->125|156->125|157->126|157->126|157->126|158->127|159->128|159->128|160->129|161->130|161->130|162->131
                  -- GENERATED --
              */
          