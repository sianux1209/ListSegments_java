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
	 * Main 함수
	 * @param : args[0]
	 */
	public static void main(String[] args) {
		try { // 에러 처리를 위한 try문
			File[] fileList = fileOpen(args[0]); // args[0]으로부터 받은 디렉토리명에서 파일 목록 추출
			Stream<File> fileStream = sortingList(fileList); // FileList 정렬
			printFileStream(fileStream); // FileStream 추력
		} catch (Exception e) {
			System.out.println(e.getMessage()); // 에러 출력
		}
	}
	/**
	 * 파일 스트림 출력
	 * @param : fileStream
	 */
	private static void printFileStream(Stream<File> fileStream) {
		fileStream.forEach(file -> System.out.println(file.getName())); // File Stream 출력
	}
	/**
	 * 파일 리스트 정렬
	 * @param : fileList
	 * @return File Stream
	 */
	private static Stream<File> sortingList(File[] fileList) {
		Arrays.sort(fileList); // fileList 정렬
		return Arrays.stream(fileList); // stream 객체로 변환
	}
	/**
	 * 파일 오픈 함수
	 * @param args
	 * @return File list
	 */
	private static File[] fileOpen(String args) {

		File dir = new File(args); // args으로부터 디렉토리 받음
		return dir.listFiles(); // File List 반환
	}
}