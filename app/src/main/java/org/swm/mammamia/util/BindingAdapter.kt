package org.swm.mammamia.util

import android.widget.ImageView
import androidx.annotation.DrawableRes
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("app:imageUri")
fun ImageView.setImageUrl(uri: String) {
    Glide.with(this).load(uri).into(this)
}

@BindingAdapter("app:imageRes")
fun ImageView.setProfileImage(@DrawableRes uri: Int) {
    Glide.with(this).load(uri).into(this)
}
