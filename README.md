# VANimate – Simple Plug-and-Play Android View Animations  
## 📦 VANimate – ספריית אנימציות פשוטה וקומפקטית ל־Android  
## IL התקנה ואופן שימוש בעברית - מתחת לאנגלית

---

# 🎬 Animation Previews  
<table>
  <tr>
    <td><img src="GIFs/shakegif.gif" width="180"/></td>
    <td><img src="GIFs/twinklegif.gif" width="180"/></td>
  </tr>
  <tr>
    <td><img src="GIFs/zigzahgif.gif" width="180"/></td>
    <td><img src="GIFs/flickergif.gif" width="180"/></td>
  </tr>
</table>

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
VANimate.zigzag(myView, range, times, duration);
VANimate.twinkle(myView, depth, times, duration);
```
### Parameter Reference (applies to all animations)

- **duration** — animation duration in milliseconds.  
  Type: `int`, must be `> 0`.

- **times** — number of animation iterations (recursion depth).  
  Type: `int`, must be `> 0`.

- **angle** — rotation range for shake animation.  
  Type: `int`, must be `> 0`.

- **depth** — effect intensity (alpha or scale),  
  Type: `float`, range `0 < depth < 1`.

- **range** — translation range (used in zigzag), in pixels.  
  Type: `int`, must be `> 0`.


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
VANimate.zigzag(myView, range, times, duration);
VANimate.twinkle(myView, depth, times, duration);
```

###a מדריך לפרמטרים (כללי לכל האנימציות)

- **duration** — משך האנימציה במילישניות.  
 d סוג: `int`, חייב להיות `> 0`.

- **times** — מספר החזרות של האנימציה (רקורסיות).  
t סוג: `int`, חייב להיות `> 0`.

- **angle** — טווח סיבוב לאנימציית רעידה.  
 a סוג: `int`, חייב להיות `> 0`.

- **depth** — עוצמת האפקט (שקיפות/קנה מידה).  
 d סוג: `float`, בטווח `0 < depth < 1`.

- **range** — טווח תזוזה בפיקסלים (ב־zigzag).  
 r סוג: `int`, חייב להיות `> 0`.


---

# ❤️ Author  
**AbuStevie (Ofir Vander)**  

# ✔️ License  
MIT License

