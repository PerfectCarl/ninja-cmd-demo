/**
 * Copyright (C) 2012 the original author or authors.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package conf;

import controllers.Application;
import ninja.AssetsController;
import ninja.RouteBuilder;
import ninja.Router;
import ninja.application.ApplicationRoutes;

@SuppressWarnings("all")
public class Routes implements ApplicationRoutes {
  @Override
  public void init(final Router router) {
    RouteBuilder _GET = router.GET();
    RouteBuilder _route = _GET.route("/");
    _route.with(Application.class, "index");
    RouteBuilder _GET_1 = router.GET();
    RouteBuilder _route_1 = _GET_1.route("/hello_world.json");
    _route_1.with(Application.class, "helloWorldJson");
    RouteBuilder _GET_2 = router.GET();
    RouteBuilder _route_2 = _GET_2.route("/assets/webjars/{fileName: .*}");
    _route_2.with(AssetsController.class, "serveWebJars");
    RouteBuilder _GET_3 = router.GET();
    RouteBuilder _route_3 = _GET_3.route("/assets/{fileName: .*}");
    _route_3.with(AssetsController.class, "serveStatic");
  }
}
