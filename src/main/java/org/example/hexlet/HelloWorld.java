package org.example.hexlet;

import io.javalin.rendering.template.JavalinJte;
import io.javalin.Javalin;
import org.example.hexlet.controller.UsersController;
import org.example.hexlet.util.NamedRoutes;

public class HelloWorld {
    public static void main(String[] args) {

        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            config.fileRenderer(new JavalinJte());
        });

//        Main page
        app.get("/", ctx -> {
            ctx.render("index_post_form.jte");
        });

//        Описание роутинга с добавлением контроллеров становится проще для восприятия:
//        app.get("/users", UsersController::index);
//        app.get("/users/build", UsersController::build);
//        app.get("/users/{id}", UsersController::show);
//        app.post("/users", UsersController::create);
//        app.get("/users/{id}/edit", UsersController::edit);
//        app.patch("/users/{id}", UsersController::update);
//        app.delete("/users/{id}", UsersController::destroy);


        // Добавим обработчик маршрута /users/build, который выводит форму добавления пользователя:
        app.get(NamedRoutes.buildUserPath(), UsersController::build);
//        app.get("/users/build", UsersController::build);

        //Обработчик формы без нормализации данных, "/users"
        app.post(NamedRoutes.usersPath(), UsersController::create);

        // Обработчик маршрута /users
        app.get(NamedRoutes.usersPath(), UsersController::index);


        // Обработчик маршрута /users/{id}
//        app.get("/users/{id}", UsersController::show);
        app.get(NamedRoutes.userPath("{id}"), UsersController::show);

        app.start(7070);
    }


}
