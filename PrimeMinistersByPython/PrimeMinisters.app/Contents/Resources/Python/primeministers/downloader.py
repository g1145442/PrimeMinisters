#! /usr/bin/env python
# -*- coding: utf-8 -*-

import os
import shutil
import urllib

import io
import reader

class Downloader(io.IO):
	"""ダウンローダ：総理大臣のCSVファイル・画像ファイル・サムネイル画像ファイルをダウンロードする。"""

	def __init__(self, base_directory):
		"""ダウンローダのコンストラクタ。"""
		return

	def download_all(self):
		"""すべて（総理大臣の情報を記したCSVファイル・画像ファイル群・縮小画像ファイル群）をダウンロードし、テーブルを応答する。"""
		self.download_csv()
		return None

	def download_csv(self):
		"""総理大臣の情報を記したCSVファイルをダウンロードする。"""
		
		try: 
			with open('PrimeMinister.csv','w') as local_file:
				try: 
					a_file = urllib.urlopen('http://www.cc.kyoto-su.ac.jp/~atsushi/Programs/CSV2HTML/PrimeMinisters/PrimeMinisters.csv')
				except URLError, an_exception: 
					print an_exception.reason
				shutil.copyfileobj(a_file,local_file)
				a_file.close()
		except IOError, an_exception: print an_exception.reason
		
		return None

	def download_images(self, image_filenames):
		"""画像ファイル群または縮小画像ファイル群をダウンロードする。"""
		return
