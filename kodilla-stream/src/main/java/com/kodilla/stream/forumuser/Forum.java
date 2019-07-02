package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List <ForumUser> theForumUserList = new ArrayList<>();


    public Forum() {
        theForumUserList.add(new ForumUser(1, "Jan", 'M', 1977,01,13,28));
        theForumUserList.add(new ForumUser(1, "Joanna", 'F', 1979,03,30,5));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUserList);
    }
}

