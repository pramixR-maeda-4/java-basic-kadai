package text.kadai_018;

public class KatoExec_Chapter18 {
	public static void main(String[] args) {
		KatoTaro_Chapter18 katoTaro = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 katoIchiro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 katoHanako = new KatoHanako_Chapter18();
		
		katoTaro.setGivenName();
		katoIchiro.setGivenName();
		katoHanako.setGivenName();
		
		katoTaro.execIntroduce(); // taroの紹介
		System.out.print("\n"); // 改行で見やすくしているだけ
		katoIchiro.execIntroduce(); // ichiroの紹介
		System.out.print("\n"); // 改行で見やすくしているだけ
		katoHanako.execIntroduce(); // hanakoの紹介
	}
}
