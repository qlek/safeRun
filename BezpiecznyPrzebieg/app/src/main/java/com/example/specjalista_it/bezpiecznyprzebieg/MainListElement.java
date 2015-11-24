package com.example.specjalista_it.bezpiecznyprzebieg;

/**
 * Created by Specjalista-IT on 2015-11-24.
 */
public class MainListElement {

    private int id;
    private String text;

    public MainListElement(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
