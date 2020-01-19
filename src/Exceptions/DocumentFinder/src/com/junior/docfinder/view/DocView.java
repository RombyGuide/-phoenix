package Exceptions.DocumentFinder.src.com.junior.docfinder.view;

import Exceptions.DocumentFinder.src.com.junior.docfinder.business.DocFinder;
import Exceptions.DocumentFinder.src.com.junior.docfinder.filter.DocFilter;

public class DocView {

    public void showDocuments() {

        DocFinder docFinder = new DocFinder();

        DocFilter docFilter = new DocFilter();
        docFilter.setDocName("skdhbf");

        docFinder.findDocuments(docFilter);

    }

}
