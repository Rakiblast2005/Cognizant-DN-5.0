package com.exercise2.factory;

public class WordFactory extends DocumentFactory {

    @Override
    public Document createDocument() {

        return new WordFile();
    }
}