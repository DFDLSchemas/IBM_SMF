package io.github.dfdlschemas.ibm_smf.ibm_smf

import org.apache.daffodil.junit.tdml.TdmlSuite
import org.apache.daffodil.junit.tdml.TdmlTests

import org.junit.Test

import org.apache.daffodil.tdml.Runner

object TestIbm_smf extends TdmlSuite {
  val tdmlResource = "/TestIbm_smf.tdml"
}

class TestIbm_smf extends TdmlTests {
  val tdmlSuite = TestIbm_smf

  @Test def ibm_smf_01 = test
}
