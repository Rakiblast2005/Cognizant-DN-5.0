package com.exercise2.factory;

public class ExcelFile implements Document {

    @Override
    public void open() {
        System.out.println("Excel workbook opened.");
    }

    @Override
    public void save() {
        System.out.println("Excel workbook saved successfully.");
    }

    @Override
    public void close() {
        System.out.println("Excel workbook closed.\n");
    }
}