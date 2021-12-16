package selectionSort;

/**
 * @description: 主方法
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/16 10:23
 */
public class Main {
	public static void main(String[] args) {
		String[] data = {"Dumpty", "Bowman", "Carroll", "Elfland", "Alice",};
		SortAndPrint sap = new SortAndPrint(data, new SelectionSorter());
		sap.execute();
	}
}
