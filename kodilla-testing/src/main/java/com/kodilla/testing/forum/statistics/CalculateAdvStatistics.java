package com.kodilla.testing.forum.statistics;

import java.util.List;
import java.util.ArrayList;

public class CalculateAdvStatistics {

    private int usrCount;
    private int postCount;
    private int commCount;
    private double avgPostUsr;
    private double avgCommUser;
    private double avgCommPost;

    public void calculateAdvStatistics (Statistics statistics ) {
        usrCount = statistics.usersNames().size();
        postCount = statistics.postsCount();
        commCount = statistics.commentsCount();
        if (usrCount == 0) {
            avgPostUsr = 0.0;
        } else {
            avgPostUsr = postCount / usrCount;
        }
        if (usrCount == 0) {
            avgCommUser = 0.0;
        } else {
            avgCommUser = commCount / usrCount;
        }
        if (postCount == 0) {
            avgCommPost = 0.0;
        } else {
            avgCommPost = commCount / postCount;
        }
    }
    public int getUsrCount() {
        return usrCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommCount() {
        return commCount;
    }

    public double getAvgPostUsr() {
        return avgPostUsr;
    }

    public double getAvgCommUser() {
        return avgCommUser;
    }

    public double getAvgCommPost() {
        return avgCommPost;
    }
}
