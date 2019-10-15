// @GENERATOR:play-routes-compiler
// @SOURCE:/home/smartcatolica/workspace-play/crud-play/conf/routes
// @DATE:Tue Oct 15 15:25:04 BRT 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:22
  class ReverseEnderecoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def atualizarEnderecoPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EnderecoController.atualizarEnderecoPage",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "atualizar-endereco" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:27
    def cadastrarEndereco: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EnderecoController.cadastrarEndereco",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cadastrar-endereco"})
        }
      """
    )
  
    // @LINE:25
    def removerEndereco: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EnderecoController.removerEndereco",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "remover-endereco" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:23
    def gerenciarEnderecoPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EnderecoController.gerenciarEnderecoPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "gerenciar-endereco"})
        }
      """
    )
  
    // @LINE:28
    def atualizarEndereco: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EnderecoController.atualizarEndereco",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "atualizar-endereco"})
        }
      """
    )
  
    // @LINE:22
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

  
    // @LINE:7
    def socket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.socket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "socket"})
        }
      """
    )
  
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

  // @LINE:31
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:10
  class ReversePessoaController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def atualizarPessoaPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PessoaController.atualizarPessoaPage",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "atualizar-pessoa" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:11
    def gerenciarPessoaPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PessoaController.gerenciarPessoaPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "gerenciar-pessoa"})
        }
      """
    )
  
    // @LINE:18
    def pesquisarPessoa: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PessoaController.pesquisarPessoa",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "pesquisar-pessoa"})
        }
      """
    )
  
    // @LINE:10
    def cadastrarPessoaPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PessoaController.cadastrarPessoaPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cadastrar-pessoa"})
        }
      """
    )
  
    // @LINE:13
    def removerPessoa: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PessoaController.removerPessoa",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "remover-pessoa" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:16
    def cadastrarPessoa: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PessoaController.cadastrarPessoa",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cadastrar-pessoa"})
        }
      """
    )
  
    // @LINE:14
    def pesquisarPessoaPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PessoaController.pesquisarPessoaPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pesquisar-pessoa"})
        }
      """
    )
  
    // @LINE:17
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
