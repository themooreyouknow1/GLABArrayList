import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {
    public static void main(String[] args) {
//        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
//        firstFivePrimeNumbers.add(2);
//        firstFivePrimeNumbers.add(3);
//        firstFivePrimeNumbers.add(5);
//        firstFivePrimeNumbers.add(7);
//        firstFivePrimeNumbers.add(11);
//
//        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);
//        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
//        nextFivePrimeNumbers.add(13);
//        nextFivePrimeNumbers.add(17);
//        nextFivePrimeNumbers.add(19);
//        nextFivePrimeNumbers.add(23);
//        nextFivePrimeNumbers.add(29);
//
//        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
//        System.out.println(firstTenPrimeNumbers);

        //Access ArrayList example:

        List<String> topCompanies = new ArrayList<>();
        System.out.println("Is the topCompanies list empty? : " + topCompanies.isEmpty());

        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        System.out.println("Here are the top " + topCompanies.size() + " companies om the world: ");
        System.out.println(topCompanies);

        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size() - 1);

        System.out.println("Best Company: " + bestCompany);
        System.out.println("Second Best Company: " + secondBestCompany);
        System.out.println("Last Company in the list: " + lastCompany);

        topCompanies.set(4, "Walmart");
        System.out.println("Modified top companies list: " + topCompanies);

    }
}
