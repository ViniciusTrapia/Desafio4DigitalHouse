package com.example.desafio4digitalhouse_firebase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018J\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001c"}, d2 = {"Lcom/example/desafio4digitalhouse_firebase/GamesRepository;", "", "()V", "binding", "Lcom/example/desafio4digitalhouse_firebase/databinding/ActivityEditGameBinding;", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "getFirebaseAuth", "()Lcom/google/firebase/auth/FirebaseAuth;", "firebaseAuth$delegate", "Lkotlin/Lazy;", "firebaseFirestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "getFirebaseFirestore", "()Lcom/google/firebase/firestore/FirebaseFirestore;", "firebaseFirestore$delegate", "listGames", "", "Lcom/example/desafio4digitalhouse_firebase/GamesFirestore;", "getListGames", "()Ljava/util/List;", "setListGames", "(Ljava/util/List;)V", "getGames", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/firebase/firestore/QuerySnapshot;", "getUser", "Lcom/google/firebase/auth/FirebaseUser;", "app_debug"})
public final class GamesRepository {
    private final kotlin.Lazy firebaseAuth$delegate = null;
    private final kotlin.Lazy firebaseFirestore$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.desafio4digitalhouse_firebase.GamesFirestore> listGames;
    private com.example.desafio4digitalhouse_firebase.databinding.ActivityEditGameBinding binding;
    
    private final com.google.firebase.auth.FirebaseAuth getFirebaseAuth() {
        return null;
    }
    
    private final com.google.firebase.firestore.FirebaseFirestore getFirebaseFirestore() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.desafio4digitalhouse_firebase.GamesFirestore> getListGames() {
        return null;
    }
    
    public final void setListGames(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.desafio4digitalhouse_firebase.GamesFirestore> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.auth.FirebaseUser getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.tasks.Task<com.google.firebase.firestore.QuerySnapshot> getGames() {
        return null;
    }
    
    public GamesRepository() {
        super();
    }
}