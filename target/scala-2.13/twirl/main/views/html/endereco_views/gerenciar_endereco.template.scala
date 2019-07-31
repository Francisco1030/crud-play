
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
    """),format.raw/*3.5*/("""<div class="container">
    <h1 class="center-align">Gerenciar Endereco</h1>
    <table>
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
            """),_display_(/*16.14*/if(enderecos.isEmpty)/*16.35*/{_display_(Seq[Any](format.raw/*16.36*/("""
                """),format.raw/*17.17*/("""<tr>
                    <td colspan="4">
                        Nenhum endereço cadastrado!
                    </td>
                </tr>
            """)))}),format.raw/*22.14*/("""
            """),_display_(/*23.14*/for(endereco <- enderecos) yield /*23.40*/ {_display_(Seq[Any](format.raw/*23.42*/("""
                """),format.raw/*24.17*/("""<tr>
                    <td>"""),_display_(/*25.26*/endereco/*25.34*/.getId),format.raw/*25.40*/("""</td>
                    <td>"""),_display_(/*26.26*/endereco/*26.34*/.getRua),format.raw/*26.41*/("""</td>
                    <td>"""),_display_(/*27.26*/endereco/*27.34*/.getNumero),format.raw/*27.44*/("""</td>
                    <td>"""),_display_(/*28.26*/endereco/*28.34*/.getPessoa.getNome),format.raw/*28.52*/("""</td>
                    <td>
                        <a class="waves-effect waves-light btn blue" href=""""),_display_(/*30.77*/routes/*30.83*/.EnderecoController.atualizarEnderecoPage(endereco.getId)),format.raw/*30.140*/(""""><i class="material-icons">create</i></a>
                        <a class="waves-effect waves-light btn red"  href=""""),_display_(/*31.77*/routes/*31.83*/.EnderecoController.removerEndereco(endereco.getId)),format.raw/*31.134*/(""""><i class="material-icons">delete</i></a>
                    </td>
                </tr>
            """)))}),format.raw/*34.14*/("""
        """),format.raw/*35.9*/("""</tbody>
    </table>
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
                  DATE: 2019-07-31T17:11:10.441575
                  SOURCE: /home/smartcatolica/workspace-play/crud/app/views/endereco_views/gerenciar_endereco.scala.html
                  HASH: 6c9228ef23752a1a65214f4f5ed0a1f80a9fcd9d
                  MATRIX: 994->1|1125->40|1136->44|1173->45|1204->50|1569->388|1599->409|1638->410|1683->427|1869->582|1910->596|1952->622|1992->624|2037->641|2094->671|2111->679|2138->685|2196->716|2213->724|2241->731|2299->762|2316->770|2347->780|2405->811|2422->819|2461->837|2595->944|2610->950|2689->1007|2835->1126|2850->1132|2923->1183|3058->1287|3094->1296
                  LINES: 28->1|33->2|33->2|33->2|34->3|47->16|47->16|47->16|48->17|53->22|54->23|54->23|54->23|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|61->30|61->30|61->30|62->31|62->31|62->31|65->34|66->35
                  -- GENERATED --
              */
          