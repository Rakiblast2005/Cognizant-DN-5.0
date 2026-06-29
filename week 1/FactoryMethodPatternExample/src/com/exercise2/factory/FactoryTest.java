package com.exercise2.factory;

public class FactoryTest {

    public static void main(String[] args) {

        System.out.println("===== Factory Method Pattern Demo =====\n");

        DocumentFactory wordFactory = new WordFactory();
        wordFactory.launchDocument();

        DocumentFactory pdfFactory = new PdfFactory();
        pdfFactory.launchDocument();

        DocumentFactory excelFactory = new ExcelFactory();
        excelFactory.launchDocument();

        System.out.println("All document operations completed successfully.");
    }
}