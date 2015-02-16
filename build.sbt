scalaVersion := "2.11.4"

libraryDependencies ++= Seq(
  "com.twitter" %% "scrooge-core" % "3.17.0",
  "org.apache.thrift" % "libthrift" % "0.9.2"
)

com.twitter.scrooge.ScroogeSBT.newSettings

scroogeThriftSourceFolder in Compile := baseDirectory.value

