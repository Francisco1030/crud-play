
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

object atualizar_pessoa extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[entidades.Pessoa,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pessoa: entidades.Pessoa):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main/*2.6*/ {_display_(Seq[Any](format.raw/*2.8*/("""
    """),format.raw/*3.5*/("""<div class="container">
    <h3 class="center-align">Atualizar Pessoa</h3>

    """),_display_(/*6.6*/helper/*6.12*/.form(routes.PessoaController.atualizarPessoa)/*6.58*/ {_display_(Seq[Any](format.raw/*6.60*/("""
        """),_display_(/*7.10*/helper/*7.16*/.CSRF.formField),format.raw/*7.31*/("""
        """),format.raw/*8.9*/("""<input type="hidden" value=""""),_display_(/*8.38*/pessoa/*8.44*/.getId),format.raw/*8.50*/("""" name="id">
        <lable>Nome:</lable>
        <input type="text" value=""""),_display_(/*10.36*/pessoa/*10.42*/.getNome),format.raw/*10.50*/("""" name="nome">
        <label>E-mail</label>
        <input type="text" value=""""),_display_(/*12.36*/pessoa/*12.42*/.getEmail),format.raw/*12.51*/("""" name="email">
        <input class="waves-effect waves-light white-text btn" type="submit" value="Enviar">
    """)))}),format.raw/*14.6*/("""
    """),format.raw/*15.5*/("""</div>
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
                  DATE: 2019-08-01T13:24:38.940837
                  SOURCE: /home/smartcatolica/workspace-play/crud/app/views/pessoa_views/atualizar_pessoa.scala.html
                  HASH: 7ef63b47035b9ffe9f5b107324fc6d3e46c0f007
                  MATRIX: 982->1|1102->29|1113->33|1151->35|1182->40|1288->121|1302->127|1356->173|1395->175|1431->185|1445->191|1480->206|1515->215|1570->244|1584->250|1610->256|1714->333|1729->339|1758->347|1865->427|1880->433|1910->442|2054->556|2086->561
                  LINES: 28->1|33->2|33->2|33->2|34->3|37->6|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|39->8|41->10|41->10|41->10|43->12|43->12|43->12|45->14|46->15
                  -- GENERATED --
              */
          