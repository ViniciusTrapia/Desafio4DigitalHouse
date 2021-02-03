// Generated by view binder compiler. Do not edit!
package com.example.desafio4digitalhouse_firebase.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import com.example.desafio4digitalhouse_firebase.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class HomeCardItemBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final MaterialCardView cvItemHome;

  @NonNull
  public final AppCompatImageView ivCardItem;

  @NonNull
  public final TextView tvCardItemName;

  @NonNull
  public final TextView year;

  private HomeCardItemBinding(@NonNull MaterialCardView rootView,
      @NonNull MaterialCardView cvItemHome, @NonNull AppCompatImageView ivCardItem,
      @NonNull TextView tvCardItemName, @NonNull TextView year) {
    this.rootView = rootView;
    this.cvItemHome = cvItemHome;
    this.ivCardItem = ivCardItem;
    this.tvCardItemName = tvCardItemName;
    this.year = year;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static HomeCardItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static HomeCardItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.home_card_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static HomeCardItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      MaterialCardView cvItemHome = (MaterialCardView) rootView;

      id = R.id.ivCardItem;
      AppCompatImageView ivCardItem = rootView.findViewById(id);
      if (ivCardItem == null) {
        break missingId;
      }

      id = R.id.tvCardItemName;
      TextView tvCardItemName = rootView.findViewById(id);
      if (tvCardItemName == null) {
        break missingId;
      }

      id = R.id.year;
      TextView year = rootView.findViewById(id);
      if (year == null) {
        break missingId;
      }

      return new HomeCardItemBinding((MaterialCardView) rootView, cvItemHome, ivCardItem,
          tvCardItemName, year);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
