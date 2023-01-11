package com.sha.tests;

import org.testng.annotations.Test;

import com.sha.testdata.TestData;

import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;

public class DataSupplierTest {
	
	@Test(dataProvider = "getData")
    public void dataSupplierTest(TestData testData) {
        System.out.println(testData.username);
    }

    @DataSupplier 
    public StreamEx<TestData> getData(){
        return TestDataReader.use(XlsxReader.class)
                .withTarget(TestData.class)
                .withSource("testdata.xlsx")
                .read();
    }

}
