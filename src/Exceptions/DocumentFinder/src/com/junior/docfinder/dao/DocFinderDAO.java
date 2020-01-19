package Exceptions.DocumentFinder.src.com.junior.docfinder.dao;

import Exceptions.DocumentFinder.src.com.junior.docfinder.entity.DocDescription;
import Exceptions.DocumentFinder.src.com.junior.docfinder.filter.DocFilter;
//import javax.naming.directory.InvalidSearchFilterException;

public interface DocFinderDAO {
    public DocDescription[] findDocuments(DocFilter filter) throws Exception;
}
