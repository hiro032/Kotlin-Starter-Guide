# 1. Kotlin에서의 null 체크

---

```java
//Java
public class Main {

	public Boolean startWithA(String str) {
        // NPE 방어 로직
        if(str == null) {
			return null;
        }
		return str.startsWith("A");
	}
}

```

```kotlin
//Kotlin
fun startWithA(str: String?): Boolean? {
    return str?.startsWith("A") ?: null
}
```

## Safe Call

---

- null이 아니면 뒤에 오는 함수나 프로퍼티등을 실행하고, null이면 실행하지 않는다.
- null인 경우 값이 null이 된다.

## Safe Call & Elvis 연산자

---

```kotlin
fun elvis(string: String?): Int {
    return str?.length ?: 0
}
```
- str의 값이 null일 수 있기에 null이 아니라면 length 값을, null이라면 0을 리턴한다.
- safe call과 elvis 연산자로 간단히 null 방어 가능.

## null이 아님 단언하기

---

nullable type으로 되어있지만, 확실히 null이 될 수 없는 경우 사용한다.

```kotlin
fun notnull(string: String?): Boolean {
    return string!!.startsWith("A")
}
```

- !! 키워드를 붙인 변수는 null이 아닌것으로 인지되어 바로 객체의 메서드를 사용할 수 있지만, 객체가 null인 경우 NPE가 발생한다.

## Kotlin에서 Java 코드 가져다 사용하기

---

코틀린은 자바와 100% 호환 가능하기에 한 프로젝트 내에서 병행해서 사용하는 경우가 많다.

코틀린에서 자바 코드를 가져다 사용할때 null 처리를 알아보자.

```java
import org.jetbrains.annotations.Nullable;

public class Person {

	private final String name;

	public Person(String name) {
		this.name = name;
	}

	@Nullable
    public String getName() {
		return name;
    }
}
```

```kotlin
fun main() {
    var person = Person("hiro");
}

fun startWith(str: String): Boolean {
    return str.startsWith("A")
}
```

- Java에 있는 Person에서 name의 값이 null이 될 수 있음을 @Nullable Annotation을 통해 알려주고 있다.
  - 이 경우에 Kotlin에서 Null이 들어올 수 없다고 선언된 곳에는 사용할 수 없다.(?가 아닌곳)
  - @Nullable이나 @NotNull Annotation이 없다면 Kotlin은 가져온 자바 값이 null이 가능한지 안되는지 알 수 없고 이런 타입 **플랫폼 타입** 이라고 한다.
  - 플랫폼 타입을 사용하는 경우, NPE가 발생할 수 있기에 주의해서 사용해야 한다.



## 정리

---

- 코틀린에서 null이 들어갈 수 있는 타입은 완전히 다른 타입으로 간주 된다.
- 한번 null 검사를 하면 non-null임을 컴파일러가 알 수 있다.
- null이 아닌 경우에만 호출되는 safe call(?.)이 있다.
- null인 경우에만 호출되는 Elvis 연산자(?:)가 있다.
- null이 절대 아닐때 사용할 수 있는 단언 연산자(??)가 있다.
- 코틀린에서 자바 코드를 사용할 때 플랫폼 타 사용에 유의해야 한다.
