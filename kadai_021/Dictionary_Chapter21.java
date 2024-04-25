package text.kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	private HashMap<String, String> dictionary;
	
	public Dictionary_Chapter21() {
		dictionary = new HashMap<String, String>();
		// ArrayList<String> dictionaryKeyList = new ArrayList<String>();
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウィ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
		
		// System.out.println("log");
		// for (型名 変数名 : 取得される変数) <== 類似:foreach文
		for (String str : dictionary.keySet()) {
			// System.out.println(dictionary.get(str));
			
			// 辞書に追加されていない場合出力する
			if (dictionary.get(str) == null) {
				System.out.println(str);
			}
		}
	}
	
	// key検索のメソッドをまとめたもの
	private String getSearchWord(String keyWord) {
		return dictionary.get(keyWord)==null ? "辞書に存在しません": dictionary.get(keyWord);
	}
	// 検索します
	public void searchWordLog(String[] words) {
		for (int i = 0; i < words.length; i++) {
			System.out.println(getSearchWord(words[i]));
		}
	}
	
}
