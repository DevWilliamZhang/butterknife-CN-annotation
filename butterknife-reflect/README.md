ButterKnife Reflect
===================

The `butterknife-reflect` artifact is an API-compatible replacement for `butterknife` which uses
100% reflection to fulfill field and method bindings for use during development.
butterknife-reflect 是与  butterknife api兼容的神器。它百分之百的使用反射实现绑定变量和方法

Er, what? Why would I want this?
我为甚这么做呢
--------------------------------

The normal `butterknife` artifact requires the use of `butterknife-compiler` as an annotation
processor for compile-time validation of your bindings and code generation for runtime performance.
This is a desirable feature for your CI and release builds, but it slows down iterative development.
By using `butterknife-reflect` for only your IDE builds, you have one less annotation processor
sitting between you and your running app. This is especially important for Kotlin-only or
Java/Kotlin mixed projects using KAPT. And if `butterknife-compiler` is your only annotation
processor for a module, using `butterknife-reflect` means that **zero** annotation processors run
during development.

之前 butterknife 需要使用 butterknife-compiler 配合来作为注解处理器，在编译时验证绑定的和生成运行时代码的。
这是CI和发行版构建所需要的特性，但是它会减慢迭代开发。
使用 butterknife-reflect 只用ide构建，在编译和运行之间就少了一个注解处理的过程，尤其在 Kotlin 或者 Kotlin和java混编使用kapt中，
如果 你只用了一个 butterknife-compiler的话  换成 butterknife-reflect ，意味着你的项目开发0注解处理器了。

Can I use this in production?
我能在生产环境使用他吗？
-----------------------------

No.
不能

Well technically you _can_, but don't. It's slow, inefficient, and lacks the level of validation
that normal Butter Knife usage provides.
虽然技术上是可以的，但是不要。它速度慢、效率低，而且缺乏常规ButterKnife使用所提供的验证级别。

Usage
使用方法
-----

Kotlin modules:
```groovy
dependencies {
  if (properties.containsKey('android.injected.invoked.from.ide')) {
    implementation 'com.jakewharton:butterknife-reflect:<version>'
  } else {
    implementation 'com.jakewharton:butterknife:<version>'
    kapt 'com.jakewharton:butterknife-compiler:<version>'
  }
}
```

Java modules:
```groovy
dependencies {
  if (properties.containsKey('android.injected.invoked.from.ide')) {
    implementation 'com.jakewharton:butterknife-reflect:<version>'
  } else {
    implementation 'com.jakewharton:butterknife:<version>'
    annotationProcessor 'com.jakewharton:butterknife-compiler:<version>'
  }
}
```

_(Replacing `<version>` with whatever version you are using.)_

If you have a dedicated variant for development you can skip the `if` check and simply add
`butterknife-reflect` to that variant and `butterknife`+`butterknife-compiler` for the regular
variants.

如果你已经声明了 开发过程和生产过程的不同变体，你可以跳过if 检查，开发过程用 `butterknife-reflect` ，生产环境用
`butterknife`+`butterknife-compiler`