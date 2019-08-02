
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
                    """),_display_(/*23.22*/if(pessoa.getId <= 0)/*23.43*/{_display_(Seq[Any](format.raw/*23.44*/("""
                        """),format.raw/*24.25*/("""<tr>
                            <td colspan="4">
                                Pesquise por uma pessoarun!
                            </td>
                        </tr>
                    """)))}/*29.22*/else/*29.26*/{_display_(Seq[Any](format.raw/*29.27*/("""
                        """),format.raw/*30.25*/("""<tr>
                            <td>"""),_display_(/*31.34*/pessoa/*31.40*/.getId),format.raw/*31.46*/("""</td>
                            <td>"""),_display_(/*32.34*/pessoa/*32.40*/.getNome),format.raw/*32.48*/("""</td>
                            <td>"""),_display_(/*33.34*/pessoa/*33.40*/.getEmail),format.raw/*33.49*/("""</td>
                            <td>"""),_display_(/*34.34*/pessoa/*34.40*/.getEnderecos),format.raw/*34.53*/("""</td>
                            <td>
                                """),format.raw/*36.222*/("""
                                """),format.raw/*37.216*/("""
                            """),format.raw/*38.29*/("""</td>
                        </tr>
                    """)))}),format.raw/*40.22*/("""

                """),format.raw/*42.17*/("""</tbody>

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
                  DATE: 2019-08-02T17:17:10.262341
                  SOURCE: /home/smartcatolica/workspace-play/crud/app/views/pessoa_views/pesquisar_pessoa.scala.html
                  HASH: dabd30994d59d4f5db705357346eb7711b03bd81
                  MATRIX: 982->1|1102->29|1113->33|1150->34|1182->40|1292->124|1306->130|1362->178|1401->180|1441->194|1455->200|1490->215|1530->228|1702->369|1744->383|2114->726|2144->747|2183->748|2236->773|2450->968|2463->972|2502->973|2555->998|2620->1036|2635->1042|2662->1048|2728->1087|2743->1093|2772->1101|2838->1140|2853->1146|2883->1155|2949->1194|2964->1200|2998->1213|3098->1473|3160->1689|3217->1718|3305->1775|3351->1793
                  LINES: 28->1|33->2|33->2|33->2|35->4|37->6|37->6|37->6|37->6|38->7|38->7|38->7|39->8|41->10|43->12|54->23|54->23|54->23|55->24|60->29|60->29|60->29|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|67->36|68->37|69->38|71->40|73->42
                  -- GENERATED --
              */
          