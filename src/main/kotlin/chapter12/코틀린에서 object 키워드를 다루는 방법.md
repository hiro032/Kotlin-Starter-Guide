# 코틀린에서 object 키워드를 다루는 방법

1. static 함수와 변수
2. 싱글톤
3. 익명 클래스


# 1. static 함수와 변수

- static : 클래스가 인스턴스화 될 때 새로운 값이 복제되는게 아니라 정적으로 인스턴스끼리의 값을 공유
- Kotlin에는 static이라는 키워드가 존재하지 않는다.
- companion object 키워드를 통해 static의 기능을 구현할 수 있다
- companion object는 클래스와 동행하는 오브젝트 라는 의미를 갖는다.
  - 인스턴스가 여러개 생겨도 클래스(설계도)와 동행한다는 의미

- const 키워드는 캄파일 타임시에 변수에 값이 할당된다.
- 상수에 붙이기 위한 용도로써 기본, String 타입에 const 키워드를 붙일 수 있다.
```kotlin

class Person(
    var name: String,
    var age: Int
) {
    companion object {
        private const val MIN_AGE = 1
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }
    }
}
```

- 이때, companion object는 자바와 다르 하나의 객체로 간주된다.
- 이 companion object자체를 변수에 할당할 수 있고, interface를 구현 시킬수 있다.


```kotlin

class Person(
    var name: String,
    var age: Int
) {
    companion object Factory: Log{
        private const val MIN_AGE = 1
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
        }
    }
}
```
- companion object에 유틸성 메서드를 넣을 수 있지만, 유틸성 함수는 파일의 상단에 정의하는것이 권장 된다.
- companion object는 외부에 사용시에 할당된 이름을 호출할 수도 있고 바로 호출도 가능하다.
- 할당된 이름이 없다면, Companion이름을 통해 접근이 가능하다.

```kotlin
fun main() {
    Person.newBaby("hi")
    Person.log()

    Person.Factory.newBaby("hi")
    Person.Factory.log()
    
    Person.Companion.newBaby("hi")
    Person.Companion.log()
}
```

## 2. 싱글톤
```kotlin
object Singleton {
    const val a: Int = 0
}
```

## 3. 익명 클래스

익명 클래스 : 특정 인터페이스나 클래스를 상속받은 구현체를 일회성으로 사용할 때 쓰는 클래스

kotlin에서는 new 키워드 대신 object: interface를 통해 익명 클래스를 구현 가능하다.
```kotlin

interface Movable {

  fun move()

}

fun main() {
    moveSomething(object : Movable{
        override fun move() {
            print("movable")
        }
    })
}

fun moveSomething(movable: Movable) {

}

```


