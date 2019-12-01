package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List <ForumUser> theForumUserList = new ArrayList<>();


    public Forum() {
        theForumUserList.add(new ForumUser(1, "Jan", 'M', 1977,01,13,28));
        theForumUserList.add(new ForumUser(2, "Joanna", 'F', 1979,03,30,5));
        theForumUserList.add(new ForumUser(3, "Barbara", 'F', 1986, 12, 18, 0));
        theForumUserList.add(new ForumUser(4, "Damian", 'M',1992, 6, 23, 54));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUserList);
    }
}

