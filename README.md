# Zarino - Persian Android App

![Platform](https://img.shields.io/badge/platform-Android-green)
![Language](https://img.shields.io/badge/language-Kotlin-blue)
![UI](https://img.shields.io/badge/UI-Jetpack%20Compose-orange)
![License](https://img.shields.io/badge/license-MIT-blue)

Zarino is a Persian-based Android application built with Kotlin, Jetpack Compose, and Material Design. The app features a fixed layout size that works consistently across all mobile devices, with full RTL (Right-to-Left) support for the Persian language.

## Features

- 🇮🇷 **Fully Persian localized** - All UI elements and content in Persian
- 📱 **Fixed layout design** - Consistent appearance across all device sizes
- 🎨 **Material Design** - Modern UI with Material Design components
- 🖋️ **Custom Persian fonts** - Uses Vazirmatn font family for authentic Persian typography
- ⚡ **Jetpack Compose** - Built with modern Android UI toolkit
- 🔤 **RTL Support** - Fully optimized for Right-to-Left reading languages

## Architecture

The app follows a modern Android architecture with:
- **Jetpack Compose** for UI development
- **MVVM** pattern for separation of concerns
- **Material Design 3** for consistent UI components
- **Single Activity** architecture with Compose navigation

## Tech Stack

- **Kotlin** - Primary programming language
- **Jetpack Compose** - Modern toolkit for building native UI
- **Material Design 3** - UI component system
- **Vazirmatn Font** - Persian font family
- **Android SDK 36** - Target API level

## App Structure

The app consists of 5 main screens accessible through a bottom navigation bar:
1. Home (`خانه`)
2. Search (`جستجو`)
3. Favorites (`مورد علاقه`)
4. Profile (`پروفایل`)
5. Settings (`تنظیمات`)

## Getting Started

### Prerequisites

- Android Studio Ladybug or newer
- Kotlin 1.9+
- Android SDK 36

### Building the App

1. Clone the repository:
   ```bash
   git clone https://github.com/code3-dev/Android-Base.git
   ```

2. Open the project in Android Studio

3. Build the project:
   ```bash
   ./gradlew assembleDebug
   ```

4. Install on device:
   ```bash
   adb install app/build/outputs/apk/debug/app-debug.apk
   ```

### Key Configurations

- Forces Persian locale (`fa`) as the default language
- RTL layout direction enforced
- Fixed sizing for consistent UI across devices
- Custom font family integration

## Localization

The app is fully localized in Persian (Farsi) with all strings stored in `res/values-fa/strings.xml`. The app forces Persian locale regardless of system settings.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- [Vazirmatn Font](https://github.com/rastikerdar/vazirmatn) - Persian font family
- [Jetpack Compose](https://developer.android.com/jetpack/compose) - Android's modern toolkit for building native UI
- [Material Design](https://m3.material.io/) - Google's design system