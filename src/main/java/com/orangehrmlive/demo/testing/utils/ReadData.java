package com.orangehrmlive.demo.testing.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadData {

    private XSSFWorkbook workbook;
    private FileInputStream campo;

    public ReadData() {

    }

    public ReadData(XSSFWorkbook workbook, FileInputStream campo) {
        this.workbook = workbook;
        this.campo = campo;
    }

    public String ReadData(String sheet1, String path, int ColumValue, int RowValue) throws IOException {
        campo = new FileInputStream(new File(path));
        workbook = new XSSFWorkbook(campo);
        Sheet sheet = workbook.getSheet(sheet1);
        Row row = sheet.getRow(RowValue);
        Cell cell = row.getCell(ColumValue);
        String value = cell.getStringCellValue();
        return value;
    }


}

