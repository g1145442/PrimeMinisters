package primeministers;

import java.net.URL;
import java.net.URLConnection;
import java.io.InputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


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
         *総理大臣の情報を記したCSVファイルの在処(URL文字列)を記憶するフィールド。
         */
        private String url;


        /*
         *ダウンローダのコンストラクタ。
         */
        
		public Downloader(){
			this.url="http://www.cc.kyoto-su.ac.jp/~atsushi/Programs/CSV2HTML/PrimeMinisters/PrimeMinisters.csv";
			return;
		}

        /*
         *総理大臣の情報を記しCSVファイルをダウンロードする。
         */
		public void downloadCSV(){
			URL csvURL;
			InputStream in;
			FileOutputStream out;
			URLConnection conect;
			try{
				
				csvURL = new URL(url);
				conect = csvURL.openConnection();
				in = conect.getInputStream();
				
				File file = new File("CSV/PrimeMinisters.csv");
				out = new FileOutputStream(file,false);

                                this.url="CSV/PrimeMinisters.csv";
                                //CSVファイルを落としてきたので相対パスに変更
				int b;
				
				while((b = in.read())!=-1){
					out.write(b);
				}
				in.close();
				out.close();
			}catch(IOException e){
				System.out.println("e");
			}finally{
			}
			return;
		}


        /*
         *総理大臣の画像群をダウンロードする。
         */
        public void downloadImages(){
                return;
        }
        
        /*
         *総理大臣の画像群またはサムネイル画像群をダウンロードする。
         */
        private void downloadPictures(int indexOfPicture){
                return;
        }

        /*
         *総理大臣の画像群をダウンロードする。
         */
        public void downloadThumbnails(){
                return;
        }

        /*
         *総理大臣の情報を記したCSVファイルをダウンロードして、画像群やサムネイル画像群を
         *ダウンロードし、テーブルで応答する。
         */
        @Override
        public Table table(){
                return null;
        }

        /*
         *総理大臣の情報を記したCSVファイルの在処(URL)を文字列で応答する。
         */
        public String url(){
                return this.url;
        }

        /*
         *総理大臣の情報の在処(URL)を文字列で応答するクラスメソッド。
         */
        public static String urlString(){
                return "http://www.cc.kyoto-su.ac.jp/~atsushi/Programs/CSV2HTML/PrimeMinisters/PrimeMinisters.csv";
        }


        /*
         *総理大臣の情報を記したCSVファイル在処(URL)を文字列で応答するクラスメソッド。
         */
        public static String urlStringOfCSV(){
                return "CSV/PrimeMinisters.csv";
        }
}
