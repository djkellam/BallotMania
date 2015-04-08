package com.example.danielkellam.ballotmania2;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


/**
 * Created by danielkellam on 4/2/15.
 */
public class NomineeModel {
    private String NomineeName;
    private int NomineeID;

    public NomineeModel(String name, int id)
    {
        NomineeName = name;
        NomineeID = id;
    }

    public String getNomineeName()
    {
        return NomineeName;
    }

    public int getNomineeID()
    {
        return NomineeID;
    }

}
