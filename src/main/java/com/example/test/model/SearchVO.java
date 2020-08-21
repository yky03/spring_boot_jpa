package com.example.test.model;

//RENAME FILE : Shift + F6
//get,set : Alt + insert


import lombok.Data;

@Data
public class SearchVO {

    private String id;
    private String email;
    private int page;
}


/*
public class SearchVO {

    private String id;
    private String email;
    private int page;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
*/
