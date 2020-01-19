package Exceptions.DocumentFinder.src.com.junior.docfinder.business;

import Exceptions.DocumentFinder.src.com.junior.docfinder.dao.DocFinderDAO;
import Exceptions.DocumentFinder.src.com.junior.docfinder.dao.DocFinderDAOFactory;
import Exceptions.DocumentFinder.src.com.junior.docfinder.entity.DocDescription;
import Exceptions.DocumentFinder.src.com.junior.docfinder.filter.DocFilter;

public class DocFinder {

    public DocDescription[] findDocuments(DocFilter filter) {
        DocFinderDAOFactory factory = DocFinderDAOFactory.getInstance();
        DocFinderDAO dao = factory.getDAO();
        DocDescription[] list = dao.findDocuments(filter);
        return list;
    }
}
