# kotlin-examples
[![Open Source Love](https://badges.frapsoft.com/os/v2/open-source.svg?v=103)](https://github.com/ellerbrock/open-source-badge/)    

[![Build Status](https://travis-ci.org/Iurii-Dziuban/kotlin-examples.svg?branch=master)](https://travis-ci.org/Iurii-Dziuban/kotlin-examples)
[![Coverage Status](https://coveralls.io/repos/github/Iurii-Dziuban/kotlin-examples/badge.svg?branch=master)](https://coveralls.io/github/Iurii-Dziuban/kotlin-examples?branch=master)
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

# Coverage
Coveralls and Cobertura are not good with generated code, so Delegates example with `ObservableValue` and `VarArgExample` were excluded from coverage.

# Kotlin features
- `TopLevelFunction` function as first class citizen
- `ExtSimpleService` example of adding functionality (method) into existing class (problems can occur with separate compilation)
- `FactorialTailRec` tail recursion example
- `NullableNonNullableReturnTypeExample` example that shows nullable and notNullable types with `?` in the end
- `WhenExample` potentially more powerful instrument than java switch statement
- `Transaction` kotlin data POJO example. `data` notation generates equals and hashcode, costructor generation, `val` - readonly properties,  so only getters will be generated
   destructing and equality declaration example
- `Dollar` shows 
     * Operator overrides.
     * Operator overloading
     * Equals and hashcode override_operators
     * Try/catch expression values
     * Copy value
     * Referential and structural equals
     * Destructuring object
     * Inlining by locking example // coverage tool does not cover inline functions
     * Infix function
     * Null check do
     * Closure
     * Dollar Range implementation
- `DollarProgression` progression implementation with internal visibility modifier to be visible inside module
- `VarArgExample` shows vararg parameters example
- `Delegation` example of Delegation pattern alternative to Inheritance
- `SealedExample` feature of closing functionality inside sealed class.
   Not possible to extend class hierarchy from outside. Plus companion object example, cause there is no static members
- `variance` examples of Producer/Consumer pattern to make safe casts and assignments
- `SpringExampleTest` integration with spring framework
- `ObservableTest` observable feature example (kind of value changed listener)
- `Mapping` mapping from Map to class fields example
