package com.exercise2.factory;

public class PdfFile implements Document {

    @Override
    public void open() {
        System.out.println("PDF document opened.");
    }

    @Override
    public void save() {
        System.out.println("PDF document saved successfully.");
    }

    @Override
    public void close() {
        System.out.println("PDF document closed.\n");
    }
}