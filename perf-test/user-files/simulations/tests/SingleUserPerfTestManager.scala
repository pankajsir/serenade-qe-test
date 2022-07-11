import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.io.Source
import java.io.PrintStream
import java.io.PrintStream
import scala.io.Source
import scala.collection.mutable.ListBuffer

package object SingleUserPerfTestManager {

val apiHits = Config.repeatAPIHits;
val baseURL = Config.baseUrl;

  def GetAllPetAPIPerformance () = {
    repeat(apiHits) {
      feed(Config.UuidFeeder)
        .exec (http("SingleUserPerfTestManager")
          .get(baseURL)
            .check(status.is(200))
             .check(bodyString.saveAs("ResponseBody"))
        )
        .exec(session => {
          println("ResponseBody: " + session("ResponseBody").as[String]);
          session
        })
    }
  }

    def GetAPetAPIPerformance () = {
    repeat(apiHits) {
      feed(Config.UuidFeeder)
        .exec (http("SingleUserPerfTestManager")
          .get(baseURL +"/1")
            .check(status.is(200))
             .check(bodyString.saveAs("ResponseBody"))
        )
        .exec(session => {
          println("ResponseBody: " + session("ResponseBody").as[String]);
          session
        })
    }
  }
}