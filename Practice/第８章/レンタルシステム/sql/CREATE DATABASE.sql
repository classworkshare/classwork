# データベースの作成
# 「RentalSystemDB」という名前でデータベースを作成します。

CREATE DATABASE IF NOT EXISTS RentalSystemDB;
USE RentalSystemDB

# データベース接続ユーザの作成
# usernameやpasswordなどは必要に応じて変更してください
# その際、MenuView.java内のデータベース接続ユーザ名とパスワードを変更してください。

CREATE USER IF NOT EXISTS 'username'@'localhost' IDENTIFIED WITH mysql_native_password BY 'password';
GRANT ALL ON RentalSystemDB.* TO 'username'@'localhost';

# 作品テーブル
create table ARTWORK_TABLE (
    artwork_num   varchar(3),   # 作品番号
    artwork_name  varchar(20),  # 作品名
    recent_div    varchar(2),   # 新旧区分
    genre_num     varchar(1),   # ジャンル
    PRIMARY KEY(artwork_num)    # 主キー
);

# サンプルデータ
insert into ARTWORK_TABLE (artwork_num, artwork_name, recent_div, genre_num) values ("001", "呪怨", "準", "1");
insert into ARTWORK_TABLE (artwork_num, artwork_name, recent_div, genre_num) values ("002", "シャンハイナイト", "新", "4");
insert into ARTWORK_TABLE (artwork_num, artwork_name, recent_div, genre_num) values ("003", "美女と野獣", "旧", "6");
insert into ARTWORK_TABLE (artwork_num, artwork_name, recent_div, genre_num) values ("004", "ターミネーター", "旧", "3");
insert into ARTWORK_TABLE (artwork_num, artwork_name, recent_div, genre_num) values ("005", "指輪物語", "新", "6");



# DVDテーブル
create table DVD_TABLE (
    artwork_num  varchar(3),             # 作品番号
    media_num    varchar(2),             # DVD媒体番号（枝番号）
    entry_day    datetime,               # 入荷日
    disuse_day   datetime,               # 貸出停止日
    PRIMARY KEY(artwork_num, media_num)  # 主キー
);

# サンプルデータ
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("001", "01", "2014/03/03", "2014/08/10");
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("001", "02", "2014/03/03", "2014/08/10");
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("001", "03", "2014/03/03", "2014/08/10");
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("001", "04", "2014/08/09", "2014/08/10");
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("001", "05", "2014/04/06", null);
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("001", "06", "2014/04/06", null);
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("001", "07", "2014/08/10", null);
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("001", "08", "2014/08/09", null);
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("001", "09", "2014/08/10", null);
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("001", "10", "2014/08/10", null);
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("001", "11", "2014/08/10", null);
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("001", "12", "2014/08/10", null);
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("001", "13", "2014/08/10", null);
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("002", "01", "2014/02/01", null);
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("002", "02", "2014/02/01", null);
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("002", "03", "2014/02/01", null);
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("002", "04", "2014/02/01", null);
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("002", "05", "2014/02/01", null);
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("002", "06", "2014/08/10", null);
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("002", "07", "2014/08/10", null);
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("002", "08", "2014/08/10", null);
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("002", "09", "2014/08/10", null);
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("002", "10", "2014/08/10", null);
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("003", "01", "2013/11/23", null);
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("003", "02", "2013/11/23", null);
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("003", "03", "2013/11/23", null);
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("003", "04", "2014/08/10", null);
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("003", "05", "2014/08/10", null);
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("004", "01", "2013/12/24", "2014/08/10");
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("004", "02", "2013/12/24", null);
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("004", "03", "2014/08/10", null);
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("005", "01", "2014/03/05", null);
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("005", "02", "2014/03/05", null);
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("005", "03", "2014/03/05", null);
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("005", "04", "2014/03/05", null);
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("005", "05", "2014/03/05", null);
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("005", "06", "2014/08/09", null);
insert into DVD_TABLE (artwork_num, media_num, entry_day, disuse_day) values ("005", "07", "2014/08/10", null);


# ジャンルテーブル
create table GENRE_TABLE (
    genre_num   varchar(1),   # ジャンル番号
    genre_name  varchar(10),  # ジャンル名
    PRIMARY KEY(genre_num)    # 主キー
);

