
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
                        """),_display_(/*11.26*/helper/*11.32*/.form(routes.EnderecoController.cadastrarEndereco())/*11.84*/ {_display_(Seq[Any](format.raw/*11.86*/("""
                            """),_display_(/*12.30*/helper/*12.36*/.CSRF.formField),format.raw/*12.51*/("""
                            """),format.raw/*13.29*/("""<lable>Rua:</lable>
                            <input type="text" name="rua" minlength="5" maxlength="200">
                            <label>Numero</label>
                            <input type="text" name="numero">

                            <div class="input-field col s12">
                                <select name="pessoa.id">
                                    <option value="" disabled selected>Selecione</option>
                                    """),_display_(/*21.38*/for(pessoa <- pessoas) yield /*21.60*/ {_display_(Seq[Any](format.raw/*21.62*/("""
                                        """),format.raw/*22.41*/("""<option value=""""),_display_(/*22.57*/pessoa/*22.63*/.getId),format.raw/*22.69*/("""">"""),_display_(/*22.72*/pessoa/*22.78*/.getNome),format.raw/*22.86*/("""</option>
                                    """)))}),format.raw/*23.38*/("""
                                """),format.raw/*24.33*/("""</select>
                            </div>
                            <button class="waves-effect waves-light btn green" type="submit" value="Enviar">Cadastrar</button>
                        """)))}),format.raw/*27.26*/("""
                    """),format.raw/*28.21*/("""</div>
                </div>
            </div>
        </div>

    </div>
""")))}),format.raw/*34.2*/("""
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
                  DATE: 2019-08-06T15:55:45.789610
                  SOURCE: /home/smartcatolica/workspace-play/crud/app/views/endereco_views/cadastrar_endereco.scala.html
                  HASH: 85f73e30ceee5e4577f62d84817fa2f9b5b82912
                  MATRIX: 992->1|1119->36|1130->40|1167->41|1198->46|1600->421|1615->427|1676->479|1716->481|1773->511|1788->517|1824->532|1881->561|2377->1030|2415->1052|2455->1054|2524->1095|2567->1111|2582->1117|2609->1123|2639->1126|2654->1132|2683->1140|2761->1187|2822->1220|3050->1417|3099->1438|3206->1515
                  LINES: 28->1|33->2|33->2|33->2|34->3|42->11|42->11|42->11|42->11|43->12|43->12|43->12|44->13|52->21|52->21|52->21|53->22|53->22|53->22|53->22|53->22|53->22|53->22|54->23|55->24|58->27|59->28|65->34
                  -- GENERATED --
              */
          