package week23;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        try {
            //Tutor class instance to hold tutor details
            Tutor tutor = new Tutor();

            //Create a File with the specified path
            File file = new File("C:\\JavaFiles\\details.txt");

            //Buffered reader to read the file into Java
            BufferedReader br = new BufferedReader(new FileReader(file));

            //read the file
            String line = br.readLine();
            while (line != null) {
                //split each line using the : into String[]
                String[] splitLine = line.split(":");
                //check the contents of the line and map relevant details to the attributes in Tutor class
                if (splitLine[0].equals("givenName")) {
                    tutor.setGivenName(splitLine[1]);
                } else if (splitLine[0].equals("surname")) {
                    tutor.setSurname(splitLine[1]);
                } else if (splitLine[0].equals("email")) {
                    tutor.setEmail(splitLine[1]);
                } else if (splitLine[0].equals("room")) {
                    tutor.setRoom(splitLine[1]);
                }
                //read the next line whilst there are lines to read
                line = br.readLine();
            }
            //close the reader once finished
            br.close();

            //Print the Tutor details once populated.
            System.out.println(tutor);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
