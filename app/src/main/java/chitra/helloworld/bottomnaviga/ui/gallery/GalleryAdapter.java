package chitra.helloworld.bottomnaviga.ui.gallery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

import androidx.annotation.NonNull;


import java.util.List;

import chitra.helloworld.bottomnaviga.R;

public class GalleryAdapter extends BaseAdapter {

 Context context;
 int images[];

    public GalleryAdapter(Context context, int [] images) {
        this.context = context;
        this.images=images;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int i) {
        return images[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView=new ImageView(context);
        imageView.setImageResource(images[i]);
        imageView.setLayoutParams(new Gallery.LayoutParams(200,200));
        return imageView;
    }
}

