// @GENERATOR:play-routes-compiler
// @SOURCE:/home/smartcatolica/workspace-play/crud/conf/routes
// @DATE:Fri Aug 09 16:51:26 BRT 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseEnderecoController EnderecoController = new controllers.ReverseEnderecoController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReversePessoaController PessoaController = new controllers.ReversePessoaController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseEnderecoController EnderecoController = new controllers.javascript.ReverseEnderecoController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReversePessoaController PessoaController = new controllers.javascript.ReversePessoaController(RoutesPrefix.byNamePrefix());
  }

}
