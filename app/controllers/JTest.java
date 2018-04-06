package controllers;

import Util_Rpt.ReadExcel;
import com.aspose.cells.*;
import com.avaje.ebean.Ebean;
import entities.TV;
import entities.WaterFallLteData;
import play.mvc.Controller;

import javax.sql.RowSet;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.*;

/**
 * Created by Dost Muhammad on 3/13/2018.
 */


public class JTest {
    /*
    public static void main(String args[]) throws SQLException {

        try{

            Process proc =
                    Runtime.getRuntime().exec("cmd /c dir c:\\logfile.log /tc");

            BufferedReader br =
                    new BufferedReader(
                            new InputStreamReader(proc.getInputStream()));

            String data ="";

            //it's quite stupid but work
            for(int i=0; i<6; i++){
                data = br.readLine();
            }

            System.out.println("Extracted value : " + data);

            //split by space
            StringTokenizer st = new StringTokenizer(data);
            String date = st.nextToken();//Get date
            String time = st.nextToken();//Get time

            System.out.println("Creation Date  : " + date);
            System.out.println("Creation Time  : " + time);

        }catch(IOException e){

            e.printStackTrace();

        }

    }*/
    }



