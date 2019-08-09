
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

object cadastrar_pessoa extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main/*1.6*/ {_display_(Seq[Any](format.raw/*1.8*/("""
    """),format.raw/*2.5*/("""<div class="container">
        <div class="row">
            <div class="col s12 m12">
                <div class="card">
                    <div class="card-content">
                        <span class="card-title blue-grey-text text-darken-2 center-align">
                            <h4>Cadastrar Pessoa</h4>
                        </span>
                        """),_display_(/*10.26*/helper/*10.32*/.form(routes.PessoaController.cadastrarPessoa())/*10.80*/ {_display_(Seq[Any](format.raw/*10.82*/("""
                            """),_display_(/*11.30*/helper/*11.36*/.CSRF.formField),format.raw/*11.51*/("""
                            """),format.raw/*12.29*/("""<lable>Nome:</lable>
                            <input type="text" name="nome">
                            <label>E-mail</label>
                            <input type="text" name="email">
                            <button class="waves-effect waves-light btn green" type="submit" value="Enviar">Cadastrar</button>
                            """)))}),format.raw/*17.30*/("""
                    """),format.raw/*18.21*/("""</div>
                </div>
            </div>
        </div>

    </div>
""")))}),format.raw/*24.2*/("""


"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-08-09T15:30:40.433197
                  SOURCE: /home/smartcatolica/workspace-play/crud/app/views/pessoa_views/cadastrar_pessoa.scala.html
                  HASH: 69de711d9a7e983372b5eef276dcc4106a91f79d
                  MATRIX: 1054->1|1065->5|1103->7|1134->12|1534->385|1549->391|1606->439|1646->441|1703->471|1718->477|1754->492|1811->521|2190->869|2239->890|2346->967
                  LINES: 33->1|33->1|33->1|34->2|42->10|42->10|42->10|42->10|43->11|43->11|43->11|44->12|49->17|50->18|56->24
                  -- GENERATED --
              */
          