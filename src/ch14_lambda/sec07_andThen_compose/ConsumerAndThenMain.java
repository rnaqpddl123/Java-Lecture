package ch14_lambda.sec07_andThen_compose;

import java.util.function.Consumer;

public class ConsumerAndThenMain {

	public static void main(String[] args) {
		Consumer<Member> consumerA = m -> System.out.println("ConsumerA: " + m.getName());
		Consumer<Member> consumerB = m -> System.out.println("ConsumerB: " + m.getId());
		
		// andThen은 consumerA처리하고 consumerB 처리해라
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("홍길동", "hong", null));
		
		
	

	}

}
