<!--suppress HtmlUnknownAnchorTarget -->

# Learning "Introduction to Gradle for Java Developers"

<a href="https://gradle.org/" title="Go to gradle.org website"><img alt="Gradle icon" src="./docs/assets/gradle.svg" width="25"/></a>

<h2 id="table-of-contents">⤴️ Table of Contents</h2>

<ul>
  <li>❓ <a href="#about" title="Go to about section">About</a></li>
  <li>
     📝 <a href="#notes" title="Go to about notes section">Notes</a>
    <ul>
      <li><a href="#plugins-and-tasks" title="Go to about plugins and tasks section">Plugins and Tasks</a></li>
      <li><a href="#configuring-task-properties" title="Go to about configuring task properties section">Configuring Task Properties</a></li>
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

Useful links:

- https://docs.gradle.org/current/userguide/build_environment.html

Useful commands:

```shell
# list all tasks
./gradlew tasks --all

# compile a task in the root project
./gradlew compileJava

# compile a task specifically for a [sub]project.
./gradlew :app:compileJava
```

The instructor suggests running more specific tasks.

<a href="#table-of-contents" title="Go to table of contents">Back to Top</a>

<h3 id="configuring-task-properties">Configuring Task Properties</h3>

Lifecycle tasks are group of tasks without actions or outputs. They contain mostly a group of pre-requisite tasks.

Useful links:

- https://docs.gradle.org/current/userguide/java_plugin.html#java_plugin
- https://docs.gradle.org/current/dsl/org.gradle.api.tasks.compile.JavaCompile.html
- https://docs.gradle.org/current/dsl/org.gradle.api.tasks.compile.CompileOptions.html

<a href="#table-of-contents" title="Go to table of contents">Back to Top</a>

<h2 id="references">📖 References</h2>

<ul>
  <li>
    <a href="https://simpleicons.org/" title="Go to simpleicons.org website">Fonts icon</a>
  </li>
</ul>

<a href="#table-of-contents" title="Go to table of contents">Back to Top</a>