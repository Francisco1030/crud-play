// @GENERATOR:play-routes-compiler
// @SOURCE:/home/smartcatolica/workspace-play/crud/conf/routes
// @DATE:Tue Jul 30 17:28:33 BRT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_2: controllers.HomeController,
  // @LINE:9
  PessoaController_0: controllers.PessoaController,
  // @LINE:18
  EnderecoController_3: controllers.EnderecoController,
  // @LINE:22
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_2: controllers.HomeController,
    // @LINE:9
    PessoaController_0: controllers.PessoaController,
    // @LINE:18
    EnderecoController_3: controllers.EnderecoController,
    // @LINE:22
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_2, PessoaController_0, EnderecoController_3, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, PessoaController_0, EnderecoController_3, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cadastrar-pessoa""", """controllers.PessoaController.cadastrarPessoaPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """gerenciar-pessoa""", """controllers.PessoaController.gerenciarPessoaPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """atualizar-pessoa""", """controllers.PessoaController.atualizarPessoaPage(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """remover-pessoa""", """controllers.PessoaController.removerPessoa(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cadastrar-pessoa""", """controllers.PessoaController.cadastrarPessoa(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """atualizar-pessoa""", """controllers.PessoaController.atualizarPessoa(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cadastrar-endereco""", """controllers.EnderecoController.cadastrarEnderecoPage"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cadastrar-endereco""", """controllers.EnderecoController.cadastrarEndereco(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_PessoaController_cadastrarPessoaPage1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cadastrar-pessoa")))
  )
  private[this] lazy val controllers_PessoaController_cadastrarPessoaPage1_invoker = createInvoker(
    PessoaController_0.cadastrarPessoaPage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PessoaController",
      "cadastrarPessoaPage",
      Nil,
      "GET",
      this.prefix + """cadastrar-pessoa""",
      """Bloco Pessoa""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_PessoaController_gerenciarPessoaPage2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("gerenciar-pessoa")))
  )
  private[this] lazy val controllers_PessoaController_gerenciarPessoaPage2_invoker = createInvoker(
    PessoaController_0.gerenciarPessoaPage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PessoaController",
      "gerenciarPessoaPage",
      Nil,
      "GET",
      this.prefix + """gerenciar-pessoa""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_PessoaController_atualizarPessoaPage3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("atualizar-pessoa")))
  )
  private[this] lazy val controllers_PessoaController_atualizarPessoaPage3_invoker = createInvoker(
    PessoaController_0.atualizarPessoaPage(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PessoaController",
      "atualizarPessoaPage",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """atualizar-pessoa""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_PessoaController_removerPessoa4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("remover-pessoa")))
  )
  private[this] lazy val controllers_PessoaController_removerPessoa4_invoker = createInvoker(
    PessoaController_0.removerPessoa(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PessoaController",
      "removerPessoa",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """remover-pessoa""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_PessoaController_cadastrarPessoa5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cadastrar-pessoa")))
  )
  private[this] lazy val controllers_PessoaController_cadastrarPessoa5_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      PessoaController_0.cadastrarPessoa(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PessoaController",
      "cadastrarPessoa",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """cadastrar-pessoa""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_PessoaController_atualizarPessoa6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("atualizar-pessoa")))
  )
  private[this] lazy val controllers_PessoaController_atualizarPessoa6_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      PessoaController_0.atualizarPessoa(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PessoaController",
      "atualizarPessoa",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """atualizar-pessoa""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_EnderecoController_cadastrarEnderecoPage7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cadastrar-endereco")))
  )
  private[this] lazy val controllers_EnderecoController_cadastrarEnderecoPage7_invoker = createInvoker(
    EnderecoController_3.cadastrarEnderecoPage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EnderecoController",
      "cadastrarEnderecoPage",
      Nil,
      "GET",
      this.prefix + """cadastrar-endereco""",
      """Bloco Endereco""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_EnderecoController_cadastrarEndereco8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cadastrar-endereco")))
  )
  private[this] lazy val controllers_EnderecoController_cadastrarEndereco8_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      EnderecoController_3.cadastrarEndereco(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EnderecoController",
      "cadastrarEndereco",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """cadastrar-endereco""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Assets_versioned9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned9_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:9
    case controllers_PessoaController_cadastrarPessoaPage1_route(params@_) =>
      call { 
        controllers_PessoaController_cadastrarPessoaPage1_invoker.call(PessoaController_0.cadastrarPessoaPage)
      }
  
    // @LINE:10
    case controllers_PessoaController_gerenciarPessoaPage2_route(params@_) =>
      call { 
        controllers_PessoaController_gerenciarPessoaPage2_invoker.call(PessoaController_0.gerenciarPessoaPage)
      }
  
    // @LINE:11
    case controllers_PessoaController_atualizarPessoaPage3_route(params@_) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_PessoaController_atualizarPessoaPage3_invoker.call(PessoaController_0.atualizarPessoaPage(id))
      }
  
    // @LINE:12
    case controllers_PessoaController_removerPessoa4_route(params@_) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_PessoaController_removerPessoa4_invoker.call(PessoaController_0.removerPessoa(id))
      }
  
    // @LINE:14
    case controllers_PessoaController_cadastrarPessoa5_route(params@_) =>
      call { 
        controllers_PessoaController_cadastrarPessoa5_invoker.call(
          req => PessoaController_0.cadastrarPessoa(req))
      }
  
    // @LINE:15
    case controllers_PessoaController_atualizarPessoa6_route(params@_) =>
      call { 
        controllers_PessoaController_atualizarPessoa6_invoker.call(
          req => PessoaController_0.atualizarPessoa(req))
      }
  
    // @LINE:18
    case controllers_EnderecoController_cadastrarEnderecoPage7_route(params@_) =>
      call { 
        controllers_EnderecoController_cadastrarEnderecoPage7_invoker.call(EnderecoController_3.cadastrarEnderecoPage)
      }
  
    // @LINE:20
    case controllers_EnderecoController_cadastrarEndereco8_route(params@_) =>
      call { 
        controllers_EnderecoController_cadastrarEndereco8_invoker.call(
          req => EnderecoController_3.cadastrarEndereco(req))
      }
  
    // @LINE:22
    case controllers_Assets_versioned9_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned9_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
