@rem このファイルがある場所に移動する
cd /d %~dp0


@rem コンパイル
javac Rental.java


@rem プログラム実行
java -cp .\lib\*;. Rental


pause
