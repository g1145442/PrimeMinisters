package primeministers;

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
			
		} catch (FileNotFoundException fileNotFoundException) {
			// Fileオブジェクト生成時の例外捕捉
			fileNotFoundException.printStackTrace();
		} catch (IOException iOException) {
			// BufferedReaderオブジェクトのクローズ時の例外捕捉
			iOException.printStackTrace();
		}
		return null;
	}
}
