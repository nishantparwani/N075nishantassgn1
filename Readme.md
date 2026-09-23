# N075nishantassgn1

## Gemini Jetpack Compose Chat Application

**Student:** Nishant Parwani  
**Roll No.:** N075  
**Program:** MBA Tech Computer Engineering  
**Application ID:** `com.example.n075nishantassgn1`

---

## 1. Project Overview

This project is a Gemini-powered Android chat application developed using Kotlin and Jetpack Compose.

The application allows users to:

- Send text prompts to Gemini.
- Receive Gemini-generated responses.
- View conversations using Material 3 chat bubbles.
- Use voice input through Android Speech Recognition.
- Automatically scroll to the latest message.
- Display a loading indicator while Gemini is processing.
- Display errors using Snackbar.
- Store chat history locally using Room Database.
- Persist user preferences using Preferences DataStore.
- Support dark mode.
- Adapt the interface for different screen sizes.
- Test the ViewModel using a fake Gemini repository.
- Test Compose UI components using Compose UI testing.

---

## 2. Technologies Used

- Kotlin
- Android Studio
- Jetpack Compose
- Material 3
- Firebase AI Logic
- Gemini
- Room Database
- Preferences DataStore
- Android Keystore
- AES-256-GCM encryption
- Kotlin Coroutines
- StateFlow
- Lifecycle Compose
- Compose UI Testing
- JUnit
- Gradle

---

## 3. Gemini Integration

The application uses Firebase AI Logic to communicate with Gemini.

The Gemini model is initialized using the Firebase AI Logic Google AI backend.

Firebase configuration is provided through:

```text
google-services.json