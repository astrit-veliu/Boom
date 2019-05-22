# Boom ⭐
![license](https://img.shields.io/badge/license-MIT%20License-blue.svg)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/fdcf022a3ffc4f8bb643f06a657c7604)](https://app.codacy.com/app/astrit-veliu/Boom?utm_source=github.com&utm_medium=referral&utm_content=astrit-veliu/Boom&utm_campaign=Badge_Grade_Dashboard)
[![API](https://img.shields.io/badge/API-16%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=16) <br>

A lightweight library written in Kotlin to implement elastic touch effect in your project.

![gif0](https://user-images.githubusercontent.com/16231428/58156715-06e2f380-7c77-11e9-8c33-e51b93c4cb6f.gif)

## Including in your project
[![](https://jitpack.io/v/astrit-veliu/Boom.svg)](https://jitpack.io/#astrit-veliu/Boom)

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
   implementation 'com.github.astrit-veliu:Boom:1.0'
}
```

## Usage
`Boom` is really easy to use and gives to your Views a beautiful touch effect.

### Kotlin
Some of material widgets needs to be casted to View, otherwise it will show `Type mismatch` warning.
```kotlin
  Boom(txt_header)
  Boom(material_text_button as View)
```
### Java
After views are binded simply pass the name of widget to Boom constructor. 
```java
  new Boom(txt_header);
  new Boom(material_text_button);
```

## Supports ❤
Feel free to give your support by contributing to this library. <br><br>

# License
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
