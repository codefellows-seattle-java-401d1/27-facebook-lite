package com.example.panos.friendlist;

import com.example.panos.friendlist.Class.FriendDB;
import com.example.panos.friendlist.Classes.Friend;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class FriendListPopulatesTest {
    @Test
    public void checkNames() {FriendDB friends = new FriendDB();
        Friend friend1 = new Friend("Julius","Wait wasn't this a republic?");
        Friend friend2 = new Friend("Octavian","Practically flawless");
        Friend friend3 = new Friend("Tiberius","He was alright");
        Friend friend4 = new Friend("Nero","Pretty bad PR");
        Friend friend5 = new Friend("Justinian","Empire too big");

        assertTrue(friends.Friends[0].equals(friend1));
        assertTrue(friends.Friends[1].equals(friend2));
        assertTrue(friends.Friends[2].equals(friend3));
        assertTrue(friends.Friends[3].equals(friend4));
        assertTrue(friends.Friends[4].equals(friend5));
    }
}