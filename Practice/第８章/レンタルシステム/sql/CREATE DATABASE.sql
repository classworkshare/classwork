# �f�[�^�x�[�X�̍쐬
# �uRentalSystemDB�v�Ƃ������O�Ńf�[�^�x�[�X���쐬���܂��B

CREATE DATABASE IF NOT EXISTS RentalSystemDB;
USE RentalSystemDB

# �f�[�^�x�[�X�ڑ����[�U�̍쐬
# username��password�Ȃǂ͕K�v�ɉ����ĕύX���Ă�������
# ���̍ہAMenuView.java���̃f�[�^�x�[�X�ڑ����[�U���ƃp�X���[�h��ύX���Ă��������B

CREATE USER IF NOT EXISTS 'username'@'localhost' IDENTIFIED WITH mysql_native_password BY 'password';
GRANT ALL ON RentalSystemDB.* TO 'username'@'localhost';

# ��i�e�[�u��
create table ARTWORK_TABLE (
    artwork_num   varchar(3),   # ��i�ԍ�
    artwork_name  varchar(20),  # ��i��
    recent_div    varchar(2),   # �V���敪
    genre_num     varchar(1),   # �W������
    PRIMARY KEY(artwork_num)    # ��L�[
);

# �T���v���f�[�^
insert into ARTWORK_TABLE (artwork_num, artwork_name, recent_div, genre_num) values ("001", "��", "��", "1");
insert into ARTWORK_TABLE (artwork_num, artwork_name, recent_div, genre_num) values ("002", "�V�����n�C�i�C�g", "�V", "4");
insert into ARTWORK_TABLE (artwork_num, artwork_name, recent_div, genre_num) values ("003", "�����Ɩ�b", "��", "6");
insert into ARTWORK_TABLE (artwork_num, artwork_name, recent_div, genre_num) values ("004", "�^�[�~�l�[�^�[", "��", "3");
insert into ARTWORK_TABLE (artwork_num, artwork_name, recent_div, genre_num) values ("005", "�w�֕���", "�V", "6");



# DVD�e�[�u��
create table DVD_TABLE (
    artwork_num  varchar(3),             # ��i�ԍ�
    media_num    varchar(2),             # DVD�}�̔ԍ��i�}�ԍ��j
    entry_day    datetime,               # ���ד�
    disuse_day   datetime,               # �ݏo��~��
    PRIMARY KEY(artwork_num, media_num)  # ��L�[
);

# �T���v���f�[�^
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


# �W�������e�[�u��
create table GENRE_TABLE (
    genre_num   varchar(1),   # �W�������ԍ�
    genre_name  varchar(10),  # �W��������
    PRIMARY KEY(genre_num)    # ��L�[
);

# �T���v���f�[�^
insert into GENRE_TABLE (genre_num, genre_name) values ("1", "�z���[");
insert into GENRE_TABLE (genre_num, genre_name) values ("2", "�l���h���}");
insert into GENRE_TABLE (genre_num, genre_name) values ("3", "�A�N�V����");
insert into GENRE_TABLE (genre_num, genre_name) values ("4", "�J���t�[");
insert into GENRE_TABLE (genre_num, genre_name) values ("5", "�푈");
insert into GENRE_TABLE (genre_num, genre_name) values ("6", "���̑�");


# ����e�[�u��
create table MEMBER_TABLE (
    member_num      varchar(5),         # ����ԍ�
    member_name     varchar(20),        # ����
    member_address  varchar(50),        # �Z��
    member_age      integer,            # �N��
    member_tel      varchar(15),        # �d�b�ԍ��u-(�n�C�t��)�t�v
    member_mail     varchar(30),        # ���[���A�h���X
    enter_day       datetime not null,  # ����N����
    leave_day       datetime,           # �މ�N����
    rank_div        varchar(2),         # ����D�ǋ敪
    PRIMARY KEY(member_num)             # ��L�[
);

