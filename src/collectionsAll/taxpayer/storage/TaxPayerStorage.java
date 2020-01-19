package collectionsAll.taxpayer.storage;

import collectionsAll.taxpayer.Enterprise;
import collectionsAll.taxpayer.Person;
import collectionsAll.taxpayer.TaxPayer;

/**
 *
 * @author ASaburov
 */
public class TaxPayerStorage {
    private static final int TAXPAYER_NUMBER = 10;

    public TaxPayer[] getTaxPayers() {
        TaxPayer[] tpList = new TaxPayer[TAXPAYER_NUMBER];

        for(int i=0; i<tpList.length; i++) {
            if(Math.random()>0.5) {
                tpList[i] = new Person();
            } else {
                tpList[i] = new Enterprise();
            }
        }

        return tpList;
    }
}
