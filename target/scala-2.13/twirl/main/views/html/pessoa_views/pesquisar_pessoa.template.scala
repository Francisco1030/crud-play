
package views.html.pessoa_views

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

object pesquisar_pessoa extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[entidades.Pessoa,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pessoa: entidades.Pessoa):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main/*2.6*/{_display_(Seq[Any](format.raw/*2.7*/("""

    """),format.raw/*4.5*/("""<div class="container">
    <h3 class="center-align">Pesquisar Pessoa</h3>
"""),format.raw/*6.163*/("""
        
            """),format.raw/*8.13*/("""<table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nome</th>
                        <th>E-mail</th>
                        <th>Ações</th>
                    </tr>
                </thead>
                <tbody>
                    """),_display_(/*18.22*/if(pessoa == null)/*18.40*/{_display_(Seq[Any](format.raw/*18.41*/("""
                        """),format.raw/*19.25*/("""<tr>
                            <td colspan="4">
                                Nenhuma pessoa cadastrada!
                            </td>
                        </tr>
                    """)))}),format.raw/*24.22*/("""
                        """),format.raw/*25.25*/("""<tr>
                            <td>"""),_display_(/*26.34*/pessoa/*26.40*/.getId),format.raw/*26.46*/("""</td>
                            <td>"""),_display_(/*27.34*/pessoa/*27.40*/.getNome),format.raw/*27.48*/("""</td>
                            <td>"""),_display_(/*28.34*/pessoa/*28.40*/.getEmail),format.raw/*28.49*/("""</td>
                            <td>
"""),format.raw/*30.190*/("""
"""),format.raw/*31.184*/("""
                            """),format.raw/*32.29*/("""</td>
                        </tr>
                </tbody>

            </table>
    </div>
""")))}))
      }
    }
  }

  def render(pessoa:entidades.Pessoa): play.twirl.api.HtmlFormat.Appendable = apply(pessoa)

  def f:((entidades.Pessoa) => play.twirl.api.HtmlFormat.Appendable) = (pessoa) => apply(pessoa)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-08-01T17:38:26.065595
                  SOURCE: /home/smartcatolica/workspace-play/crud/app/views/pessoa_views/pesquisar_pessoa.scala.html
                  HASH: 8d706c11b25aca631e1dfd96456f5f0a71c41ab5
                  MATRIX: 982->1|1102->29|1113->33|1150->34|1182->40|1285->277|1334->299|1667->605|1694->623|1733->624|1786->649|2011->843|2064->868|2129->906|2144->912|2171->918|2237->957|2252->963|2281->971|2347->1010|2362->1016|2392->1025|2460->1253|2490->1437|2547->1466
                  LINES: 28->1|33->2|33->2|33->2|35->4|37->6|39->8|49->18|49->18|49->18|50->19|55->24|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|61->30|62->31|63->32
                  -- GENERATED --
              */
          