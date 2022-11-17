###########################################
#
# 날짜/시간조작
#
#######################################

/*
 *1.테이블 생성
 */

CREATE TABLE datetable (
	id INT PRIMARY KEY AUTO_INCREMENT,      # id 자동생성
	`date` DATE,                            
	`datetime` DATETIME DEFAULT CURRENT_TIMESTAMP   # 시간 자동생성(입력시간)
) AUTO_INCREMENT=101;                       # id 시작번호

/*
 *
 */
 # date에 2022-11-17 입력, 나머지 자동생성
INSERT INTO datetable VALUES (DEFAULT, '2022-11-17', DEFAULT);
SELECT * FROM datatable;

 # date와 datetime에 따로 입력 id 자동생성 
INSERT INTO datetable(`date`, `datetime`) VALUES 
	('2001-11-23', '2001-11-23 11:20:01'),
	('2005-10-24', '2005-10-24 10:04:35'); 

# 2022-11-17 형식의 값을 얻고 싶을 경우
SELECT `date`, DATE_FORMAT(`datetime`, '%Y-%m-%d') FROM datetable;

# 시간만 표시(11:26:36 AM 형식)
SELECT DATE_FORMAT(`datetime`,'%r') FROM datetable;
SELECT DATE_FORMAT(`datetime`,'%h:%i:%s %p') FROM datetable;    # 위와 같은 형식의 테이블


# 22-11-17 14:28의 형식
SELECT DATE_FORMAT(`datetime`,'%y-%m-%d %H-%i') AS modifytime
	 FROM datetable;

# 날짜 조회 함수
SELECT NOW(), CURDATE(), CURTIME();