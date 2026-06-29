package com.exercise2.factory;

public class ExcelFactory extends DocumentFactory {

    @Override
    public Document createDocument() {

        return new ExcelFile();
    }
}