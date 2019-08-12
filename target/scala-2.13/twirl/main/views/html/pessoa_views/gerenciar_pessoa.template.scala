
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

            <!-- Modal Structure -->
        <div id="modal1" class="modal">
            <div class="modal-content">
                <h5>Dados da pessoa</h5>
                <p>Nome: </p>
            </div>
            <div class="modal-footer">
                <a href="#!" class="modal-close waves-effect waves-green btn-flat">Fechar</a>
            </div>
        </div>

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
                                """),_display_(/*34.34*/if(pessoas.isEmpty)/*34.53*/{_display_(Seq[Any](format.raw/*34.54*/("""
                                    """),format.raw/*35.37*/("""<tr>
                                        <td colspan="4">
                                            Nenhuma pessoa cadastrada!
                                        </td>
                                    </tr>
                                """)))}),format.raw/*40.34*/("""
                                """),_display_(/*41.34*/for(pessoa <- pessoas) yield /*41.56*/ {_display_(Seq[Any](format.raw/*41.58*/("""
                                    """),format.raw/*42.37*/("""<tr>
                                        <td>"""),_display_(/*43.46*/pessoa/*43.52*/.getId),format.raw/*43.58*/("""</td>
                                        <td>"""),_display_(/*44.46*/pessoa/*44.52*/.getNome),format.raw/*44.60*/("""</td>
                                        <td>"""),_display_(/*45.46*/pessoa/*45.52*/.getEmail),format.raw/*45.61*/("""</td>
                                        <td>
                                            <a class="waves-effect waves-light btn blue modal-trigger" data-target="modal1" href=""><i class="material-icons">visibility</i></a>
                                            <a class="waves-effect waves-light btn orange" href=""""),_display_(/*48.99*/routes/*48.105*/.PessoaController.atualizarPessoaPage(pessoa.getId())),format.raw/*48.158*/(""""><i class="material-icons">create</i></a>
                                            <a class="waves-effect waves-light btn red"  href=""""),_display_(/*49.97*/routes/*49.103*/.PessoaController.removerPessoa(pessoa.getId())),format.raw/*49.150*/(""""><i class="material-icons">delete</i></a>
                                        </td>
                                    </tr>
                                """)))}),format.raw/*52.34*/("""
                            """),format.raw/*53.29*/("""</tbody>
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
                  DATE: 2019-08-09T17:10:29.605293
                  SOURCE: /home/smartcatolica/workspace-play/crud/app/views/pessoa_views/gerenciar_pessoa.scala.html
                  HASH: 2481acc6707cc73f107af7f993ba82a31f13fc96
                  MATRIX: 988->1|1115->36|1126->40|1163->41|1194->46|2442->1267|2470->1286|2509->1287|2574->1324|2859->1578|2920->1612|2958->1634|2998->1636|3063->1673|3140->1723|3155->1729|3182->1735|3260->1786|3275->1792|3304->1800|3382->1851|3397->1857|3427->1866|3780->2192|3796->2198|3871->2251|4037->2390|4053->2396|4122->2443|4317->2607|4374->2636
                  LINES: 28->1|33->2|33->2|33->2|34->3|65->34|65->34|65->34|66->35|71->40|72->41|72->41|72->41|73->42|74->43|74->43|74->43|75->44|75->44|75->44|76->45|76->45|76->45|79->48|79->48|79->48|80->49|80->49|80->49|83->52|84->53
                  -- GENERATED --
              */
          