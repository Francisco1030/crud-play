
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
                        """),_display_(/*11.26*/helper/*11.32*/.form(routes.EnderecoController.atualizarEndereco, 'id -> "form-endereco")/*11.106*/ {_display_(Seq[Any](format.raw/*11.108*/("""
                            """),_display_(/*12.30*/helper/*12.36*/.CSRF.formField),format.raw/*12.51*/("""
                            """),format.raw/*13.29*/("""<div class="row">
                                <input type="hidden" value=""""),_display_(/*14.62*/endereco/*14.70*/.getId),format.raw/*14.76*/("""" name="id">
                                <lable>Rua:</lable>
                                <input type="text"  id="rua" value=""""),_display_(/*16.70*/endereco/*16.78*/.getRua),format.raw/*16.85*/("""" name="rua">
                            </div>
                            <div class="row">
                                <label>N°</label>
                                <input type="text" id="numero" value=""""),_display_(/*20.72*/endereco/*20.80*/.getNumero),format.raw/*20.90*/("""" name="numero">
                            </div>
                            <div class="row">
                                <div class="input-field col s12">
                                    <select name="pessoa.id">
                                        <option value=""""),_display_(/*25.57*/endereco/*25.65*/.getPessoa.getId),format.raw/*25.81*/("""">"""),_display_(/*25.84*/endereco/*25.92*/.getPessoa.getNome),format.raw/*25.110*/("""</option>
                                        """),_display_(/*26.42*/for(pessoa <- pessoas) yield /*26.64*/{_display_(Seq[Any](format.raw/*26.65*/("""
                                            """),_display_(/*27.46*/if(endereco.getPessoa.getId != pessoa.getId)/*27.90*/ {_display_(Seq[Any](format.raw/*27.92*/("""
                                                """),format.raw/*28.49*/("""<option value=""""),_display_(/*28.65*/pessoa/*28.71*/.getId),format.raw/*28.77*/("""">"""),_display_(/*28.80*/pessoa/*28.86*/.getNome),format.raw/*28.94*/("""</option>
                                            """)))}),format.raw/*29.46*/("""
                                        """)))}),format.raw/*30.42*/("""
                                    """),format.raw/*31.37*/("""</select>
                                </div>
                            </div>
                            <button class="waves-effect waves-light btn green" type="submit" value="Enviar">Atualizar</button>
                        """)))}),format.raw/*35.26*/("""
                    """),format.raw/*36.21*/("""</div>
                </div>
            </div>
        </div>

    </div>
""")))}),format.raw/*42.2*/("""


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
                  DATE: 2019-08-12T17:30:21.276422
                  SOURCE: /home/smartcatolica/workspace-play/crud/app/views/endereco_views/atualizar_endereco.scala.html
                  HASH: ad9f23da2c3000f9a043ce8e677cfccc220cbe57
                  MATRIX: 1011->1|1168->66|1179->70|1217->72|1248->77|1650->452|1665->458|1749->532|1790->534|1847->564|1862->570|1898->585|1955->614|2061->693|2078->701|2105->707|2266->841|2283->849|2311->856|2554->1072|2571->1080|2602->1090|2911->1372|2928->1380|2965->1396|2995->1399|3012->1407|3052->1425|3130->1476|3168->1498|3207->1499|3280->1545|3333->1589|3373->1591|3450->1640|3493->1656|3508->1662|3535->1668|3565->1671|3580->1677|3609->1685|3695->1740|3768->1782|3833->1819|4100->2055|4149->2076|4256->2153
                  LINES: 28->1|33->2|33->2|33->2|34->3|42->11|42->11|42->11|42->11|43->12|43->12|43->12|44->13|45->14|45->14|45->14|47->16|47->16|47->16|51->20|51->20|51->20|56->25|56->25|56->25|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|59->28|60->29|61->30|62->31|66->35|67->36|73->42
                  -- GENERATED --
              */
          