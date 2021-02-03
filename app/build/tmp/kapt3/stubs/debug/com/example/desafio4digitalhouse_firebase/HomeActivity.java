package com.example.desafio4digitalhouse_firebase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\b\u0010%\u001a\u00020\"H\u0014J\u0014\u0010&\u001a\u00020\"2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001b\u0010\u001cR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018\u00a8\u0006("}, d2 = {"Lcom/example/desafio4digitalhouse_firebase/HomeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/desafio4digitalhouse_firebase/databinding/ActivityHomeBinding;", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "getFirebaseAuth", "()Lcom/google/firebase/auth/FirebaseAuth;", "firebaseAuth$delegate", "Lkotlin/Lazy;", "firebaseFirestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "getFirebaseFirestore", "()Lcom/google/firebase/firestore/FirebaseFirestore;", "firebaseFirestore$delegate", "gamesRepo", "Lcom/example/desafio4digitalhouse_firebase/GamesRepository;", "listGames", "", "Lcom/example/desafio4digitalhouse_firebase/GamesFirestore;", "getListGames", "()Ljava/util/List;", "setListGames", "(Ljava/util/List;)V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView$delegate", "userGames", "getUserGames", "setUserGames", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "populateRecycler", "query", "app_debug"})
public final class HomeActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.desafio4digitalhouse_firebase.databinding.ActivityHomeBinding binding;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.desafio4digitalhouse_firebase.GamesFirestore> userGames;
    private final com.example.desafio4digitalhouse_firebase.GamesRepository gamesRepo = null;
    private final kotlin.Lazy recyclerView$delegate = null;
    private final kotlin.Lazy firebaseAuth$delegate = null;
    private final kotlin.Lazy firebaseFirestore$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.desafio4digitalhouse_firebase.GamesFirestore> listGames;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.desafio4digitalhouse_firebase.GamesFirestore> getUserGames() {
        return null;
    }
    
    public final void setUserGames(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.desafio4digitalhouse_firebase.GamesFirestore> p0) {
    }
    
    private final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return null;
    }
    
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
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public final void populateRecycler(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.desafio4digitalhouse_firebase.GamesFirestore> query) {
    }
    
    public HomeActivity() {
        super();
    }
}