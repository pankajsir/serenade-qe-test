import java.util.UUID

import io.gatling.http.Predef._
import java.util.concurrent.ThreadLocalRandom
import io.gatling.core.Predef._

package object Config {

  val defaultBaseURL = "http://localhost:1080"
    val defaultUserCount = 1
  val defaultRampUpUsersCount = 1
  val defaultRepeatScenario = 1
  val defaultRepeatAPIHits = 1

  //****************** uncomment to local run

  val baseUrl = "http://host.docker.internal:1080/pets"
  val userCount = 1
  val rampUpUsersCount = 1
  val repeatScenario = 1
  val repeatAPIHits = 1

  //****************** uncomment to local run

  val UuidFeeder = Iterator.continually(Map("uuid" -> UUID.randomUUID.toString))

  val httpProtocol = http
    .baseUrl(baseUrl)
    .acceptHeader("application/json")
    .acceptLanguageHeader("en;q=1.0,de-AT;q=0.9")
    .acceptEncodingHeader("gzip;q=1.0,compress;q=0.5")
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36")

}
