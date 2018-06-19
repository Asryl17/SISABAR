package asryl.aziz.sisabar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView dataCard,publikasiCard,infografisCard,grafikCard, kondefCard,konsulCard;

    //GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataCard =(CardView)findViewById(R.id.data);
        publikasiCard =(CardView)findViewById(R.id.publikasi);
        infografisCard =(CardView)findViewById(R.id.infografis);
        grafikCard =(CardView)findViewById(R.id.grafik);
        kondefCard =(CardView)findViewById(R.id.kondef);
        konsulCard =(CardView)findViewById(R.id.konsul);

        dataCard.setOnClickListener(this);
        publikasiCard.setOnClickListener(this);
        infografisCard.setOnClickListener(this);
        grafikCard.setOnClickListener(this);
        kondefCard.setOnClickListener(this);
        konsulCard.setOnClickListener(this);

      /*  mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        //Set Event
        setSingleEvent(mainGrid);
        //setToggleEvent(mainGrid);
        */
    }

    @Override
    public void onClick(View v) {
            Intent i;
        switch(v.getId()){
            case R.id.data:i= new Intent(this, DataActivity.class);startActivity(i);break;
            case R.id.publikasi: i = new Intent(this, PublikasiActivity.class);startActivity(i);break;
            case R.id.infografis: i = new Intent(this, InfografisActivity.class);startActivity(i);break;
            default:break;


        }
    }

  /*  private void setToggleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            final CardView cardView = (CardView) mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                        Toast.makeText(MainActivity.this, "State : True", Toast.LENGTH_SHORT).show();

                    } else {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(MainActivity.this, "State : False", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void setSingleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(MainActivity.this,DataActivity.class);
                    intent.putExtra("info","This is activity from card item index  "+finalI);
                    startActivity(intent);

                }
            });
        }
    }*/
}
