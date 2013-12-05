package primeministers;

import java.io.File;
import java.util.ArrayList;
import java.io.BufferedWriter;

/**
 * ライタ：総理大臣の情報のテーブルをHTMLページとして書き出す。
 */
public class Writer extends IO
{
	/**
	 * ここを作成してください。
	 * まず、次のページを参照しながら、スケルトン（スタブ）を作ることから始めましょう。
	 * http://www.cc.kyoto-su.ac.jp/~atsushi/Programs/CSV2HTML/PrimeMinistersJavaDoc/index.html
	 */
	
	/**
	 * ライタのコンストラクタ。
	 */
	public Writer(){
	}
	
	/**
	 * 属性リストを応答する。
	 */
	public Attributes attributes(){
		return super.table.attributes();
	}
	
	/**
	 * ローカルなHTMLのインデックスファイル(index.html)を応答するクラスメソッド。
	 */
	public File filenameOfHTML(){
		return new File(directoryOfPages().toString()+"/index.html");
	}
	
	/**
	 * HTMLページを基にするテーブルを受け取って、インデックスファイル(index.html)に書き出す。
	 */
	public Table table(Table aTable){
		//下のメソッド郡を使用するよー
		super.table = aTable;
		try {
			BufferedWriter outputWriter = new BufferedWriter(new FileWriter().filenameOfHTML()));
			writeHeaderOn(outputWriter);
			writeTableBodyOn(outputWriter);
			writeFooterOn(outputWriter);
			outputWriter.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return super.table;
	}
	
	/**
	 * タプル群を応答する。
	 */
	public ArrayList<Tuple> tuples(){
		return super.table.tuples();
	}
	
	/**
	 * 属性リストを書き出す
	 */
	public void writeAttributesOn(BufferedWriter outputWriter){
		try {
			outputWriter.write("\t\t\t\t\t\t<tr>\n");
			Iterator<String> ite = this.attribute().name().iterator();
			while (ite.hasNext()) {
				outputWriter.write()
			}
		}catch (<#exception#>) {
			<#handler#>
		}
	}
		return;
	}
	
	/**
	 * フッタを書き出す。
	 */
	public void writeFooterOn(BufferedWriter outputWriter){
		return;
	}
	
	/**
	 * ヘッダを書き出す。
	 */
	public void writeHeaderOn(BufferedWriter outputWriter){
		return;
	}
	
	/**
	 * ボディを書き出す。
	 */
	public void writeTableBodyOn(BufferedWriter outputWriter){
		return;
	}
	
	/**
	 * タプルを書き出す。
	 */
	
	public void writeTuplesOn(BufferedWriter outputWriter){
		return;
	}
	
	
}
