package primeministers;

import java.util.ArrayList;
import java.awt.image.BufferedImage;
/**
 * 表：総理大臣の情報テーブル。
 */
public class Table extends Object
{
	/**
	 * ここを作成してください。
	 * まず、次のページを参照しながら、スケルトン（スタブ）を作ることから始めましょう。
	 * http://www.cc.kyoto-su.ac.jp/~atsushi/Programs/CSV2HTML/PrimeMinistersJavaDoc/index.html
	 */
        
        /*
         *属性リストを記憶するフィールド。
         */
        private Attributes attributes;

        /*
         *画像群を記憶するフィールド。
         */
        private ArrayList<BufferedImage> images;
        
        /*
         *サムネイル画像群を記憶するフィールド。
         */
        private ArrayList<BufferedImage> thumbnails;

        /*
         *タプル群を記憶するフィールド。
         */
        private ArrayList<Tuple> tuples;

        /*
         *テーブルのコンストラクタ。
         */
        public Table(){
                return;
        }

        /*
         *タプルを追加する。 (実装:今江)
         */
        public void add(Tuple aTuple)
		{
			this.tuples.add(aTuple);
			return;
        }

        /*
         *属性リストを応答する。 (実装:今江)
         */
        public Attributes attributes(){
			return this.attributes;
        }

        /*
         *属性リストを設定する。
         */
        public void attributes(Attributes instanceOfAttributes)
		{
			//Attributesの仕様がわからないので未実装
			return;
        }

        /*
         *画像群を応答する。 (実装:今江)
         */
        public ArrayList<BufferedImage> images(){
                return this.images;
        }

        /*
         *画像またはサムネイル画像の文字列を受け取って該当画像を応答する。
         */
        private BufferedImage picture(String aString){
                return null;
        }

        /*
         *サムネイル画像群を応答する。 (実装:今江)
         */
        public ArrayList<BufferedImage> thumbnails(){
                return this.thumbnails;
        }

        /*
         *自分自身を文字列にして、それを応答する。
         */
        public String toString(){
                return null;
        }

        /*
         *タプル群を応答する。 (実装:今江)
         */
        public ArrayList<Tuple> tuples(){
                return this.tuples;
        }
}
