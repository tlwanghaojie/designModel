package compositePattern;

/**
 * @description: 针对文件调用add方法时抛出的异常
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/16 10:46
 */
public class FileTreatmentException extends RuntimeException {
	public FileTreatmentException() {
	}

	public FileTreatmentException(String msg) {
		super(msg);
	}
}
