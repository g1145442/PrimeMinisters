package primeministers;

import java.io.File;
import java.util.ArrayList;

/**
 * ダウンローダ：総理大臣のCSVファイル・画像ファイル・サムネイル画像ファイルをダウンロードする。
 */
public class Downloader extends IO
{
	/**
	 * ここを作成してください。
	 * まず、次のページを参照しながら、スケルトン（スタブ）を作ることから始めましょう。
	 * http://www.cc.kyoto-su.ac.jp/~atsushi/Programs/CSV2HTML/PrimeMinistersJavaDoc/index.html
	 */
	
	/**
	 * 総理大臣の情報を記したCSVファイルの在処(URL文字列)を記憶するフィールド。
	 */
	private String url;
	
	/**
	 * ダウンローダのコンストラクタ。
	 */
	public Downloader()
	{
		this.url = this.url();
	}
	
	/**
	 * 総理大臣の情報を記しCSVファイルをダウンロードする。
	 */
	public void downloadCSV()
	{
		File aFile;
		aFile = new File(this.url);
		ArrayList<String> aCollection = IO.readTextFromFile(aFile);
		aFile = new File("PrimeMinisters.csv");
		IO.writeText(aCollection, aFile);
		return;
	}
	
	
	/**
	 * 総理大臣の画像群をダウンロードする。
	 */
	public void downloadImages()
	{
		return;
	}
	
	/**
	 * 総理大臣の画像群またはサムネイル画像群をダウンロードする。
	 */
	private void downloadPictures(int indexOfPicture)
	{
		return;
	}
	
	/**
	 * 総理大臣の画像群をダウンロードする。
	 */
	public void downloadThumbnails()
	{
		return;
	}
	
	/**
	 * 総理大臣の情報を記したCSVファイルをダウンロードして、画像群やサムネイル画像群を
	 * ダウンロードし、テーブルで応答する。
	 */
	@Override
	public Table table()
	{
		Reader aReader = new Reader();
		this.table = aReader.table();
		
		this.downloadImages();
		this.downloadThumbnails();
		
		return this.table;
	}
	
	/**
	 * 総理大臣の情報を記したCSVファイルの在処(URL)を文字列で応答する。
	 */
	public String url(){
		return this.urlStringOfCSV();
	}
	
	/**
	 * 総理大臣の情報の在処(URL)を文字列で応答するクラスメソッド。
	 */
	public static String urlString() {
		return "http://www.cc.kyoto-su.ac.jp/~atsushi/Programs/CSV2HTML/PrimeMinisters/";
	}
	
	
	/**
	 * 総理大臣の情報を記したCSVファイル在処(URL)を文字列で応答するクラスメソッド。
	 */
	public static String urlStringOfCSV() {
		return Downloader.urlString() + "PrimeMinisters.csv";
	}
}
