package text.kadai_021;

public class DictionaryExec_Chapter21 {
	public static void main(String[] args) {
		Dictionary_Chapter21 dic_21 = new Dictionary_Chapter21();
		
		String[] searchWord = new String[4];
		searchWord[0]="apple";
		searchWord[1]="banana";
		searchWord[2]="grape";
		searchWord[3]="orange";
		
		dic_21.searchWordLog(searchWord);
	}
	
}
