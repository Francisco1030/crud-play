// @GENERATOR:play-routes-compiler
// @SOURCE:/home/smartcatolica/workspace-play/crud/conf/routes
// @DATE:Tue Jul 30 15:40:23 BRT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

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

  // @LINE:17
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
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
  
    // @LINE:9
    def cadastrarPessoaPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cadastrar-pessoa")
    }
  
    // @LINE:12
    def removerPessoa(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "remover-pessoa" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:14
    def cadastrarPessoa(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "cadastrar-pessoa")
    }
  
    // @LINE:15
    def atualizarPessoa(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "atualizar-pessoa")
    }
  
  }


}
