package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AzielCase {
    static Boolean isLock;

    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();
        Collections.addAll(nameList,
                "Rizwan", "Nisar", "Nikhat", "Rizwan", "Nisar", "Nikhatt", "Patel", "Patel1", "Abba", "Ammi",
                "Bashumia", "Najamunnisa", "Zulekha", "Zulekha", "Naaz", "Zaid", "Aziel", "Aziel", "Azil", "Zde","Rizwan", "Nisar", "Nikhat", "Rizwan", "Nisar", "Nikhatt", "Patel", "Patel1", "Abba", "Ammi",
                "Bashumia", "Najamunnisa", "Zulekha", "Zulekha", "Naaz", "Zaid", "Aziel", "Aziel", "Azil", "Zde","Rizwan", "Nisar", "Nikhat", "Rizwan", "Nisar", "Nikhatt", "Patel", "Patel1", "Abba", "Ammi",
                "Bashumia", "Najamunnisa", "Zulekha", "Zulekha", "Naaz", "Zaid", "Aziel", "Aziel", "Azil", "Zde","Rizwan", "Nisar", "Nikhat", "Rizwan", "Nisar", "Nikhatt", "Patel", "Patel1", "Abba", "Ammi",
                "Bashumia", "Najamunnisa", "Zulekha", "Zulekha", "Naaz", "Zaid", "Aziel", "Aziel", "Azil", "Zde","Rizwan", "Nisar", "Nikhat", "Rizwan", "Nisar", "Nikhatt", "Patel", "Patel1", "Abba", "Ammi",
                "Bashumia", "Najamunnisa", "Zulekha", "Zulekha", "Naaz", "Zaid", "Aziel", "Aziel", "Azil", "Zde","Rizwan", "Nisar", "Nikhat", "Rizwan", "Nisar", "Nikhatt", "Patel", "Patel1", "Abba", "Ammi",
                "Bashumia", "Najamunnisa", "Zulekha", "Zulekha", "Naaz", "Zaid", "Aziel", "Aziel", "Azil", "Zde","Rizwan", "Nisar", "Nikhat", "Rizwan", "Nisar", "Nikhatt", "Patel", "Patel1", "Abba", "Ammi",
                "Bashumia", "Najamunnisa", "Zulekha", "Zulekha", "Naaz", "Zaid", "Aziel", "Aziel", "Azil", "Zde","Rizwan", "Nisar", "Nikhat", "Rizwan", "Nisar", "Nikhatt", "Patel", "Patel1", "Abba", "Ammi",
                "Bashumia", "Najamunnisa", "Zulekha", "Zulekha", "Naaz", "Zaid", "Aziel", "Aziel", "Azil", "Zde","Rizwan", "Nisar", "Nikhat", "Rizwan", "Nisar", "Nikhatt", "Patel", "Patel1", "Abba", "Ammi",
                "Bashumia", "Najamunnisa", "Zulekha", "Zulekha", "Naaz", "Zaid", "Aziel", "Aziel", "Azil", "Zde","Rizwan", "Nisar", "Nikhat", "Rizwan", "Nisar", "Nikhatt", "Patel", "Patel1", "Abba", "Ammi",
                "Bashumia", "Najamunnisa", "Zulekha", "Zulekha", "Naaz", "Zaid", "Aziel", "Aziel", "Azil", "Zde","Rizwan", "Nisar", "Nikhat", "Rizwan", "Nisar", "Nikhatt", "Patel", "Patel1", "Abba", "Ammi",
                "Bashumia", "Najamunnisa", "Zulekha", "Zulekha", "Naaz", "Zaid", "Aziel", "Aziel", "Azil", "Zde","Rizwan", "Nisar", "Nikhat", "Rizwan", "Nisar", "Nikhatt", "Patel", "Patel1", "Abba", "Ammi",
                "Bashumia", "Najamunnisa", "Zulekha", "Zulekha", "Naaz", "Zaid", "Aziel", "Aziel", "Azil", "Zde","Rizwan", "Nisar", "Nikhat", "Rizwan", "Nisar", "Nikhatt", "Patel", "Patel1", "Abba", "Ammi",
                "Bashumia", "Najamunnisa", "Zulekha", "Zulekha", "Naaz", "Zaid", "Aziel", "Aziel", "Azil", "Zde","Rizwan", "Nisar", "Nikhat", "Rizwan", "Nisar", "Nikhatt", "Patel", "Patel1", "Abba", "Ammi",
                "Bashumia", "Najamunnisa", "Zulekha", "Zulekha", "Naaz", "Zaid", "Aziel", "Aziel", "Azil", "Zde","Rizwan", "Nisar", "Nikhat", "Rizwan", "Nisar", "Nikhatt", "Patel", "Patel1", "Abba", "Ammi",
                "Bashumia", "Najamunnisa", "Zulekha", "Zulekha", "Naaz", "Zaid", "Aziel", "Aziel", "Azil", "Zde");

        List<String> nameListOthere =new ArrayList<>();

        Collections.addAll(nameListOthere, "Rizwan", "Nisar", "Nikhat", "Rizwan", "Nisar", "Nikhatt", "Patel", "Patel1", "Abba", "Ammi",
                "Bashumia", "Najamunnisa", "Zulekha", "Zulekha", "Naaz", "Zaid", "Aziel", "Aziel", "Azil", "Zde","Rizwan", "Nisar", "Nikhat", "Rizwan", "Nisar", "Nikhatt", "Patel", "Patel1", "Abba", "Ammi",
                "Bashumia", "Najamunnisa", "Zulekha", "Zulekha", "Naaz", "Zaid", "Aziel", "Aziel", "Azil", "Zde","Rizwan", "Nisar", "Nikhat", "Rizwan", "Nisar", "Nikhatt", "Patel", "Patel1", "Abba", "Ammi",
                "Bashumia", "Najamunnisa", "Zulekha", "Zulekha", "Naaz", "Zaid", "Aziel", "Aziel", "Azil", "Zde","Rizwan", "Nisar", "Nikhat", "Rizwan", "Nisar", "Nikhatt", "Patel", "Patel1", "Abba", "Ammi",
                "Bashumia", "Najamunnisa", "Zulekha", "Zulekha", "Naaz", "Zaid", "Aziel", "Aziel", "Azil", "Zde","Rizwan", "Nisar", "Nikhat", "Rizwan", "Nisar", "Nikhatt", "Patel", "Patel1", "Abba", "Ammi",
                "Bashumia", "Najamunnisa", "Zulekha", "Zulekha", "Naaz", "Zaid", "Aziel", "Aziel", "Azil", "Zde","Rizwan", "Nisar", "Nikhat", "Rizwan", "Nisar", "Nikhatt", "Patel", "Patel1", "Abba", "Ammi",
                "Bashumia", "Najamunnisa", "Zulekha", "Zulekha", "Naaz", "Zaid", "Aziel", "Aziel", "Azil", "Zde","Rizwan", "Nisar", "Nikhat", "Rizwan", "Nisar", "Nikhatt", "Patel", "Patel1", "Abba", "Ammi",
                "Bashumia", "Najamunnisa", "Zulekha", "Zulekha", "Naaz", "Zaid", "Aziel", "Aziel", "Azil", "Zde","Rizwan", "Nisar", "Nikhat", "Rizwan", "Nisar", "Nikhatt", "Patel", "Patel1", "Abba", "Ammi",
                "Bashumia", "Najamunnisa", "Zulekha", "Zulekha", "Naaz", "Zaid", "Aziel", "Aziel", "Azil", "Zde","Rizwan", "Nisar", "Nikhat", "Rizwan", "Nisar", "Nikhatt", "Patel", "Patel1", "Abba", "Ammi",
                "Bashumia", "Najamunnisa", "Zulekha", "Zulekha", "Naaz", "Zaid", "Aziel", "Aziel", "Azil", "Zde","Rizwan", "Nisar", "Nikhat", "Rizwan", "Nisar", "Nikhatt", "Patel", "Patel1", "Abba", "Ammi",
                "Bashumia", "Najamunnisa", "Zulekha", "Zulekha", "Naaz", "Zaid", "Aziel", "Aziel", "Azil", "Zde","Rizwan", "Nisar", "Nikhat", "Rizwan", "Nisar", "Nikhatt", "Patel", "Patel1", "Abba", "Ammi",
                "Bashumia", "Najamunnisa", "Zulekha", "Zulekha", "Naaz", "Zaid", "Aziel", "Aziel", "Azil", "Zde","Rizwan", "Nisar", "Nikhat", "Rizwan", "Nisar", "Nikhatt", "Patel", "Patel1", "Abba", "Ammi",
                "Bashumia", "Najamunnisa", "Zulekha", "Zulekha", "Naaz", "Zaid", "Aziel", "Aziel", "Azil", "Zde","Rizwan", "Nisar", "Nikhat", "Rizwan", "Nisar", "Nikhatt", "Patel", "Patel1", "Abba", "Ammi",
                "Bashumia", "Najamunnisa", "Zulekha", "Zulekha", "Naaz", "Zaid", "Aziel", "Aziel", "Azil", "Zde","Rizwan", "Nisar", "Nikhat", "Rizwan", "Nisar", "Nikhatt", "Patel", "Patel1", "Abba", "Ammi",
                "Bashumia", "Najamunnisa", "Zulekha", "Zulekha", "Naaz", "Zaid", "Aziel", "Aziel", "Azil", "Zde","Rizwan", "Nisar", "Nikhat", "Rizwan", "Nisar", "Nikhatt", "Patel", "Patel1", "Abba", "Ammi",
                "Bashumia", "Najamunnisa", "Zulekha", "Zulekha", "Naaz", "Zaid", "Aziel", "Aziel", "Azil", "Zde");

        System.out.println("In beginnign : " + nameList.size());

        removeDupViaSet(nameList);
        removeDupViaStream(nameListOthere);

    }

    private static void removeDupViaStream(List<String> nameList) {
        long start = System.nanoTime();
        List<String> nm = nameList.stream().distinct().collect(Collectors.toList());
        long end = System.nanoTime() - start;
        System.out.println("Dup Removed via Stream : " + end);
    }

    private static void removeDupViaSet(List<String> nameList) {
        long start = System.nanoTime();
        Set<String> tempHashSet = new HashSet<>();
        tempHashSet.addAll(nameList);
        nameList.clear();
        nameList.addAll(tempHashSet);
        long end = System.nanoTime() - start;
        System.out.println("Dup Removed via Set : " + end);
    }
}
