# kotlin-examples
[![Open Source Love](https://badges.frapsoft.com/os/v2/open-source.svg?v=103)](https://github.com/ellerbrock/open-source-badge/)    

[![Build Status](https://travis-ci.org/Iurii-Dziuban/kotlin-examples.svg?branch=master)](https://travis-ci.org/Iurii-Dziuban/kotlin-examples)
[![Coverage Status](https://coveralls.io/repos/github/Iurii-Dziuban/spring-batch-sandbox/badge.svg?branch=master)](https://coveralls.io/github/Iurii-Dziuban/kotlin-examples?branch=master)
<a href="https://scan.coverity.com/projects/iurii-dziuban-kotlin-examples">
  <img alt="Coverity Scan Build Status"
       src="https://scan.coverity.com/projects/9961/badge.svg"/>
</a>
[![Dependency Status](https://www.versioneye.com/user/projects/57c6958b69d9490042f72f1b/badge.svg?style=flat-square)](https://www.versioneye.com/user/projects/57c6958b69d9490042f72f1b)
[![contributions welcome](https://img.shields.io/badge/contributions-welcome-brightgreen.svg?style=flat)](https://github.com/Iurii-Dziuban/kotlin-examples/issues)

A project that shows Kotlin language features that differ from java (https://kotlinlang.org/)

# Project structure
Each sub project follows the structure
Maven project that consists of the following parts:
- Kotlin main classes are under (`src/main/kotlin`) with different classes with kotlin features.
- Test extentions for executing tests (`src/test/kotlin`) that show kotlin features and run during the build

# Building project
`mvn clean package`

# Pom.xml
Libraries:
- kotlin

# Logging
Standard output is used

# Kotlin features
- `TopLevelFunction` function as first class citizen
- `ExtSimpleService` example of adding functionality (method) into existing class (problems can occur with separate compilation)
- `NullableNonNullableReturnTypeExample` example that shows nullable and notNullable types with `?` in the end
- `WhenExample` potentially more powerful instrument than java switch statement
- `Transaction` kotlin data POJO example. `data` notation generates equals and hashcode, costructor generation, `val` - readonly properties,  so only getters will be generated