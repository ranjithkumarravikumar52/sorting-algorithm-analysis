package com.sortingalgorithm.daolayer.datapersistence;

import com.sortingalgorithm.daolayer.format.FormatType;
import com.sortingalgorithm.daolayer.model.DataAnalysis;

public class DataPersistence {

    private DataAnalysis dao;
    private FormatType formatType;

    public DataPersistence(DataAnalysis dao, FormatType formatType) {
        this.dao = dao;
        this.formatType = formatType;
    }

    public boolean saveData(){
       try {
           formatType.save(dao);
           return true;
       }catch (Exception e){
           e.printStackTrace();
           return false;
       }
    }
}
