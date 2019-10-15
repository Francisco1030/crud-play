
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

object gerenciar_endereco extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[entidades.Endereco],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(enderecos: List[entidades.Endereco]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main/*2.6*/{_display_(Seq[Any](format.raw/*2.7*/("""
    """),format.raw/*3.5*/("""<div>
        <div class="row">
            <div class="col s12 m12">
                <div class="card">
                    <div class="card-content">
                        <span class="card-title blue-grey-text text-darken-2 center-align">
                            <h4>Gerenciar Endereco</h4>
                        </span>
                        <table id="tabela-paginacao" class="styleTable bordered striped">
                            <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>Rua</th>
                                    <th>Numero</th>
                                    <th>Pessoa</th>
                                    <th>Ações</th>
                                </tr>
                            </thead>

                            <tbody>
                                """),_display_(/*23.34*/if(enderecos.isEmpty)/*23.55*/{_display_(Seq[Any](format.raw/*23.56*/("""
                                    """),format.raw/*24.37*/("""<tr>
                                        <td colspan="4">
                                            Nenhum endereço cadastrado!
                                        </td>
                                    </tr>
                                """)))}),format.raw/*29.34*/("""
                                """),_display_(/*30.34*/for(endereco <- enderecos) yield /*30.60*/ {_display_(Seq[Any](format.raw/*30.62*/("""
                                    """),format.raw/*31.37*/("""<tr>
                                        <td>"""),_display_(/*32.46*/endereco/*32.54*/.getId),format.raw/*32.60*/("""</td>
                                        <td>"""),_display_(/*33.46*/endereco/*33.54*/.getRua),format.raw/*33.61*/("""</td>
                                        <td>"""),_display_(/*34.46*/endereco/*34.54*/.getNumero),format.raw/*34.64*/("""</td>
                                        <td>"""),_display_(/*35.46*/endereco/*35.54*/.getPessoa.getNome),format.raw/*35.72*/("""</td>
                                        <td>
                                            <a class="waves-effect waves-light btn orange" href=""""),_display_(/*37.99*/routes/*37.105*/.EnderecoController.atualizarEnderecoPage(endereco.getId)),format.raw/*37.162*/(""""><i class="material-icons">create</i></a>
                                            <a class="waves-effect waves-light btn red"  href=""""),_display_(/*38.97*/routes/*38.103*/.EnderecoController.removerEndereco(endereco.getId)),format.raw/*38.154*/(""""><i class="material-icons">delete</i></a>
                                        </td>
                                    </tr>
                                """)))}),format.raw/*41.34*/("""
                            """),format.raw/*42.29*/("""</tbody>
                        </table>

                    </div>
                </div>
            </div>
        </div>

    </div>
""")))}))
      }
    }
  }

  def render(enderecos:List[entidades.Endereco]): play.twirl.api.HtmlFormat.Appendable = apply(enderecos)

  def f:((List[entidades.Endereco]) => play.twirl.api.HtmlFormat.Appendable) = (enderecos) => apply(enderecos)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-10-08T14:55:56.996
                  SOURCE: /home/smartcatolica/workspace-play/crud-play/app/views/endereco_views/gerenciar_endereco.scala.html
                  HASH: bf55cf1946c1d91ce88b5bf1c4b7448773d6e878
                  MATRIX: 994->1|1125->40|1136->44|1173->45|1204->50|2123->942|2153->963|2192->964|2257->1001|2543->1256|2604->1290|2646->1316|2686->1318|2751->1355|2828->1405|2845->1413|2872->1419|2950->1470|2967->1478|2995->1485|3073->1536|3090->1544|3121->1554|3199->1605|3216->1613|3255->1631|3431->1780|3447->1786|3526->1843|3692->1982|3708->1988|3781->2039|3976->2203|4033->2232
                  LINES: 28->1|33->2|33->2|33->2|34->3|54->23|54->23|54->23|55->24|60->29|61->30|61->30|61->30|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|68->37|68->37|68->37|69->38|69->38|69->38|72->41|73->42
                  -- GENERATED --
              */
          