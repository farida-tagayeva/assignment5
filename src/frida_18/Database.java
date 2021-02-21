package frida_18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Database {
    private Connection connection;

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itcompany?useUnicode=true&serverTimezone=UTC", "root", "");
            System.out.println("CONNECTED");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    ArrayList<FSDcompany> getAllFSDcompany(){
        ArrayList<FSDcompany> company = new ArrayList<>();

        try{
            PreparedStatement st = connection.prepareStatement("SELECT * FROM company");
            ResultSet rs = st.executeQuery();


        }catch (Exception e){
            e.printStackTrace();
        }

    }



}


