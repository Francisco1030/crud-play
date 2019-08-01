
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

object gerenciar_pessoa extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[entidades.Pessoa],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pessoas: List[entidades.Pessoa]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main/*2.6*/{_display_(Seq[Any](format.raw/*2.7*/("""
    """),format.raw/*3.5*/("""<div class="container">
    <h3 class="center-align">Gerenciador de Pessoas</h3>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>E-mail</th>
                <th>Ações</th>
            </tr>
        </thead>
        <tbody>
            """),_display_(/*15.14*/if(pessoas.isEmpty)/*15.33*/{_display_(Seq[Any](format.raw/*15.34*/("""
                """),format.raw/*16.17*/("""<tr>
                    <td colspan="4">
                        Nenhuma pessoa cadastrada!
                    </td>
                </tr>
            """)))}),format.raw/*21.14*/("""
            """),_display_(/*22.14*/for(pessoa <- pessoas) yield /*22.36*/ {_display_(Seq[Any](format.raw/*22.38*/("""
                """),format.raw/*23.17*/("""<tr>
                    <td>"""),_display_(/*24.26*/pessoa/*24.32*/.getId),format.raw/*24.38*/("""</td>
                    <td>"""),_display_(/*25.26*/pessoa/*25.32*/.getNome),format.raw/*25.40*/("""</td>
                    <td>"""),_display_(/*26.26*/pessoa/*26.32*/.getEmail),format.raw/*26.41*/("""</td>
                    <td>
                        <a class="waves-effect waves-light btn blue" href=""""),_display_(/*28.77*/routes/*28.83*/.PessoaController.atualizarPessoaPage(pessoa.getId())),format.raw/*28.136*/(""""><i class="material-icons">create</i></a>
                        <a class="waves-effect waves-light btn red"  href=""""),_display_(/*29.77*/routes/*29.83*/.PessoaController.removerPessoa(pessoa.getId())),format.raw/*29.130*/(""""><i class="material-icons">delete</i></a>
                    </td>
                </tr>
            """)))}),format.raw/*32.14*/("""
        """),format.raw/*33.9*/("""</tbody>
    </table>
    </div>
""")))}))
      }
    }
  }

  def render(pessoas:List[entidades.Pessoa]): play.twirl.api.HtmlFormat.Appendable = apply(pessoas)

  def f:((List[entidades.Pessoa]) => play.twirl.api.HtmlFormat.Appendable) = (pessoas) => apply(pessoas)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-08-01T15:35:43.305267
                  SOURCE: /home/smartcatolica/workspace-play/crud/app/views/pessoa_views/gerenciar_pessoa.scala.html
                  HASH: c4983c93218f28369bf0fe43586ce664df9ab77c
                  MATRIX: 988->1|1115->36|1126->40|1163->41|1194->46|1532->357|1560->376|1599->377|1644->394|1829->548|1870->562|1908->584|1948->586|1993->603|2050->633|2065->639|2092->645|2150->676|2165->682|2194->690|2252->721|2267->727|2297->736|2431->843|2446->849|2521->902|2667->1021|2682->1027|2751->1074|2886->1178|2922->1187
                  LINES: 28->1|33->2|33->2|33->2|34->3|46->15|46->15|46->15|47->16|52->21|53->22|53->22|53->22|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|59->28|59->28|59->28|60->29|60->29|60->29|63->32|64->33
                  -- GENERATED --
              */
          