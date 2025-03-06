name := "dfdl-ibm_smf"

organization := "io.github.dfdlschemas.ibm_smf"

version := "0.1.0-SNAPSHOT"

// if you need a specific version of Daffodil, you can uncomment and edit
// this line to refer to a specific daffodil version.
// daffodilVersion := "00.00.0"

// for details about DaffodilPlugin settings, see https://github.com/apache/daffodil-sbt
enablePlugins(DaffodilPlugin)

daffodilFlatLayout := true
