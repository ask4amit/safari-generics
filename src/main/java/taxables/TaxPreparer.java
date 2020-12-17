package taxables;

import java.util.ArrayList;
import java.util.List;

public class TaxPreparer {
  public static void prepareTaxes(Taxable t) {}
//  public static void prepareBulkTaxes(List<Taxable> lt) {
  public static void prepareBulkTaxes(List<? extends Taxable> lt) {
//    lt.add(new Corporation()); // Because of type erasure, runtime CANNOT reject this!!!!
    for (Taxable t : lt) {
      prepareTaxes(t);
    }
  }

  public static void getIndividualClients(List<Individual> li) {
    li.add(new Individual());
    li.add(new Individual());
  }

  public static void main(String[] args) {
    List<Taxable> client = new ArrayList<>();
    client.add(new Corporation());
    client.add(new Corporation());
    client.add(new Individual());

    prepareBulkTaxes(client);
    getIndividualClients(client);

    List<Individual> joesClients = new ArrayList<>();
    joesClients.add(new Individual());
    joesClients.add(new Individual());

    prepareBulkTaxes(joesClients);

//    prepareBulkTaxes(List.of(""));
  }
}
