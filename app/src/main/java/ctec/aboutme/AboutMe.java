package ctec.aboutme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Typeface;

/**
 * @author Rory Baker
 * @version 2.0, 11/20/2015 Added new font to in app text.
 *  This app shows various images and a textView to give information about my life.
 */
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
    private TextView infoText;


    /**
     * Creates the app, casts a view to each object.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        //Casting views to buttons
        foodImage = (ImageView) findViewById(R.id.foodPic);
        introImage = (ImageView) findViewById(R.id.introPic);
        animeImage = (ImageView) findViewById(R.id.animePic);
        choirImage = (ImageView) findViewById(R.id.choirPic);
        magicImage = (ImageView) findViewById(R.id.cgPic);
        gameImage = (ImageView) findViewById(R.id.vgPic);
        introButton = (Button) findViewById(R.id.introButton);
        foodButton = (Button) findViewById(R.id.eatButton);
        animeButton = (Button) findViewById(R.id.animButton);
        choirButton = (Button) findViewById(R.id.choiralButton);
        magicButton = (Button) findViewById(R.id.cgButton);
        gameButton = (Button) findViewById(R.id.vgButton);
        infoText = (TextView) findViewById(R.id.introText);

        //Calls the setupText method to change fonts.
        setupText();

        //Calls the setup Listeners method to make buttons work.
        setupListeners();

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

    /**
     * Makes the intro image visible, sets all other images to gone, and changes the text.
     */
    private void changeIntroVisibility()
    {
        introImage.setVisibility(View.VISIBLE);
        foodImage.setVisibility(View.GONE);
        animeImage.setVisibility(View.GONE);
        choirImage.setVisibility(View.GONE);
        magicImage.setVisibility(View.GONE);
        gameImage.setVisibility(View.GONE);
        infoText.setText(R.string.intro_text);
    }

    /**
     * Makes the food image visible, sets all other images to gone, and changes the text.
     */
    private void changeFoodVisibility()
    {
        foodImage.setVisibility(View.VISIBLE);
        introImage.setVisibility(View.GONE);
        animeImage.setVisibility(View.GONE);
        choirImage.setVisibility(View.GONE);
        magicImage.setVisibility(View.GONE);
        gameImage.setVisibility(View.GONE);
        infoText.setText(R.string.food_text);
    }

    /**
     * Makes the food image visible, sets all other images to gone, and changes the text.
     */
    private void changeAnimeVisibility()
    {
        animeImage.setVisibility(View.VISIBLE);
        foodImage.setVisibility(View.GONE);
        introImage.setVisibility(View.GONE);
        choirImage.setVisibility(View.GONE);
        magicImage.setVisibility(View.GONE);
        gameImage.setVisibility(View.GONE);
        infoText.setText(R.string.anime_text);
    }

    /**
     * Makes the Choir image visible, sets all other images to gone, and changes the text.
     */
    private void changeChoirVisibility()
    {
        choirImage.setVisibility(View.VISIBLE);
        foodImage.setVisibility(View.GONE);
        introImage.setVisibility(View.GONE);
        animeImage.setVisibility(View.GONE);
        magicImage.setVisibility(View.GONE);
        gameImage.setVisibility(View.GONE);
        infoText.setText(R.string.choir_text);
    }

    /**
     * Makes the magic image visible, sets all other images to gone, and changes the text.
     */
    private void changeMagicVisibility()
    {
        magicImage.setVisibility(View.VISIBLE);
        foodImage.setVisibility(View.GONE);
        introImage.setVisibility(View.GONE);
        animeImage.setVisibility(View.GONE);
        choirImage.setVisibility(View.GONE);
        gameImage.setVisibility(View.GONE);
        infoText.setText(R.string.magic_text);
    }

    /**
     * Makes the video game image visible, sets all other images to gone, and changes the text.
     */
    private void changeGameVisibility()
    {
        gameImage.setVisibility(View.VISIBLE);
        foodImage.setVisibility(View.GONE);
        introImage.setVisibility(View.GONE);
        animeImage.setVisibility(View.GONE);
        choirImage.setVisibility(View.GONE);
        magicImage.setVisibility(View.GONE);
        infoText.setText(R.string.vg_text);
    }

    /**
     * Adds listeners to each, and calls a method when they are pressed.
     */
    private void setupListeners()
   {
        introButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
           public void onClick(View buttonView)
            {
                changeIntroVisibility();
            }
        });

        foodButton.setOnClickListener(new View.OnClickListener()
        {
          @Override
            public void onClick(View buttonView)
           {
               changeFoodVisibility();
           }
        });

        animeButton.setOnClickListener(new View.OnClickListener()
        {
          @Override
            public void onClick(View buttonView)
            {
                changeAnimeVisibility();
            }
        });

        choirButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View buttonView)
            {
                changeChoirVisibility();
            }
        });

        magicButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View buttonView)
            {
                changeMagicVisibility();
            }
        });

        gameButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View buttonView)
            {
                changeGameVisibility();
            }
        });
    }

    /**
     * Changes the font of the in-app text to Comic Sans MS.
     */
    private void setupText()
    {
        //creates the font from the ttf file in the assets/fonts folder.
        Typeface comicFont = Typeface.createFromAsset(getAssets(), "fonts/comic_sans.ttf");
        //sets the font for the textView to Comic Sans MS.
        infoText.setTypeface(comicFont);
    }
}
