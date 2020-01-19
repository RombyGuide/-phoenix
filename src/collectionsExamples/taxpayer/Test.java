package collectionsExamples.taxpayer;

import collectionsExamples.taxpayer.storage.TaxPayerStorage;

public class Test {

    public static void main(String[] args) {
        TaxPayerStorage tps = new TaxPayerStorage();
        TaxPayer[] tpArray = tps.getTaxPayers();

        for(TaxPayer tp : tpArray) {
            System.out.println(tp.getInfo());
        }
    }

}
