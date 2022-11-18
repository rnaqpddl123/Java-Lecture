package mysql.customer;

import java.time.LocalDate;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		DAO dao = new DAO();
		
		// 데이터 insert 방법1
//		Customer c1 = new Customer("admin","관리자", LocalDate.parse("2022-11-17"), 0);
//		System.out.println(c1);
		
		// 데이터 insert 방법2
//		Customer c2 = new Customer("james","제임스");
//		dao.insertCustomer(c2);
		
		
		// SELECT *FROM customer WHERE  uid =? 에서 james채워준것
//		Customer c3 = dao.getCustomer("james");
//		System.out.println(c3);
//		System.out.println();
//		
		
		// UPDATE
		// UPDATE customer SET name=?, regdate=?, isDeleted=? WHERE uid = ?; 에서 name,regdate변경
//		c3.setName("재임수");		// name update
//		c3.setRegdate(LocalDate.parse("2022-11-01"));
//		dao.updateCustomer(c3);
		
		
		// isDelete를 0에서 1로 바꾸면 mysql에서는 값만 바뀌지만 
		// getCustomers()에서 where isDelete = 0으로 잡아놨기때문에 여기서는 보이지않음
//		dao.deleteCustomer("james");
		
		Customer c2 = new Customer("maria","마리아");
		dao.insertCustomer(c2);
		
		//데이터 select * from customer WHERE isDeleted=0; 실행
		List<Customer> list = dao.getCustomers();
		for (Customer c : list)
			System.out.println(c);
		
		
		
		

	}

}
