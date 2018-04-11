package controllers;

import play.mvc.Security;

/**
 * Created by Dost Muhammad on 4/11/2018.
 */
import play.*;
import play.mvc.*;
import play.mvc.Http.*;

import models.*;
public class Secured extends Security.Authenticator{
    @Override
    public String getUsername(Context ctx) {
        return ctx.session().get("email");
    }

    @Override
    public Result onUnauthorized(Context ctx) {
        return redirect(routes.LoginController.login());
    }

    public static boolean isLoggedIn(Context ctx) {

        return (getUser(ctx) != null);
    }
    public static String getUser(Context ctx) {
        return ctx.session().get("email");
    }
}
