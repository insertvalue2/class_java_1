package ex_11;

public class Person {
	// this란 3가지 사용법
	// 1. 자기 자신을 가리킨다.
	// 2. 생성자에서 다른 생성자를 호출할 때 사용할 수 있다.
	// 3. 자신의 주소(참조값, 주소값) 를 반환 시킬 수 있다.

	private String name;
	private int age;
	private String phone;
	private String gender;

	public Person(String name, int age) {
		// 1. 자기 자신을 가리키는 this
		this.name = name;
		this.age = age;
	}

	// 생성자는 객체가 메모리에 올라 갈 때 제일 먼저 실행 하는 코드이다.
	public Person(String name, int age, String phone) {
		// new this();
		// 2. 생성자에서 다른 생성자를 호출 함
		this(name, age);
		this.phone = phone;
	}

	public Person(String name, int age, String phone, String gender) {
		this(name, age, phone);
		this.gender = gender;
	}

	// 자신 자신을 반환하는 this 는 빌더패던 만들어 낼 수 있다.
	public Person getPerson() {
		// 3. 자기 자신의 주소값을 반환 시킬 수 있다.
		return this;
	}

	public void showInfo() {
		System.out.println("이름 : " + name + ",  나이 : " + age);
	}

} // end of Person class

// xxx.java 하나의 파일안에 여래개의 클래스를 작성할 수 있다.
// 단. xxx.java 하나의 파일안에 public 을 가지는 클래스는 단 하나만 선언할 수 있다.
// default 접근 제어 지시자 --> ch07 에 있는 클래스들은 사용 가능하다.
class PersonMainTest {

	// static 메인 함수는 잠시 자리를 빌려서 사용한다.
	public static void main(String[] args) {
		Person person1 = new Person("홍길동", 100);
		person1.showInfo();
	} // end of main
}
