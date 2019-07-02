package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args ) {
        Forum theForum = new Forum();
        Map <Integer, ForumUser> map = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> (2019 - (forumUser.getBirthDate().getYear()) >= 20))
                .filter(forumUser -> forumUser.getPostCount() > 1 )
                .collect(Collectors.toMap(forumUser -> forumUser.getUserID(), forumUser -> forumUser ));
        System.out.println(map);
    }
}