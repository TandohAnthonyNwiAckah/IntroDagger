# IntroDagger
An introduction to Dagger in Android.


>Dagger is a fully static, compile-time dependency injection framework for both Java and Android.

>Dagger is a compile-time framework for dependency injection which generates a lot of boilerplate for us.

>It uses no reflection or runtime bytecode generation, 
does all its analysis at compile-time, and generates plain Java source code.






## Installation

#### Gradle
```groovy
// Add Dagger dependencies
dependencies {
  api 'com.google.dagger:dagger:2.x'
  annotationProcessor 'com.google.dagger:dagger-compiler:2.x'
}
```

If you're using classes in `dagger.android` you'll also want to include:

```groovy
api 'com.google.dagger:dagger-android:2.x'
api 'com.google.dagger:dagger-android-support:2.x' // if you use the support libraries
annotationProcessor 'com.google.dagger:dagger-android-processor:2.x'
```

Notes:

-   Some projects will want to use `implementation` instead of `api` for better
    compilation performance.
    -   See the [Gradle documentation][gradle-api-implementation] for more
        information on how to select appropriately, and the [Android Gradle
        plugin documentation][gradle-api-implementation-android] for Android
        projects.
-   For Kotlin projects, use [`kapt`] in place of `annotationProcessor`.

If you're using the [Android Databinding library][databinding], you may want to
increase the number of errors that `javac` will print. When Dagger prints an
error, databinding compilation will halt and sometimes print more than 100
errors, which is the default amount for `javac`. For more information, see
[Issue 306](https://github.com/google/dagger/issues/306).

```groovy
gradle.projectsEvaluated {
  tasks.withType(JavaCompile) {
    options.compilerArgs << "-Xmaxerrs" << "500" // or whatever number you want
  }
}
```

### Resources

*   [Documentation][website]
*   [Javadocs][latestapi]
*   [GitHub Issues]




[website]: https://dagger.dev

[latestapi]: https://dagger.dev/api/latest/

[GitHub Issues]: https://github.com/google/dagger/issues


