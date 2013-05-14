package models.daos;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import models.Todo;
import play.Logger;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: mugglmenzel
 * Date: 14.05.13
 * Time: 16:05
 * To change this template use File | Settings | File Templates.
 */
public class TodoDAO {

    private DynamoDBMapper pm = PersistenceHelper.getManager();

    public List<Todo> all() {
        return pm.scan(Todo.class, new DynamoDBScanExpression());
    }

    public Todo get(String id) {
        return pm.load(Todo.class, id);
    }

    public boolean save(Todo obj) {
        try {
            pm.save(obj);
        } catch (Exception e) {
            Logger.error("Not saved " + obj, e);
            return false;
        }
        return true;
    }

    public boolean delete(Todo obj) {
        pm.delete(obj);
        return true;
    }

    public boolean delete(String id) {
        try {
            pm.delete(get(id));
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
