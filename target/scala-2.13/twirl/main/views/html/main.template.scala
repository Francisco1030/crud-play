
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
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>Titulo</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("images/favicon.png")),format.raw/*15.104*/("""">
        <link rel="stylesheet" href=""""),_display_(/*16.39*/routes/*16.45*/.Assets.versioned("materialize/css/materialize.css")),format.raw/*16.97*/("""">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    </head>
    <body>
        """),format.raw/*21.32*/("""
    """),format.raw/*22.5*/("""<nav>
        <div class="nav-wrapper">
            <a href="#" class="brand-logo">Logo</a>
            <ul id="nav-mobile" class="right hide-on-med-and-down">
                <li><a href=""""),_display_(/*26.31*/routes/*26.37*/.PessoaController.cadastrarPessoaPage()),format.raw/*26.76*/("""">Cadastrar Pessoa</a></li>
                <li><a href=""""),_display_(/*27.31*/routes/*27.37*/.PessoaController.gerenciarPessoaPage()),format.raw/*27.76*/("""">Gerenciar Pessoas</a></li>
                <li><a href=""""),_display_(/*28.31*/routes/*28.37*/.EnderecoController.cadastrarEnderecoPage()),format.raw/*28.80*/("""">Cadastrar Endereço</a></li>
                <li><a href=""""),_display_(/*29.31*/routes/*29.37*/.EnderecoController.gerenciarEnderecoPage()),format.raw/*29.80*/("""">Gerenciar Endeeços</a></li>
            </ul>
        </div>
    </nav>

        """),_display_(/*34.10*/content),format.raw/*34.17*/("""

        """),format.raw/*36.9*/("""<script src=""""),_display_(/*36.23*/routes/*36.29*/.Assets.versioned("javascripts/JQuery.js")),format.raw/*36.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*37.23*/routes/*37.29*/.Assets.versioned("materialize/js/materialize.min.js")),format.raw/*37.83*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*38.23*/routes/*38.29*/.Assets.versioned("javascripts/main.js")),format.raw/*38.69*/("""" type="text/javascript"></script>
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
                  DATE: 2019-07-31T13:46:49.551381
                  SOURCE: /home/smartcatolica/workspace-play/crud/app/views/main.scala.html
                  HASH: 4c98f58d9e494a7b3e77af62601468d4a3805a23
                  MATRIX: 1199->260|1308->276|1335->277|1415->382|1451->391|1553->466|1568->472|1631->513|1719->574|1734->580|1795->619|1863->660|1878->666|1951->718|2108->937|2140->942|2357->1132|2372->1138|2432->1177|2517->1235|2532->1241|2592->1280|2678->1339|2693->1345|2757->1388|2844->1448|2859->1454|2923->1497|3034->1581|3062->1588|3099->1598|3140->1612|3155->1618|3218->1660|3302->1717|3317->1723|3392->1777|3476->1834|3491->1840|3552->1880
                  LINES: 33->7|38->8|39->9|42->12|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|50->21|51->22|55->26|55->26|55->26|56->27|56->27|56->27|57->28|57->28|57->28|58->29|58->29|58->29|63->34|63->34|65->36|65->36|65->36|65->36|66->37|66->37|66->37|67->38|67->38|67->38
                  -- GENERATED --
              */
          