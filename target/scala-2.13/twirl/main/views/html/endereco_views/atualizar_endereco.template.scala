
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

object atualizar_endereco extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[entidades.Endereco,List[entidades.Pessoa],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(endereco: entidades.Endereco)(pessoas: List[entidades.Pessoa]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main/*2.6*/ {_display_(Seq[Any](format.raw/*2.8*/("""
    """),format.raw/*3.5*/("""<div class="container">
        <div class="row">
            <div class="col s12 m12">
                <div class="card">
                    <div class="card-content">
                        <span class="card-title blue-grey-text text-darken-2 center-align">
                            <h4>Atualizar Endereco</h4>
                        </span>
                        """),_display_(/*11.26*/helper/*11.32*/.form(routes.EnderecoController.atualizarEndereco)/*11.82*/ {_display_(Seq[Any](format.raw/*11.84*/("""
                            """),_display_(/*12.30*/helper/*12.36*/.CSRF.formField),format.raw/*12.51*/("""
                            """),format.raw/*13.29*/("""<input type="hidden" value=""""),_display_(/*13.58*/endereco/*13.66*/.getId),format.raw/*13.72*/("""" name="id">
                            <lable>Rua:</lable>
                            <input type="text" value=""""),_display_(/*15.56*/endereco/*15.64*/.getRua),format.raw/*15.71*/("""" name="rua">
                            <label>N°</label>
                            <input type="text" value=""""),_display_(/*17.56*/endereco/*17.64*/.getNumero),format.raw/*17.74*/("""" name="numero">

                            <div class="input-field col s12">
                                <select name="pessoa.id">
                                    <option value=""""),_display_(/*21.53*/endereco/*21.61*/.getPessoa.getId),format.raw/*21.77*/("""">"""),_display_(/*21.80*/endereco/*21.88*/.getPessoa.getNome),format.raw/*21.106*/("""</option>
                                    """),_display_(/*22.38*/for(pessoa <- pessoas) yield /*22.60*/{_display_(Seq[Any](format.raw/*22.61*/("""
                                        """),_display_(/*23.42*/if(endereco.getPessoa.getId != pessoa.getId)/*23.86*/ {_display_(Seq[Any](format.raw/*23.88*/("""
                                            """),format.raw/*24.45*/("""<option value=""""),_display_(/*24.61*/pessoa/*24.67*/.getId),format.raw/*24.73*/("""">"""),_display_(/*24.76*/pessoa/*24.82*/.getNome),format.raw/*24.90*/("""</option>
                                        """)))}),format.raw/*25.42*/("""
                                    """)))}),format.raw/*26.38*/("""
                                """),format.raw/*27.33*/("""</select>
                            </div>
                            <button class="waves-effect waves-light btn green" type="submit" value="Enviar">Atualizar</button>
                        """)))}),format.raw/*30.26*/("""
                    """),format.raw/*31.21*/("""</div>
                </div>
            </div>
        </div>

    </div>
""")))}),format.raw/*37.2*/("""


"""))
      }
    }
  }

  def render(endereco:entidades.Endereco,pessoas:List[entidades.Pessoa]): play.twirl.api.HtmlFormat.Appendable = apply(endereco)(pessoas)

  def f:((entidades.Endereco) => (List[entidades.Pessoa]) => play.twirl.api.HtmlFormat.Appendable) = (endereco) => (pessoas) => apply(endereco)(pessoas)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-08-06T16:07:49.740888
                  SOURCE: /home/smartcatolica/workspace-play/crud/app/views/endereco_views/atualizar_endereco.scala.html
                  HASH: 690ab65582c6dc9eec16842dea48734cb0b402d5
                  MATRIX: 1011->1|1168->66|1179->70|1217->72|1248->77|1650->452|1665->458|1724->508|1764->510|1821->540|1836->546|1872->561|1929->590|1985->619|2002->627|2029->633|2172->749|2189->757|2217->764|2359->879|2376->887|2407->897|2624->1087|2641->1095|2678->1111|2708->1114|2725->1122|2765->1140|2839->1187|2877->1209|2916->1210|2985->1252|3038->1296|3078->1298|3151->1343|3194->1359|3209->1365|3236->1371|3266->1374|3281->1380|3310->1388|3392->1439|3461->1477|3522->1510|3750->1707|3799->1728|3906->1805
                  LINES: 28->1|33->2|33->2|33->2|34->3|42->11|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|44->13|46->15|46->15|46->15|48->17|48->17|48->17|52->21|52->21|52->21|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|55->24|55->24|55->24|55->24|56->25|57->26|58->27|61->30|62->31|68->37
                  -- GENERATED --
              */
          