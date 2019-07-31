
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

    <h3 class="center-align">Cadastrar Endereco</h3>
    """),_display_(/*6.6*/helper/*6.12*/.form(routes.EnderecoController.cadastrarEndereco())/*6.64*/ {_display_(Seq[Any](format.raw/*6.66*/("""
        """),_display_(/*7.10*/helper/*7.16*/.CSRF.formField),format.raw/*7.31*/("""
        """),format.raw/*8.9*/("""<lable>Rua:</lable>
        <input type="text" name="rua" minlength="5" maxlength="200">
        <label>Numero</label>
        <input type="text" name="numero">

        <div class="input-field col s12">
            <select name="pessoa.id">
                <option value="" disabled selected>Selecione</option>
                """),_display_(/*16.18*/for(pessoa <- pessoas) yield /*16.40*/ {_display_(Seq[Any](format.raw/*16.42*/("""
                    """),format.raw/*17.21*/("""<option value=""""),_display_(/*17.37*/pessoa/*17.43*/.getId),format.raw/*17.49*/("""">"""),_display_(/*17.52*/pessoa/*17.58*/.getNome),format.raw/*17.66*/("""</option>
                """)))}),format.raw/*18.18*/("""
            """),format.raw/*19.13*/("""</select>
        </div>
"""),format.raw/*21.63*/("""
        """),format.raw/*22.9*/("""<input class="waves-effect waves-light white-text btn" type="submit" value="Enviar">
    """)))}),format.raw/*23.6*/("""
    """),format.raw/*24.5*/("""</div>
""")))}))
      }
    }
  }

  def render(pessoas:List[entidades.Pessoa]): play.twirl.api.HtmlFormat.Appendable = apply(pessoas)

  def f:((List[entidades.Pessoa]) => play.twirl.api.HtmlFormat.Appendable) = (pessoas) => apply(pessoas)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-07-31T16:17:43.399124
                  SOURCE: /home/smartcatolica/workspace-play/crud/app/views/endereco_views/cadastrar_endereco.scala.html
                  HASH: 6d441ad7047f04b6ee326f425179c94ee3d82466
                  MATRIX: 992->1|1119->36|1130->40|1167->41|1198->46|1306->129|1320->135|1380->187|1419->189|1455->199|1469->205|1504->220|1539->229|1895->558|1933->580|1973->582|2022->603|2065->619|2080->625|2107->631|2137->634|2152->640|2181->648|2239->675|2280->688|2333->775|2369->784|2489->874|2521->879
                  LINES: 28->1|33->2|33->2|33->2|34->3|37->6|37->6|37->6|37->6|38->7|38->7|38->7|39->8|47->16|47->16|47->16|48->17|48->17|48->17|48->17|48->17|48->17|48->17|49->18|50->19|52->21|53->22|54->23|55->24
                  -- GENERATED --
              */
          