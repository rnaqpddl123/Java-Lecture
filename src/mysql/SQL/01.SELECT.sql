/*
 *데이터 조작 언어(DML:Data Manipulation Language)
 */

 /*1. Select */
USE world;  # 사용할 데이터베이스 선택
SHOW TABLES;   #현 데이터베이스에 있는 테이브 조회
DESC city;			# city 테이블의 구조 보기

/*
SELECT 필드명 FROM 테이블명
    JOIN 테이블명
    ON 조인조건  
    WHERE 조건
    GROUP BY 필드명
    HAVING 그룹 조건
    ORDER BY 필드명 순서
    LIMIT 숫자 OFFSET 숫자
*/
SELECT * FROM city;     # city 테이블에 있는 모든 것 출력
SELECT `Name`, Population FROM city;        # city테이블 아래에서 필요한 항목만 보기 `Name`를 넣으면 이름이 바뀌지않음
SELECT NOW();

# 다른데이터베이스.테이블명
SELECT * FROM sakila.actor LIMIT 10;

/* 조회 조건 */
SELECT * FROM city WHERE countrycode='KOR';     # countrycode='KOR'에 부합하는 데이터만보여줌
SELECT `Name`, District, Population FROM city WHERE countrycode='KOR';
SELECT `Name`, District, Population FROM city 
	WHERE countrycode='KOR' AND Population > 1000000;


SELECT DISTINCT District from city	# DISTINCT(고유한) - 중복없이 보여줌
	 WHERE countrycode='KOR';		# 대한민국 광역시도명

# 수도권  (서울, 인천, 경기) 도시
SELECT * from city
	 WHERE district='Seoul' OR district='Inchon' OR district='kyonggi'	# 대한민국 광역시도명
SELECT * FROM city
	WHERE District IN ( 'inchon', 'kyonggi' ,'Seoul');		# in사용 (이산적인(diecreate) 값의 조건)
# 한국의인구수 100만 이상인 도시중 인구수가 홀수인 도시
SELECT * from city
	 WHERE CountryCode = 'KOR' And
	 Population >1000000 AND Population % 2 = 1;

# 한국의인구수 50만 ~ 100인도시
SELECT * from city
	 WHERE CountryCode = 'KOR' And
	 Population <1000000 AND Population > 500000;

SELECT * from city
	 WHERE CountryCode = 'KOR' 
	 And Population  between 500000 AND 1000000;    # between사용

# 충청남북도의 도시
SELECT * from city
	 WHERE CountryCode = 'KOR' 
	 And District ='Chungchongbuk' OR District = 'Chungchonhnam';

# 충청남북도의 도시
SELECT * from city
	 WHERE CountryCode = 'KOR' 
	 And District  LIKE 'Chungchongbuk' OR District = 'Chungchongnam';
SELECT * from city
	 WHERE CountryCode = 'KOR' 
	 And District  LIKE 'Chungchong%';  # LIKE 사용


/* 순서 */
#  전세계에서 인구가 800만 이상인 도시를 내림차순으로 조회
SELECT * from city
	 WHERE Population >= 8000000
	 ORDER BY Population DESC;		# Descending(내림차순)

#  한국에서 인구가 50만 이상인 도시를 광역시도 오름차순, 인구수 내림순으로 조회
SELECT * from city
	 WHERE Population >= 500000 AND Countrycode = 'Kor'
	 ORDER BY District, Population DESC;		# ASC(Ascending)오름차순은 생략가능

/* 갯수  */
#  전세계 인구수 top 10
SELECT * from city
	ORDER BY Population DESC
	LIMIT 10;	

#  한국 인구수 top 5
SELECT * from city
	WHERE Countrycode = 'kor'
	ORDER BY Population DESC
	LIMIT 5;	

#  한국 인구수 11~ 20위인 도시
SELECT * from city
	WHERE Countrycode = 'kor'
	ORDER BY Population DESC
	LIMIT 10 OFFSET 10;     #앞에서 10개는 건너뛰고 10개를 선택

/* 함수 */
#  국내 도시의 갯수
SELECT COUNT(*) from city
	WHERE Countrycode = 'kor';

#  국내 도시의 평균 인구수
SELECT AVG(Population) from city
	WHERE Countrycode = 'kor';

#  국내 도시의 평균 인구수(정수형태로 보여주기)
SELECT ROUND(AVG(Population)) from city     # ROUND 정수형태로
	WHERE Countrycode = 'kor';
