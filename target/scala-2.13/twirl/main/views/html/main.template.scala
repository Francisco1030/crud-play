
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
        <script src=""""),_display_(/*12.23*/routes/*12.29*/.Assets.versioned("javascripts/JQuery.js")),format.raw/*12.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*13.23*/routes/*13.29*/.Assets.versioned("javascripts/jquery.validate.min.js")),format.raw/*13.84*/("""" type="text/javascript"></script>
    </head>
    <body>
        <nav class="blue-grey darken-4" role="navigation">
            <div class="nav-wrapper container">
                <a href="#" class="brand-logo"><i class="material-icons">settings_input_component</i>CRUD</a>
                    <!-- Dropdown Structure -->
                <ul id="dropdown2" class="dropdown-content">
                    <li><a href=""""),_display_(/*21.35*/routes/*21.41*/.EnderecoController.cadastrarEnderecoPage()),format.raw/*21.84*/(""""><span class="blue-grey-text text-darken-2">Cadastrar</span></a></li>
                    <li><a href=""""),_display_(/*22.35*/routes/*22.41*/.EnderecoController.gerenciarEnderecoPage()),format.raw/*22.84*/(""""><span class="blue-grey-text text-darken-2">Gerenciar</span></a></li>
                </ul>
                <ul id="dropdown1" class="dropdown-content">
                    <li><a href=""""),_display_(/*25.35*/routes/*25.41*/.PessoaController.cadastrarPessoaPage()),format.raw/*25.80*/(""""><span class="blue-grey-text text-darken-2">Cadastrar</span></a></li>
                    <li><a href=""""),_display_(/*26.35*/routes/*26.41*/.PessoaController.gerenciarPessoaPage()),format.raw/*26.80*/(""""><span class="blue-grey-text text-darken-2">Gerenciar</span></a></li>
                </ul>

                    <!-- MENU DESKTOP -->
                <ul class="right hide-on-med-and-down">
                    <li><a href=""""),_display_(/*31.35*/routes/*31.41*/.HomeController.index()),format.raw/*31.64*/("""">Home</a></li>
                        <!-- Dropdown Trigger -->
                    <li><a href="#!" class="dropdown-button" data-target="dropdown1">Pessoa<i
                    class="material-icons right">arrow_drop_down</i></a></li>
                    <li><a href="#!" class="dropdown-button" data-target="dropdown2">Endereço<i
                    class="material-icons right">arrow_drop_down</i></a></li>
                </ul>

                    <!-- MENU MOBILE -->
                <ul id="nav-mobile" class="sidenav">
                    <li><a href=""""),_display_(/*41.35*/routes/*41.41*/.HomeController.index()),format.raw/*41.64*/("""">Home</a></li>
                        <!-- Dropdown Trigger -->
                    <li><a href="#!" class="dropdown-button" data-target="dropdown1">Pessoa<i
                    class="material-icons right">arrow_drop_down</i></a></li>
                    <li><a href="#!" class="dropdown-button" data-target="dropdown2">Endereço<i
                    class="material-icons right">arrow_drop_down</i></a></li>
                </ul>
                <a href="#" data-target="nav-mobile" class="sidenav-trigger"><i class="material-icons">menu</i></a>
            </div>
        </nav>

        """),_display_(/*52.10*/content),format.raw/*52.17*/("""

        """),format.raw/*54.9*/("""<script src=""""),_display_(/*54.23*/routes/*54.29*/.Assets.versioned("materialize/js/materialize.min.js")),format.raw/*54.83*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*55.23*/routes/*55.29*/.Assets.versioned("javascripts/main.js")),format.raw/*55.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*56.23*/routes/*56.29*/.Assets.versioned("javascripts/data-table.js")),format.raw/*56.75*/("""" type="text/javascript"></script>

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
                  DATE: 2019-10-15T14:52:54.004
                  SOURCE: /home/smartcatolica/workspace-play/crud-play/app/views/main.scala.html
                  HASH: 156fb16cf4396d9459b2de6a3087a7631e9eec42
                  MATRIX: 945->1|1054->17|1081->18|1235->146|1249->152|1311->193|1398->254|1412->260|1469->296|1536->337|1550->343|1622->395|1690->436|1705->442|1773->489|1920->609|1935->615|1998->657|2082->714|2097->720|2173->775|2618->1193|2633->1199|2697->1242|2829->1347|2844->1353|2908->1396|3123->1584|3138->1590|3198->1629|3330->1734|3345->1740|3405->1779|3658->2005|3673->2011|3717->2034|4307->2597|4322->2603|4366->2626|4987->3220|5015->3227|5052->3237|5093->3251|5108->3257|5183->3311|5267->3368|5282->3374|5343->3414|5427->3471|5442->3477|5509->3523
                  LINES: 28->1|33->2|34->3|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|43->12|43->12|43->12|44->13|44->13|44->13|52->21|52->21|52->21|53->22|53->22|53->22|56->25|56->25|56->25|57->26|57->26|57->26|62->31|62->31|62->31|72->41|72->41|72->41|83->52|83->52|85->54|85->54|85->54|85->54|86->55|86->55|86->55|87->56|87->56|87->56
                  -- GENERATED --
              */
          