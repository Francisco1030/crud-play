
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
        <div class="row">
            <div class="col s12 m12">
                <div class="card">
                    <div class="card-content">
                        <span class="card-title blue-grey-text text-darken-2 center-align">
                            <h4>Atualizar Pessoa</h4>
                        </span>
                        """),_display_(/*11.26*/helper/*11.32*/.form(routes.PessoaController.atualizarPessoa)/*11.78*/ {_display_(Seq[Any](format.raw/*11.80*/("""
                            """),_display_(/*12.30*/helper/*12.36*/.CSRF.formField),format.raw/*12.51*/("""
                            """),format.raw/*13.29*/("""<input type="hidden" value=""""),_display_(/*13.58*/pessoa/*13.64*/.getId),format.raw/*13.70*/("""" name="id">
                            <lable>Nome:</lable>
                            <input type="text" value=""""),_display_(/*15.56*/pessoa/*15.62*/.getNome),format.raw/*15.70*/("""" name="nome">
                            <label>E-mail</label>
                            <input type="text" value=""""),_display_(/*17.56*/pessoa/*17.62*/.getEmail),format.raw/*17.71*/("""" name="email">
                            <button class="waves-effect waves-light btn green" type="submit" value="Enviar">Atualizar</button>
                        """)))}),format.raw/*19.26*/("""
                    """),format.raw/*20.21*/("""</div>
                </div>
            </div>
        </div>

    </div>
""")))}),format.raw/*26.2*/("""

"""))
      }
    }
  }

  def render(pessoa:entidades.Pessoa): play.twirl.api.HtmlFormat.Appendable = apply(pessoa)

  def f:((entidades.Pessoa) => play.twirl.api.HtmlFormat.Appendable) = (pessoa) => apply(pessoa)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-08-06T15:32:16.947189
                  SOURCE: /home/smartcatolica/workspace-play/crud/app/views/pessoa_views/atualizar_pessoa.scala.html
                  HASH: 4e1c746945f7f1eacdfde5458a1cb718810c3229
                  MATRIX: 982->1|1102->29|1113->33|1151->35|1182->40|1582->413|1597->419|1652->465|1692->467|1749->497|1764->503|1800->518|1857->547|1913->576|1928->582|1955->588|2099->705|2114->711|2143->719|2290->839|2305->845|2335->854|2534->1022|2583->1043|2690->1120
                  LINES: 28->1|33->2|33->2|33->2|34->3|42->11|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|44->13|46->15|46->15|46->15|48->17|48->17|48->17|50->19|51->20|57->26
                  -- GENERATED --
              */
          