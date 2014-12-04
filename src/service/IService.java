package service;

import java.util.List;

public interface IService {
	/**
	 * 
	 * @return
	 */
	List<?> getPOList();

	// 更新
	boolean updatePO(Object pojo);

	int updatePOs(List<?> pojos);

	// 删除
	boolean deletePO(Object pojo);

	boolean deletesPO(List<?> pojos);

}
