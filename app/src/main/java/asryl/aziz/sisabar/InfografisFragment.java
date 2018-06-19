package asryl.aziz.sisabar;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


/**
 * A simple {@link Fragment} subclass.
 */
public class InfografisFragment extends PagerAdapter{

    Activity activity;
    int images[];
    LayoutInflater inflater;

    public void InfografisFragment(){
        this.activity = activity;
        this.images= images;

    }



    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }


    @Override
    public Object instantiateItem(ViewGroup container,int position) {
        // Inflate the layout for this fragment
       inflater= (LayoutInflater) activity.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       View itemView = inflater.inflate(R.layout.fragment_infografis,container,false);

        ImageView image;
        image =(ImageView)itemView.findViewById(R.id.imageView);
        DisplayMetrics dis = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(dis);
        int height = dis.heightPixels;
        int width = dis.widthPixels;
        image.setMinimumHeight(height);
        image.setMinimumWidth(width);

        try{
            Picasso.with(activity.getApplicationContext())
                    .load(images[position])
                    .placeholder(R.mipmap.ic_launcher)
                    .error(R.mipmap.ic_launcher)
                    .into(image);
        }catch (Exception ex){

        }
        container.addView(itemView);
        return itemView;
    }


}
