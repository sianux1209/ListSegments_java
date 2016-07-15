import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * List Sements_java
 * @author enrjfenrjf
 *
 */
public class ListSements {
	/**
	 * Main �Լ�
	 * @param : args[0]
	 */
	public static void main(String[] args) {
		try { // ���� ó���� ���� try��
			File[] fileList = fileOpen(args[0]); // args[0]���κ��� ���� ���丮���� ���� ��� ����
			Stream<File> fileStream = sortingList(fileList); // FileList ����
			printFileStream(fileStream); // FileStream �߷�
		} catch (Exception e) {
			System.out.println(e.getMessage()); // ���� ���
		}
	}
	/**
	 * ���� ��Ʈ�� ���
	 * @param : fileStream
	 */
	private static void printFileStream(Stream<File> fileStream) {
		fileStream.forEach(file -> System.out.println(file.getName())); // File Stream ���
	}
	/**
	 * ���� ����Ʈ ����
	 * @param : fileList
	 * @return File Stream
	 */
	private static Stream<File> sortingList(File[] fileList) {
		Arrays.sort(fileList); // fileList ����
		return Arrays.stream(fileList); // stream ��ü�� ��ȯ
	}
	/**
	 * ���� ���� �Լ�
	 * @param args
	 * @return File list
	 */
	private static File[] fileOpen(String args) {

		File dir = new File(args); // args���κ��� ���丮 ����
		return dir.listFiles(); // File List ��ȯ
	}
}