package com.PoorStudentManagerment.tester;

import com.PoorStudentManagerment.util.SQLHelper;

public class sqlitetester {
    public static void main(String[] args) {
        SQLHelper sqlHelper = new SQLHelper();
        sqlHelper.executeUpdate("CREATE TABLE A(A int)");
    }
}
