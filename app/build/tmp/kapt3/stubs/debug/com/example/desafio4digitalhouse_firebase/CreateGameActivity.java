package com.example.desafio4digitalhouse_firebase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\"\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0012\u0010 \u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\b\u0010#\u001a\u00020\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082D\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006$"}, d2 = {"Lcom/example/desafio4digitalhouse_firebase/CreateGameActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/desafio4digitalhouse_firebase/databinding/ActivityCreateGameBinding;", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "getFirebaseAuth", "()Lcom/google/firebase/auth/FirebaseAuth;", "firebaseAuth$delegate", "Lkotlin/Lazy;", "firebaseFirestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "getFirebaseFirestore", "()Lcom/google/firebase/firestore/FirebaseFirestore;", "firebaseFirestore$delegate", "imageUri", "Landroid/net/Uri;", "pickImage", "", "storageRef", "Lcom/google/firebase/storage/StorageReference;", "getStorageRef", "()Lcom/google/firebase/storage/StorageReference;", "storageRef$delegate", "loadPhoto", "", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupObservables", "app_debug"})
public final class CreateGameActivity extends androidx.appcompat.app.AppCompatActivity {
    private final int pickImage = 100;
    private android.net.Uri imageUri;
    private com.example.desafio4digitalhouse_firebase.databinding.ActivityCreateGameBinding binding;
    private final kotlin.Lazy firebaseFirestore$delegate = null;
    private final kotlin.Lazy firebaseAuth$delegate = null;
    private final kotlin.Lazy storageRef$delegate = null;
    
    private final com.google.firebase.firestore.FirebaseFirestore getFirebaseFirestore() {
        return null;
    }
    
    private final com.google.firebase.auth.FirebaseAuth getFirebaseAuth() {
        return null;
    }
    
    private final com.google.firebase.storage.StorageReference getStorageRef() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupObservables() {
    }
    
    private final void loadPhoto() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public CreateGameActivity() {
        super();
    }
}