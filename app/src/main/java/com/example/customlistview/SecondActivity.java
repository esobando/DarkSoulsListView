package com.example.customlistview;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class SecondActivity extends AppCompatActivity {

    Toolbar mToolbar;
    ImageView Bosses;
    String[] states;
    ListView listView;


//    ImageView = (ImageView) findViewById(R.id.imageView);

//        Glide.with(this).load(IMAGE_Url).into(ImageView);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        listView = (ListView) findViewById(R.id.listView);

        mToolbar = (Toolbar) findViewById(R.id.toolbar1);
        Bosses = (ImageView) findViewById(R.id.imageView);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            mToolbar.setTitle(bundle.getString("Bosses"));
            if (mToolbar.getTitle().toString().equalsIgnoreCase("Yorhm The Giant")) {
                Bosses.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.icon1));
                states = getResources().getStringArray(R.array.YorhmTheGiant);

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Abyss Watchers")) {
                Bosses.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.icon2));
                states = getResources().getStringArray(R.array.AbyssWatchers);


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Dancer of the Boreal Valley")) {
                Bosses.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.icon3));
                states = getResources().getStringArray(R.array.DanceroftheBorealValley);

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Dragon Slayer Armour")) {
                Bosses.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.icon4));
                states = getResources().getStringArray(R.array.DragonSlayerArmour);

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Nameless King")) {
                Bosses.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.icon5));
                states = getResources().getStringArray(R.array.NamelessKing);

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Champion Gundyr")) {
                Bosses.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.icon6));
                states = getResources().getStringArray(R.array.ChampionGundyr);

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Lothric, Younger Prince")) {
                Bosses.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.icon7));
                states = getResources().getStringArray(R.array.LothricYoungerPrince);

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Sister Friede")) {
                Bosses.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.icon8));
                states = getResources().getStringArray(R.array.SisterFriede);

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Vordt of The Boreal Valley")) {
                Bosses.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.icon9));
                states = getResources().getStringArray(R.array.VordtofTheBorealValley);

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Pontiff Sulyvhan")) {
                Bosses.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.icon10));
                states = getResources().getStringArray(R.array.PontiffSulyvahn);

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Old Demon King")) {
                Bosses.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.icon11));
                states = getResources().getStringArray(R.array.OldDemonKing);

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Iudex Gundyr")) {
                Bosses.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.icon12));
                states = getResources().getStringArray(R.array.IudexGundyr);

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Curse-Rotted Greatwood")) {
                Bosses.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.icon13));
                states = getResources().getStringArray(R.array.CurseRottedGreatwood);



            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Crystal Sage")) {
                Bosses.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.icon14));
                states = getResources().getStringArray(R.array.CrystalSage);

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Aldrich, Devourer of Gods")) {
                Bosses.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.icon15));
                states = getResources().getStringArray(R.array.AldrichDevourOfGods);

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Deacons of the Deep")) {
                Bosses.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.icon16));
                states = getResources().getStringArray(R.array.DeaconsOfTheDeep);
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("High Lord Wolnir")) {
                Bosses.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.icon17));
                states = getResources().getStringArray(R.array.HighLordWolnir);
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Oceiros, The Consumed King")) {
                Bosses.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.icon18));
                states = getResources().getStringArray(R.array.OceirosTheConsumedKing);
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Ancient Wyvern")) {
                Bosses.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.icon19));
                states = getResources().getStringArray(R.array.AncientWyvern);
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Soul of Cinder")) {
                Bosses.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.icon20));
                states = getResources().getStringArray(R.array.SoulofCinder);
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Champions Gravetender and Gravetender Greatwolf")) {
                Bosses.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.icon21));
                states = getResources().getStringArray(R.array.ChampionsGravetenderandGravetenderGreatwolf);
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Demon Prince")) {
                Bosses.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.iconde));
                states = getResources().getStringArray(R.array.DemonPrince);

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Darkeater Midir")) {
                Bosses.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.icon24));
                states = getResources().getStringArray(R.array.DarkeaterMidir);

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Darkeater Midir")) {
                Bosses.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.icon24));
                states = getResources().getStringArray(R.array.DarkeaterMidir);
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Slave Knight Gael")) {
                Bosses.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.icon25));
                states = getResources().getStringArray(R.array.SlaveKnightGael);

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Halflight, Spear of the Church")) {
                Bosses.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.icon22));
                states = getResources().getStringArray(R.array.HalflightSpearoftheChurch);
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Curse Rotted Greatwood")) {
                Bosses.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.icon26));
                states = getResources().getStringArray(R.array.CurseRottedGreatwood);

            }
        }

        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(SecondActivity.this,
                android.R.layout.simple_list_item_1,
                states);
        listView.setAdapter(mAdapter);
    }


}
