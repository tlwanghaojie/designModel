package selectionSort;

/**
 * @description: 排序接口
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/16 10:12
 */
public interface Sorter {
	/**
	 * description 排序方法
	 * @param data 被比较的数据
	 **/
	public abstract void sort(Comparable[] data);
}
