package code.rest

import net.liftweb.http.rest.RestHelper
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient
import com.amazonaws.auth.BasicAWSCredentials
import code.model.credentials.AWSCredentials
import model.Todo
import net.liftweb.http.{RedirectResponse, OkResponse, S}

/**
 * Created with IntelliJ IDEA.
 * User: mugglmenzel
 * Date: 15.05.13
 * Time: 16:21
 * To change this template use File | Settings | File Templates.
 */
object RestServer extends RestHelper {

  val mapper = new DynamoDBMapper(new AmazonDynamoDBClient(new BasicAWSCredentials(AWSCredentials.AWS_ACCESS, AWSCredentials.AWS_SECRET)))

  serve {
    case "delete" :: id :: Nil Get req =>
      mapper.delete(mapper.load(classOf[Todo], id))
      RedirectResponse("/")
  }
}
