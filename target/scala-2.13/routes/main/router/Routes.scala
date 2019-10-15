// @GENERATOR:play-routes-compiler
// @SOURCE:/home/smartcatolica/workspace-play/crud-play/conf/routes
// @DATE:Tue Oct 15 15:25:04 BRT 2019

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
  // @LINE:10
  PessoaController_0: controllers.PessoaController,
  // @LINE:22
  EnderecoController_3: controllers.EnderecoController,
  // @LINE:31
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_2: controllers.HomeController,
    // @LINE:10
    PessoaController_0: controllers.PessoaController,
    // @LINE:22
    EnderecoController_3: controllers.EnderecoController,
    // @LINE:31
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """socket""", """controllers.HomeController.socket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cadastrar-pessoa""", """controllers.PessoaController.cadastrarPessoaPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """gerenciar-pessoa""", """controllers.PessoaController.gerenciarPessoaPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """atualizar-pessoa""", """controllers.PessoaController.atualizarPessoaPage(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """remover-pessoa""", """controllers.PessoaController.removerPessoa(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pesquisar-pessoa""", """controllers.PessoaController.pesquisarPessoaPage(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cadastrar-pessoa""", """controllers.PessoaController.cadastrarPessoa(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """atualizar-pessoa""", """controllers.PessoaController.atualizarPessoa(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pesquisar-pessoa""", """controllers.PessoaController.pesquisarPessoa(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cadastrar-endereco""", """controllers.EnderecoController.cadastrarEnderecoPage()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """gerenciar-endereco""", """controllers.EnderecoController.gerenciarEnderecoPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """atualizar-endereco""", """controllers.EnderecoController.atualizarEnderecoPage(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """remover-endereco""", """controllers.EnderecoController.removerEndereco(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cadastrar-endereco""", """controllers.EnderecoController.cadastrarEndereco(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """atualizar-endereco""", """controllers.EnderecoController.atualizarEndereco(request:Request)"""),
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

  // @LINE:7
  private[this] lazy val controllers_HomeController_socket1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("socket")))
  )
  private[this] lazy val controllers_HomeController_socket1_invoker = createInvoker(
    HomeController_2.socket(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "socket",
      Nil,
      "GET",
      this.prefix + """socket""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_PessoaController_cadastrarPessoaPage2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cadastrar-pessoa")))
  )
  private[this] lazy val controllers_PessoaController_cadastrarPessoaPage2_invoker = createInvoker(
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

  // @LINE:11
  private[this] lazy val controllers_PessoaController_gerenciarPessoaPage3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("gerenciar-pessoa")))
  )
  private[this] lazy val controllers_PessoaController_gerenciarPessoaPage3_invoker = createInvoker(
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

  // @LINE:12
  private[this] lazy val controllers_PessoaController_atualizarPessoaPage4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("atualizar-pessoa")))
  )
  private[this] lazy val controllers_PessoaController_atualizarPessoaPage4_invoker = createInvoker(
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

  // @LINE:13
  private[this] lazy val controllers_PessoaController_removerPessoa5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("remover-pessoa")))
  )
  private[this] lazy val controllers_PessoaController_removerPessoa5_invoker = createInvoker(
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
  private[this] lazy val controllers_PessoaController_pesquisarPessoaPage6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pesquisar-pessoa")))
  )
  private[this] lazy val controllers_PessoaController_pesquisarPessoaPage6_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      PessoaController_0.pesquisarPessoaPage(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PessoaController",
      "pesquisarPessoaPage",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """pesquisar-pessoa""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_PessoaController_cadastrarPessoa7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cadastrar-pessoa")))
  )
  private[this] lazy val controllers_PessoaController_cadastrarPessoa7_invoker = createInvoker(
    
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

  // @LINE:17
  private[this] lazy val controllers_PessoaController_atualizarPessoa8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("atualizar-pessoa")))
  )
  private[this] lazy val controllers_PessoaController_atualizarPessoa8_invoker = createInvoker(
    
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
  private[this] lazy val controllers_PessoaController_pesquisarPessoa9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pesquisar-pessoa")))
  )
  private[this] lazy val controllers_PessoaController_pesquisarPessoa9_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      PessoaController_0.pesquisarPessoa(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PessoaController",
      "pesquisarPessoa",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """pesquisar-pessoa""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_EnderecoController_cadastrarEnderecoPage10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cadastrar-endereco")))
  )
  private[this] lazy val controllers_EnderecoController_cadastrarEnderecoPage10_invoker = createInvoker(
    EnderecoController_3.cadastrarEnderecoPage(),
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

  // @LINE:23
  private[this] lazy val controllers_EnderecoController_gerenciarEnderecoPage11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("gerenciar-endereco")))
  )
  private[this] lazy val controllers_EnderecoController_gerenciarEnderecoPage11_invoker = createInvoker(
    EnderecoController_3.gerenciarEnderecoPage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EnderecoController",
      "gerenciarEnderecoPage",
      Nil,
      "GET",
      this.prefix + """gerenciar-endereco""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_EnderecoController_atualizarEnderecoPage12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("atualizar-endereco")))
  )
  private[this] lazy val controllers_EnderecoController_atualizarEnderecoPage12_invoker = createInvoker(
    EnderecoController_3.atualizarEnderecoPage(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EnderecoController",
      "atualizarEnderecoPage",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """atualizar-endereco""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_EnderecoController_removerEndereco13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("remover-endereco")))
  )
  private[this] lazy val controllers_EnderecoController_removerEndereco13_invoker = createInvoker(
    EnderecoController_3.removerEndereco(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EnderecoController",
      "removerEndereco",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """remover-endereco""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_EnderecoController_cadastrarEndereco14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cadastrar-endereco")))
  )
  private[this] lazy val controllers_EnderecoController_cadastrarEndereco14_invoker = createInvoker(
    
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

  // @LINE:28
  private[this] lazy val controllers_EnderecoController_atualizarEndereco15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("atualizar-endereco")))
  )
  private[this] lazy val controllers_EnderecoController_atualizarEndereco15_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      EnderecoController_3.atualizarEndereco(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EnderecoController",
      "atualizarEndereco",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """atualizar-endereco""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Assets_versioned16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned16_invoker = createInvoker(
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
  
    // @LINE:7
    case controllers_HomeController_socket1_route(params@_) =>
      call { 
        controllers_HomeController_socket1_invoker.call(HomeController_2.socket())
      }
  
    // @LINE:10
    case controllers_PessoaController_cadastrarPessoaPage2_route(params@_) =>
      call { 
        controllers_PessoaController_cadastrarPessoaPage2_invoker.call(PessoaController_0.cadastrarPessoaPage)
      }
  
    // @LINE:11
    case controllers_PessoaController_gerenciarPessoaPage3_route(params@_) =>
      call { 
        controllers_PessoaController_gerenciarPessoaPage3_invoker.call(PessoaController_0.gerenciarPessoaPage)
      }
  
    // @LINE:12
    case controllers_PessoaController_atualizarPessoaPage4_route(params@_) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_PessoaController_atualizarPessoaPage4_invoker.call(PessoaController_0.atualizarPessoaPage(id))
      }
  
    // @LINE:13
    case controllers_PessoaController_removerPessoa5_route(params@_) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_PessoaController_removerPessoa5_invoker.call(PessoaController_0.removerPessoa(id))
      }
  
    // @LINE:14
    case controllers_PessoaController_pesquisarPessoaPage6_route(params@_) =>
      call { 
        controllers_PessoaController_pesquisarPessoaPage6_invoker.call(
          req => PessoaController_0.pesquisarPessoaPage(req))
      }
  
    // @LINE:16
    case controllers_PessoaController_cadastrarPessoa7_route(params@_) =>
      call { 
        controllers_PessoaController_cadastrarPessoa7_invoker.call(
          req => PessoaController_0.cadastrarPessoa(req))
      }
  
    // @LINE:17
    case controllers_PessoaController_atualizarPessoa8_route(params@_) =>
      call { 
        controllers_PessoaController_atualizarPessoa8_invoker.call(
          req => PessoaController_0.atualizarPessoa(req))
      }
  
    // @LINE:18
    case controllers_PessoaController_pesquisarPessoa9_route(params@_) =>
      call { 
        controllers_PessoaController_pesquisarPessoa9_invoker.call(
          req => PessoaController_0.pesquisarPessoa(req))
      }
  
    // @LINE:22
    case controllers_EnderecoController_cadastrarEnderecoPage10_route(params@_) =>
      call { 
        controllers_EnderecoController_cadastrarEnderecoPage10_invoker.call(EnderecoController_3.cadastrarEnderecoPage())
      }
  
    // @LINE:23
    case controllers_EnderecoController_gerenciarEnderecoPage11_route(params@_) =>
      call { 
        controllers_EnderecoController_gerenciarEnderecoPage11_invoker.call(EnderecoController_3.gerenciarEnderecoPage)
      }
  
    // @LINE:24
    case controllers_EnderecoController_atualizarEnderecoPage12_route(params@_) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_EnderecoController_atualizarEnderecoPage12_invoker.call(EnderecoController_3.atualizarEnderecoPage(id))
      }
  
    // @LINE:25
    case controllers_EnderecoController_removerEndereco13_route(params@_) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_EnderecoController_removerEndereco13_invoker.call(EnderecoController_3.removerEndereco(id))
      }
  
    // @LINE:27
    case controllers_EnderecoController_cadastrarEndereco14_route(params@_) =>
      call { 
        controllers_EnderecoController_cadastrarEndereco14_invoker.call(
          req => EnderecoController_3.cadastrarEndereco(req))
      }
  
    // @LINE:28
    case controllers_EnderecoController_atualizarEndereco15_route(params@_) =>
      call { 
        controllers_EnderecoController_atualizarEndereco15_invoker.call(
          req => EnderecoController_3.atualizarEndereco(req))
      }
  
    // @LINE:31
    case controllers_Assets_versioned16_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned16_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
