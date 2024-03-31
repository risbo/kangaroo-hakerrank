package com.kangaroo.service;

public class KangarooService {
    
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        boolean completed = true;
        int k1Jump = x1;
        int k2Jump = x2;
        while(completed) {
            k1Jump +=v1;
            k2Jump +=v2;
            if(k1Jump == k2Jump){
                completed = false;
            }
        }
        return completed ? "YES" : "NO";

    }
}
