
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

"""),format.raw/*4.1*/("""<div class="container">
    <h3 class="center-align">Atualizar Endereco</h3>

    """),_display_(/*7.6*/helper/*7.12*/.form(routes.EnderecoController.atualizarEndereco)/*7.62*/ {_display_(Seq[Any](format.raw/*7.64*/("""
        """),_display_(/*8.10*/helper/*8.16*/.CSRF.formField),format.raw/*8.31*/("""

        """),format.raw/*10.9*/("""<div class="row">
            <div class="col s4">
                <input type="hidden" value=""""),_display_(/*12.46*/endereco/*12.54*/.getId),format.raw/*12.60*/("""" name="id">
                <lable>Rua:</lable>
                <input type="text" value=""""),_display_(/*14.44*/endereco/*14.52*/.getRua),format.raw/*14.59*/("""" name="rua">
            </div>

            <div class="col s4">
                <label>N°</label>
                <input type="text" value=""""),_display_(/*19.44*/endereco/*19.52*/.getNumero),format.raw/*19.62*/("""" name="numero">
            </div>

            <div class="col s4">
                    <select name="pessoa.id">
                        <option value=""""),_display_(/*24.41*/endereco/*24.49*/.getPessoa.getId),format.raw/*24.65*/("""">"""),_display_(/*24.68*/endereco/*24.76*/.getPessoa.getNome),format.raw/*24.94*/("""</option>
                            """),_display_(/*25.30*/for(pessoa <- pessoas) yield /*25.52*/{_display_(Seq[Any](format.raw/*25.53*/("""
                                """),_display_(/*26.34*/if(endereco.getPessoa.getId != pessoa.getId)/*26.78*/ {_display_(Seq[Any](format.raw/*26.80*/("""
                                    """),format.raw/*27.37*/("""<option value=""""),_display_(/*27.53*/pessoa/*27.59*/.getId),format.raw/*27.65*/("""">"""),_display_(/*27.68*/pessoa/*27.74*/.getNome),format.raw/*27.82*/("""</option>
                                """)))}),format.raw/*28.34*/("""
                            """)))}),format.raw/*29.30*/("""
                    """),format.raw/*30.21*/("""</select>
            </div>
        </div>

        <div class="row">
            <div class="col s12">
                <input class="waves-effect waves-light btn white-text" type="submit" value="Enviar">
            </div>
        </div>
    """)))}),format.raw/*39.6*/("""
"""),format.raw/*40.1*/("""</div>
""")))}))
      }
    }
  }

  def render(endereco:entidades.Endereco,pessoas:List[entidades.Pessoa]): play.twirl.api.HtmlFormat.Appendable = apply(endereco)(pessoas)

  def f:((entidades.Endereco) => (List[entidades.Pessoa]) => play.twirl.api.HtmlFormat.Appendable) = (endereco) => (pessoas) => apply(endereco)(pessoas)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-08-01T13:34:00.794671
                  SOURCE: /home/smartcatolica/workspace-play/crud/app/views/endereco_views/atualizar_endereco.scala.html
                  HASH: f7d1612cc9bc11ca5cd2b5dd8fbde1d8d38e6431
                  MATRIX: 1011->1|1168->66|1179->70|1217->72|1245->74|1353->157|1367->163|1425->213|1464->215|1500->225|1514->231|1549->246|1586->256|1709->352|1726->360|1753->366|1872->458|1889->466|1917->473|2088->617|2105->625|2136->635|2319->791|2336->799|2373->815|2403->818|2420->826|2459->844|2525->883|2563->905|2602->906|2663->940|2716->984|2756->986|2821->1023|2864->1039|2879->1045|2906->1051|2936->1054|2951->1060|2980->1068|3054->1111|3115->1141|3164->1162|3439->1407|3467->1408
                  LINES: 28->1|33->2|33->2|33->2|35->4|38->7|38->7|38->7|38->7|39->8|39->8|39->8|41->10|43->12|43->12|43->12|45->14|45->14|45->14|50->19|50->19|50->19|55->24|55->24|55->24|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|58->27|58->27|58->27|58->27|59->28|60->29|61->30|70->39|71->40
                  -- GENERATED --
              */
          