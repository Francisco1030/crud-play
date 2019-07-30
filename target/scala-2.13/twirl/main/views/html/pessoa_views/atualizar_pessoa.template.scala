
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
    """),format.raw/*3.5*/("""<h1>Atualizar Pessoa</h1>

    """),_display_(/*5.6*/helper/*5.12*/.form(routes.PessoaController.atualizarPessoa)/*5.58*/ {_display_(Seq[Any](format.raw/*5.60*/("""
        """),_display_(/*6.10*/helper/*6.16*/.CSRF.formField),format.raw/*6.31*/("""
        """),format.raw/*7.9*/("""<input type="hidden" value=""""),_display_(/*7.38*/pessoa/*7.44*/.getId),format.raw/*7.50*/("""" name="id">
        <lable>Nome:</lable>
        <input type="text" value=""""),_display_(/*9.36*/pessoa/*9.42*/.getNome),format.raw/*9.50*/("""" name="nome">
        <label>E-mail</label>
        <input type="text" value=""""),_display_(/*11.36*/pessoa/*11.42*/.getEmail),format.raw/*11.51*/("""" name="email">
        <input type="submit" value="Enviar">
    """)))}),format.raw/*13.6*/("""
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
                  DATE: 2019-07-30T15:25:23.215816
                  SOURCE: /home/smartcatolica/workspace-play/crud/app/views/pessoa_views/atualizar_pessoa.scala.html
                  HASH: b637514452216b98e50c3df0985173d3d82d7a8a
                  MATRIX: 982->1|1102->29|1113->33|1151->35|1182->40|1239->72|1253->78|1307->124|1346->126|1382->136|1396->142|1431->157|1466->166|1521->195|1535->201|1561->207|1664->284|1678->290|1706->298|1813->378|1828->384|1858->393|1954->459
                  LINES: 28->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|38->7|40->9|40->9|40->9|42->11|42->11|42->11|44->13
                  -- GENERATED --
              */
          