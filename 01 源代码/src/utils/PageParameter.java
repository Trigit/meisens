package utils;

/**
 * @Class Description:分页参数
 * @author Boki
 * @Date 2014年12月7日 - 下午4:41:22
 */
public class PageParameter {
	private int currentPage;
	private int pageSize;

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
}
