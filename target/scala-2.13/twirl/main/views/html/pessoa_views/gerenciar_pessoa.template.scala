
package views.html.pessoa_views

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

object gerenciar_pessoa extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[entidades.Pessoa],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pessoas: List[entidades.Pessoa]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main/*2.6*/{_display_(Seq[Any](format.raw/*2.7*/("""
    """),format.raw/*3.5*/("""<div>
        <div class="row">
            <div class="col s12 m12">
                <div class="card">
                    <div class="card-content">
                        <span class="card-title blue-grey-text text-darken-2 center-align">
                            <h4>Gerenciador de Pessoas</h4>
                        </span>
                        <table id="tabela-paginacao" class="styleTable bordered striped">
                            <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>Name</th>
                                    <th>E-mail</th>
                                    <th>Ações</th>
                                </tr>
                            </thead>

                            <tbody>
                                """),_display_(/*22.34*/if(pessoas.isEmpty)/*22.53*/{_display_(Seq[Any](format.raw/*22.54*/("""
                                    """),format.raw/*23.37*/("""<tr>
                                        <td colspan="4">
                                            Nenhuma pessoa cadastrada!
                                        </td>
                                    </tr>
                                """)))}),format.raw/*28.34*/("""
                                """),_display_(/*29.34*/for(pessoa <- pessoas) yield /*29.56*/ {_display_(Seq[Any](format.raw/*29.58*/("""
                                    """),format.raw/*30.37*/("""<tr>
                                        <td>"""),_display_(/*31.46*/pessoa/*31.52*/.getId),format.raw/*31.58*/("""</td>
                                        <td>"""),_display_(/*32.46*/pessoa/*32.52*/.getNome),format.raw/*32.60*/("""</td>
                                        <td>"""),_display_(/*33.46*/pessoa/*33.52*/.getEmail),format.raw/*33.61*/("""</td>
                                        <td>
                                            <a class="waves-effect waves-light btn orange" href=""""),_display_(/*35.99*/routes/*35.105*/.PessoaController.atualizarPessoaPage(pessoa.getId())),format.raw/*35.158*/(""""><i class="material-icons">create</i></a>
                                            <a class="waves-effect waves-light btn red"  href=""""),_display_(/*36.97*/routes/*36.103*/.PessoaController.removerPessoa(pessoa.getId())),format.raw/*36.150*/(""""><i class="material-icons">delete</i></a>
                                        </td>
                                    </tr>
                                """)))}),format.raw/*39.34*/("""
                            """),format.raw/*40.29*/("""</tbody>
                        </table>

                    </div>
                </div>
            </div>
        </div>

    </div>
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
                  DATE: 2019-08-08T14:13:45.599775
                  SOURCE: /home/smartcatolica/workspace-play/crud/app/views/pessoa_views/gerenciar_pessoa.scala.html
                  HASH: adf76514a24a796652c5e5ad0ff002a9652349f6
                  MATRIX: 988->1|1115->36|1126->40|1163->41|1194->46|2066->891|2094->910|2133->911|2198->948|2483->1202|2544->1236|2582->1258|2622->1260|2687->1297|2764->1347|2779->1353|2806->1359|2884->1410|2899->1416|2928->1424|3006->1475|3021->1481|3051->1490|3227->1639|3243->1645|3318->1698|3484->1837|3500->1843|3569->1890|3764->2054|3821->2083
                  LINES: 28->1|33->2|33->2|33->2|34->3|53->22|53->22|53->22|54->23|59->28|60->29|60->29|60->29|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|66->35|66->35|66->35|67->36|67->36|67->36|70->39|71->40
                  -- GENERATED --
              */
          