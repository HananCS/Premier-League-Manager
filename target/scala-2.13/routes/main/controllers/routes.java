// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Benhanan/Desktop/play-samples-play-java-hello-world-tutorial/conf/routes
// @DATE:Thu Jan 14 19:59:49 IST 2021

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseFrontendController FrontendController = new controllers.ReverseFrontendController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseClubMatchController ClubMatchController = new controllers.ReverseClubMatchController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseFrontendController FrontendController = new controllers.javascript.ReverseFrontendController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseClubMatchController ClubMatchController = new controllers.javascript.ReverseClubMatchController(RoutesPrefix.byNamePrefix());
  }

}
