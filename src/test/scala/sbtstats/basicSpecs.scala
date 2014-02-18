package sbtstats

import org.specs2.mutable._

trait basicSpecs extends SpecificationLike {
  "the most basic of tests" should {
    "verify booleans" in {
      true mustEqual true
    }
  }
}

object basicSpecs extends basicSpecs
