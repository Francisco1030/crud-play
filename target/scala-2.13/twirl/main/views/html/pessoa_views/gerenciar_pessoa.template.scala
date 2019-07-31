
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
    """),format.raw/*3.5*/("""<h1>Gerenciar Pessoa</h1>
"""),format.raw/*4.163*/("""
            """),format.raw/*5.13*/("""<table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nome</th>
                        <th>E-mail</th>
                        <th>Ações</th>
                    </tr>
                </thead>
                <tbody>
                    """),_display_(/*15.22*/if(pessoas.isEmpty)/*15.41*/{_display_(Seq[Any](format.raw/*15.42*/("""
                        """),format.raw/*16.25*/("""<tr>
                            <td colspan="4">
                                Nenhuma pessoa cadastrada!
                            </td>
                        </tr>
                    """)))}),format.raw/*21.22*/("""
                    """),_display_(/*22.22*/for(pessoa <- pessoas) yield /*22.44*/ {_display_(Seq[Any](format.raw/*22.46*/("""
                        """),format.raw/*23.25*/("""<tr>
                            <td>"""),_display_(/*24.34*/pessoa/*24.40*/.getId),format.raw/*24.46*/("""</td>
                            <td>"""),_display_(/*25.34*/pessoa/*25.40*/.getNome),format.raw/*25.48*/("""</td>
                            <td>"""),_display_(/*26.34*/pessoa/*26.40*/.getEmail),format.raw/*26.49*/("""</td>
                            <td>
                                <a class="waves-effect waves-light btn blue" href=""""),_display_(/*28.85*/routes/*28.91*/.PessoaController.atualizarPessoaPage(pessoa.getId())),format.raw/*28.144*/(""""><i class="material-icons">create</i></a>
                                <a class="waves-effect waves-light btn red"  href=""""),_display_(/*29.85*/routes/*29.91*/.PessoaController.removerPessoa(pessoa.getId())),format.raw/*29.138*/(""""><i class="material-icons">delete</i></a>
                            </td>
                        </tr>
                    """)))}),format.raw/*32.22*/("""
                """),format.raw/*33.17*/("""</tbody>
            </table>
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
                  DATE: 2019-07-31T13:19:03.523759
                  SOURCE: /home/smartcatolica/workspace-play/crud/app/views/pessoa_views/gerenciar_pessoa.scala.html
                  HASH: 0414545af48443a7331914d4c4b77e97121a48b0
                  MATRIX: 988->1|1115->36|1126->40|1163->41|1194->46|1248->234|1288->247|1621->553|1649->572|1688->573|1741->598|1966->792|2015->814|2053->836|2093->838|2146->863|2211->901|2226->907|2253->913|2319->952|2334->958|2363->966|2429->1005|2444->1011|2474->1020|2624->1143|2639->1149|2714->1202|2868->1329|2883->1335|2952->1382|3111->1510|3156->1527
                  LINES: 28->1|33->2|33->2|33->2|34->3|35->4|36->5|46->15|46->15|46->15|47->16|52->21|53->22|53->22|53->22|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|59->28|59->28|59->28|60->29|60->29|60->29|63->32|64->33
                  -- GENERATED --
              */
          