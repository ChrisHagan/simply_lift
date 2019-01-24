name := "Simply Lift Chat Application"

version := "0.3"

organization := "net.liftweb"

scalaVersion := "2.12.4"

resolvers ++= Seq("snapshots"     at "http://oss.sonatype.org/content/repositories/snapshots",
  "releases"        at "http://oss.sonatype.org/content/repositories/releases"
)

enablePlugins(JettyPlugin)

scalacOptions ++= Seq("-deprecation", "-unchecked")

libraryDependencies ++= {
  val liftVersion = "3.3.0"
  Seq(
    "net.liftweb"       %% "lift-webkit"        % liftVersion        % "compile",
    "org.eclipse.jetty"     % "jetty-webapp"             % "9.4.11.v20180605",
    "ch.qos.logback"        % "logback-classic"          % "1.2.3"
  )
}
