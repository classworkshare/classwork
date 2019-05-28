@rem このファイルがある場所に移動する
cd /d %~dp0


@rem コンパイル
javac rentalSystem\Main.java


@rem プログラム実行
java -cp .\lib\*;. rentalSystem.Main


pause
