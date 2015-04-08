package com.example.danielkellam.ballotmania2;

import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    private TextView BestPictureTextView;
    private TextView LeadingActorTextView;
    private TextView LeadingActressTextView;
    private TextView SupportingActorTextView;
    private TextView SupportingActressTextView;
    private TextView AnimatedFilmTextView;
    private TextView CinematographyTextView;
    private TextView CostumeDesignTextView;
    private TextView DirectingTextView;
    private TextView DocumentaryFeatureTextView;
    private TextView DocumentaryShortSubjectTextView;
    private TextView FilmEditingTextView;
    private TextView ForeignLanguageFilmTextView;
    private TextView MakeupAndHairstylingTextView;
    private TextView MusicOriginalScoreTextView;
    private TextView MusicOriginalSongTextView;
    private TextView ProductionDesignTextView;
    private TextView ShortFilmAnimatedTextView;
    private TextView ShortFilmLiveActionTextView;
    private TextView SoundEditingTextView;
    private TextView SoundMixingTextView;
    private TextView VisualEffectsTextView;
    private TextView WritingAdaptedScreenplayTextView;
    private TextView WritingOriginalScreenplayTextView;

    private Spinner BPictureSpinner;
    private Spinner LActorSpinner;
    private Spinner LActressSpinner;
    private Spinner SActorSpinner;
    private Spinner SActressSpinner;
    private Spinner AFilmSpinner;
    private Spinner CinemaSpinner;
    private Spinner CDesignSpinner;
    private Spinner DirectSpinner;
    private Spinner DFeatureSpinner;
    private Spinner DSSubjectSpinner;
    private Spinner FEditingSpinner;
    private Spinner FLFilmSpinner;
    private Spinner MAHairstylingSpinner;
    private Spinner MOScoreSpinner;
    private Spinner MOSongSpinner;
    private Spinner PDesignSpinner;
    private Spinner SFAnimatedSpinner;
    private Spinner SFLActionSpinner;
    private Spinner SEditingSpinner;
    private Spinner SMixingSpinner;
    private Spinner VEffectsSpinner;
    private Spinner WAScreenplaySpinner;
    private Spinner WOScreenplaySpinner;

    //private List<String> Categories;
    private List<Spinner> NomineeSpinner;
    private List<TextView> CategoryTextViews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CategoryTextViews = new ArrayList<TextView>();
        NomineeSpinner = new ArrayList<Spinner>();

        this.BestPictureTextView = (TextView) this.findViewById(R.id.BestPicture);
        this.LeadingActorTextView = (TextView) this.findViewById(R.id.LeadingActor);
        this.LeadingActressTextView = (TextView) this.findViewById(R.id.LeadingActress);
        this.SupportingActorTextView = (TextView) this.findViewById(R.id.SupportingActor);
        this.SupportingActressTextView = (TextView) this.findViewById(R.id.SupportingActress);
        this.AnimatedFilmTextView = (TextView) this.findViewById(R.id.AnimatedFilm);
        this.CinematographyTextView = (TextView) this.findViewById(R.id.Cinematography);
        this.CostumeDesignTextView = (TextView) this.findViewById(R.id.CostumeDesign);
        this.DirectingTextView = (TextView) this.findViewById(R.id.Directing);
        this.DocumentaryFeatureTextView = (TextView) this.findViewById(R.id.DocumentaryFeature);
        this.DocumentaryShortSubjectTextView = (TextView) this.findViewById(R.id.DocumentaryShortSubject);
        this.FilmEditingTextView = (TextView) this.findViewById(R.id.FilmEditing);
        this.ForeignLanguageFilmTextView = (TextView) this.findViewById(R.id.ForeignLanguageFilm);
        this.MakeupAndHairstylingTextView = (TextView) this.findViewById(R.id.MakeupAndHairstyling);
        this.MusicOriginalScoreTextView = (TextView) this.findViewById(R.id.MusicOriginalScore);
        this.MusicOriginalSongTextView = (TextView) this.findViewById(R.id.MusicOriginalSong);
        this.ProductionDesignTextView = (TextView) this.findViewById(R.id.ProductionDesign);
        this.ShortFilmAnimatedTextView = (TextView) this.findViewById(R.id.ShortFilmAnimated);
        this.ShortFilmLiveActionTextView = (TextView) this.findViewById(R.id.ShortFilmLiveAction);
        this.SoundEditingTextView = (TextView) this.findViewById(R.id.SoundEditing);
        this.SoundMixingTextView = (TextView) this.findViewById(R.id.SoundMixing);
        this.VisualEffectsTextView = (TextView) this.findViewById(R.id.VisualEffects);
        this.WritingAdaptedScreenplayTextView = (TextView) this.findViewById(R.id.WritingAdaptedScreenplay);
        this.WritingOriginalScreenplayTextView = (TextView) this.findViewById(R.id.WritingOriginalScreenplay);

        CategoryTextViews.add(BestPictureTextView);
        CategoryTextViews.add(LeadingActorTextView);
        CategoryTextViews.add(LeadingActressTextView);
        CategoryTextViews.add(SupportingActorTextView);
        CategoryTextViews.add(SupportingActressTextView);
        CategoryTextViews.add(AnimatedFilmTextView);
        CategoryTextViews.add(CinematographyTextView);
        CategoryTextViews.add(CostumeDesignTextView);
        CategoryTextViews.add(DirectingTextView);
        CategoryTextViews.add(DocumentaryFeatureTextView);
        CategoryTextViews.add(DocumentaryShortSubjectTextView);
        CategoryTextViews.add(FilmEditingTextView);
        CategoryTextViews.add(ForeignLanguageFilmTextView);
        CategoryTextViews.add(MakeupAndHairstylingTextView);
        CategoryTextViews.add(MusicOriginalScoreTextView);
        CategoryTextViews.add(MusicOriginalSongTextView);
        CategoryTextViews.add(ProductionDesignTextView);
        CategoryTextViews.add(ShortFilmAnimatedTextView);
        CategoryTextViews.add(ShortFilmLiveActionTextView);
        CategoryTextViews.add(SoundEditingTextView);
        CategoryTextViews.add(SoundMixingTextView);
        CategoryTextViews.add(VisualEffectsTextView);
        CategoryTextViews.add(WritingAdaptedScreenplayTextView);
        CategoryTextViews.add(WritingOriginalScreenplayTextView);

        this.BPictureSpinner = (Spinner) this.findViewById(R.id.BPicture);
        this.LActorSpinner = (Spinner) this.findViewById(R.id.LActor);
        this.LActressSpinner = (Spinner) this.findViewById(R.id.LActress);
        this.SActorSpinner = (Spinner) this.findViewById(R.id.SActor);
        this.SActressSpinner = (Spinner) this.findViewById(R.id.SActress);
        this.AFilmSpinner = (Spinner) this.findViewById(R.id.AFilm);
        this.CinemaSpinner = (Spinner) this.findViewById(R.id.Cinema);
        this.CDesignSpinner = (Spinner) this.findViewById(R.id.CDesign);
        this.DirectSpinner = (Spinner) this.findViewById(R.id.Direct);
        this.DFeatureSpinner = (Spinner) this.findViewById(R.id.DFeature);
        this.DSSubjectSpinner = (Spinner) this.findViewById(R.id.DSSubject);
        this.FEditingSpinner = (Spinner) this.findViewById(R.id.FEditing);
        this.FLFilmSpinner = (Spinner) this.findViewById(R.id.FLFilm);
        this.MAHairstylingSpinner = (Spinner) this.findViewById(R.id.MAHairstyling);
        this.MOScoreSpinner = (Spinner) this.findViewById(R.id.MOScore);
        this.MOSongSpinner = (Spinner) this.findViewById(R.id.MOSong);
        this.PDesignSpinner = (Spinner) this.findViewById(R.id.PDesign);
        this.SFAnimatedSpinner = (Spinner) this.findViewById(R.id.SFAnimated);
        this.SFLActionSpinner = (Spinner) this.findViewById(R.id.SFLAction);
        this.SEditingSpinner = (Spinner) this.findViewById(R.id.SEditing);
        this.SMixingSpinner = (Spinner) this.findViewById(R.id.SMixing);
        this.VEffectsSpinner = (Spinner) this.findViewById(R.id.VEffects);
        this.WAScreenplaySpinner = (Spinner) this.findViewById(R.id.WAScreenplay);
        this.WOScreenplaySpinner = (Spinner) this.findViewById(R.id.WOScreenplay);

        NomineeSpinner.add(BPictureSpinner);
        NomineeSpinner.add(LActorSpinner);
        NomineeSpinner.add(LActressSpinner);
        NomineeSpinner.add(SActorSpinner);
        NomineeSpinner.add(SActressSpinner);
        NomineeSpinner.add(AFilmSpinner);
        NomineeSpinner.add(CinemaSpinner);
        NomineeSpinner.add(CDesignSpinner);
        NomineeSpinner.add(DirectSpinner);
        NomineeSpinner.add(DFeatureSpinner);
        NomineeSpinner.add(DSSubjectSpinner);
        NomineeSpinner.add(FEditingSpinner);
        NomineeSpinner.add(FLFilmSpinner);
        NomineeSpinner.add(MAHairstylingSpinner);
        NomineeSpinner.add(MOScoreSpinner);
        NomineeSpinner.add(MOSongSpinner);
        NomineeSpinner.add(PDesignSpinner);
        NomineeSpinner.add(SFAnimatedSpinner);
        NomineeSpinner.add(SFLActionSpinner);
        NomineeSpinner.add(SEditingSpinner);
        NomineeSpinner.add(SMixingSpinner);
        NomineeSpinner.add(VEffectsSpinner);
        NomineeSpinner.add(WAScreenplaySpinner);
        NomineeSpinner.add(WOScreenplaySpinner);

        new GetAllCategoriesTask().execute(new ApiConnector());
        new GetNomineesInOrderTheyAppearTask(this).execute(new ApiConnector());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void TextName(String Cat, TextView text)
    {
        text.setText(Cat);
    }

    public List<CategoryModel> addToCategoryList(List<CategoryModel> L, JSONArray jsonArray, String RowName, String id)
    {
        String s = "";
        int t;
        for (int i = 0; i < jsonArray.length(); i++) {

            JSONObject json = null;
            try {
                json = jsonArray.getJSONObject(i);
                s = json.getString(RowName);
                t = json.getInt(id);
                CategoryModel Cat = new CategoryModel(s,t);
                L.add(Cat);
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
        return L;
    }

    public List<NomineeModel> addToNomineeList(List<NomineeModel> L, JSONArray jsonArray, String RowName, String id)
    {
        String s = "";
        int t;
        for (int i = 0; i < jsonArray.length(); i++) {


            JSONObject json = null;
            try {
                json = jsonArray.getJSONObject(i);
                s = json.getString(RowName);
                t = json.getInt(id);
                NomineeModel Nom = new NomineeModel(s, t);
                L.add(Nom);
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
        return L;
    }

    private class GetAllCategoriesTask extends AsyncTask<ApiConnector, Long, JSONArray> {
        List<CategoryModel> cat;
        public GetAllCategoriesTask()
        {
            cat = new ArrayList<CategoryModel>();
        }

        @Override
        protected JSONArray doInBackground(ApiConnector... params) {
            return params[0].GetAllCategories();
        }

        @Override
        protected void onPostExecute(JSONArray jsonArray) {

            cat = addToCategoryList(cat,jsonArray, "CategoryName", "CategoryID");
            for(int i = 0; i < CategoryTextViews.size(); i++)
            {
                TextName(cat.get(i).getCategoryName(), CategoryTextViews.get(i));
            }
        }
    }


    private class GetNomineesInOrderTheyAppearTask extends AsyncTask<ApiConnector, Long, JSONArray> {

        public List<NomineeModel> Nom;
        MainActivity T;

        public GetNomineesInOrderTheyAppearTask(MainActivity t)
        {
            Nom = new ArrayList<NomineeModel>();
            T = t;
        }

        @Override
        protected JSONArray doInBackground(ApiConnector... params) {
            return params[0].GetNomineesInOrderTheyAppear();
        }

        @Override
        protected void onPostExecute(JSONArray jsonArray) {
            Nom = addToNomineeList(Nom, jsonArray, "NomName", "NomID");
            int count = 0;
            for (int i = 0; i < NomineeSpinner.size(); i++) {

                if (i == 0) {
                    String[] arraySpinner = new String[]{
                            " ", Nom.get(count).getNomineeName(), Nom.get(count + 1).getNomineeName(), Nom.get(count + 2).getNomineeName(), Nom.get(count + 3).getNomineeName(), Nom.get(count + 4).getNomineeName(), Nom.get(count + 5).getNomineeName(), Nom.get(count + 6).getNomineeName(), Nom.get(count + 7).getNomineeName()
                    };
                    count = count + 8;
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(T, android.R.layout.simple_spinner_item, arraySpinner);
                    NomineeSpinner.get(i).setAdapter(adapter);
                } else if (i == 13) {
                    String[] arraySpinner = new String[]{
                            " ", Nom.get(count).getNomineeName(), Nom.get(count + 1).getNomineeName(), Nom.get(count + 2).getNomineeName()
                    };
                    count = count + 3;
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(T, android.R.layout.simple_spinner_item, arraySpinner);
                    NomineeSpinner.get(i).setAdapter(adapter);
                } else {
                    String[] arraySpinner = new String[]{
                            " ", Nom.get(count).getNomineeName(), Nom.get(count + 1).getNomineeName(), Nom.get(count + 2).getNomineeName(), Nom.get(count + 3).getNomineeName(), Nom.get(count + 4).getNomineeName()
                    };
                    count = count + 5;
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(T, android.R.layout.simple_spinner_item, arraySpinner);
                    NomineeSpinner.get(i).setAdapter(adapter);
                }
            }
        }
    }
}