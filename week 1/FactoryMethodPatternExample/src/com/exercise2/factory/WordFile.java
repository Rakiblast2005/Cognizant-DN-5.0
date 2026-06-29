package com.exercise2.factory;

public class WordFile implements Document {

    @Override
    public void open() {
        System.out.println("Microsoft Word document opened.");
    }

    @Override
    public void save() {
        System.out.println("Word document saved successfully.");
    }

    @Override
    public void close() {
        System.out.println("Word document closed.\n");
    }
}