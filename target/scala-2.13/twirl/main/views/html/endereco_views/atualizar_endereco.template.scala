
package views.html.endereco_views

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

object atualizar_endereco extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[entidades.Endereco,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(endereco: entidades.Endereco):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main/*2.6*/ {_display_(Seq[Any](format.raw/*2.8*/("""

"""),format.raw/*4.1*/("""<div class="container">
    <h1 class="grey-text">Atualizar Endereco</h1>

    """),_display_(/*7.6*/helper/*7.12*/.form(routes.EnderecoController.atualizarEndereco)/*7.62*/ {_display_(Seq[Any](format.raw/*7.64*/("""
        """),_display_(/*8.10*/helper/*8.16*/.CSRF.formField),format.raw/*8.31*/("""

        """),format.raw/*10.9*/("""<div class="row">
            <div class="col s6">
                <input type="hidden" value=""""),_display_(/*12.46*/endereco/*12.54*/.getId),format.raw/*12.60*/("""" name="id">
                <lable>Rua:</lable>
                <input type="text" value=""""),_display_(/*14.44*/endereco/*14.52*/.getRua),format.raw/*14.59*/("""" name="rua">
            </div>

            <div class="col s6">
                <label>N°</label>
                <input type="text" value=""""),_display_(/*19.44*/endereco/*19.52*/.getNumero),format.raw/*19.62*/("""" name="numero">
            </div>
        </div>

        <div class="row">
            <div class="col s12">
                <input class="waves-effect waves-light btn white-text" type="submit" value="Enviar">
            </div>
        </div>
    """)))}),format.raw/*28.6*/("""
"""),format.raw/*29.1*/("""</div>
""")))}))
      }
    }
  }

  def render(endereco:entidades.Endereco): play.twirl.api.HtmlFormat.Appendable = apply(endereco)

  def f:((entidades.Endereco) => play.twirl.api.HtmlFormat.Appendable) = (endereco) => apply(endereco)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-07-31T15:00:43.168606
                  SOURCE: /home/smartcatolica/workspace-play/crud/app/views/endereco_views/atualizar_endereco.scala.html
                  HASH: 887e8db841a8dbb4158ca4116c334fa80dbab913
                  MATRIX: 988->1|1112->33|1123->37|1161->39|1189->41|1294->121|1308->127|1366->177|1405->179|1441->189|1455->195|1490->210|1527->220|1650->316|1667->324|1694->330|1813->422|1830->430|1858->437|2029->581|2046->589|2077->599|2359->851|2387->852
                  LINES: 28->1|33->2|33->2|33->2|35->4|38->7|38->7|38->7|38->7|39->8|39->8|39->8|41->10|43->12|43->12|43->12|45->14|45->14|45->14|50->19|50->19|50->19|59->28|60->29
                  -- GENERATED --
              */
          