package com.example.desafio4digitalhouse_firebase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B+\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/desafio4digitalhouse_firebase/TesteAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/desafio4digitalhouse_firebase/TesteAdapter$TesteAdapterVH;", "gameList", "", "Lcom/example/desafio4digitalhouse_firebase/GamesFirestore;", "onItemClicked", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "TesteAdapterVH", "app_debug"})
public final class TesteAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.desafio4digitalhouse_firebase.TesteAdapter.TesteAdapterVH> {
    private java.util.List<com.example.desafio4digitalhouse_firebase.GamesFirestore> gameList;
    private final kotlin.jvm.functions.Function1<com.example.desafio4digitalhouse_firebase.GamesFirestore, kotlin.Unit> onItemClicked = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.desafio4digitalhouse_firebase.TesteAdapter.TesteAdapterVH onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.desafio4digitalhouse_firebase.TesteAdapter.TesteAdapterVH holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public TesteAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.desafio4digitalhouse_firebase.GamesFirestore> gameList, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.desafio4digitalhouse_firebase.GamesFirestore, kotlin.Unit> onItemClicked) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/desafio4digitalhouse_firebase/TesteAdapter$TesteAdapterVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/desafio4digitalhouse_firebase/databinding/HomeCardItemBinding;", "(Lcom/example/desafio4digitalhouse_firebase/databinding/HomeCardItemBinding;)V", "bind", "", "game", "Lcom/example/desafio4digitalhouse_firebase/GamesFirestore;", "onItemClicked", "Lkotlin/Function1;", "app_debug"})
    public static final class TesteAdapterVH extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.desafio4digitalhouse_firebase.databinding.HomeCardItemBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.desafio4digitalhouse_firebase.GamesFirestore game, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.example.desafio4digitalhouse_firebase.GamesFirestore, kotlin.Unit> onItemClicked) {
        }
        
        public TesteAdapterVH(@org.jetbrains.annotations.NotNull()
        com.example.desafio4digitalhouse_firebase.databinding.HomeCardItemBinding binding) {
            super(null);
        }
    }
}