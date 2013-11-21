package primeministers;

import java.io.File;
import java.util.ArrayList;
import java.net.URL;
/**
 * 入出力：リーダ・ダウンローダ・ライタを抽象する。
 */
public abstract class IO extends Object
{
	/**
	 * ここを作成してください。
	 * まず、次のページを参照しながら、スケルトン（スタブ）を作ることから始めましょう。
	 * http://www.cc.kyoto-su.ac.jp/~atsushi/Programs/CSV2HTML/PrimeMinistersJavaDoc/index.html
	 */

        /*
         * テーブル(表：スプレッドシート)を記憶するフィールド。
         */
        protected Table table;

        /*
         * 入出力のコンストラクタ。
         */
        public IO(){
                return;
        }
        
        /*
         * ファイルやディレクトリを削除するクラスメソッド。
         */
        public static void deleteFoleOrDirectory(File aFile){
                return;
        }

        /*
         *総理大臣ページのためのディレクトリ(存在しなければ作成して)を応答するメソッド。
         */
        public static File directoryOfPages(){
                return null;
        }

        /*
         *入出力する際の文字コードを応答するクラスメソッド。
         */
        public static String encodingSymbol(){
                return null;
        }

        /*
         *指定されたファイルからテキストを読み込んで、それを行リストにして応答するクラスメソッド。
         */
        public static ArrayList<String> readTextFromFile(File aFile)
		{
			ArrayList<String> readText;
			
			try{
				FileReader filereader = new FileReader(afile);
				int readLine = filereader.read();
				readText.add(readLine);
			}catch(FileNotFoundException fileNotFoundException){
				fileNotFoundException.PrintStackTrace();
			}catch(IOException iOException){
				iOException.PrintStackTrace();
			}
			
			return readText;
        }
        
        /*
         *指定されたファイル文字列からテキストを読み込んで、それを行リストにして応答するクラスメソッド。
         */
        public static ArrayList<String> readTextFromFile(String fileString)
		{
			ArrayList<String> lineList;
			String[] text = text.split(",", 0);
			for(String str : text)
			{
				lineList.add(str);
			}
			
			return lineList;
        }

        /*
         *指定されたURL文字列からテキストを読み込んで、それを行リストにして応答するクラスメソッド。
         */
        public static ArrayList<String> readTextFromURL(String urlString){
                return null;
        }
        
        /*
         *指定されたURLからテキストを読み込んで、それを行リストにして応答するクラスメソッド。
         */
        public static ArrayList<String> readTextFromURL(URL aURL){
                return null;
        }

        /*
         *文字列をセパレータで分割したトークン列を応答するクラスメソッド。
         */
        public static ArrayList<String> splitString(String string,String separators){
    			ArrayList<String> tokenList = new ArrayList<String>();
				String str[] = string.split(separators);
				for(int i=0;i<str.size();i++){
					tokenList.add(str[i]);	
				}
				return tokenList;
        }

        /*
         *テーブルを応答する。
         */
        public Table table(){
                return table;
        }

        /*
         *指定された行リストを、指定されたファイルに書き出すクラスメソッド。
         */
        public static void writeText(ArrayList<String> aCollection,File aFile){
			return;
		}

        /*
         *指定された行リストを、指定されたファイル名のファイルに書き出すクラスメソッド。
         */
        public static void writeText(ArrayList<String> aCollection,String fileString){
                return;
        }
}
