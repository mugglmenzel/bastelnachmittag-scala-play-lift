package code.snippet

import net.liftweb.http.{S, SHtml}
import net.liftweb.http.js.{JsCmds, JsCmd}
import net.liftweb.util.Helpers._
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient
import com.amazonaws.auth.BasicAWSCredentials
import code.model.credentials.AWSCredentials
import model.Todo

/**
 * Created with IntelliJ IDEA.
 * User: mugglmenzel
 * Date: 15.05.13
 * Time: 17:33
 * To change this template use File | Settings | File Templates.
 */
object deletetodoajax {

  var id = ""

  def delete(): JsCmd = {
    if (!"".equals(id)) {
      val mapper = new DynamoDBMapper(new AmazonDynamoDBClient(new BasicAWSCredentials(AWSCredentials.AWS_ACCESS, AWSCredentials.AWS_SECRET)))
      println("deleting " + id)
      val todo = mapper.load(classOf[Todo], id)
      mapper.delete(todo)
      JsCmds.Alert("Deleted " + todo.getTitle)
    } else JsCmds.Alert("Error during deletion! No id!")
  }

  def render = {
    id = S.attr("id").openOr("")

    "a [onclick+]" #>
      SHtml.ajaxInvoke(delete)
  }

}
