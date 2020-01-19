package collectionsAll.taxpayer;

import collectionsAll.taxpayer.storage.TaxPayerStorage;

/**
 *
 * @author ASaburov
 */
public class Test {

    public static void main(String[] args) {
        TaxPayerStorage tps = new TaxPayerStorage();
        TaxPayer[] tpArray = tps.getTaxPayers();

        for(TaxPayer tp : tpArray) {
            System.out.println(tp.getInfo());
        }
    }

}
