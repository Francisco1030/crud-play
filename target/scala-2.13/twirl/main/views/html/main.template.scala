
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
                <li><a href="sass.html">Sass</a></li>
                <li><a href="badges.html">Components</a></li>
                <li><a href="collapsible.html">JavaScript</a></li>
            </ul>
        </div>
    </nav>

        """),_display_(/*33.10*/content),format.raw/*33.17*/("""

        """),format.raw/*35.9*/("""<script src=""""),_display_(/*35.23*/routes/*35.29*/.Assets.versioned("javascripts/JQuery.js")),format.raw/*35.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*36.23*/routes/*36.29*/.Assets.versioned("materialize/js/materialize.min.js")),format.raw/*36.83*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*37.23*/routes/*37.29*/.Assets.versioned("javascripts/main.js")),format.raw/*37.69*/("""" type="text/javascript"></script>
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
                  DATE: 2019-07-30T14:52:53.098226
                  SOURCE: /home/smartcatolica/workspace-play/crud/app/views/main.scala.html
                  HASH: 9d676939084dae816b913e48a1296eafb8b1a774
                  MATRIX: 1199->260|1308->276|1335->277|1415->382|1451->391|1553->466|1568->472|1631->513|1719->574|1734->580|1795->619|1863->660|1878->666|1951->718|2108->937|2140->942|2564->1339|2592->1346|2629->1356|2670->1370|2685->1376|2748->1418|2832->1475|2847->1481|2922->1535|3006->1592|3021->1598|3082->1638
                  LINES: 33->7|38->8|39->9|42->12|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|50->21|51->22|62->33|62->33|64->35|64->35|64->35|64->35|65->36|65->36|65->36|66->37|66->37|66->37
                  -- GENERATED --
              */
          