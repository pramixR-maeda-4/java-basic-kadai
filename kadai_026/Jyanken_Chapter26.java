package text.kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	// 自分のじゃんけんで出した手
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		String handKey = null;
		int missHand = 0;
		while (handKey==null) {
			Scanner scnr = new Scanner(System.in);
			// 何度か入力ミスをすると出力されます
			if (missHand % 5 == 4) {
				System.out.println("自分のじゃんけんの手を入力しましょう");
				System.out.println("グーはrockのrを入力しましょう");
				System.out.println("チョキはscissorsのsを入力しましょう");
				System.out.println("パーはpaperのpを入力しましょう");
			}
			// wait key
			handKey=scnr.next();
			switch(handKey) {
			case "r":
			case "R":
			case "s":
			case "S":
			case "p":
			case "P":
				missHand = 0;
				scnr.close();
				break;
			default:
				System.out.println(handKey + "はいづれにもあてはまりません。もう一度選びなおしてください");
				handKey=null;
				missHand++;
				break;
			}
		}
		return handKey;
	}
	// 対戦相手のじゃんけんの手
	public String getRandom() {
		// 配列にじゃんけんの手をセット
		String[] handName = {
			"r", "s", "p"
		};
		// 乱数でじゃんけんの手を取得
		short randHand = (short)Math.floor(Math.random()*3);
		// 取得した手を返す
		return handName[randHand];
	}
	// じゃんけんを行う
	public void playGame(String key) {
		// handを設定
		HashMap<String, String> hand = new HashMap<String, String>();
		hand.put("r", "グー");
		hand.put("s", "チョキ");
		hand.put("p", "パー");
		String myHand = hand.get(key), opponentHand = hand.get(getRandom());
		// draw lose win
		if (myHand.equals(opponentHand)) {
			System.out.println("あいこです");
		} else {
			System.out.println(
				myHand.equals(hand.get("r")) && opponentHand.equals(hand.get("s")) ||
				myHand.equals(hand.get("s")) && opponentHand.equals(hand.get("p")) ||
				myHand.equals(hand.get("p")) && opponentHand.equals(hand.get("r")) ?
				"あなたの勝ちです" : "あなたの負けです"
			);
		}
	}
}
