package com.logic;
import util.ConnectionUtil;

import java.sql.Connection;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    //connect to postgres
    public static void main(String[] args) {
        ConnectionUtil db=new ConnectionUtil();
        Connection conn=db.connect_to_db("postgres","postgres", "4alfonso4");
        db.createTable(conn, "recovery");

    }
}
