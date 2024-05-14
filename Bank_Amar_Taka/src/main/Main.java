package main;

import java.io.File;
import java.io.IOException;

// Import MainPage from the gui package
import gui.MainPage;

public class Main {
    public static void main(String[] args) 
    {
        try{
            createDependency();
        }
        catch(IOException e)
        {
          System.out.println("Error creating dependency");   
        }
        
        // Instantiate MainPage
        final MainPage main = new MainPage(540,10);
        main.setVisible(true);
    }
    public static void createDependency() throws IOException
    {
        File directory = new File("users");
        if (!directory.exists())
        {
            directory.mkdir();
        }

        File file = new File("usernamelist.txt");
         if(!file.exists())
         {
             file.createNewFile();
         }
    }
}
