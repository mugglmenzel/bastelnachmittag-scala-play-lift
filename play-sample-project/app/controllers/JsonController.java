package controllers;

import models.daos.TodoDAO;
import play.data.DynamicForm;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.indexjson;

import static play.data.Form.form;

public class JsonController extends Controller {

    public static Result index() {
        return ok(indexjson.render(new TodoDAO().all()));
    }

    public static Result addTodo() {
        DynamicForm requestData = form().bindFromRequest();

        models.Todo todo = new models.Todo();
        todo.setTitle(requestData.get("title"));

        new TodoDAO().save(todo);

        return ok(Json.toJson(todo));

    }

    public static Result updateTodo(String todoId) {
        DynamicForm requestData = form().bindFromRequest();

        models.Todo todo = new TodoDAO().get(todoId);
        todo.setStatus(requestData.get("status").toUpperCase());

        new TodoDAO().save(todo);

        return ok(Json.toJson(todo));
    }


    public static Result deleteTodo(String todoId) {
        new TodoDAO().delete(todoId);

        return ok();
    }

}
