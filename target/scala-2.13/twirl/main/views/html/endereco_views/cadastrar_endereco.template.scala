
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

object cadastrar_endereco extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[entidades.Pessoa],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pessoas: List[entidades.Pessoa]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main/*2.6*/{_display_(Seq[Any](format.raw/*2.7*/("""
    """),format.raw/*3.5*/("""<div class="container">
        <div class="row">
            <div class="col s12 m12">
                <div class="card">
                    <div class="card-content">
                        <span class="card-title blue-grey-text text-darken-2 center-align">
                            <h4>Cadastrar Endereco</h4>
                        </span>
                        """),_display_(/*11.26*/helper/*11.32*/.form(routes.EnderecoController.cadastrarEndereco(), 'id -> "form-endereco")/*11.108*/ {_display_(Seq[Any](format.raw/*11.110*/("""
                            """),_display_(/*12.30*/helper/*12.36*/.CSRF.formField),format.raw/*12.51*/("""
                            """),format.raw/*13.29*/("""<div class="row">
                                <lable>Rua:</lable>
                                <input type="text" id="rua" name="rua">
                            </div>
                            <div class="row">
                                <label>Numero</label>
                                <input type="text" id="numero" name="numero">
                            </div>
                            <div class="row">
                                <div class="input-field col s12">
                                    <select id="pessoa" name="pessoa.id">
                                        <option value="" disabled selected required="true">Selecione</option>
                                        """),_display_(/*25.42*/for(pessoa <- pessoas) yield /*25.64*/ {_display_(Seq[Any](format.raw/*25.66*/("""
                                            """),format.raw/*26.45*/("""<option value=""""),_display_(/*26.61*/pessoa/*26.67*/.getId),format.raw/*26.73*/("""">"""),_display_(/*26.76*/pessoa/*26.82*/.getNome),format.raw/*26.90*/("""</option>
                                        """)))}),format.raw/*27.42*/("""
                                    """),format.raw/*28.37*/("""</select>
                                </div>
                            </div>
                            <button class="waves-effect waves-light btn green" type="submit" value="Enviar">Cadastrar</button>
                        """)))}),format.raw/*32.26*/("""
                    """),format.raw/*33.21*/("""</div>
                </div>
            </div>
        </div>

    </div>
""")))}),format.raw/*39.2*/("""
"""))
      }
    }
  }

  def render(pessoas:List[entidades.Pessoa]): play.twirl.api.HtmlFormat.Appendable = apply(pessoas)

  def f:((List[entidades.Pessoa]) => play.twirl.api.HtmlFormat.Appendable) = (pessoas) => apply(pessoas)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-08-12T17:27:19.522330
                  SOURCE: /home/smartcatolica/workspace-play/crud/app/views/endereco_views/cadastrar_endereco.scala.html
                  HASH: 6eec88d23ece7d92bc69d597599d7f369958acb2
                  MATRIX: 992->1|1119->36|1130->40|1167->41|1198->46|1600->421|1615->427|1701->503|1742->505|1799->535|1814->541|1850->556|1907->585|2661->1312|2699->1334|2739->1336|2812->1381|2855->1397|2870->1403|2897->1409|2927->1412|2942->1418|2971->1426|3053->1477|3118->1514|3385->1750|3434->1771|3541->1848
                  LINES: 28->1|33->2|33->2|33->2|34->3|42->11|42->11|42->11|42->11|43->12|43->12|43->12|44->13|56->25|56->25|56->25|57->26|57->26|57->26|57->26|57->26|57->26|57->26|58->27|59->28|63->32|64->33|70->39
                  -- GENERATED --
              */
          