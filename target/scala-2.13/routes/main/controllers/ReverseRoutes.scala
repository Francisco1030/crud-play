// @GENERATOR:play-routes-compiler
// @SOURCE:/home/smartcatolica/workspace-play/crud/conf/routes
// @DATE:Thu Aug 01 17:21:56 BRT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:19
  class ReverseEnderecoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def atualizarEnderecoPage(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "atualizar-endereco" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:24
    def cadastrarEndereco(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "cadastrar-endereco")
    }
  
    // @LINE:22
    def removerEndereco(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "remover-endereco" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:20
    def gerenciarEnderecoPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "gerenciar-endereco")
    }
  
    // @LINE:25
    def atualizarEndereco(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "atualizar-endereco")
    }
  
    // @LINE:19
    def cadastrarEnderecoPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cadastrar-endereco")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:28
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:9
  class ReversePessoaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def atualizarPessoaPage(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "atualizar-pessoa" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:10
    def gerenciarPessoaPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "gerenciar-pessoa")
    }
  
    // @LINE:13
    def pesquisarPessoaPage(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "pesquisar-pessoa" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:9
    def cadastrarPessoaPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cadastrar-pessoa")
    }
  
    // @LINE:12
    def removerPessoa(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "remover-pessoa" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:15
    def cadastrarPessoa(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "cadastrar-pessoa")
    }
  
    // @LINE:16
    def atualizarPessoa(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "atualizar-pessoa")
    }
  
  }


}
