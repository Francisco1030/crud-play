
package views.html.endereco_views

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

object cadastrar_endereco extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main/*1.6*/{_display_(Seq[Any](format.raw/*1.7*/("""
    """),format.raw/*2.5*/("""<h1>Cadastrar Endereco</h1>
    """),_display_(/*3.6*/helper/*3.12*/.form(routes.EnderecoController.cadastrarEndereco())/*3.64*/ {_display_(Seq[Any](format.raw/*3.66*/("""
        """),_display_(/*4.10*/helper/*4.16*/.CSRF.formField),format.raw/*4.31*/("""
        """),format.raw/*5.9*/("""<lable>Rua:</lable>
        <input type="text" name="rua">
        <label>Numero</label>
        <input type="text" name="numero">
        <input type="submit" value="Enviar">
    """)))}),format.raw/*10.6*/("""
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
                  DATE: 2019-07-30T17:28:33.983154
                  SOURCE: /home/smartcatolica/workspace-play/crud/app/views/endereco_views/cadastrar_endereco.scala.html
                  HASH: cb6f670cb391b272a5bd72c9290d17323c6e53f1
                  MATRIX: 1058->1|1069->5|1106->6|1137->11|1195->44|1209->50|1269->102|1308->104|1344->114|1358->120|1393->135|1428->144|1639->325
                  LINES: 33->1|33->1|33->1|34->2|35->3|35->3|35->3|35->3|36->4|36->4|36->4|37->5|42->10
                  -- GENERATED --
              */
          