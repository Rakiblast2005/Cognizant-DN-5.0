package com.exercise2.factory;

public abstract class DocumentFactory {

    public abstract Document createDocument();

    public void launchDocument() {

        Document doc = createDocument();

        doc.open();
        doc.save();
        doc.close();
    }
}