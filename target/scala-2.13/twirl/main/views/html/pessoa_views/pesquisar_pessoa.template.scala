
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

object pesquisar_pessoa extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[entidades.Pessoa],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pessoas: List[entidades.Pessoa]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main/*2.6*/{_display_(Seq[Any](format.raw/*2.7*/("""

    """),format.raw/*4.5*/("""<div class="container">
    <h3 class="center-align">Pesquisar Pessoa</h3>
        """),_display_(/*6.10*/helper/*6.16*/.form(routes.PessoaController.pesquisarPessoa())/*6.64*/ {_display_(Seq[Any](format.raw/*6.66*/("""
            """),_display_(/*7.14*/helper/*7.20*/.CSRF.formField),format.raw/*7.35*/("""
            """),format.raw/*8.13*/("""<input type="text" name="nome">
            <input class="waves-effect waves-light white-text btn" type="submit" value="Pesquisar">
        """)))}),format.raw/*10.10*/("""

            """),format.raw/*12.13*/("""<table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nome</th>
                        <th>E-mail</th>
                        <th>Rua</th>
                        <th>Ações</th>
                    </tr>
                </thead>
                <tbody>
                    """),_display_(/*23.22*/for(pessoa <- pessoas) yield /*23.44*/ {_display_(Seq[Any](format.raw/*23.46*/("""
                        """),_display_(/*24.26*/if(pessoa.getId <= 0)/*24.47*/ {_display_(Seq[Any](format.raw/*24.49*/("""
                            """),format.raw/*25.29*/("""<tr>
                                <td colspan="4">
                                    Pesquise por uma pessoarun!
                                </td>
                            </tr>
                        """)))}/*30.27*/else/*30.32*/{_display_(Seq[Any](format.raw/*30.33*/("""
                            """),format.raw/*31.29*/("""<tr>
                                <td>"""),_display_(/*32.38*/pessoa/*32.44*/.getId),format.raw/*32.50*/("""</td>
                                <td>"""),_display_(/*33.38*/pessoa/*33.44*/.getNome),format.raw/*33.52*/("""</td>
                                <td>"""),_display_(/*34.38*/pessoa/*34.44*/.getEmail),format.raw/*34.53*/("""</td>
                                <td>"""),_display_(/*35.38*/pessoa/*35.44*/.getEnderecos),format.raw/*35.57*/("""</td>
                                <td>
                                    """),format.raw/*37.195*/("""
                                    """),format.raw/*38.188*/("""
                                """),format.raw/*39.33*/("""</td>
                            </tr>
                        """)))}),format.raw/*41.26*/("""
                    """)))}),format.raw/*42.22*/("""
                """),format.raw/*43.17*/("""</tbody>

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
                  DATE: 2019-08-02T17:57:40.859393
                  SOURCE: /home/smartcatolica/workspace-play/crud/app/views/pessoa_views/pesquisar_pessoa.scala.html
                  HASH: 63303f98f20ee6e3cdc84738c52a3595977ae968
                  MATRIX: 988->1|1115->36|1126->40|1163->41|1195->47|1305->131|1319->137|1375->185|1414->187|1454->201|1468->207|1503->222|1543->235|1715->376|1757->390|2127->733|2165->755|2205->757|2258->783|2288->804|2328->806|2385->835|2619->1051|2632->1056|2671->1057|2728->1086|2797->1128|2812->1134|2839->1140|2909->1183|2924->1189|2953->1197|3023->1240|3038->1246|3068->1255|3138->1298|3153->1304|3187->1317|3295->1554|3361->1742|3422->1775|3518->1840|3571->1862|3616->1879
                  LINES: 28->1|33->2|33->2|33->2|35->4|37->6|37->6|37->6|37->6|38->7|38->7|38->7|39->8|41->10|43->12|54->23|54->23|54->23|55->24|55->24|55->24|56->25|61->30|61->30|61->30|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|68->37|69->38|70->39|72->41|73->42|74->43
                  -- GENERATED --
              */
          