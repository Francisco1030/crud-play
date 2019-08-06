
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

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <title>CRUD</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*13.54*/routes/*13.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*13.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*14.59*/routes/*14.65*/.Assets.versioned("images/icon.png")),format.raw/*14.101*/("""">
        <link rel="stylesheet" href=""""),_display_(/*15.39*/routes/*15.45*/.Assets.versioned("materialize/css/materialize.css")),format.raw/*15.97*/("""">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    </head>
    <body>
        <nav class="blue-grey darken-4" role="navigation">
            <div class="nav-wrapper container">
                <a href="#" class="brand-logo"><i class="material-icons">settings_input_component</i>CRUD</a>
                    <!-- Dropdown Structure -->
                <ul id="dropdown2" class="dropdown-content">
                    <li><a href=""""),_display_(/*24.35*/routes/*24.41*/.EnderecoController.cadastrarEnderecoPage()),format.raw/*24.84*/(""""><span class="blue-grey-text text-darken-2">Cadastrar</span></a></li>
                    <li><a href=""""),_display_(/*25.35*/routes/*25.41*/.EnderecoController.gerenciarEnderecoPage()),format.raw/*25.84*/(""""><span class="blue-grey-text text-darken-2">Gerenciar</span></a></li>
                </ul>
                <ul id="dropdown1" class="dropdown-content">
                    <li><a href=""""),_display_(/*28.35*/routes/*28.41*/.PessoaController.cadastrarPessoaPage()),format.raw/*28.80*/(""""><span class="blue-grey-text text-darken-2">Cadastrar</span></a></li>
                    <li><a href=""""),_display_(/*29.35*/routes/*29.41*/.PessoaController.gerenciarPessoaPage()),format.raw/*29.80*/(""""><span class="blue-grey-text text-darken-2">Gerenciar</span></a></li>
                </ul>

                    <!-- MENU DESKTOP -->
                <ul class="right hide-on-med-and-down">
                    <li><a href=""""),_display_(/*34.35*/routes/*34.41*/.HomeController.index()),format.raw/*34.64*/("""">Home</a></li>
                        <!-- Dropdown Trigger -->
                    <li><a href="#!" class="dropdown-button" data-target="dropdown1">Pessoa<i
                    class="material-icons right">arrow_drop_down</i></a></li>
                    <li><a href="#!" class="dropdown-button" data-target="dropdown2">Endereço<i
                    class="material-icons right">arrow_drop_down</i></a></li>
                </ul>

                    <!-- MENU MOBILE -->
                <ul id="nav-mobile" class="sidenav">
                    <li><a href=""""),_display_(/*44.35*/routes/*44.41*/.HomeController.index()),format.raw/*44.64*/("""">Home</a></li>
                        <!-- Dropdown Trigger -->
                    <li><a href="#!" class="dropdown-button" data-target="dropdown1">Pessoa<i
                    class="material-icons right">arrow_drop_down</i></a></li>
                    <li><a href="#!" class="dropdown-button" data-target="dropdown2">Endereço<i
                    class="material-icons right">arrow_drop_down</i></a></li>
                </ul>
                <a href="#" data-target="nav-mobile" class="sidenav-trigger"><i class="material-icons">menu</i></a>
            </div>
        </nav>

        """),_display_(/*55.10*/content),format.raw/*55.17*/("""

        """),format.raw/*57.9*/("""<script src=""""),_display_(/*57.23*/routes/*57.29*/.Assets.versioned("javascripts/JQuery.js")),format.raw/*57.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*58.23*/routes/*58.29*/.Assets.versioned("materialize/js/materialize.min.js")),format.raw/*58.83*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*59.23*/routes/*59.29*/.Assets.versioned("javascripts/main.js")),format.raw/*59.69*/("""" type="text/javascript"></script>
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
                  DATE: 2019-08-06T15:36:43.103719
                  SOURCE: /home/smartcatolica/workspace-play/crud/app/views/main.scala.html
                  HASH: 5bfe1d6af13b88b6ed8ddde77f431e3de5f013bb
                  MATRIX: 1199->260|1308->276|1335->277|1490->405|1505->411|1568->452|1656->513|1671->519|1729->555|1797->596|1812->602|1885->654|2393->1135|2408->1141|2472->1184|2604->1289|2619->1295|2683->1338|2898->1526|2913->1532|2973->1571|3105->1676|3120->1682|3180->1721|3433->1947|3448->1953|3492->1976|4082->2539|4097->2545|4141->2568|4762->3162|4790->3169|4827->3179|4868->3193|4883->3199|4946->3241|5030->3298|5045->3304|5120->3358|5204->3415|5219->3421|5280->3461
                  LINES: 33->7|38->8|39->9|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|54->24|54->24|54->24|55->25|55->25|55->25|58->28|58->28|58->28|59->29|59->29|59->29|64->34|64->34|64->34|74->44|74->44|74->44|85->55|85->55|87->57|87->57|87->57|87->57|88->58|88->58|88->58|89->59|89->59|89->59
                  -- GENERATED --
              */
          