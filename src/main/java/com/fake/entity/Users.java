package com.fake.entity;

import com.entity.ThreadEntity;
import com.entity.UserEntity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Users extends ArrayList<UserEntity> {
    public Users(Threads threads, Comments comments){
        Set<ThreadEntity> threadEntitySet01 = new HashSet<>();
        Set<ThreadEntity> threadEntitySet02 = new HashSet<>();
        Set<ThreadEntity> threadEntitySet03 = new HashSet<>();
        Set<ThreadEntity> threadEntitySet04 = new HashSet<>();
        Set<ThreadEntity> threadEntitySet05 = new HashSet<>();
        Set<ThreadEntity> threadEntitySet06 = new HashSet<>();
        Set<ThreadEntity> threadEntitySet07 = new HashSet<>();
        Set<ThreadEntity> threadEntitySet08 = new HashSet<>();
        Set<ThreadEntity> threadEntitySet09 = new HashSet<>();
        Set<ThreadEntity> threadEntitySet10 = new HashSet<>();

        threadEntitySet01.add(threads.get(0));

        threadEntitySet02.add(threads.get(1));
        threadEntitySet02.add(threads.get(2));
        threadEntitySet02.add(threads.get(3));
        threadEntitySet02.add(threads.get(4));
        threadEntitySet02.add(threads.get(5));

        threadEntitySet03.add(threads.get(6));
        threadEntitySet03.add(threads.get(7));

        // set 4 is intentionally empty
        // threadEntitySet01.add();

        threadEntitySet05.add(threads.get(8));

        threadEntitySet06.add(threads.get(10));
        threadEntitySet07.add(threads.get(11));
        threadEntitySet08.add(threads.get(12));
        threadEntitySet09.add(threads.get(13));
        threadEntitySet10.add(threads.get(14));

//        UserEntity userEntity01 = new UserEntity(11, "alligator", "apricot", null);
//        UserEntity userEntity02 = new UserEntity(12, "bear", "beans", null);
//        UserEntity userEntity03 = new UserEntity(13, "camel", "cabbage", null);
//        UserEntity userEntity04 = new UserEntity(14, "deer", "donut", null);
//        UserEntity userEntity05 = new UserEntity(15, "eagle", "fajita", null);
//        UserEntity userEntity06 = new UserEntity(16, "falcon", "granola", null);
//        UserEntity userEntity07 = new UserEntity(17, "goat", "honey", null);
//        UserEntity userEntity08 = new UserEntity(18, "heron", "ice", null);
//        UserEntity userEntity09 = new UserEntity(19, "iguana", "jerky", null);
//        UserEntity userEntity10 = new UserEntity(20, "jackal", "kiwi", null);
    }
}
