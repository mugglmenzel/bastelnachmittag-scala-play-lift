package code.snippet

import net.liftweb.http.{S, SHtml}
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
 * Time: 16:00
 * To change this template use File | Settings | File Templates.
 */
class edittodo {

  val mapper = new DynamoDBMapper(new AmazonDynamoDBClient(new BasicAWSCredentials(AWSCredentials.AWS_ACCESS, AWSCredentials.AWS_SECRET)))

  var title = ""



  def process() {
    if ("".equals(title)) S.error("Please enter a title for your todo entry!")
    else {
      val todo = new Todo()
      todo.setTitle(title)
      new DynamoDBMapper(new AmazonDynamoDBClient(new BasicAWSCredentials(AWSCredentials.AWS_ACCESS, AWSCredentials.AWS_SECRET))).save(todo)
    }
  }

  def render = {
    title = S.param("id").map(id => mapper.load(classOf[Todo], id).getTitle).openOr("")

    "name=title [value]" #> title &
      "name=title" #> SHtml.onSubmit(title = _) &
      "type=submit" #> SHtml.onSubmitUnit(process)
  }

}
