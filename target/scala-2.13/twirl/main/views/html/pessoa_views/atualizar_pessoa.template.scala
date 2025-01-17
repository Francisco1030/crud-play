
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
                        """),_display_(/*11.26*/helper/*11.32*/.form(routes.PessoaController.atualizarPessoa, 'id -> "form-pessoa")/*11.100*/ {_display_(Seq[Any](format.raw/*11.102*/("""
                            """),_display_(/*12.30*/helper/*12.36*/.CSRF.formField),format.raw/*12.51*/("""
                            """),format.raw/*13.29*/("""<div class="row">
                                <input type="hidden" value=""""),_display_(/*14.62*/pessoa/*14.68*/.getId),format.raw/*14.74*/("""" name="id">
                                <lable>Nome:</lable>
                                <input type="text" id="nome" value=""""),_display_(/*16.70*/pessoa/*16.76*/.getNome),format.raw/*16.84*/("""" name="nome">
                            </div>
                            <div class="row">
                                <label>E-mail</label>
                                <input type="text" id="email" value=""""),_display_(/*20.71*/pessoa/*20.77*/.getEmail),format.raw/*20.86*/("""" name="email">
                            </div>
                            <button class="waves-effect waves-light btn green" type="submit" value="Enviar">Atualizar</button>
                        """)))}),format.raw/*23.26*/("""
                    """),format.raw/*24.21*/("""</div>
                </div>
            </div>
        </div>

    </div>
""")))}),format.raw/*30.2*/("""

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
                  DATE: 2019-08-12T16:35:05.899085
                  SOURCE: /home/smartcatolica/workspace-play/crud/app/views/pessoa_views/atualizar_pessoa.scala.html
                  HASH: 2eafa602fcfbdf2a6a65023f06bf5574acb760f4
                  MATRIX: 982->1|1102->29|1113->33|1151->35|1182->40|1582->413|1597->419|1675->487|1716->489|1773->519|1788->525|1824->540|1881->569|1987->648|2002->654|2029->660|2191->795|2206->801|2235->809|2482->1029|2497->1035|2527->1044|2761->1247|2810->1268|2917->1345
                  LINES: 28->1|33->2|33->2|33->2|34->3|42->11|42->11|42->11|42->11|43->12|43->12|43->12|44->13|45->14|45->14|45->14|47->16|47->16|47->16|51->20|51->20|51->20|54->23|55->24|61->30
                  -- GENERATED --
              */
          