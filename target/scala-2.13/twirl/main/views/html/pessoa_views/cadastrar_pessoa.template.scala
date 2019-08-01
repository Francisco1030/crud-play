
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
    <h3 class="center-align">Cadastrar Pessoa</h3>

    """),_display_(/*5.6*/helper/*5.12*/.form(routes.PessoaController.cadastrarPessoa())/*5.60*/ {_display_(Seq[Any](format.raw/*5.62*/("""
        """),_display_(/*6.10*/helper/*6.16*/.CSRF.formField),format.raw/*6.31*/("""
        """),format.raw/*7.9*/("""<lable>Nome:</lable>
        <input type="text" name="nome">
        <label>E-mail</label>
        <input type="text" name="email">
        <input class="waves-effect waves-light white-text btn" type="submit" value="Enviar">
    """)))}),format.raw/*12.6*/("""
    """),format.raw/*13.5*/("""</div>
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
                  DATE: 2019-08-01T13:20:49.569418
                  SOURCE: /home/smartcatolica/workspace-play/crud/app/views/pessoa_views/cadastrar_pessoa.scala.html
                  HASH: ff1a0fb603671cc81db595e8426db51f949c7ab5
                  MATRIX: 1054->1|1065->5|1103->7|1134->12|1240->93|1254->99|1310->147|1349->149|1385->159|1399->165|1434->180|1469->189|1729->419|1761->424
                  LINES: 33->1|33->1|33->1|34->2|37->5|37->5|37->5|37->5|38->6|38->6|38->6|39->7|44->12|45->13
                  -- GENERATED --
              */
          