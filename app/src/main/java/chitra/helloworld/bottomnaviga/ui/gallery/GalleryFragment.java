package chitra.helloworld.bottomnaviga.ui.gallery;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;


import chitra.helloworld.bottomnaviga.R;


public class GalleryFragment extends Fragment {

    GalleryAdapter adapter;
    Gallery gallery;
    ImageView imageView;
    int [] images={R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,
            R.drawable.img5,R.drawable.img6,R.drawable.img7,R.drawable.img8,R.drawable.img9};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_gallery, container, false);
      Gallery gallery=(Gallery)view.findViewById(R.id.simplegallery1);
      final ImageView imageView=(ImageView)view.findViewById(R.id.imageView);

      adapter=new GalleryAdapter(getActivity().getApplicationContext(),images);
        gallery.setAdapter(adapter);
        gallery.setSpacing(10);
        
        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                imageView.setImageResource(images[i]);
            }
        });
    return view;

    }




}