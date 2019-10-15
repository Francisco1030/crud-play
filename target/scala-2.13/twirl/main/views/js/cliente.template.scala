
package views.js

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.js._
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

object cliente extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.JavaScriptFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.JavaScriptFormat.Appendable]](play.twirl.api.JavaScriptFormat) with _root_.play.twirl.api.Template0[play.twirl.api.JavaScriptFormat.Appendable] {

  /**/
  def apply():play.twirl.api.JavaScriptFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""$(function() """),format.raw/*2.14*/("""{"""),format.raw/*2.15*/("""

    """),format.raw/*4.5*/("""var websocket = new WebSocket(""""),_display_(/*4.37*/routes/*4.43*/.HomeController.socket().webSocketURL(request)),format.raw/*4.89*/("""")

    // $("#talk").keypress(enviaMensagemEnter)
    // websocket.onmessage = receiveEvent
"""),format.raw/*8.1*/("""}"""),format.raw/*8.2*/(""")"""))
      }
    }
  }

  def render(): play.twirl.api.JavaScriptFormat.Appendable = apply()

  def f:(() => play.twirl.api.JavaScriptFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-10-15T14:52:54.027
                  SOURCE: /home/smartcatolica/workspace-play/crud-play/app/views/cliente.scala.js
                  HASH: cba398ed3ec9584c74d6ad872b46ecddb1e427e6
                  MATRIX: 1058->1|1098->14|1126->15|1158->21|1216->53|1230->59|1296->105|1415->198|1442->199
                  LINES: 33->2|33->2|33->2|35->4|35->4|35->4|35->4|39->8|39->8
                  -- GENERATED --
              */
          