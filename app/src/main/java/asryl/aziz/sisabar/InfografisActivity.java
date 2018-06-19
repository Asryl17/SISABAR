package asryl.aziz.sisabar;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class InfografisActivity extends AppCompatActivity {

    ViewPager viewPager;
    InfografisFragment adapter;
    private int[] images ={
            R.drawable.infografis1,R.drawable.infografis_2,R.drawable.infografis_3
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infografis);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        adapter = new InfografisFragment(InfografisActivity.this,images);
        viewPager.setAdapter(adapter);
    }
}
