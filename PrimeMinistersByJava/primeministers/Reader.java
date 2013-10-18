package primeministers;

import java.io.File;
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

        /*
         *総理大臣の情報を記したCSVファイルを記憶するフィールド。
         */
        private File filename;

        /*
         *リーダのコンストラクタ。
         */
        public Reader(){
                return;
        }

        /*
         *ダウンロードしたCSVファイルを応答する。
         */
        public File filename(){
                return null;
        }

        /*
         *ダウンロードしたCSVファイルのローカルなファイルを応答するクラスメソッド。
         */
        public static File filenameOfCSV(){
                return null;
        }

        /*
         *ダウンロードしたCSVファイルを読み込んでテーブルを応答する。
         */
        public Table table(){
                return null;
        }
}