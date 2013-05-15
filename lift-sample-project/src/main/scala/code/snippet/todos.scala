package code.snippet

import code.model.credentials.AWSCredentials
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient
import com.amazonaws.auth.BasicAWSCredentials
import com.amazonaws.services.dynamodbv2.datamodeling.{DynamoDBScanExpression, DynamoDBMapper}
import scala.collection.JavaConversions.asScalaBuffer
import model.Todo

/**
 * Created with IntelliJ IDEA.
 * User: mugglmenzel
 * Date: 15.05.13
 * Time: 15:15
 * To change this template use File | Settings | File Templates.
 */
object todos {

  def render = {
    new DynamoDBMapper(new AmazonDynamoDBClient(new BasicAWSCredentials(AWSCredentials.AWS_ACCESS, AWSCredentials.AWS_SECRET))).scan(classOf[Todo], new DynamoDBScanExpression).toList.map(todo =>
      <tr class={"status-" + todo.getStatus() + " todo-entry"} data-id={todo.getId()}>
        <td>
          <input type="checkbox" class="input-status"
                 checked={if (todo.getStatus() == "COMPLETE") {
                   "checked"
                 } else {
                   null
                 }}/>
        </td>
        <td>
          {todo.getTitle()}
        </td>
        <td>
          <a href={"/?id=" + todo.getId()}>Update</a>
        </td>
        <td>
          <a href={"/delete/" + todo.getId()} class="btn-delete">
            <i class="icon-trash"></i>
            Delete REST</a>
        </td>
        <td>
          <a href="#" class={"lift:deletetodoajax?id=" + todo.getId()}>Delete AJAX</a>
        </td>
      </tr>
    )

  }
}
