package com.example.jianingwang.minilinkedin.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.widget.ImageView;

import java.io.IOException;

/**
 * Created by Jianing Wang on 2/1/2018.
 */

public class ImageUtils {
    public static void loadImage(@NonNull Context context,
                                 @NonNull Uri uri,
                                 @NonNull ImageView imageView) {
        try {
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri);
            imageView.setImageBitmap(bitmap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}