#  국내 도시의 평균 인구수(이름 바꿔주기)
SELECT ROUND(AVG(Population)) AS avgPopulation from city    # Aliasing(AS) 이름바꾸기
	WHERE Countrycode = 'kor';

#  국내 도시의 최대/최소  인구수
SELECT MAX(Population), MIN(Population) from city
	WHERE Countrycode = 'kor';

/* 그룹 */

#  경기도의 도시이름 
SELECT GROUP_CONCAT(`Name`) from city
	WHERE District = 'kyonggi';

#  국내 광역시도 이름
SELECT GROUP_CONCAT(District) from city
	WHERE Countrycode = 'kor';

#  국내 광역시도의 인구수합계를 내림차순으로 정렬
SELECT District,SUM(Population) from city
	WHERE Countrycode = 'kor'
	GROUP BY District
	ORDER BY SUM(Population) DESC;



# 도시의 갯수가 많은 나라 top 10
SELECT GROUP_CONCAT(countrycode) from city
	LIMIT 10;

# 도시의 갯수가 많은 나라 top 10;
SELECT CountryCode,COUNT(*) from city
	GROUP BY CountryCode
	ORDER BY COUNT(*) DESC
	LIMIT 10;

# 국대 도시의 갯수가 5개이상인 도의 인구수 평균
SELECT District, ROUND(AVG(Population)), COUNT(*) from city
	WHERE Countrycode = 'kor'
	GROUP BY District 
	HAVING COUNT(*) >=5;        # grouping할때 조건들어가는게 HAVING


# 국대 도시의 갯수가 5개이상인 도의 인구수 평균을 인구수 평균의 내린차순으로 정렬
SELECT District, ROUND(AVG(Population)), COUNT(*) from city
	WHERE Countrycode = 'kor'
	GROUP BY District 
	HAVING COUNT(*) >=5
	ORDER BY AVG(Population) DESC;


# 도시의 갯수가 100개이상인 국가의 인구수 평균을 인구수 평균의 내린차순으로 정렬
SELECT CountryCode, ROUND(AVG(Population)), COUNT(*) from city
	GROUP BY CountryCode 
	HAVING COUNT(*) >=100
	ORDER BY AVG(Population) DESC;

# 대륙별 면적, 평균  GNP, 국가의 숫자를 면적의 내림차순으로 정렬
SELECT continent,SUM(surfaceArea), ROUND(AVG(gnp)) , COUNT(`Name`) 
	FROM country
	GROUP by continent
	ORDER BY SUM(surfaceArea) DESC;


/* join */
# 도시의 갯수가 많은 나라 top 10;
SELECT country.Name, COUNT(city.Name) from city
	JOIN country
	ON city.CountryCode = country.Code
	GROUP BY CountryCode
	ORDER BY COUNT(city.Name) DESC
	LIMIT 10;


#  인구가 많은 도시 top10의 국가명, 도시명, 인구수
SELECT r.Name AS country, l.Name AS city , l.Population from city AS l
	JOIN country AS r
	ON l.CountryCode = r.Code
	ORDER BY l.Population DESC
	LIMIT 10;


#  아시아 대륙에서 인구가 가장 많은 도시 10개를 내림차순으로 정렬
# 		(대륙명, 국가명, 도시명, 인구수)
SELECT r.Continent, r.Name AS `country`, l.name AS `city`, l.Population
	FROM city AS l
	JOIN country AS r
	ON l.CountryCode = r.Code
	WHERE r.Continent = 'Asia'
	ORDER BY l.Population desc
	LIMIT 10;

# 우리나라의 공식 언어는?
SELECT CountryCode, `Language` FROM countrylanguage
	WHERE CountryCode = 'Kor'
	AND Isofficial = TRUE;  

#  전셰계에서 인구가 가장 많은 10개 도시에서 사용하는 공식 언어는?
#    (도시명, 인구수, 언어명)
SELECT l.name, l.population , r.Language FROM city AS l
	JOIN countrylanguage AS r
	ON l.countryCode = r.CountryCode
	WHERE r.Isofficial = TRUE
	ORDER BY l.population DESC
	LIMIT 10;

# 다른데이터베이스.테이블명
SELECT * FROM sakila.actor LIMIT 10;

/* SubQuery */
# 서울보다 인구가 많은 도시
SELECT * FROM city
	WHERE population >
	(SELECT population FROM city WHERE `NAME` = 'seoul');