# �T���v���f�[�^
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00001", "���� ��", "�����s����撆��", "27", "xxx-677-x763", "sato@example.com", "2014/08/08", null, "��");
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00002", "��� ���", "�����s�����㍂�c", "27", "xxx-460-x555", "suzuki@example.com", "2014/08/09", null, "�D");
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00003", "�c�� ��", "�����s����擌����", "27", "xxx-891-x677", "tanaka@example.com", "2014/08/09", null, "ka");
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00004", "��� �N��", "�����s����撆��", "27", "xxx-857-x196", "tsuzuki@example.com", "2014/08/09", null, "ka");
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00005", "�ɓ� �B��", "�����s�����{��", "27", "xxx-124-x440", "titou@example.com", "2014/08/09", "2014/08/09", "�D");
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00006", "��� �b", "�����s�����퐶��", "24", "xxx-590-x261", "esuzuki@example.com", "2014/08/09", null, "�D");
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00007", "�c�� �����", "�����s�������", "54", "xxx-592-x270", "m-kojima@ppp.net", "2014/08/09", null, "�D");
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00008", "��� ������", "�����s�����ێR", "26", "xxx-185-x599", "atanaka@example.com", "2014/08/10", null, "��");
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00009", "���� ���b", "�����s�����]�Óc", "29", "xxx-920-x247", "nakamura@example.com", "2014/08/10", null, "�D");
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00010", "���� ���Y", "�����s�����]����", "22", "xxx-211-x186", "tnakamura@example.com", "2014/08/10", null, "�D");
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00011", "���� ���I", "�����s����揼���u", "22", "xxx-221-x808", "mkobayashi@example.com", "2014/08/10", "2014/08/10", "�D");
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00012", "�R�{ �G��", "�����s��������", "23", "xxx-666-x807", "hyamamoto@example.com", "2014/08/10", null, "�D");
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00013", "���� �^�|", "�����s�����V��", "23", "xxx-019-x807", "takahashi@example.com", "2014/08/10", null, "�D");
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00014", "�R�{ ��", "�����s�������", "22", "xxx-224-x800", "ayamamoto@example.com", "2014/08/10", null, "�D");
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00015", "���� �a�F", "�����s�������{", "11", "xxx-766-x807", "kobayashi@example.com", "2014/08/10", "2014/08/10", "�D");
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00016", "�ɓ� ���c", "�����s������{", "27", "xxx-404-x905", "itou@example.com", "2014/08/10", "2014/08/10", "�D");
insert into MEMBER_TABLE(member_num, member_name, member_address, member_age, member_tel, member_mail, enter_day, leave_day, rank_div) values("00017", "�R�{ ��", "�����s������{", "12", "xxx-227-x907", "myamamoto@example.com", "2015/01/14", "2015/01/14", "��");


# �����e�[�u��
create table PRICE_TABLE (
    recent_div           varchar(50),  # �V���敪
    rental_charge        integer,      # �����^������
    rental_period        integer,      # �����^���\����
    arrears_par_unit_day integer,      # ���ؗ����i1��������j
    PRIMARY KEY(recent_div)            # ��L�[
);

# �T���v���f�[�^
insert into PRICE_TABLE(recent_div, rental_charge, rental_period, arrears_par_unit_day) values ("��", "100", 7, 100);
insert into PRICE_TABLE(recent_div, rental_charge, rental_period, arrears_par_unit_day) values ("��", "250", 4, 150);
insert into PRICE_TABLE(recent_div, rental_charge, rental_period, arrears_par_unit_day) values ("�V", "300", 2, 200);


# �ݏo�e�[�u��
create table RENTAL_TABLE (
    rental_num     varchar(6),  # �ݏo�ԍ�
    check_out_day  datetime,    # �ݏo��
    member_num     varchar(5),  # ����ԍ�
    artwork_num    varchar(3),  # ��i�ԍ�
    media_num      varchar(2),  # DVD�}�̔ԍ�
    term_day       datetime,    # �ԋp����
    check_in_day   datetime,    # �ԋp��
    arrears        integer,     # ���؋�
    PRIMARY KEY(rental_num)     # ��L�[
);


# �T���v���f�[�^
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
