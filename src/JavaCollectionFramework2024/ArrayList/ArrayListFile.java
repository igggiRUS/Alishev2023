package JavaCollectionFramework2024.ArrayList;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListFile {
	public static void main(String[] args) {
		// укажите путь к папке

		Scanner scanner = new Scanner("D:\\JAVA LEARN\\_ALISHEV\\Наиль Алишев Продвинутая Java\\02 Java Collections Framework Коллекции\\");
		System.out.println("Укажите путь к файлам : ");
		String folderPath = scanner.nextLine();
		System.out.println(folderPath);
		// создаем список файлов
		ArrayList<String> fileName = new ArrayList<>();

		// Получите объект File для указанной папки
		File folder = new File(folderPath);
		// получите список папок и файлов в указанной папке
		File[] listOfFiles = folder.listFiles();

		// пройтись по каждому файлу и добавить его название в массив список
		for (File file :
				listOfFiles) {
			if (file.isFile()) {
				fileName.add(file.getName());
			}
		}
		System.out.println(fileName);
		for (int i = 0; i < fileName.size(); i++) {
			System.out.println(fileName.get(i));

		}
		String postFix = folderPath;
//		String postFix = "D:\\JAVA LEARN\\_ALISHEV\\Наиль Алишев Продвинутая Java\\02 Java Collections Framework Коллекции\\";
		// D:\JAVA LEARN\_ALISHEV\Наиль Алишев Продвинутая Java\02 Java Collections Framework Коллекции\

		ArrayList<String> arrayListPath = new ArrayList<>();
		int countSlash = 0;

		String searchChar = "\\";
		boolean found = arrayListPath.contains(postFix);
		while (found){
			countSlash++;
		}
		System.out.println(countSlash);
	}


}

