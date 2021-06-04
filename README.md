
<img src="https://user-images.githubusercontent.com/16231428/59336971-e0592b00-8cff-11e9-89fd-145293c40c81.png">

<img align="left" src="https://user-images.githubusercontent.com/16231428/58156715-06e2f380-7c77-11e9-8c33-e51b93c4cb6f.gif" width="260" height="460" /></a>
<a href="https://github.com/astrit-veliu/Boom">

<p><h1 align="left">Boom ⭐</h1></p>

<h4>A lightweight library written in Kotlin to implement elastic touch effect in your project.</h4>

___

## Supports ❤
<p><h6>Feel free to give your support by contributing to this library. Buy me a beer!</h6>
<a href="https://paypal.me/AstritVeliu" >
<img src="https://img.shields.io/badge/Donate-PayPal-blue.svg" width="130" height="22"></a>
</p>
<p><h6>Follow me on Github for upcoming repositories:</h6>
<a href="https://github.com/astrit-veliu" >
<img src="https://user-images.githubusercontent.com/16231428/59339358-5069b000-8d04-11e9-9584-795700af65a0.PNG" width="140" height="32"></a></p>
</br>

![license](https://img.shields.io/badge/license-MIT%20License-blue.svg)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/fdcf022a3ffc4f8bb643f06a657c7604)](https://app.codacy.com/app/astrit-veliu/Boom?utm_source=github.com&utm_medium=referral&utm_content=astrit-veliu/Boom&utm_campaign=Badge_Grade_Dashboard)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Boom-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/7684)
[![CircleCI](https://circleci.com/gh/astrit-veliu/Boom.svg?style=svg)](https://circleci.com/gh/astrit-veliu/Boom)
[![](https://jitpack.io/v/astrit-veliu/Boom.svg)](https://jitpack.io/#astrit-veliu/Boom)
<br>

## Installation

### build.gradle

Add `jitpack` maven in your root build.gradle at the end of repositories:
```gradle
allprojects {
  repositories {
   ...
   maven { url 'https://jitpack.io' }
  }
 }
```

Add the dependency to your app `build.gradle` file (not your project build.gradle file).
```gradle
dependencies {
   implementation 'com.github.astrit-veliu:Boom:1.1'
}
```

### Changelog
- fixed UI issue while keeping the view pressed and going outside the bound of view
- updated libs and code cleanup
- now you can use BoomUtils to add/remove effect on a view, or you can apply it to multiple views by calling only one function
- applying **Boom** effect with ripple (optional)

> **Note:** The **Version 1.1** has better support for Kotlin, you can use the full potential of **Boom** library with extension functions.
​

## Usage
`Boom` is really easy to use and gives to your Views a beautiful touch effect.

### Kotlin
In case you get a `Type mismatch` warning when passing the view as param to constructor, it needs to be casted to View.
```kotlin
  Boom(txt_header)
  Boom(cardview as View)
  imgLauncher.boom(true) //ripple effect is optional, by default is set to false
  BoomUtils.boomAll(txtHeader, materialTextButton)

  materialTextButton.removeBoom()
```
### Java
After views are binded simply pass the name of widget to Boom constructor.
```java
  new Boom(txt_header);
  new Boom(material_text_button);
```

## 📄 License

Boom is released under the MIT license.
See [LICENSE](./LICENSE) for details.

```xml
MIT License

Copyright (c) 2019 Astrit Veliu

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```