package ctec.aboutme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;

public class AboutMe extends AppCompatActivity {

    private ImageView foodImage;
    private ImageView introImage;
    private ImageView animeImage;
    private ImageView choirImage;
    private ImageView magicImage;
    private ImageView gameImage;
    private Button introButton;
    private Button foodButton;
    private Button animeButton;
    private Button choirButton;
    private Button magicButton;
    private Button gameButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        foodImage = (ImageView) findViewById(R.id.foodPic);
        introImage = (ImageView) findViewById(R.id.introPic);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_about_me, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void changeIntroVisibility()
    {
        introImage.setVisibility(View.VISIBLE);
        foodImage.setVisibility(View.GONE);
        animeImage.setVisibility(View.GONE);
        choirImage.setVisibility(View.GONE);
        magicImage.setVisibility(View.GONE);
        gameImage.setVisibility(View.GONE);


    }
    private void changeFoodVisibility()
    {
        foodImage.setVisibility(View.VISIBLE);
        introImage.setVisibility(View.GONE);
        animeImage.setVisibility(View.GONE);
        choirImage.setVisibility(View.GONE);
        magicImage.setVisibility(View.GONE);
        gameImage.setVisibility(View.GONE);
    }
    private void changeAnimeVisibility()
    {
        animeImage.setVisibility(View.VISIBLE);
        foodImage.setVisibility(View.GONE);
        introImage.setVisibility(View.GONE);
        choirImage.setVisibility(View.GONE);
        magicImage.setVisibility(View.GONE);
        gameImage.setVisibility(View.GONE);

    }
    private void changeChoirVisibility()
    {
        choirImage.setVisibility(View.VISIBLE);
        foodImage.setVisibility(View.GONE);
        introImage.setVisibility(View.GONE);
        animeImage.setVisibility(View.GONE);
        magicImage.setVisibility(View.GONE);
        gameImage.setVisibility(View.GONE);
    }
    private void changeMagicVisibility()
    {
        magicImage.setVisibility(View.VISIBLE);
        foodImage.setVisibility(View.GONE);
        introImage.setVisibility(View.GONE);
        animeImage.setVisibility(View.GONE);
        choirImage.setVisibility(View.GONE);
        gameImage.setVisibility(View.GONE);
    }
    private void changeGameVisibility()
    {
        gameImage.setVisibility(View.VISIBLE);
        foodImage.setVisibility(View.GONE);
        introImage.setVisibility(View.GONE);
        animeImage.setVisibility(View.GONE);
        choirImage.setVisibility(View.GONE);
        magicImage.setVisibility(View.GONE);
    }

    private void setupListeners()
    {

    }
}
