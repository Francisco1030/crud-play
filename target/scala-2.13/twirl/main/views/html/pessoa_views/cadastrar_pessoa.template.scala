
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
    """),format.raw/*2.5*/("""<h1>Cadastrar Pessoa</h1>

    """),_display_(/*4.6*/helper/*4.12*/.form(routes.PessoaController.cadastrarPessoa())/*4.60*/ {_display_(Seq[Any](format.raw/*4.62*/("""
        """),_display_(/*5.10*/helper/*5.16*/.CSRF.formField),format.raw/*5.31*/("""
        """),format.raw/*6.9*/("""<lable>Nome:</lable>
        <input type="text" name="nome">
        <label>E-mail</label>
        <input type="text" name="email">
        <input type="submit" value="Enviar">
    """)))}),format.raw/*11.6*/("""
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-07-30T14:20:13.833042
                  SOURCE: /home/smartcatolica/workspace-play/crud/app/views/pessoa_views/cadastrar_pessoa.scala.html
                  HASH: 32b4c3f7b5bfc0eea5f6ff24835bb955abd9e410
                  MATRIX: 1054->1|1065->5|1103->7|1134->12|1191->44|1205->50|1261->98|1300->100|1336->110|1350->116|1385->131|1420->140|1632->322
                  LINES: 33->1|33->1|33->1|34->2|36->4|36->4|36->4|36->4|37->5|37->5|37->5|38->6|43->11
                  -- GENERATED --
              */
          