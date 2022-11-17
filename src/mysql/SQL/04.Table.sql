#######################################
#
#  데이터 정의 언어(DDL: Data Definition Language)
#
########################################################

/*
 * 1. 테이블 생성

CREATE TABLE 테이블명 (
	필드명 데이터타입 [NOT NULL] [KEY] [DEFAULT 값] [Extra],
	필드명 데이터타입 [NOT NULL] [KEY] [DEFAULT 값] [Extra],
	...
) [Extra];
*/

# 주소록 테이블 생성
CREATE TABLE if NOT EXISTS addrBook (
	num INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`name` VARCHAR(4) NOT NULL,
	tel VARCHAR(14) NOT NULL,
	birthday DATE
); AUTO_INCREMENT=101;

# 고객 테이블생성
CREATE TABLE if NOT EXISTS customer (
	uid VARCHAR(10) PRIMARY KEY,
	pwd CHAR(44) NOT NULL,		# 암호화된 결과를 저장
	`name` VARCHAR(4) NOT NULL,
	email VARCHAR(20),
	regDate DATE DEFAULT (CURRENT_DATE),
	isDeleted INT DEFAULT 0
);

/*
 * 2. 테이블 조회
 */

# 데이터베이스 내의 테이블 목록
SHOW tables

# 테이블 구조
DESC 테이블명;


/*
 * 3. 테이블삭제 
 */
# 테이블 삭제
DROP TABLE 테이블명;

# 테이블내의 내용을 모두 제거
TRUNCATE 테이블명;

/*
 * 4.테이블 이름 변경 (RENAME)
 */

# koreancity -> korcity
RENAME TABLE koreancity TO KorCity;

/*
 * 5. 테이블 구조 변경 (ALTER)
 */

# customer 테이블에 tel 항목 추가
ALTER TABLE customer
	ADD tel VARCHAR(14);

# customer 테이블에 tel 항목 삭제
ALTER TABLE customer
	DROP tel;

# customer 테이블에 name 항목 다음에 tel 항목 추가 (테이블 안에 순서가 name 다음에 tel나온다는뜻)
ALTER TABLE customer
	ADD tel VARCHAR(14) AFTER `name`;
DESC customer;


# customer 테이블에 tel 항목에 not null추가 
ALTER TABLE customer
	CHANGE tel tel VARCHAR(14) NOT NULL;


/*
 * 6. view생성
 */

# 인구 900만 이상인 도시를 largeCity 뷰 생성
CREATE VIEW largecity
	AS SELECT * FROM city WHERE population >= 9000000
	WITH CHECK OPTION;		
SELECT * FROM largecity;

# 서울의 인구를 8900000으로 변경하면 에러가 발생, where문을 벗어나는값으로 변경하거나 추가하면 error뜸
UPDATE largecity SET population = 8900000 WHERE id = 2331; # error 발생


# city 에서 테이블 변경하면 largecity에도 반영이됨(WITH CHECK OPTION 과는 무관함)
UPDATE city SET population = 9900000 WHERE id = 2331;
SELECT * FROM largecity;

#view 삭제
DROP view 테이블명;