# 예외처리(Exception Handling) 정리

## 1. 예외처리란

프로그램이 비정상 종료되는 것을 방지하고, 에러가 발생해도 정상적으로 수행을 이어갈 수 있게 만드는 것. 에러가 발생한 부분만 건너뛰고 나머지는 계속 실행되게 한다.

- **에러**: 소스상에서 수정이 불가능한 문제
- **예외**: 소스상에서 수정(처리)이 가능한 에러 — 사용자의 잘못된 입력, 개발자의 실수(형변환, 인덱스 초과 등)로 발생

**예외 클래스 계층 구조**

```plain text
Throwable
├── Error                (복구 불가능한 심각한 에러)
└── Exception
    ├── CheckedException   → 컴파일 시 반드시 예외처리 필요 (IOException, SQLException 등)
    └── UncheckedException → 실행 시 상황에 따라 처리 (RuntimeException 계열)
                              ├── NumberFormatException      (문자열 → 숫자 변환 실패)
                              ├── ArrayIndexOutOfBoundsException (배열 인덱스 초과)
                              ├── NullPointerException
                              └── ClassCastException
```

---

## 2. try ~ catch ~ finally

```java
try {
    A a = new A();
    B b = (B) a;              // 형변환 실패
} catch (ClassCastException e) {
    e.printStackTrace();      // 에러 위치까지 자세히 출력
    // e.getMessage() 는 에러 메시지만 출력
}
```

**실행 흐름**
- `try` 블록 안에서 에러가 발생하면, 그 지점 아래 문장은 건너뛰고 바로 `catch` 절로 이동한다.
- `catch` 절에서 에러를 확인하고(`printStackTrace()`, `getMessage()`) 복구 처리를 한다.
- `finally`는 생략 가능하며, **에러 발생 여부와 상관없이 무조건 실행**된다. 파일 닫기, DB 연결 종료처럼 반드시 정리해야 하는 작업에 사용한다.

```java
public static int test() {
    try {
        int a = 10 / 0;
        return 1;
    } catch (Exception e) {
        return 2;
    } finally {
        return 3;   // finally의 return이 우선되어 최종 결과는 3
    }
}
```

> `finally`는 무조건 실행되기 때문에, 여기서 `return`을 쓰면 `try`나 `catch`의 결과값을 덮어써버린다. 그래서 `finally`에는 결과를 반환하는 코드보다 리소스 정리(파일·DB 닫기) 용도로만 쓰는 게 맞다.

---

## 3. 멀티 catch (다중 예외처리)

여러 종류의 예외를 각각 다른 catch절로 나눠 처리할 수도 있지만, 처리 방식이 같다면 `|`로 묶어서 한 번에 처리할 수 있다.

```java
try {
    String n1 = "10";
    String n2 = "3 ";                       // 공백이 있으면 형변환 에러
    int[] arr = { Integer.parseInt(n1), Integer.parseInt(n2) };
    int res = arr[0] / arr[2];              // 인덱스 초과 에러
    System.out.println(res);
} catch (NumberFormatException | ArrayIndexOutOfBoundsException | ArithmeticException e) {
    e.printStackTrace();
}
```

> catch절은 **범위가 좁은 예외부터 넓은 예외 순서로** 작성해야 한다. `Exception`처럼 범위가 넓은 걸 먼저 쓰면, 그 아래 있는 세부 catch절은 실행될 일이 없어서 작성한 의미가 없어진다.

---

## 4. throw / throws

| 구분 | 의미 |
|---|---|
| `throws` | 메소드 선언부에 "이 메소드는 이런 예외가 발생할 수 있다"고 미리 선언 (예외 회피 — 컴파일 통과 목적) |
| `throw` | 필요할 때 직접 예외를 만들어서 강제로 발생시킴 (`throw new 클래스()`) |

> `throws`는 메소드 안에서 try~catch 위치를 정하기 애매하거나 소스가 길 때, 또는 라이브러리를 만들 때 주로 사용한다. 일반적인 경우엔 try~catch로 직접 처리하는 경우가 더 많다.
