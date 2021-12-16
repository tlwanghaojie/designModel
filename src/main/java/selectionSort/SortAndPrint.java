package selectionSort;

import java.util.Arrays;

/**
 * @description: 排序并打印
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/16 10:20
 */
public class SortAndPrint {
	Comparable[] data;
	Sorter sorter;

	public SortAndPrint(Comparable[] data, Sorter sorter) {
		this.data = data;
		this.sorter = sorter;
	}

	public void execute() {
		print();
		sorter.sort(data);
		print();
	}

	public void print() {
		Arrays.stream(data).forEach(i -> System.out.print(i + ", "));
		System.out.println("");
	}
}
