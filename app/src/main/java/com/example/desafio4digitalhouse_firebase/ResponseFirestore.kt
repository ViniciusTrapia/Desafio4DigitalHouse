package com.example.desafio4digitalhouse_firebase

sealed class ResponseFirestore {
    class Sucess(val data: Any?) : ResponseFirestore()
    class Error(val message: String) : ResponseFirestore()
}