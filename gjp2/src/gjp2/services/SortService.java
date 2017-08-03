package gjp2.services;

import java.util.List;

import gjp2.dao.SortDao;
import gjp2.domain.Sort;

public class SortService {
	private SortDao sortDao = new SortDao();
	
	public void addSort(Sort sort){
		sortDao.addSort(sort);
	}
	
	public List<Sort> querySortAll(){
		return sortDao.querySortAll();
	}
}
