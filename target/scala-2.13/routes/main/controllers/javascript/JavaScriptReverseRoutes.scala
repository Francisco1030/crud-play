// @GENERATOR:play-routes-compiler
// @SOURCE:/home/smartcatolica/workspace-play/crud/conf/routes
// @DATE:Tue Jul 30 17:28:33 BRT 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:18
  class ReverseEnderecoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def cadastrarEndereco: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EnderecoController.cadastrarEndereco",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cadastrar-endereco"})
        }
      """
    )
  
    // @LINE:18
    def cadastrarEnderecoPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EnderecoController.cadastrarEnderecoPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cadastrar-endereco"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:22
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:9
  class ReversePessoaController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def atualizarPessoaPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PessoaController.atualizarPessoaPage",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "atualizar-pessoa" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:10
    def gerenciarPessoaPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PessoaController.gerenciarPessoaPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "gerenciar-pessoa"})
        }
      """
    )
  
    // @LINE:9
    def cadastrarPessoaPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PessoaController.cadastrarPessoaPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cadastrar-pessoa"})
        }
      """
    )
  
    // @LINE:12
    def removerPessoa: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PessoaController.removerPessoa",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "remover-pessoa" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:14
    def cadastrarPessoa: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PessoaController.cadastrarPessoa",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cadastrar-pessoa"})
        }
      """
    )
  
    // @LINE:15
    def atualizarPessoa: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PessoaController.atualizarPessoa",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "atualizar-pessoa"})
        }
      """
    )
  
  }


}
