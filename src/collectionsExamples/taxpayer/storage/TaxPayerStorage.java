package collectionsExamples.taxpayer.storage;

import collectionsExamples.taxpayer.Enterprise;
import collectionsExamples.taxpayer.Person;
import collectionsExamples.taxpayer.TaxPayer;

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
