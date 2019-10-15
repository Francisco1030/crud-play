
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
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main/*3.6*/ {_display_(Seq[Any](format.raw/*3.8*/("""
    """),format.raw/*4.5*/("""<div id="ping"></div>
          <input type="submit" id="enviar" />
<script>

        $(function() """),format.raw/*8.22*/("""{"""),format.raw/*8.23*/("""

            """),format.raw/*10.13*/("""var websocket = new WebSocket(""""),_display_(/*10.45*/routes/*10.51*/.HomeController.socket().webSocketURL(request)),format.raw/*10.97*/("""")

            var receiveEvent = function(event) """),format.raw/*12.48*/("""{"""),format.raw/*12.49*/("""
                """),format.raw/*13.17*/("""$("#ping").html("Last ping: "+event.data);
                //alert(event.data);
            """),format.raw/*15.13*/("""}"""),format.raw/*15.14*/("""

            """),format.raw/*17.13*/("""dateSocket.onmessage = receiveEvent


            // var btnEnv = document.getElementById("#enviar");
            //
            // var createReceive = function() """),format.raw/*22.47*/("""{"""),format.raw/*22.48*/("""
            """),format.raw/*23.13*/("""//     websocket.send(
            //         alert("Enviado")
            //     )
            // """),format.raw/*26.16*/("""}"""),format.raw/*26.17*/("""
            """),format.raw/*27.13*/("""//
            // var receiveEvent = function(event) """),format.raw/*28.51*/("""{"""),format.raw/*28.52*/("""
            """),format.raw/*29.13*/("""//     createReceive();
            // """),format.raw/*30.16*/("""}"""),format.raw/*30.17*/("""

            """),format.raw/*32.13*/("""//websocket.onmessage = receiveEvent

            console.table(websocket);
        """),format.raw/*35.9*/("""}"""),format.raw/*35.10*/(""")
</script>

""")))}),format.raw/*38.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-10-15T16:02:46.256
                  SOURCE: /home/smartcatolica/workspace-play/crud-play/app/views/index.scala.html
                  HASH: d3959dcff6ed83fdd4e3912b96e42e942166276d
                  MATRIX: 941->1|1037->4|1064->6|1075->10|1113->12|1144->17|1270->116|1298->117|1340->131|1399->163|1414->169|1481->215|1560->266|1589->267|1634->284|1754->376|1783->377|1825->391|2016->554|2045->555|2086->568|2213->667|2242->668|2283->681|2364->734|2393->735|2434->748|2501->787|2530->788|2572->802|2683->886|2712->887|2756->901
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|39->8|39->8|41->10|41->10|41->10|41->10|43->12|43->12|44->13|46->15|46->15|48->17|53->22|53->22|54->23|57->26|57->26|58->27|59->28|59->28|60->29|61->30|61->30|63->32|66->35|66->35|69->38
                  -- GENERATED --
              */
          