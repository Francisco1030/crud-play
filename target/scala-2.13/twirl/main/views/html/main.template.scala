
package views.html

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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <title>CRUD</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*7.54*/routes/*7.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*7.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.59*/routes/*8.65*/.Assets.versioned("images/icon.png")),format.raw/*8.101*/("""">
        <link rel="stylesheet" href=""""),_display_(/*9.39*/routes/*9.45*/.Assets.versioned("materialize/css/materialize.css")),format.raw/*9.97*/("""">
        <link rel="stylesheet" href=""""),_display_(/*10.39*/routes/*10.45*/.Assets.versioned("stylesheets/data-table.css")),format.raw/*10.92*/("""">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    </head>
    <body>
        <nav class="blue-grey darken-4" role="navigation">
            <div class="nav-wrapper container">
                <a href="#" class="brand-logo"><i class="material-icons">settings_input_component</i>CRUD</a>
                    <!-- Dropdown Structure -->
                <ul id="dropdown2" class="dropdown-content">
                    <li><a href=""""),_display_(/*19.35*/routes/*19.41*/.EnderecoController.cadastrarEnderecoPage()),format.raw/*19.84*/(""""><span class="blue-grey-text text-darken-2">Cadastrar</span></a></li>
                    <li><a href=""""),_display_(/*20.35*/routes/*20.41*/.EnderecoController.gerenciarEnderecoPage()),format.raw/*20.84*/(""""><span class="blue-grey-text text-darken-2">Gerenciar</span></a></li>
                </ul>
                <ul id="dropdown1" class="dropdown-content">
                    <li><a href=""""),_display_(/*23.35*/routes/*23.41*/.PessoaController.cadastrarPessoaPage()),format.raw/*23.80*/(""""><span class="blue-grey-text text-darken-2">Cadastrar</span></a></li>
                    <li><a href=""""),_display_(/*24.35*/routes/*24.41*/.PessoaController.gerenciarPessoaPage()),format.raw/*24.80*/(""""><span class="blue-grey-text text-darken-2">Gerenciar</span></a></li>
                </ul>

                    <!-- MENU DESKTOP -->
                <ul class="right hide-on-med-and-down">
                    <li><a href=""""),_display_(/*29.35*/routes/*29.41*/.HomeController.index()),format.raw/*29.64*/("""">Home</a></li>
                        <!-- Dropdown Trigger -->
                    <li><a href="#!" class="dropdown-button" data-target="dropdown1">Pessoa<i
                    class="material-icons right">arrow_drop_down</i></a></li>
                    <li><a href="#!" class="dropdown-button" data-target="dropdown2">Endereço<i
                    class="material-icons right">arrow_drop_down</i></a></li>
                </ul>

                    <!-- MENU MOBILE -->
                <ul id="nav-mobile" class="sidenav">
                    <li><a href=""""),_display_(/*39.35*/routes/*39.41*/.HomeController.index()),format.raw/*39.64*/("""">Home</a></li>
                        <!-- Dropdown Trigger -->
                    <li><a href="#!" class="dropdown-button" data-target="dropdown1">Pessoa<i
                    class="material-icons right">arrow_drop_down</i></a></li>
                    <li><a href="#!" class="dropdown-button" data-target="dropdown2">Endereço<i
                    class="material-icons right">arrow_drop_down</i></a></li>
                </ul>
                <a href="#" data-target="nav-mobile" class="sidenav-trigger"><i class="material-icons">menu</i></a>
            </div>
        </nav>

        """),_display_(/*50.10*/content),format.raw/*50.17*/("""

        """),format.raw/*52.9*/("""<script src=""""),_display_(/*52.23*/routes/*52.29*/.Assets.versioned("javascripts/JQuery.js")),format.raw/*52.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*53.23*/routes/*53.29*/.Assets.versioned("materialize/js/materialize.min.js")),format.raw/*53.83*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*54.23*/routes/*54.29*/.Assets.versioned("javascripts/main.js")),format.raw/*54.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*55.23*/routes/*55.29*/.Assets.versioned("javascripts/data-table.js")),format.raw/*55.75*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply(content)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (content) => apply(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-08-08T14:00:00.825511
                  SOURCE: /home/smartcatolica/workspace-play/crud/app/views/main.scala.html
                  HASH: 589ba9515ec12946010c71a12e79dad3ea655fba
                  MATRIX: 945->1|1054->17|1081->18|1235->146|1249->152|1311->193|1398->254|1412->260|1469->296|1536->337|1550->343|1622->395|1690->436|1705->442|1773->489|2281->970|2296->976|2360->1019|2492->1124|2507->1130|2571->1173|2786->1361|2801->1367|2861->1406|2993->1511|3008->1517|3068->1556|3321->1782|3336->1788|3380->1811|3970->2374|3985->2380|4029->2403|4650->2997|4678->3004|4715->3014|4756->3028|4771->3034|4834->3076|4918->3133|4933->3139|5008->3193|5092->3250|5107->3256|5168->3296|5252->3353|5267->3359|5334->3405
                  LINES: 28->1|33->2|34->3|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|50->19|50->19|50->19|51->20|51->20|51->20|54->23|54->23|54->23|55->24|55->24|55->24|60->29|60->29|60->29|70->39|70->39|70->39|81->50|81->50|83->52|83->52|83->52|83->52|84->53|84->53|84->53|85->54|85->54|85->54|86->55|86->55|86->55
                  -- GENERATED --
              */
          