// Generated by view binder compiler. Do not edit!
package com.example.desafio4digitalhouse_firebase.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.desafio4digitalhouse_firebase.R;
import com.google.android.material.textfield.TextInputLayout;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCreateGameBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton btSaveGame;

  @NonNull
  public final CircleImageView civGamePhoto;

  @NonNull
  public final TextInputLayout tilCreatedAt;

  @NonNull
  public final TextInputLayout tilDescription;

  @NonNull
  public final TextInputLayout tilNameGame;

  private ActivityCreateGameBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton btSaveGame, @NonNull CircleImageView civGamePhoto,
      @NonNull TextInputLayout tilCreatedAt, @NonNull TextInputLayout tilDescription,
      @NonNull TextInputLayout tilNameGame) {
    this.rootView = rootView;
    this.btSaveGame = btSaveGame;
    this.civGamePhoto = civGamePhoto;
    this.tilCreatedAt = tilCreatedAt;
    this.tilDescription = tilDescription;
    this.tilNameGame = tilNameGame;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCreateGameBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCreateGameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_create_game, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCreateGameBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btSaveGame;
      AppCompatButton btSaveGame = rootView.findViewById(id);
      if (btSaveGame == null) {
        break missingId;
      }

      id = R.id.civGamePhoto;
      CircleImageView civGamePhoto = rootView.findViewById(id);
      if (civGamePhoto == null) {
        break missingId;
      }

      id = R.id.tilCreatedAt;
      TextInputLayout tilCreatedAt = rootView.findViewById(id);
      if (tilCreatedAt == null) {
        break missingId;
      }

      id = R.id.tilDescription;
      TextInputLayout tilDescription = rootView.findViewById(id);
      if (tilDescription == null) {
        break missingId;
      }

      id = R.id.tilNameGame;
      TextInputLayout tilNameGame = rootView.findViewById(id);
      if (tilNameGame == null) {
        break missingId;
      }

      return new ActivityCreateGameBinding((ConstraintLayout) rootView, btSaveGame, civGamePhoto,
          tilCreatedAt, tilDescription, tilNameGame);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
