package com.example.n075nishantassgn1.data

import com.google.firebase.Firebase
import com.google.firebase.ai.ai
import com.google.firebase.ai.type.GenerativeBackend

interface GeminiRepository {
    suspend fun sendMessage(message: String): String
}

class FirebaseGeminiRepository : GeminiRepository {

    private val model = Firebase.ai(
        backend = GenerativeBackend.googleAI()
    ).generativeModel("gemini-3.8-flash")

    override suspend fun sendMessage(message: String): String {
        return try {
            val response = model.generateContent(message)
            response.text ?: "No response received."
        } catch (e: Exception) {
            "Error: ${e.message}"
        }
    }
}