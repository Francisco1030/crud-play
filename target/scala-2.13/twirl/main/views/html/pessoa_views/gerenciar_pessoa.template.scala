
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
    <h3 class="center-align">Gerenciar Pessoa</h3>
"""),format.raw/*5.163*/("""
            """),format.raw/*6.13*/("""<table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nome</th>
                        <th>E-mail</th>
                        <th>Ações</th>
                    </tr>
                </thead>
                <tbody>
                    """),_display_(/*16.22*/if(pessoas.isEmpty)/*16.41*/{_display_(Seq[Any](format.raw/*16.42*/("""
                        """),format.raw/*17.25*/("""<tr>
                            <td colspan="4">
                                Nenhuma pessoa cadastrada!
                            </td>
                        </tr>
                    """)))}),format.raw/*22.22*/("""
                    """),_display_(/*23.22*/for(pessoa <- pessoas) yield /*23.44*/ {_display_(Seq[Any](format.raw/*23.46*/("""
                        """),format.raw/*24.25*/("""<tr>
                            <td>"""),_display_(/*25.34*/pessoa/*25.40*/.getId),format.raw/*25.46*/("""</td>
                            <td>"""),_display_(/*26.34*/pessoa/*26.40*/.getNome),format.raw/*26.48*/("""</td>
                            <td>"""),_display_(/*27.34*/pessoa/*27.40*/.getEmail),format.raw/*27.49*/("""</td>
                            <td>
                                <a class="waves-effect waves-light btn blue" href=""""),_display_(/*29.85*/routes/*29.91*/.PessoaController.atualizarPessoaPage(pessoa.getId())),format.raw/*29.144*/(""""><i class="material-icons">create</i></a>
                                <a class="waves-effect waves-light btn red"  href=""""),_display_(/*30.85*/routes/*30.91*/.PessoaController.removerPessoa(pessoa.getId())),format.raw/*30.138*/(""""><i class="material-icons">delete</i></a>
                            </td>
                        </tr>
                    """)))}),format.raw/*33.22*/("""
                """),format.raw/*34.17*/("""</tbody>
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
                  DATE: 2019-08-01T13:23:11.198600
                  SOURCE: /home/smartcatolica/workspace-play/crud/app/views/pessoa_views/gerenciar_pessoa.scala.html
                  HASH: 105cf2308f71047ee82c52943fdb3042447ed381
                  MATRIX: 988->1|1115->36|1126->40|1163->41|1194->46|1297->283|1337->296|1670->602|1698->621|1737->622|1790->647|2015->841|2064->863|2102->885|2142->887|2195->912|2260->950|2275->956|2302->962|2368->1001|2383->1007|2412->1015|2478->1054|2493->1060|2523->1069|2673->1192|2688->1198|2763->1251|2917->1378|2932->1384|3001->1431|3160->1559|3205->1576
                  LINES: 28->1|33->2|33->2|33->2|34->3|36->5|37->6|47->16|47->16|47->16|48->17|53->22|54->23|54->23|54->23|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|60->29|60->29|60->29|61->30|61->30|61->30|64->33|65->34
                  -- GENERATED --
              */
          