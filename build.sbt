name := "spark-definitive-scala"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  //  "org.apache.spark" % "spark-core_2.10" % "2.2.3",
  //  "org.apache.spark" % "spark-sql_2.10" % "2.2.3",
  //  "org.apache.spark" % "spark-mllib_2.10" % "2.2.3"
  "org.apache.spark"  %%  "spark-core"    % "2.3.0"   % "provided",
  "org.apache.spark"  %%  "spark-sql"     % "2.3.0",
  "org.apache.spark"  %%  "spark-mllib"   % "2.3.0",
  "org.xerial" % "sqlite-jdbc" % "3.31.1"

  //  "org.apache.spark" % "spark-core_2.10" % "2.0.2",
  //  "org.apache.spark" % "spark-sql_2.10" % "2.0.2",
  //  "org.apache.spark" % "spark-streaming_2.10" % "2.0.2",
  //  "org.apache.spark" % "spark-yarn_2.10" % "2.0.2"

)

