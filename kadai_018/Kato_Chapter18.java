package text.kadai_018;

public abstract class Kato_Chapter18 {
	public String familyName = "加藤";
	public String givenName = "";
	public String address = "東京都中野区〇×";
	
	// 共通の紹介
	public void commonIntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
	}
	// 個別の紹介
	abstract public void eachIntroduce();
	// 紹介実行
	public void execIntroduce() {
		this.commonIntroduce();
		this.eachIntroduce();
	}
	
}
