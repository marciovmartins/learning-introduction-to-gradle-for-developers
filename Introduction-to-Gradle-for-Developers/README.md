<!--suppress HtmlUnknownAnchorTarget -->

# Learning "Introduction to Gradle for Java Developers"

<a href="https://gradle.org/" title="Go to gradle.org website"><img alt="Gradle icon" src="../docs/assets/gradle.svg" width="25"/></a>

<h2 id="table-of-contents">⤴️ Table of Contents</h2>

<ul>
  <li>❓ <a href="#about" title="Go to about section">About</a></li>
  <li>
     📝 <a href="#notes" title="Go to notes section">Notes</a>
    <ul>
      <li><a href="#plugins-and-tasks" title="Go to plugins and tasks section">Plugins and Tasks</a></li>
      <li><a href="#dependency-management" title="Go to dependency management section">Dependency Management</a></li>
    </ul>
  </li>
  <li>📖 <a href="#references" title="Go to about references section">References</a></li>
</ul>

<h2 id="about">❓ About</h2>

Hands-on training for Java developers to learn about Gradle with the course
at <a href="https://dpeuniversity.gradle.com/app/courses/012de84f-fcd3-45d4-9c4c-284382eb3f3f" title="Go to the course page">
dpeuniversity.gradle.com</a>.

<a href="#table-of-contents" title="Go to table of contents">Back to Top</a>

<h2 id="notes">📝 Notes</h2>

<h3 id="plugins-and-tasks">Plugins and Tasks</h3>

It is possible to configure Gradle build environment defining Gradle properties in a `gradle.properties` file in
different locations with different precedences.

The instructor suggests running more specific tasks.

Lifecycle tasks are group of tasks without actions or outputs. They mostly contain a group of pre-requisite tasks.

Useful commands:

```shell
# list all tasks
./gradlew tasks --all

# compile a task in the root project
./gradlew compileJava

# compile a task specifically for a [sub]project.
./gradlew :app:compileJava

# list all dependencies
./gradlew :app:dependencies
```

Useful links:

- https://docs.gradle.org/current/userguide/build_environment.html
- https://docs.gradle.org/current/userguide/java_plugin.html#java_plugin
- https://docs.gradle.org/current/dsl/org.gradle.api.tasks.compile.JavaCompile.html
- https://docs.gradle.org/current/dsl/org.gradle.api.tasks.compile.CompileOptions.html
- https://plugins.gradle.org

<a href="#table-of-contents" title="Go to table of contents">Back to Top</a>

<h3 id="dependency-management">Dependency Management</h3>

The common types are `implementation`, `api`, `compileOnly`, `runtimeOnly`. And for tests are `testImplementation`,
`testCompileOnly`, `testRuntimeOnly`.

The `api` is for public APIs and the `implementation` is for internal projects.

When defined an `api`, the dependencies appear in the `compileClasspath` and `runtimeClasspath` configurations. While
that the `implementation` dependencies appear only in the `runtimeClasspath`.

The dependency version can be defined as follows:

- a regular version means "at least" that version. E.g.: implementation("groupId:moduleId:2.4")
  - the version 2.4 or newer will be used in case another dependency is using a newer version.
  - Gradle will use the latest found version.
- use "!!" to be explict about the version. E.g.: implementation("groupId:moduleId:version!!")
- use "+" to use the newest version existing. E.g.: implementation("groupId:moduleId:2.+")
  - Gradle will look for the newest version in "2.x".

There is a version catalogue that can be defined in `gradle/libs.version.toml`. There it is defined `versions`, `libs`, `bundles` and `plugins` that are available in build.gradle.kts.

Useful commands:

```shell
./gradlew :app:dependencies --configuration=runtimeClasspath
```

Useful links:

- https://plugins.gradle.org/plugin/com.autonomousapps.dependency-analysis

<a href="#table-of-contents" title="Go to table of contents">Back to Top</a>

<h2 id="references">📖 References</h2>

<ul>
  <li>
    <a href="https://simpleicons.org/" title="Go to simpleicons.org website">Fonts icon</a>
  </li>
</ul>

<a href="#table-of-contents" title="Go to table of contents">Back to Top</a>