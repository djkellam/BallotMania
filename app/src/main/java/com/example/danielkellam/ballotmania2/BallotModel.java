package com.example.danielkellam.ballotmania2;

import java.util.ArrayList;

/**
 * Created by danielkellam on 4/3/15.
 */
public class BallotModel {
    int[] intList;
    private int BallotID;
    private int UserID;
    private int Score;
    private int c1w,c2w,c3w,c4w,c5w,c6w,c7w,c8w,c9w,c10w,c11w,c12w,c13w,c14w,c15w,c16w,c17w,c18w,c19w,c20w,c21w,c22w,c23w,c24w;


    public BallotModel(ArrayList<Integer> info)
    {
        UserID = info.get(0);
        BallotID = info.get(1);
        Score = info.get(2);
        c1w=info.get(3);
        c2w=info.get(4);
        c3w=info.get(5);
        c4w=info.get(6);
        c5w=info.get(7);
        c6w=info.get(8);
        c7w=info.get(9);
        c8w=info.get(10);
        c9w=info.get(11);
        c10w=info.get(12);
        c11w=info.get(13);
        c12w=info.get(14);
        c13w=info.get(15);
        c14w=info.get(16);
        c15w=info.get(17);
        c16w=info.get(18);
        c17w=info.get(19);
        c18w=info.get(20);
        c19w=info.get(21);
        c20w=info.get(22);
        c21w=info.get(23);
        c22w=info.get(24);
        c23w=info.get(25);
        c24w=info.get(26);

        intList = new int[]{
                c1w,c2w,c3w,c4w,c5w,c6w,c7w,c8w,c9w,c10w,c11w,c12w,c13w,c14w,c15w,c16w,c17w,c18w,c19w,c20w,c21w,c22w,c23w,c24w
        };


    }

    public int[] getBallotWinnerList()
    {
        return intList;
    }

    public int getBallotID() {
        return BallotID;
    }

    public int getUserID() {
        return UserID;
    }

    public int getScore() {
        return Score;
    }

    public int getC1w() {
        return c1w;
    }

    public int getC2w() {
        return c2w;
    }

    public int getC3w() {
        return c3w;
    }

    public int getC4w() {
        return c4w;
    }

    public int getC5w() {
        return c5w;
    }

    public int getC6w() {
        return c6w;
    }

    public int getC7w() {
        return c7w;
    }

    public int getC8w() {
        return c8w;
    }

    public int getC9w() {
        return c9w;
    }

    public int getC10w() {
        return c10w;
    }

    public int getC11w() {
        return c11w;
    }

    public int getC12w() {
        return c12w;
    }

    public int getC13w() {
        return c13w;
    }

    public int getC14w() {
        return c14w;
    }

    public int getC15w() {
        return c15w;
    }

    public int getC16w() {
        return c16w;
    }

    public int getC17w() {
        return c17w;
    }

    public int getC18w() {
        return c18w;
    }

    public int getC19w() {
        return c19w;
    }

    public int getC20w() {
        return c20w;
    }

    public int getC21w() {
        return c21w;
    }

    public int getC22w() {
        return c22w;
    }

    public int getC23w() {
        return c23w;
    }

    public int getC24w() {
        return c24w;
    }
}
