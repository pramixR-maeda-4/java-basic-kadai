package text.kadai_018;

public class KatoExec_Chapter18 {
	public static void main(String[] args) {
		KatoTaro_Chapter18 katoTaro = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 katoIchiro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 katoHanako = new KatoHanako_Chapter18();
		
		katoTaro.setGivenName("太郎"); // kato taro に太郎と命名
		katoIchiro.setGivenName("一郎"); // kato ichiro に一郎と命名
		katoHanako.setGivenName("花子"); // kato hanako に花子と命名
		
		katoTaro.execIntroduce(); // taroの紹介
		System.out.print("\n"); // 改行で見やすくしているだけ
		katoIchiro.execIntroduce(); // ichiroの紹介
		System.out.print("\n"); // 改行で見やすくしているだけ
		katoHanako.execIntroduce(); // hanakoの紹介
	}
}
