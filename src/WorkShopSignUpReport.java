/*
        Task: Workshop signup report
A community workshop collects attendee names through an online form. Sometimes the same person submits the form more than once. The organizer wants to see all submissions, count the unique attendees, and print the unique names alphabetically.

Write a Java program that:
1. Stores every submitted name in a List<String> in the order received.
2. Uses a HashSet<String> to find the unique attendees.
3. Uses a TreeSet<String> to print the unique names in alphabetical order.
4. Prints:
   - All submitted names.
   - The number of submissions.
   - The number of unique attendees.
   - The unique names in alphabetical order.
Use sample data with at least two repeated names. Keep the task focused on List and Set; we can practice Map in a later task.


 */


import java.util.*;

public class WorkShopSignUpReport {

    public static void main(String[] args) {

        List<String> users = new ArrayList<>(10);

        users.add("John");
        users.add("Jane");
        users.add("Julie");
        users.add("Julie");
        users.add("Julie");
        users.add("hamza");
        users.add("hamza");
        users.add("mustafa");
        users.add("ahmad");
        users.add("ahmad");
        users.add("ahmad");
        users.add("ahmad");
        users.add("ahmad");
        users.add("ahmad");
        users.add("ahmad");
        users.add("ahmad");
        users.add("ahmad");


        Set<String> usersSet = new TreeSet<>();

        //usersSet.addAll(users);

        //for(int i = 0; i < users.size() ; i++){}

        for (String user : users){
            usersSet.add(user);
        }


        Integer userCount = usersSet.size();

        System.out.println("All submitted users");
        for(String user : users){
            System.out.println(user);
        }

        System.out.println("\nNumber of users: " + userCount);

        System.out.println("\nuniqe submitted users:");
        for(String u : usersSet){
            System.out.println(u);
        }


        Map<String , Integer> map = new HashMap<>();

        for (String u : users){
            if(map.containsKey(u)){
                map.put(u,map.get(u)+1);
            } else{
                map.put(u,1);
            }
        }

        System.out.println("\nnumber of time form submitte bye each users : ");
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " +  entry.getValue());
        }

    }

}
