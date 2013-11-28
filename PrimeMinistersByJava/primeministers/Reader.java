package primeministers;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * リーダ：総理大臣の情報を記したCSVファイルを読み込んでテーブルに仕立て上げる。
 */
public class Reader extends IO
{
	/**
	 * ここを作成してください。
	 * まず、次のページを参照しながら、スケルトン（スタブ）を作ることから始めましょう。
	 * http://www.cc.kyoto-su.ac.jp/~atsushi/Programs/CSV2HTML/PrimeMinistersJavaDoc/index.html
	 */
	
	/**
	 * 総理大臣の情報を記したCSVファイルを記憶するフィールド。
	 */
	private File filename;
	
	/**
	 * リーダのコンストラクタ。
	 */
	public Reader()
	{
		this.filename = new File("PrimeMinisters.csv");
		return;
	}
	
	/**
	 * ダウンロードしたCSVファイルを応答する。
	 */
	public File filename()
	{
		return this.filename;
	}
	
	/**
	 * ダウンロードしたCSVファイルのローカルなファイルを応答するクラスメソッド。
	 */
	public static File filenameOfCSV(){
		return null;
	}
	
	/**
	 * ダウンロードしたCSVファイルを読み込んでテーブルを応答する。
	 */
<<<<<<< HEAD
	public Table table()
	{
		
		boolean first = true;
		
		ArrayList<String> aCollection = IO.readTextFromFile(this.filename);
		Table inputTable = new Table();
		inputTable.attributes(new Attributes("input"));
		
		for (String str : aCollection){
			ArrayList<String> aRaw = IO.splitString(str, ",");
			if(first){first = false;}
=======
	public Table table(){
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(this.filename));
			
			// 最終行まで読み込む
			String line = "";
			while ((line = br.readLine()) != null) {
				
				// 1行をデータの要素に分割
				StringTokenizer token = new StringTokenizer(line, ",");
				
				while (token.hasMoreTokens()) {
					// 1行の各要素をタブ区切りで表示
					System.out.print(token.nextToken() + "\t");
				}
				System.out.println();
			}
			br.close();
>>>>>>> 026c33101b3a9618485e8d2c3e33fcbfa899b236
			
		}
<<<<<<< HEAD

		
=======
>>>>>>> 026c33101b3a9618485e8d2c3e33fcbfa899b236
		return null;
	}
}