# サンプルデータ
insert into GENRE_TABLE (genre_num, genre_name) values ("1", "ホラー");
insert into GENRE_TABLE (genre_num, genre_name) values ("2", "人生ドラマ");
insert into GENRE_TABLE (genre_num, genre_name) values ("3", "アクション");
insert into GENRE_TABLE (genre_num, genre_name) values ("4", "カンフー");
insert into GENRE_TABLE (genre_num, genre_name) values ("5", "戦争");
insert into GENRE_TABLE (genre_num, genre_name) values ("6", "その他");


# 会員テーブル
create table MEMBER_TABLE (
    member_num      varchar(5),         # 会員番号
    member_name     varchar(20),        # 氏名
    member_address  varchar(50),        # 住所
    member_age      integer,            # 年齢
    member_tel      varchar(15),        # 電話番号「-(ハイフン)付」
    member_mail     varchar(30),        # メールアドレス
    enter_day       datetime not null,  # 入会年月日
    leave_day       datetime,           # 退会年月日
    rank_div        varchar(2),         # 会員優良区分
    PRIMARY KEY(member_num)             # 主キー
);

# サンプルデータ
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00001", "佐藤 誠", "東京都中野区中野", "27", "xxx-677-x763", "sato@example.com", "2014/08/08", null, "可");
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00002", "鈴木 大輔", "東京都中野区上高田", "27", "xxx-460-x555", "suzuki@example.com", "2014/08/09", null, "優");
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00003", "田中 誠", "東京都中野区東中野", "27", "xxx-891-x677", "tanaka@example.com", "2014/08/09", null, "ka");
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00004", "鈴木 哲也", "東京都中野区中央", "27", "xxx-857-x196", "tsuzuki@example.com", "2014/08/09", null, "ka");
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00005", "伊藤 達也", "東京都中野区本町", "27", "xxx-124-x440", "titou@example.com", "2014/08/09", "2014/08/09", "優");
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00006", "鈴木 恵", "東京都中野区弥生町", "24", "xxx-590-x261", "esuzuki@example.com", "2014/08/09", null, "優");
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00007", "田中 あゆみ", "東京都中野区南台", "54", "xxx-592-x270", "m-kojima@ppp.net", "2014/08/09", null, "優");
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00008", "鈴木 かおり", "東京都中野区丸山", "26", "xxx-185-x599", "atanaka@example.com", "2014/08/10", null, "可");
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00009", "中村 理恵", "東京都中野区江古田", "29", "xxx-920-x247", "nakamura@example.com", "2014/08/10", null, "優");
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00010", "中村 太郎", "東京都中野区江原町", "22", "xxx-211-x186", "tnakamura@example.com", "2014/08/10", null, "優");
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00011", "小林 美紀", "東京都中野区松が丘", "22", "xxx-221-x808", "mkobayashi@example.com", "2014/08/10", "2014/08/10", "優");
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00012", "山本 秀樹", "東京都中野区沼袋", "23", "xxx-666-x807", "hyamamoto@example.com", "2014/08/10", null, "優");
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00013", "高橋 真弓", "東京都中野区新井", "23", "xxx-019-x807", "takahashi@example.com", "2014/08/10", null, "優");
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00014", "山本 歩", "東京都中野区野方", "22", "xxx-224-x800", "ayamamoto@example.com", "2014/08/10", null, "優");
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00015", "小林 和彦", "東京都中野区上鷺宮", "11", "xxx-766-x807", "kobayashi@example.com", "2014/08/10", "2014/08/10", "優");
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00016", "伊藤 早苗", "東京都中野区鷺宮", "27", "xxx-404-x905", "itou@example.com", "2014/08/10", "2014/08/10", "優");
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00017", "山本 勝", "東京都中野区若宮", "12", "xxx-227-x907", "myamamoto@example.com", "2015/01/14", "2015/01/14", "可");


# 料金テーブル
create table PRICE_TABLE (
    recent_div           varchar(50),  # 新旧区分
    rental_charge        integer,      # レンタル料金
    rental_period        integer,      # レンタル可能日数
    arrears_par_unit_day integer,      # 延滞料金（1日あたり）
    PRIMARY KEY(recent_div)            # 主キー
);

