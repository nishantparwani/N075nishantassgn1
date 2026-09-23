package com.example.n075nishantassgn1.data

import com.example.n075nishantassgn1.BuildConfig
import com.google.ai.client.generativeai.GenerativeModel
import com.google.firebase.Firebase
import com.google.firebase.ai.ai
import com.google.firebase.ai.type.GenerativeBackend

interface GeminiRepository {
    suspend fun sendMessage(message: String): String
}

class FirebaseGeminiRepository(
    private val apiKey: String = BuildConfig.GEMINI_API_KEY
) : GeminiRepository {

    private val firebaseModel = try {
        Firebase.ai(backend = GenerativeBackend.googleAI()).generativeModel("gemini-2.5-flash")
    } catch (_: Exception) {
        null
    }

    private val directModel by lazy {
        GenerativeModel(
            modelName = "gemini-2.5-flash",
            apiKey = apiKey
        )
    }

    override suspend fun sendMessage(message: String): String {
        if (firebaseModel != null) {
            try {
                val response = firebaseModel.generateContent(message)
                val text = response.text
                if (!text.isNullOrBlank()) return text
            } catch (_: Exception) {
                // Seamlessly fall back to Google Generative AI client if Firebase App Check token is not yet registered
            }
        }

        return try {
            val response = directModel.generateContent(message)
            response.text ?: "No response received."
        } catch (e: Exception) {
            "Error: ${e.message}"
        }
    }
}