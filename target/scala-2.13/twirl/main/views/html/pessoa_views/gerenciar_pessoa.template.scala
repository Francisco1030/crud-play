
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
    <a class="btn-floating btn-large waves-effect waves-light red" href=""""),_display_(/*4.75*/routes/*4.81*/.PessoaController.cadastrarPessoaPage()),format.raw/*4.120*/(""""><i class="material-icons">add</i></a>
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
                  DATE: 2019-07-30T15:47:01.161640
                  SOURCE: /home/smartcatolica/workspace-play/crud/app/views/pessoa_views/gerenciar_pessoa.scala.html
                  HASH: 5f00467ca6402e633779aec63433dafacbbcf42e
                  MATRIX: 988->1|1115->36|1126->40|1163->41|1194->46|1320->146|1334->152|1394->191|1779->549|1807->568|1846->569|1899->594|2124->788|2173->810|2211->832|2251->834|2304->859|2369->897|2384->903|2411->909|2477->948|2492->954|2521->962|2587->1001|2602->1007|2632->1016|2782->1139|2797->1145|2872->1198|3026->1325|3041->1331|3110->1378|3269->1506|3314->1523
                  LINES: 28->1|33->2|33->2|33->2|34->3|35->4|35->4|35->4|46->15|46->15|46->15|47->16|52->21|53->22|53->22|53->22|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|59->28|59->28|59->28|60->29|60->29|60->29|63->32|64->33
                  -- GENERATED --
              */
          