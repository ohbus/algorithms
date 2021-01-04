# Algorithms

![Algorithms CI](https://github.com/ohbus/Algorithms/workflows/Algorithms%20CI/badge.svg)

<!-- ALL-CONTRIBUTORS-BADGE:START - Do not remove or modify this section -->
[![All Contributors](https://img.shields.io/badge/all_contributors-3-orange.svg?style=flat-square)](#contributors-)
<!-- ALL-CONTRIBUTORS-BADGE:END -->


**Algorithms using Java built with :heart: using Maven**

## [Contributing](https://github.com/ohbus/algorithms/blob/master/CONTRIBUTING.md)

This repository is contribution friendly. If you'd like to add or improve an algorithm, your contribution is welcome!

Please go through this comprehensive guide to setup the repository in your local enviornment using [this guide CONTRIBUTING.md](https://github.com/ohbus/algorithms/blob/master/CONTRIBUTING.md#contributing-to-algorithms).

If you're an algorithms enthusiast and want to add or improve an algorithm your contribution is welcome! Please be sure to include tests

```zsh
➜  algorithms git:(master) ./mvnw verify
```
### Adding a new algorithm
#### The procedure to add a new algorithm or snippet of code is:

1. If there doesn't already exist an issue, then file a new issue explaining the algorithm/change you want to do.
2. Make sure the algorithm doesn't already exist! We don't want duplicate algorithms.
3. Identify the category folder your algorithm belongs to. For example, a sorting snippet would belong to the `src/main/java/xyz/subho/algorithms/sort` folder. You may also create a new **category** folder if appropriate.
4. Add the algorithm implementation to: `src/main/java/xyz/subho/algorithms/category/FooAlgorithm.java`
5. Add tests for FooAlgorithm in: `src/test/java/xyz/subho/algorithms/category/FooAlgorithmTest.java`
6. Test your algorithm thoroughly.
7. Run **`./mvnw spotless:apply`** to format all Java code according to Google Style Guide.
8. Send pull request for review.

## Running an algorithm implementation

To compile and run any of the algorithms here, you need at least JDK version 11. Maven can make things more convenient for you, but it is not required.

## Running with Maven (recommended)

This project supports the [Maven Wrapper](http://maven.apache.org/plugins/maven-wrapper-plugin/wrapper-mojo.html). The Maven wrapper automatically downloads dependecies at the first time it runs, so expect a delay when running the first command below.

If you are on Windows, use `mvnw` instead of `./mvnw` below.

Run a single algorithm like this:

```zsh
./mvnw compile exec:java -Dexec.mainClass="<algorithm-subpackage>.<algorithm-class>"
```

For instance:

```zsh
./mvnw compile exec:java -Dexec.mainClass="xyz.subho.algorithms.sort.QuickSort"
```

## Compiling and running with only a JDK

### Create a classes folder

```zsh
cd algorithms
mkdir classes
```

### Compile the algorithm

```zsh
javac -sourcepath src/main/java -d classes src/main/java/ <relative-path-to-java-source-file>
```

### Run the algorithm

```zsh
java -cp classes <class-fully-qualified-name>
```

## Contributors ✨

Thanks goes to these wonderful people ([emoji key](https://allcontributors.org/docs/en/emoji-key)):

<!-- ALL-CONTRIBUTORS-LIST:START - Do not remove or modify this section -->
<!-- prettier-ignore-start -->
<!-- markdownlint-disable -->
<table>
  <tr>
    <td align="center"><a href="http://subho.xyz"><img src="https://avatars0.githubusercontent.com/u/13291222?v=4?s=100" width="100px;" alt=""/><br /><sub><b>Subhrodip Mohanta</b></sub></a><br /><a href="#projectManagement-ohbus" title="Project Management">📆</a> <a href="#maintenance-ohbus" title="Maintenance">🚧</a></td>
    <td align="center"><a href="https://github.com/Souph"><img src="https://avatars3.githubusercontent.com/u/51859712?v=4?s=100" width="100px;" alt=""/><br /><sub><b>Souptik Hari</b></sub></a><br /><a href="https://github.com/ohbus/algorithms/commits?author=Souph" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/deepsubha"><img src="https://avatars3.githubusercontent.com/u/35770307?v=4?s=100" width="100px;" alt=""/><br /><sub><b>SUBHADEEP MAITI</b></sub></a><br /><a href="https://github.com/ohbus/algorithms/commits?author=deepsubha" title="Code">💻</a></td>
  </tr>
</table>

<!-- markdownlint-restore -->
<!-- prettier-ignore-end -->

<!-- ALL-CONTRIBUTORS-LIST:END -->

This project follows the [all-contributors](https://github.com/all-contributors/all-contributors) specification. Contributions of any kind welcome!
