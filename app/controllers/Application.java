package controllers;

import java.util.HashMap;
import java.util.Map;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public Result testMap() {
    	Map<String, String> params = new HashMap<String, String>();
    	params.put("P1", "Parameter 1");
    	params.put("P2", "2342434234");
    	return ok(demo.render(params));
    }
}
