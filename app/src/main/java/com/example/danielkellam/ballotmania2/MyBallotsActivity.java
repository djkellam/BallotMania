package com.example.danielkellam.ballotmania2;

import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Spinner;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class MyBallotsActivity extends ActionBarActivity {

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

    private ArrayList<TextView> CategoryTextViews;
    private ArrayList<TextView> NomineeTextViews;

    private TextView BPictureTextView;
    private TextView LActorTextView;
    private TextView LActressTextView;
    private TextView SActorTextView;
    private TextView SActressTextView;
    private TextView AFilmTextView;
    private TextView CinemaTextView;
    private TextView CDesignTextView;
    private TextView DirectTextView;
    private TextView DFeatureTextView;
    private TextView DSSubjectTextView;
    private TextView FEditingTextView;
    private TextView FLFilmTextView;
    private TextView MAHairstylingTextView;
    private TextView MOScoreTextView;
    private TextView MOSongTextView;
    private TextView PDesignTextView;
    private TextView SFAnimatedTextView;
    private TextView SFLActionTextView;
    private TextView SEditingTextView;
    private TextView SMixingTextView;
    private TextView VEffectsTextView;
    private TextView WAScreenplayTextView;
    private TextView WOScreenplayTextView;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_ballots);

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

        CategoryTextViews = new ArrayList<TextView>();

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

        this.BPictureTextView = (TextView) this.findViewById(R.id.BPicture);
        this.LActorTextView = (TextView) this.findViewById(R.id.LActor);
        this.LActressTextView = (TextView) this.findViewById(R.id.LActress);
        this.SActorTextView = (TextView) this.findViewById(R.id.SActor);
        this.SActressTextView = (TextView) this.findViewById(R.id.SActress);
        this.AFilmTextView = (TextView) this.findViewById(R.id.AFilm);
        this.CinemaTextView = (TextView) this.findViewById(R.id.Cinema);
        this.CDesignTextView = (TextView) this.findViewById(R.id.CDesign);
        this.DirectTextView = (TextView) this.findViewById(R.id.Direct);
        this.DFeatureTextView = (TextView) this.findViewById(R.id.DFeature);
        this.DSSubjectTextView = (TextView) this.findViewById(R.id.DSSubject);
        this.FEditingTextView = (TextView) this.findViewById(R.id.FEditing);
        this.FLFilmTextView = (TextView) this.findViewById(R.id.FLFilm);
        this.MAHairstylingTextView = (TextView) this.findViewById(R.id.MAHairstyling);
        this.MOScoreTextView = (TextView) this.findViewById(R.id.MOScore);
        this.MOSongTextView = (TextView) this.findViewById(R.id.MOSong);
        this.PDesignTextView = (TextView) this.findViewById(R.id.PDesign);
        this.SFAnimatedTextView = (TextView) this.findViewById(R.id.SFAnimated);
        this.SFLActionTextView = (TextView) this.findViewById(R.id.SFLAction);
        this.SEditingTextView = (TextView) this.findViewById(R.id.SEditing);
        this.SMixingTextView = (TextView) this.findViewById(R.id.SMixing);
        this.VEffectsTextView = (TextView) this.findViewById(R.id.VEffects);
        this.WAScreenplayTextView = (TextView) this.findViewById(R.id.WAScreenplay);
        this.WOScreenplayTextView = (TextView) this.findViewById(R.id.WOScreenplay);

        NomineeTextViews.add(BPictureTextView);
        NomineeTextViews.add(LActorTextView);
        NomineeTextViews.add(LActressTextView);
        NomineeTextViews.add(SActorTextView);
        NomineeTextViews.add(SActressTextView);
        NomineeTextViews.add(AFilmTextView);
        NomineeTextViews.add(CinemaTextView);
        NomineeTextViews.add(CDesignTextView);
        NomineeTextViews.add(DirectingTextView);
        NomineeTextViews.add(DFeatureTextView);
        NomineeTextViews.add(DSSubjectTextView);
        NomineeTextViews.add(FEditingTextView);
        NomineeTextViews.add(FLFilmTextView);
        NomineeTextViews.add(MAHairstylingTextView);
        NomineeTextViews.add(MOScoreTextView);
        NomineeTextViews.add(MOSongTextView);
        NomineeTextViews.add(PDesignTextView);
        NomineeTextViews.add(SFAnimatedTextView);
        NomineeTextViews.add(SFLActionTextView);
        NomineeTextViews.add(SEditingTextView);
        NomineeTextViews.add(SMixingTextView);
        NomineeTextViews.add(VEffectsTextView);
        NomineeTextViews.add(WAScreenplayTextView);
        NomineeTextViews.add(WOScreenplayTextView);

        new GetAllCategoriesTask().execute(new ApiConnector());


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_ballots, menu);
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

    public List<BallotModel> addToBallotList(List<BallotModel> L, JSONArray jsonArray, String uID, String BallotID,String Score,String C1W,String C2W,String C3W,String C4W,String C5W,String C6W,String C7W,String C8W,String C9W,String C10W,String C11W,String C12W,String C13W,String C14W,String C15W,String C16W,String C17W,String C18W,String C19W,String C20W,String C21W,String C22W,String C23W,String C24W)
    {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        int a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,aa;
        for (int ii = 0; ii < jsonArray.length(); ii++) {

            JSONObject json = null;
            try {
                json = jsonArray.getJSONObject(ii);
                a = json.getInt(uID);
                b = json.getInt(BallotID);
                c = json.getInt(Score);
                d = json.getInt(C1W);
                e = json.getInt(C2W);
                f = json.getInt(C3W);
                g = json.getInt(C4W);
                h = json.getInt(C5W);
                i = json.getInt(C6W);
                j = json.getInt(C7W);
                k = json.getInt(C8W);
                l = json.getInt(C9W);
                m = json.getInt(C10W);
                n = json.getInt(C11W);
                o = json.getInt(C12W);
                p = json.getInt(C13W);
                q = json.getInt(C14W);
                r = json.getInt(C15W);
                s = json.getInt(C16W);
                t = json.getInt(C17W);
                u = json.getInt(C18W);
                v = json.getInt(C19W);
                w = json.getInt(C20W);
                x = json.getInt(C21W);
                y = json.getInt(C22W);
                z = json.getInt(C23W);
                aa = json.getInt(C24W);

                intList.add(a);
                intList.add(b);
                intList.add(c);
                intList.add(d);
                intList.add(e);
                intList.add(f);
                intList.add(g);
                intList.add(h);
                intList.add(i);
                intList.add(j);
                intList.add(k);
                intList.add(l);
                intList.add(m);
                intList.add(n);
                intList.add(o);
                intList.add(p);
                intList.add(q);
                intList.add(r);
                intList.add(s);
                intList.add(t);
                intList.add(u);
                intList.add(v);
                intList.add(w);
                intList.add(x);
                intList.add(y);
                intList.add(z);
                intList.add(aa);

                BallotModel Bal = new BallotModel(intList);
                L.add(Bal);
            } catch (JSONException ee) {
                ee.printStackTrace();
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

            cat = addToCategoryList(cat, jsonArray, "CategoryName", "CategoryID");
            for(int i = 0; i < CategoryTextViews.size(); i++)
            {
                TextName(cat.get(i).getCategoryName(), CategoryTextViews.get(i));
            }
        }
    }

    private class GetBallotsTask extends AsyncTask<ApiConnector, Long, JSONArray> {
        List<BallotModel> bal;
        public GetBallotsTask()
        {
            bal = new ArrayList<BallotModel>();
        }

        @Override
        protected JSONArray doInBackground(ApiConnector... params) {
            return params[0].GetBallots();
        }

        @Override
        protected void onPostExecute(JSONArray jsonArray) {

            ArrayList<int[]> Ballots;
            bal = addToBallotList(bal,jsonArray, "uID", "BallotID","Score","C1W","C2W","C3W","C4W","C5W","C6W","C7W","C8W","C9W","C10W","C11W","C12W","C13W","C14W","C15W","C16W","C17W","C18W","C19W","C20W","C21W","C22W","C23W","C24W");

            for(int i = 0; i < bal.size(); i++)
            {
                int[] ballot = bal.get(i).getBallotWinnerList();
            }
            /*for(int i = 0; i < CategoryTextViews.size(); i++)
            {
                TextName(bal.get(i).getCategoryName(), CategoryTextViews.get(i));
            }*/
        }
    }


}
