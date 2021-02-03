package com.example.desafio4digitalhouse_firebase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/desafio4digitalhouse_firebase/ResponseFirestore;", "", "()V", "Error", "Sucess", "Lcom/example/desafio4digitalhouse_firebase/ResponseFirestore$Sucess;", "Lcom/example/desafio4digitalhouse_firebase/ResponseFirestore$Error;", "app_debug"})
public abstract class ResponseFirestore {
    
    private ResponseFirestore() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/desafio4digitalhouse_firebase/ResponseFirestore$Sucess;", "Lcom/example/desafio4digitalhouse_firebase/ResponseFirestore;", "data", "", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "app_debug"})
    public static final class Sucess extends com.example.desafio4digitalhouse_firebase.ResponseFirestore {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object data = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getData() {
            return null;
        }
        
        public Sucess(@org.jetbrains.annotations.Nullable()
        java.lang.Object data) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/desafio4digitalhouse_firebase/ResponseFirestore$Error;", "Lcom/example/desafio4digitalhouse_firebase/ResponseFirestore;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "app_debug"})
    public static final class Error extends com.example.desafio4digitalhouse_firebase.ResponseFirestore {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String message = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMessage() {
            return null;
        }
        
        public Error(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            super();
        }
    }
}