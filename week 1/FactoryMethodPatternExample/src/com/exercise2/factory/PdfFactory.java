package com.exercise2.factory;

public class PdfFactory extends DocumentFactory {

    @Override
    public Document createDocument() {

        return new PdfFile();
    }
}