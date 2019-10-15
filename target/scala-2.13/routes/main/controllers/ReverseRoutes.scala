// @GENERATOR:play-routes-compiler
// @SOURCE:/home/smartcatolica/workspace-play/crud-play/conf/routes
// @DATE:Tue Oct 15 15:25:04 BRT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:22
  class ReverseEnderecoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def atualizarEnderecoPage(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "atualizar-endereco" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:27
    def cadastrarEndereco(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "cadastrar-endereco")
    }
  
    // @LINE:25
    def removerEndereco(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "remover-endereco" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:23
    def gerenciarEnderecoPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "gerenciar-endereco")
    }
  
    // @LINE:28
    def atualizarEndereco(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "atualizar-endereco")
    }
  
    // @LINE:22
    def cadastrarEnderecoPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cadastrar-endereco")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def socket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "socket")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:31
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:10
  class ReversePessoaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def atualizarPessoaPage(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "atualizar-pessoa" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:11
    def gerenciarPessoaPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "gerenciar-pessoa")
    }
  
    // @LINE:18
    def pesquisarPessoa(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "pesquisar-pessoa")
    }
  
    // @LINE:10
    def cadastrarPessoaPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cadastrar-pessoa")
    }
  
    // @LINE:13
    def removerPessoa(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "remover-pessoa" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:16
    def cadastrarPessoa(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "cadastrar-pessoa")
    }
  
    // @LINE:14
    def pesquisarPessoaPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "pesquisar-pessoa")
    }
  
    // @LINE:17
    def atualizarPessoa(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "atualizar-pessoa")
    }
  
  }


}
