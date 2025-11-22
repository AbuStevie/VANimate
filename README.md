# VANimate – Simple Plug-and-Play Android View Animations  
## 📦 VANimate – ספריית אנימציות פשוטה וקומפקטית ל־Android  
##  התקנה ואופן שימוש בעברית - מתחת לאנגלית

---

# 🎬 Animation Previews  
![Shake](VANimate/src/main/res/drawable/shakegif.gif)  
![Twinkle](VANimate/src/main/res/drawable/twinklegif.gif)  
![Zigzag](VANimate/src/main/res/drawable/zigzaggif.gif)  
![Flicker](VANimate/src/main/res/drawable/flickergif.gif)

---

# ✨ Features  
VANimate provides quick, lightweight animations for any Android `View`.

- Shake  
- Twinkle  
- Flicker  
- Zigzag  
- Zero configuration  
- Pure Java  
- API 26+  

---

# 🏷️ JitPack Badge  
Add this badge (optional but recommended):  

[![](https://jitpack.io/v/AbuStevie/VANimate.svg)](https://jitpack.io/#AbuStevie/VANimate)

---

# English Documentation

## ✨ Installation  

### 1. Edit `settings.gradle` *(project level)*  
_Add JitPack repository_  

```gradle
dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()
        maven { url 'https://jitpack.io' }
    }
}
```

### 2. Edit `build.gradle` *(app module)*  
_Add library dependency_  

```gradle
dependencies {
    implementation 'com.github.AbuStevie:VANimate:v1.1'
}
```

---

## ✨ Usage Example  

```java
import abustevie.animations.VANimate;

VANimate.shake(imageView);
VANimate.flicker(button);
VANimate.zigzag(textView);
VANimate.twinkle(anyViewObject);
```

### Custom parameters
```java
VANimate.shake(myView, angle, times, duration);
VANimate.flicker(myView, depth, times, duration);
VANimate.zigzag(myView, depth, times, duration);
VANimate.twinkle(myView, depth, times, duration);
```


---

# 🇮🇱 תיעוד בעברית  

## IL ✨ פיצ'רים  

- A רעידה  
- B נצנוץ  
- C הבהוב  
- D זיגזג  
- E בלי הגדרות  
- Java טהור  
- API 26+  

---

## INSTALL ✨ התקנה  

### a1. עריכת `settings.gradle` *(קובץ פרויקט)*  
b_להוסיף את מאגר JitPack_  

```gradle
dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()
        maven { url 'https://jitpack.io' }
    }
}
```

### b2. עריכת `build.gradle` *(קובץ מודול)*  
b_להוסיף תלות_  

```gradle
dependencies {
    implementation 'com.github.AbuStevie:VANimate:v1.1'
}
```

---

## C ✨ דוגמת שימוש  

```java
import abustevie.animations.VANimate;

VANimate.shake(imageView);
VANimate.flicker(textView);
VANimate.zigzag(button);
VANimate.twinkle(anyViewObject);
```

###a פרמטרים מותאמים אישית
```java
VANimate.shake(myView, angle, times, duration);
VANimate.flicker(myView, depth, times, duration);
VANimate.zigzag(myView, depth, times, duration);
VANimate.twinkle(myView, depth, times, duration);
```

---

# ❤️ Author  
**AbuStevie (Ofir Vander)**  

# ✔️ License  
MIT License

