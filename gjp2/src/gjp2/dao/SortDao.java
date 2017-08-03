package gjp2.dao;

import java.sql.SQLException;
import java.util.List;

import javax.management.RuntimeErrorException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import gjp2.domain.Sort;
import gjp2.tools.JDBCUtils;

public class SortDao {
	private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
	
	public void addSort(Sort sort){
		try{
			String sql = "INSERT INTO gjp_sort(sname,parent,sdesc)values(?,?,?)";
			
			Object[] params = {sort.getSname(),sort.getParent(),sort.getSdesc()};
			
			int row = qr.update(sql, params);
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public List<Sort> querySortAll(){
		try{
			String sql = "SELECT * FROM gjp_sort";
			
			List<Sort> list = qr.query(sql, new BeanListHandler<Sort>(Sort.class));
			return list;
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