# サンプルデータ
insert into PRICE_TABLE(recent_div, rental_charge, rental_period, arrears_par_unit_day) values ("旧", "100", 7, 100);
insert into PRICE_TABLE(recent_div, rental_charge, rental_period, arrears_par_unit_day) values ("準", "250", 4, 150);
insert into PRICE_TABLE(recent_div, rental_charge, rental_period, arrears_par_unit_day) values ("新", "300", 2, 200);


# 貸出テーブル
create table RENTAL_TABLE (
    rental_num     varchar(6),  # 貸出番号
    check_out_day  datetime,    # 貸出日
    member_num     varchar(5),  # 会員番号
    artwork_num    varchar(3),  # 作品番号
    media_num      varchar(2),  # DVD媒体番号
    term_day       datetime,    # 返却期限
    check_in_day   datetime,    # 返却日
    arrears        integer,     # 延滞金
    PRIMARY KEY(rental_num)     # 主キー
);


# サンプルデータ
insert into RENTAL_TABLE (rental_num,check_out_day, member_num, artwork_num, media_num, term_day, check_in_day, arrears) values("000001", "2014/08/09", "00001", "001", "01", "2014/08/11", "2014/08/12", "0");
insert into RENTAL_TABLE (rental_num,check_out_day, member_num, artwork_num, media_num, term_day, check_in_day, arrears) values("000002", "2014/08/09", "00001", "001", "01", "2014/08/11", "2014/08/12", "0");
insert into RENTAL_TABLE (rental_num,check_out_day, member_num, artwork_num, media_num, term_day, check_in_day, arrears) values("000003", "2015/01/07", "00006", "005", "07", "2015/01/09", null, "0");
insert into RENTAL_TABLE (rental_num,check_out_day, member_num, artwork_num, media_num, term_day, check_in_day, arrears) values("000004", "2015/01/10", "00003", "004", "01", "2015/01/17", "2015/01/17", "0");
insert into RENTAL_TABLE (rental_num,check_out_day, member_num, artwork_num, media_num, term_day, check_in_day, arrears) values("000005", "2015/01/11", "00005", "002", "09", "2015/01/13", null, "0");
insert into RENTAL_TABLE (rental_num,check_out_day, member_num, artwork_num, media_num, term_day, check_in_day, arrears) values("000006", "2015/01/11", "00005", "003", "01", "2015/01/18", "2015/01/18", "0");
insert into RENTAL_TABLE (rental_num,check_out_day, member_num, artwork_num, media_num, term_day, check_in_day, arrears) values("000007", "2015/01/11", "00005", "004", "03", "2015/01/18", "2015/01/18", "0");
insert into RENTAL_TABLE (rental_num,check_out_day, member_num, artwork_num, media_num, term_day, check_in_day, arrears) values("000008", "2015/01/11", "00005", "002", "09", "2015/01/13", null, "0");
insert into RENTAL_TABLE (rental_num,check_out_day, member_num, artwork_num, media_num, term_day, check_in_day, arrears) values("000009", "2015/01/11", "00005", "003", "03", "2015/01/18", "2015/01/18", "0");
insert into RENTAL_TABLE (rental_num,check_out_day, member_num, artwork_num, media_num, term_day, check_in_day, arrears) values("000010", "2015/01/14", "00004", "003", "03", "2015/01/21", "2015/01/21", "0");
insert into RENTAL_TABLE (rental_num,check_out_day, member_num, artwork_num, media_num, term_day, check_in_day, arrears) values("000011", "2015/01/14", "00004", "001", "02", "2015/01/18", "2015/01/18", "0");
insert into RENTAL_TABLE (rental_num,check_out_day, member_num, artwork_num, media_num, term_day, check_in_day, arrears) values("000012", "2015/01/14", "00001", "003", "03", "2015/01/21", null, "0");
insert into RENTAL_TABLE (rental_num,check_out_day, member_num, artwork_num, media_num, term_day, check_in_day, arrears) values("000013", "2015/01/14", "00001", "001", "05", "2015/01/18", null, "0");
