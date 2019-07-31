
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
    """),format.raw/*3.5*/("""<h1 class="right-align">Gerenciar Endereco</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Rua</th>
                <th>Numero</th>
                <th>Ações</th>
            </tr>
        </thead>
        <tbody>
            """),_display_(/*14.14*/if(enderecos.isEmpty)/*14.35*/{_display_(Seq[Any](format.raw/*14.36*/("""
                """),format.raw/*15.17*/("""<tr>
                    <td colspan="4">
                        Nenhum endereço cadastrado!
                    </td>
                </tr>
            """)))}),format.raw/*20.14*/("""
            """),_display_(/*21.14*/for(endereco <- enderecos) yield /*21.40*/ {_display_(Seq[Any](format.raw/*21.42*/("""
                """),format.raw/*22.17*/("""<tr>
                    <td>"""),_display_(/*23.26*/endereco/*23.34*/.getId),format.raw/*23.40*/("""</td>
                    <td>"""),_display_(/*24.26*/endereco/*24.34*/.getRua),format.raw/*24.41*/("""</td>
                    <td>"""),_display_(/*25.26*/endereco/*25.34*/.getNumero),format.raw/*25.44*/("""</td>
                    <td>
                        <a class="waves-effect waves-light btn blue" href=""""),_display_(/*27.77*/routes/*27.83*/.EnderecoController.atualizarEnderecoPage(endereco.getId)),format.raw/*27.140*/(""""><i class="material-icons">create</i></a>
                        <a class="waves-effect waves-light btn red"  href=""""),_display_(/*28.77*/routes/*28.83*/.EnderecoController.removerEndereco(endereco.getId)),format.raw/*28.134*/(""""><i class="material-icons">delete</i></a>
                    </td>
                </tr>
            """)))}),format.raw/*31.14*/("""
        """),format.raw/*32.9*/("""</tbody>
    </table>
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
                  DATE: 2019-07-31T14:56:23.034212
                  SOURCE: /home/smartcatolica/workspace-play/crud/app/views/endereco_views/gerenciar_endereco.scala.html
                  HASH: bd938346e68a597544d3d800afbd863630872a86
                  MATRIX: 994->1|1125->40|1136->44|1173->45|1204->50|1508->327|1538->348|1577->349|1622->366|1808->521|1849->535|1891->561|1931->563|1976->580|2033->610|2050->618|2077->624|2135->655|2152->663|2180->670|2238->701|2255->709|2286->719|2420->826|2435->832|2514->889|2660->1008|2675->1014|2748->1065|2883->1169|2919->1178
                  LINES: 28->1|33->2|33->2|33->2|34->3|45->14|45->14|45->14|46->15|51->20|52->21|52->21|52->21|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|58->27|58->27|58->27|59->28|59->28|59->28|62->31|63->32
                  -- GENERATED --
              */
          