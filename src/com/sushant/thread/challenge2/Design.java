package com.sushant.thread.challenge2;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Sushant
 *
 */
public class Design {
    private int code;
    private String name;
    private List<Long> votes;

    public Design(int code, String name) {
        this.code = code;
        this.name = name;
        this.votes = new ArrayList();
    }

    public int getCode() {
        return code;
    }
    public String getName() {
        return name;
    }

    public List<Long> getVotes() {
        return votes;
    }
}
