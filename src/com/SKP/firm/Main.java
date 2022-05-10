package com.SKP.firm;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        addFiveComputersAndPrintThem();
    }

    private static void addFiveComputersAndPrintThem() throws IOException, ClassNotFoundException {

        //Zapis komputerów jako lista
        List<Computer> computers = Arrays.asList(
            new Computer("CustomBrand","1",
                    new Processor("2130mHz","intel",2),
                    new Graphics("GTX","1050Ti"),
                    new User("Jack","Smith","JackSmith@email.com")
            ),
            new Computer("9G","10",
                    new Processor("2630mHz","radeon",4),
                    new Graphics("RTX","3090"),
                    new User("Anne","Rock","AnneRock@email.com")
            ),
            new Computer("9G","13",
                    new Processor("2700mHz","intel",4),
                    new Graphics("GTX","1080"),
                    new User("John","Doe","JohnDoe@email.com")
            ),
            new Computer("9G","19",
                    new Processor("2133mHz","intel",8),
                    new Graphics("GT","970"),
                    new User("Andrew","Garcia","AndrewGarcia@email.com")
            ),
            new Computer("BlueBalloon","99",
                    new Processor("1997mHz","radeon",16),
                    new Graphics("GTX","1060"),
                    new User("Joanne","Smith","JoanneSmith@email.com")
            )
        );

        //Serializacja listy komputerów do pliku .db
        try{
            FileOutputStream fos = new FileOutputStream("/computersData.db");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(computers);
            oos.close();
            fos.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }

        //Deserializacja listy komputerów z pliku .db
        try {
            FileInputStream fis = new FileInputStream("/computersData.db");
            ObjectInputStream ois = new ObjectInputStream(fis);
            computers = (List<Computer>) ois.readObject();
            ois.close();
            fis.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }catch(ClassNotFoundException c){
            System.out.println("Class not found");
            c.printStackTrace();
        }

        System.out.println("Wypis komputerów po deserializacji:");
        for (Computer a : computers) {
            System.out.println(a);
        }

        //Pierwsza operacja ze strumieni. Losowanie komputera
        System.out.println("\nLosowo wybrany komputer to:");
        Random random = new Random();
        IntStream randStream = random.ints(1,1,5);
        randStream.forEach(System.out::println);

        //Druga operacja ze strumieni
        System.out.println("\nWypis komputerów z co najmniej 4 rdzeniami procesora oraz marką 9G:");
        Stream<Computer> computerWith4Cores = computers.stream();
        computerWith4Cores.filter(g -> g.processor.getCoreCount() >= 4)
                .filter(g -> g.brand.contains("9G"))
                .forEach(System.out::println);

        //Trzecia operacja ze strumieni
        System.out.println("\nWypis imion osób posiadających kartę graficzną typu GTX:");
        Stream<Computer> userName = computers.stream();
        userName.filter(g -> g.graphics.getType().contains("GTX"))
                .map(g -> g.user.getName())
                .forEach(System.out::println);
    }

}
