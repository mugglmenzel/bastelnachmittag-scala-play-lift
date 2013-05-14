package controllers;

import models.daos.TodoDAO;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

import static play.data.Form.form;

public class AppController extends Controller {

    private static Form<models.Todo> todoForm = form(models.Todo.class);

    public static Result index() {
        return ok(index.render(new TodoDAO().all(), todoForm));
    }

    public static Result save() {
        models.Todo todo = todoForm.bindFromRequest().get();
        new TodoDAO().save(todo);

        return ok(index.render(new TodoDAO().all(), todoForm));

    }

    public static Result update(String todoId) {
        models.Todo todo = new TodoDAO().get(todoId);
        Form<models.Todo> filledTodoForm = todoForm.fill(todo);

        return ok(index.render(new TodoDAO().all(), filledTodoForm));
    }

    public static Result delete(String todoId) {
        new TodoDAO().delete(todoId);

        return index();
    }

}
