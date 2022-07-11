import java.io.{FileWriter, PrintWriter, File}

import io.gatling.core.Predef._
import scala.concurrent.duration.DurationInt

class SingleUserPerfTests extends Simulation {

  val repeatScenario = Config.repeatScenario;
  val userCount = Config.userCount;

  before {
    println("Single User performance tests Simulations")
  }

   val scnTests = scenario("Performance Test for local run").repeat(repeatScenario) 
    { 
      exec(SingleUserPerfTestManager.GetAllPetAPIPerformance()) 
        .exec(SingleUserPerfTestManager.GetAPetAPIPerformance())
    }  
   


  setUp(
    scnTests.inject(
      nothingFor(1 seconds),
      atOnceUsers(userCount),
      constantUsersPerSec(1).during(2.minutes)
  ).protocols(Config.httpProtocol)
  )

  after {
    println("Single User Performance Simulations is finished!")
  }
}