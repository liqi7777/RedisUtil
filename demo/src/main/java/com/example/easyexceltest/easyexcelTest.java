package com.example.easyexceltest;

import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.metadata.Sheet;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

/**
 * @author Sky
 * create 2019/07/24
 * email sky.li@ixiaoshuidi.com
 **/
public class easyexcelTest {
    public static void main(String[] args) throws FileNotFoundException {

//        InputStream inputStream = new FileInputStream(new File("C:\\Users\\Administrator\\Desktop\\新智能硬件\\比特\\宁巢水电表(1).xlsx"));
//        List<Object> data = EasyExcelFactory.read(inputStream, new Sheet(2, 0, BiTeReadExcelModel.class));
//        for (Object datum : data) {
//            System.out.println(datum.getClass());
//        }

        ExcelReader reader = ExcelUtil.getReader("I:\\ningchao.xlsx");
        List<BiTeReadExcelModel> biTeReadExcelModels = reader.readAll(BiTeReadExcelModel.class);
        System.out.println(biTeReadExcelModels.toString());

    }
}
