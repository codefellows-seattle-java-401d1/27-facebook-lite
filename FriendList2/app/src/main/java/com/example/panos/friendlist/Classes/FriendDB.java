package com.example.panos.friendlist.Classes;

public class FriendDB {
    public Friend[] Friends;
    public FriendDB(){
        Friend friend1 = new Friend("Julius","Wait wasn't this a republic?");
        Friend friend2 = new Friend("Octavian","Practically flawless");
        Friend freind3 = new Friend("Tiberius","He was alright");
        Friend friend4 = new Friend("Nero","Pretty bad PR");
        Friend freind5 = new Friend("Justinian","Empire too big");
        Friend[] Friends= {friend1,friend2,freind3,friend4,freind5};
        this.Friends = Friends;
    }
}
