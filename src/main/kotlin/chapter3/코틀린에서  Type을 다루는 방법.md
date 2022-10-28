# 코틀린에서 Type을 다루는 방법

1. 기본 타입
2. 타입 캐스팅
3. 코틀린의 3가지 특이한 타입

# 1. 기본 타입
 
- 코틀린에서는 선언된 기본 값을 보고 타입을 추론한다.

```kotlin
val number1 = 3 // Int
val number2 = 3L // Long
val number3 = 3.0 // Double
val number4 = 3.0f // Float
```

# 2. 타입 캐스팅


자바에서는 기본 타입간 변환이 **암시적으로** 이뤄질 수 있지만, 코틀린에서 기본 타입간의 변화는 항상 **명시적으로** 이뤄져야 한다.

```java
// Java
int number1 = 4;
long number2 = number1;

number1 + number2 = 8L
```

자바에서 기본 타입간 변환은 더 큰 타입으로 암시적으로 변경 됩니다.

```kotlin
val number1 = 4
val number2: Long = number1 // Type mismatch error
```

코틀린에서는 **기본 타입간 암묵적 캐스팅이 발생하지 못합니다.**
코틀린에서는 타입간 변환을 위한 toInt(), toDouble(), toLong()과 같은 메서드를 제공 합니다.

```kotlin
val number1 = 4
val number2: Long = number1.toLong() // Solved 
```

자바에서 타입 캐스팅을 하는 방식과 코틀링에서 타입 캐스팅을 하는 방식을 비교해서 알아보자.

```java
import chapter2.Person;

public class Main {

	// Java
	public void printAgeIfPerson(Object obj) {
		if (obj instanceof Person) {
            Person person = (Person) obj;
			System.out.println("person.getName() = " + person.getName());
		}
	}
}
```

자바에서는 instance of 키워드를 통해 타입을 확인하고 변수 앞에 (Type)을 붙여 해당 타입으로 변경을 합니다.

타입이 변경된 변수는 해당 타입이 가진 메서드를 사용할 수 있게 됩니다.

```kotlin

import chapter2.Person

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        val person = obj as chapter2.Person
        print(person.name)
    }
}
```

코틀린에서 **is**는 자바의 instanceof와 같은 의미를 갖습니다.

코틀린에서 **as**는 자바의 (Type)와 같은 의미를 가지며 생략 가능합니다.

**as**가 생략 가능하다는 의미는 굳이 형 변환을 거치지 않고 obj를 바로 Person 처럼 사용 가능하다는 의미가 됩니다.

코틀린에서는 스마트 캐스트를 통해 한번 타입이 체크된 이후엔, 해당 타입처럼 사용할 수 있습니다.

또한 is 키워드 앞에 !를 붙여서 !is를 사용할 수 있다.

만약 obj에 null이 들어갈 수 있다면 as 뒤에 ?를 붙여서 NPE에 대한 방어를 할 수 있다.

```kotlin
fun printAgeIfPerson(obj: Any?) {
    if (obj is Person) {
        val person = obj as? Person
        print(person?.name)
    }
}
```

# 3. 코틀린의 3가지 특이한 타입

- Any

- Unit
- Nothing

## Any
- Java의 Object 역할 (모든 객체의 최상위 타입)
- Java의 Object와 차이점은 Kotlin에서는 Primitive Type의 최상위 타입도 Any이다.
- Any 자체로는 null을 포함할 수 없다. null을 포함하려면 ?를 붙여서 Any?로 표현할 수 있다.
- Any에 equals/hashCode/toString이 존재한다.

## Unit
- Java의 void와 동일한 역할을 한다.
- 타입 추론이 가능하기에 생략 가능하다.
- Unit void와는 다르게 그 자체로 타입 인자로 사용이 가능하다.

## Nothing
- Nothing은 함수가 정상적으로 끝나지 않음을 표현하는 역할을 한다.
- 무조건 예외를 발생시키는 함수거나 무한 루프 함수등을 표현한다.
- 이런 함수는 만들 경우가 거의 없기에 자주 사용되지 않는다.


# 4. String interpolation / String indexing

```kotlin
val person = Person("hiro", 17)//name, age
val log = "Person의 이름은 ${person.name}이며 나이는 ${person.age}이다."
```

기존 자바에서는 String.format을 통해 문자열에 대한 동적 변환이 가능했지만, 코틀린에서는 ${변수}를 통해 동적 문자열 생성이 가능하다.

```kotlin
fun indexing() {
    val name ="hiro"
    val str = """
        ABC
        EFG
        ${name}
        """.trimIndent()
    
    print(str) 
    // 결과 : ABC
             EFG
             hiro
}
```
여러 줄에 걸친 문자열을 작성할때 유용한 메서드
