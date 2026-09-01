# ☕ Java 스터디 정리

## 📌 목차

- [x] Chapter01~03 : 변수와 연산자
- [x] Chapter04 : 제어문 (조건문 · 반복문)
- [x] Chapter05 : 배열 · 메소드
- [x] Chapter06~08 : 객체지향, 인터페이스
- [x] Chapter11 : 예외처리
- [x] Chapter12~15 : 라이브러리, 제네릭, 컬렉션
- [x] Chapter16~17 : 람다, 스트림
- [x] Chapter18~19 : 입출력, 네트워크

> 아래 각 항목을 클릭하면 상세 내용이 펼쳐집니다.

---

<details>
<summary><b>Chapter01~03. 변수와 연산자</b></summary>

### 변수

한 개의 데이터를 메모리에 저장해서 사용하는 것. 어떤 데이터를 저장할지에 따라 자료형이 달라진다.

| 분류 | 자료형 | 크기 | 비고 |
|---|---|---|---|
| 정수 | `byte` | 1byte | -128 ~ 127, 파일 업/다운로드 |
| 정수 | `int` | 4byte | 기본 정수형 (컴퓨터는 모든 정수를 int로 인식) |
| 정수 | `long` | 8byte | 금융권, 빅데이터, AI |
| 실수 | `double` | 8byte | 소수점 15자리 정밀도 |
| 문자 | `char` | 2byte | 문자 1개만 저장, 작은따옴표 사용 |
| 논리 | `boolean` | 1byte | true/false, 반복문·조건문에 사용 |
| 문자열 | `String` | - | char 여러 개를 묶은 것, 웹/네트워크는 모든 데이터가 문자열 |

**변수명(식별자) 규칙**
- 알파벳, 한글로 시작 (단, 한글은 웹에서 글자가 깨질 수 있어 실무에서는 잘 안 씀)
- 대소문자 구분 (`Name` ≠ `name`)
- 숫자는 사용 가능하지만 맨 앞에는 불가 (`a1` ○, `1a` ✕)
- 특수문자는 `_`, `$`만 가능

**지역변수 vs 전역변수**

```java
char c = 'A';
for (int i = 0; i < 5; i++) {
    System.out.print(c++);   // 바깥의 c를 그대로 누적 사용 → ABCDE
}

for (int i = 0; i < 5; i++) {
    char d = 'A';             // 반복될 때마다 새로 초기화되는 지역변수
    System.out.print(d++);    // 매번 A만 출력 → AAAAA
}
```

> 지역변수는 `{}` 안에서만 사용 가능하고 자동으로 메모리가 해제된다. 사용 전 반드시 초기화해야 한다.

### 연산자

**단항연산자**
- 증감연산자 `++`, `--` : 1씩 증가/감소
- 부정연산자 `!` : true/false를 반대로. 조건문에서 "회원이 아닌", "관리자가 아닌" 같은 조건에 사용
- 형변환
  - 자동형변환: 작은 데이터 → 큰 데이터 (문제 없음)
  - 강제형변환: 큰 데이터 → 작은 데이터 (`(int)10.5`처럼 명시적으로 변환 필요, 안 하면 오류)

**이항연산자**

```java
int kor = 80, eng = 78, math = 90;
int total = kor + eng + math;
double avg = total / 3.0;          // 정수/실수 연산이라 실수 결과가 나옴

System.out.printf("평균:%.2f\n", avg);  // 소수점 자리수 지정 출력
```

| 연산자 종류 | 기호 | 비고 |
|---|---|---|
| 산술연산자 | `+ - * / %` | `10/3`처럼 정수÷정수는 정수만 나옴(소수점 버림), `%`는 나머지(배수·날짜 계산에 사용) |
| 비교연산자 | `== != < > <= >=` | 결과는 항상 true/false |
| 논리연산자 | `&& \|\|` | `&&`(and, 둘 다 true), `\|\|`(or, 하나만 true여도 true). 조건문·반복문에서 두 조건을 동시에 검사할 때 사용 (예: 아이디+비밀번호 로그인 검증) |
| 대입연산자 | `= += -=` | 가장 나중에 연산됨 |
| 삼항연산자 | `조건 ? 참 : 거짓` | if~else를 한 줄로 단순화 |

```java
int num = 100;
String result = (num % 2 == 0) ? "짝수" : "홀수";  // 삼항연산자
```

</details>

<details>
<summary><b>Chapter04. 제어문 (조건문 · 반복문)</b></summary>

> 제어문은 프로그램의 흐름을 조절하는 문법이다. 특정 조건에서만 실행하거나(조건문), 같은 동작을 여러 번 반복한다(반복문).

### 1. 조건문

#### 1-1. 단일조건문 (if)

조건이 참(true)이면 `{}` 안의 문장을 실행하고, 거짓(false)이면 그냥 건너뛴다. 여러 개의 if문을 나란히 쓰면 각각 독립적으로 조건을 검사한다(그래서 조건이 많아지면 속도가 느려짐).

```java
int num = 15;
if (num % 3 == 0) {
    System.out.println(num + "는 3의 배수입니다.");
}

char c = 'A';
if (c >= 'A' && c <= 'Z') {  // 범위(기간) 조건은 논리연산자(&&)로 묶어서 처리
    System.out.println(c + "는 대문자 입니다");
}
```

**실행 순서**

| 순서 | 코드 | 컴퓨터가 하는 일 |
|---|---|---|
| 1 | `num % 3 == 0` | 조건식 계산 → true/false 판단 |
| 2 | true | `{}` 안의 문장 실행 |
| 2' | false | `{}` 를 건너뛰고 다음 코드로 이동 |

> 실무에서는 회원가입 시 아이디 중복 체크, 비밀번호 확인, 로그인 처리 시 자동 로그인 여부 판단 등에 단일조건문을 사용한다.

#### 1-2. 선택조건문 (if~else)

조건이 참이면 if 블록, 거짓이면 else 블록 — 둘 중 하나만 무조건 실행된다.

```java
Random r = new Random();
int i = r.nextInt(100) + 1;  // 1~100 사이의 정수 추출

if (i % 2 == 0)
    System.out.println(i + "는 짝수입니다");
else
    System.out.println(i + "는 홀수입니다");
```

#### 1-3. 다중조건문 (if ~ else if ~ else)

조건이 여러 개일 때 위에서부터 순서대로 검사하다가, 처음 만족하는 조건 하나만 실행하고 빠져나간다. 사칙연산 계산기, 성적 처리, 메뉴 처리(부메뉴)처럼 **범위나 경우의 수가 여러 개**일 때 주로 쓴다.

```java
if (op.equals("+")) {
    System.out.printf("%d+%d=%d\n", num1, num2, num1 + num2);
} else if (op.equals("-")) {
    System.out.printf("%d-%d=%d\n", num1, num2, num1 - num2);
} else if (op.equals("/")) {
    if (num2 == 0)                       // 0으로 나누는 경우 별도 처리 (에러 방지)
        System.out.println("0으로 나눌 수 없다");
    else
        System.out.printf("%d/%d=%d\n", num1, num2, num1 / num2);
} else {
    System.out.println("연산자 입력이 잘못되었습니다");
}
```

#### 1-4. 선택문 (switch ~ case)

다중조건문을 단순화한 문법. **정수/문자/문자열**만 사용 가능(boolean, double 불가). 게임, 네트워크처럼 처리 경우의 수가 명확히 나뉠 때 사용한다.

```java
switch (op) {
    case "+" -> System.out.printf("%d+%d=%d\n", num1, num2, num1 + num2);
    case "-" -> System.out.printf("%d-%d=%d\n", num1, num2, num1 - num2);
    case "*" -> System.out.printf("%d*%d=%d\n", num1, num2, num1 * num2);
    case "/" -> System.out.printf("%d/%d=%d\n", num1, num2, num1 / num2);
    default  -> System.out.println("없는 연산자 입니다");
}
```

> 예전 문법은 `case "+" :` 다음 줄에 처리문을 쓰고 `break;`로 종료했는데, 최신 문법은 `->`로 대체되어 break 없이도 자동 종료된다.

### 2. 반복문

| 반복문 | 특징 | 주로 쓰는 곳 |
|---|---|---|
| `for` | 반복 횟수가 정해진 경우 | 화면 출력(UI), 배열/컬렉션 처리 |
| `while` | 반복 횟수 미지정, **선조건 검사** | 파일, 데이터베이스, 네트워크 처리 |
| `do~while` | 반복 횟수 미지정, **후조건 검사**(무조건 한 번은 실행) | 시작 화면처럼 최소 한 번은 실행돼야 하는 경우 |

#### 2-1. for문

```java
int sum = 0;               // 누적변수는 반드시 0으로 초기화
for (int i = 1; i <= 100; i++) {
    sum += i;               // sum = sum + i
}
System.out.println("1~100의 총합:" + sum);
```

| 변수 | 역할 |
|---|---|
| `i` | 반복(루프) 변수 — `for`문 안에서만 쓰는 지역변수, 1~100까지 매 바퀴 바뀜 |
| `sum` | 실제 계산 결과를 누적하는 변수 |

#### 2-2. while문

```java
Random r = new Random();
int com = r.nextInt(100) + 1;   // 컴퓨터가 뽑은 정답

for (;;) {                       // 무한루프 + 조건 만족 시 내부에서 종료
    int user = scan.nextInt();
    if (com > user)
        System.out.println("입력값 보다 큰 수 입력(up)");
    else if (com < user)
        System.out.println("입력값 보다 작은 수 입력(down)");
    else {
        System.out.println("게임오버");
        System.exit(0);          // 0을 넣어야 정상 종료
    }
}
```

#### 2-3. do~while문

`{}` 안의 문장을 **먼저 한 번 실행**하고 나서 조건을 검사한다. 그래서 조건이 처음부터 false여도 최소 1번은 실행된다.

```java
int i = 1;
do {
    System.out.print(i + " ");
    i++;
} while (i <= 10);
```

> `continue`를 while/do~while문에서 쓸 때는 주의가 필요하다 — 증가식을 건너뛰고 바로 조건 검사로 이동해버리기 때문에, 증가식 위치에 따라 무한루프에 빠질 수 있다.

#### 2-4. 반복제어문 (break / continue)

| 키워드 | 동작 | 사용 위치 |
|---|---|---|
| `break` | 반복문(또는 switch)을 즉시 종료 | 반복문/switch 안. **단독 if문 안에서는 사용 불가**(오류 발생) |
| `continue` | 그 회차만 건너뛰고 다음 반복으로 | 반복문 안에서만 사용 가능 |

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) break;          // i가 5가 되는 순간 반복문 전체 종료
    System.out.print(i + " ");
}
// 1 2 3 4
```

### 3. 중첩반복문

반복문 안에 반복문을 넣는 구조. 바깥쪽 for문이 "몇 줄" 출력할지, 안쪽 for문이 "한 줄에 몇 개" 출력할지를 담당한다.

```java
for (int i = 1; i <= 9; i++) {        // 세로 방향: 9줄 (2단~9단)
    for (int j = 2; j <= 9; j++) {    // 가로 방향: 한 줄에 8개
        System.out.printf("%d*%d=%2d\t", j, i, j * i);
    }
    System.out.println();             // 한 바퀴(안쪽 for 종료) 끝나면 줄바꿈
}
```

| 변수 | 역할 |
|---|---|
| `i` | 바깥쪽 루프 변수 — 몇 번째 줄인지 |
| `j` | 안쪽 루프 변수 — 한 줄 안에서 몇 번째 값인지 (곱하는 단) |

> 로그인 후 메뉴 분기(인증 → 댓글/예약/결제)처럼 조건문끼리 중첩되는 경우도 있고, 반복문끼리 중첩되는 경우(구구단, 표 형태 출력)도 있다.
>
> 안쪽 반복문이 완전히 끝나야 바깥쪽 반복문이 다음 바퀴로 넘어간다.

</details>

<details>
<summary><b>Chapter05. 배열 · 메소드</b></summary>

### 1. 배열(Array)

같은 자료형의 값을 여러 개 저장해야 할 때, 변수를 하나하나 늘리는 대신 하나의 이름으로 묶어서 관리하는 방법.

```java
// 기존 방식 - 학생이 늘어날 때마다 변수를 계속 선언해야 함
int kor1, kor2, kor3;
int eng1, eng2, eng3;

// 배열 - kor 하나로 여러 값을 묶어서 저장
int[] kor = new int[3];
```

**인덱스와 length**

```java
int[] arr = new int[5];
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

| 구분 | 의미 |
|---|---|
| `new int[5]`의 `[5]` | 배열의 크기(길이) — 저장할 수 있는 칸의 개수 |
| `arr[0]`, `arr[1]` | 인덱스 — 몇 번째 칸이냐, 항상 0부터 시작 |
| `arr.length` | 배열의 칸 개수 (마지막 인덱스는 항상 `length - 1`) |

> 반복문 속 `i`는 원래 반복 횟수를 관리하는 변수인데, 배열과 같이 쓰이면 그 값이 인덱스로도 동시에 쓰인다. 우연히 두 역할이 맞아떨어지는 것일 뿐, 별개의 개념이다.

**배열의 초기화**

```java
// 하나씩 넣기
int[] arr = new int[5];
arr[0] = 10; arr[1] = 20; arr[2] = 30;

// 초기화 방식 - 한 줄에 다 넣기
int[] arr2 = {10, 20, 30, 40, 50};
```

**배열 두 개 짝지어 쓰기**

```java
String[] names = {"홍", "이", "강"};
String[] address = {"서울", "경기", "제주"};

for (int i = 0; i < names.length; i++) {
    System.out.println(names[i] + "(" + address[i] + ")");
}
```

> 배열이 하나일 때는 향상된 for문(for-each)으로 인덱스 없이 값만 바로 꺼낼 수 있지만, 배열이 2개 이상이고 서로 짝지어야 할 때는 인덱스가 없으면 어느 값끼리 짝인지 알 수 없다. 그래서 인덱스(`i`)를 공통으로 써서 두 배열에 동시에 접근한다.

**활용 — 등수 구하기 / 빈도수 구하기**

```java
int[] rank = new int[3];
for (int i = 0; i < 3; i++) {
    rank[i] = 1;   // 초기값을 1로 채워두고, 비교하며 순위를 조정하는 방식으로 활용
}
```

> 합계를 담는 변수는 항상 0으로 시작해야 한다 — 시작값이 0이 아니면 그 값이 배열 값들과 섞여서 더해지기 때문에 정확한 합계가 안 나온다. 반대로 곱셈으로 누적할 때는 시작값을 1로 해야 한다(0을 곱하면 전부 0이 되므로).

---

### 2. 메소드(Method)

특정 작업을 수행하는 명령문의 집합. 반복되는 기능을 하나로 묶어서 재사용하기 위해 사용한다.

**메소드를 쓰는 이유**
- 반복되는 기능 제거
- 코드 관리가 쉬움 (기능별로 나눠서 처리 → 협업 가능)
- 소스가 간결해짐 (중복 코드 제거)
- 재사용성

**구성 요소**

| 구성 요소 | 설명 |
|---|---|
| 리턴형 | 처리 결과를 돌려주는 자료형. 결과값이 없으면 `void` |
| 메소드명 | 소문자로 시작하는 식별자 |
| 매개변수 | 사용자의 요청값 — 여러 개 사용 가능. 결과값(리턴값)은 **반드시 1개만** (여러 개 필요하면 배열/클래스로 처리) |

```java
static void sum() {
    int hap = 0;
    for (int i = 1; i <= 10; i++) {
        hap += i;
    }
    System.out.println("1~10까지의 합:" + hap);
    return;  // void면 생략 가능 (컴파일 시 자동으로 추가됨)
}

static int sum2(int n) {   // 매개변수 O, 리턴형 O
    int hap = 0;
    for (int i = 1; i <= n; i++) {
        hap += i;
    }
    return hap;
}

public static void main(String[] args) {
    sum();              // 메소드 호출 - 사용자 정의 메소드는 자동 호출되지 않으므로 반드시 호출해야 함
    int a = sum2(20);
    System.out.println(a);
}
```

**활용 — 기능별로 메소드를 나눠서 계산기 조립**

```java
static int plus(int a, int b) {
    return a + b;
}
static String div(int a, int b) {   // 0으로 나누는 경우까지 문자열로 처리
    if (b == 0) return "0으로 나눌 수 없음";
    return a + "/" + b + "=" + (a / (double) b);
}

static void process() {
    // 입력받은 연산자에 따라 plus(), minus(), gop(), div()를 각각 호출
}
```

> `main()`은 시작점으로만 쓰고, 실제 처리는 메소드로 나눠서 구현한다. 메소드는 호출되면 처음부터 실행되고, `return`을 만나면 그 자리에서 종료된다.

</details>

<details>
<summary><b>Chapter06~08. 객체지향(OOP) · 인터페이스</b></summary>

### 1. 객체지향이란

같은 자료형끼리 묶는 게 배열이라면, **서로 다른 자료형(변수)과 기능(메소드)을 하나로 묶는 것**이 클래스다. 클래스로 실제 데이터를 만든 것을 객체(인스턴스)라고 한다.

**멤버변수의 두 종류**

| 종류 | 키워드 | 특징 |
|---|---|---|
| 정적변수 | `static` | 클래스당 메모리 1개만 생성(공유), `클래스명.변수명`으로 접근, 프로그램 종료까지 유지 |
| 인스턴스 변수 | (없음) | `new`로 객체를 만들 때마다 각자 따로 메모리 생성, `객체명.변수명`으로 접근 |

```java
class Sawon {
    int sabun = 100;
    String name = "길동이";
    static String company = "SIST";   // 모든 객체가 공유
}

Sawon s1 = new Sawon();
Sawon s2 = new Sawon();
// s1.name, s2.name은 서로 다른 메모리(각자 따로 생성)
// Sawon.company는 s1, s2가 공유하는 하나의 값
```

**객체지향 4대 특성 (면접 단골 이론)**

| 특성 | 의미 |
|---|---|
| 캡슐화 | 데이터 보호. `private`으로 변수를 감추고 getter/setter로만 접근하게 함 |
| 상속 | 재사용. `extends`로 기존 클래스를 확장 |
| 다형성 | 오버라이딩. 상속받은 메소드의 기능을 변경/추가 |
| 추상화 | 공통 특징만 뽑아서 정의. 인터페이스·추상클래스로 구현 |

### 2. 클래스의 구성 요소

```java
public class 클래스전체구조 {
    int a = 10;              // 1. 변수 - 기본값/명시적 초기값

    {
        a = 100;              // 2. 인스턴스 블록 - 여기서 연산자·제어문 사용 가능
    }

    클래스전체구조() {          // 3. 생성자 - 클래스명과 동일, 리턴형 없음
        a = 200;
    }

    void display() { }        // 4. 메소드 - 기능 수행
}
```

> 클래스 영역(변수 선언부)에는 연산자나 제어문을 바로 쓸 수 없다. 그래서 **인스턴스 블록**이나 **생성자** 안에서 구현해야 한다.

**초기화 순서**: 기본값 → 명시적 초기값 → `static {}` → 인스턴스 블록 `{}` → 생성자

**생성자 특징**
- 리턴형이 없다
- 클래스명과 동일한 이름
- 생략하면 컴파일러가 매개변수 없는 **기본 생성자**를 자동으로 만들어줌
- 호출 시 반드시 `new`와 함께 사용 (`new 클래스명()`)

### 3. 접근지정어 (Access Modifier)

| 접근지정어 | 접근 가능 범위 |
|---|---|
| `public` | 어디서든 접근 가능 (공개) |
| `protected` | 같은 패키지 + 상속받은 다른 패키지의 클래스 |
| `default` (생략) | 같은 패키지(폴더) 안에서만 |
| `private` | 자신의 클래스 내부에서만 (은닉화) |

```plain text
범위 큼                                작음
public > protected > default > private
```

> 오버라이딩 시 자식 클래스의 접근지정어는 부모보다 **좁게(축소) 설정할 수 없다.**

### 4. 상속과 오버라이딩

**상속(extends)**: 이미 만들어진 클래스의 기능을 그대로 가져다 쓰고, 필요하면 고쳐서(오버라이딩) 쓰는 것. 코드를 복사하는 게 아니라 상속받은 클래스와 **연결**되는 것이라, 부모 클래스가 바뀌면 자식 클래스도 영향을 받는다.

```java
class Parent {
    int a = 10;
    public void display() {
        System.out.println("Parent : display() Call");
    }
}

class Child extends Parent {
    int a = 100;
    public void display() {                 // 오버라이딩 - 재정의
        System.out.println("Child : display() Call");
    }
}
```

**변수 vs 메소드가 따라가는 기준이 다르다**

```java
Parent pp = new Child();   // 변수 타입은 Parent, 실제 객체는 Child

System.out.println(pp.a);  // 10 - 변수는 "선언한 타입(Parent)" 을 따라감
pp.display();               // "Child : display() Call" - 메소드는 "실제 객체(Child)" 를 따라감
```

> 상속의 기본 목적은, 객체 한 개로 여러 클래스를 묶어서 관리할 수 있게 하는 것이다.

### 5. 추상클래스 (abstract class)

기능은 같은데 클래스마다 세부 내용이 달라지는 경우, 공통되는 부분은 미리 만들어두고(상속) 나머지는 상속받은 클래스가 각자 완성하게(오버라이딩) 하는 방식.

```java
abstract class ClassName {
    // 변수, 생성자
    // 구현된 메소드
    // 구현 안 된 메소드 (추상메소드) - 상황에 따라 다르게 구현해야 하는 부분
}
```

> 예: 게시판과 자료실은 목록·상세보기·검색·수정·삭제 기능이 똑같이 필요하지만, 자료실의 "상세보기"는 실제로는 "다운로드"가 되어야 한다. 이런 경우 공통 기능은 미리 만들어두고, 달라지는 부분만 각 클래스가 오버라이딩해서 완성한다.
>
> 추상클래스는 미완성 상태라 **객체를 직접 생성(`new`)할 수 없고**, 반드시 상속받아서 완성한 뒤 사용해야 한다.

### 6. 인터페이스 (interface)

기능(메소드)의 **틀만 미리 정해두는 것**. 실제 구현은 인터페이스를 구현(`implements`)하는 클래스가 담당한다.

```java
interface II {
    void display();          // 추상 메소드 - 구현부 없음, 반드시 오버라이딩해야 함
    default void aaa() { }   // 구현된 메소드 - 선택적으로 오버라이딩 가능 (JDK 1.8+)
}

class A implements II {
    public void display() { }   // display()는 필수 구현
}
```

**인터페이스 vs 추상클래스 비교**

| 구분 | 인터페이스 | 추상클래스 |
|---|---|---|
| 개념 | 설계 중심 (규칙) | 기본 기능 + 규칙 (재사용 중심) |
| 구현 코드 | 거의 없음 (선언 위주) | 실제 구현 + 미구현 혼재 |
| 상속 | 다중 상속 가능 (`implements`) | 단일 상속만 가능 (`extends`) |
| 사용 목적 | 강제 규격화, 수정 유연성 | 공통 기능 재사용 |

**인터페이스만의 특징**
- 모든 요소가 자동으로 `public`
- 변수는 상수형만 가능하며 반드시 초기화해야 함
- 객체를 직접 생성할 수 없음 (`new` 불가, 구현 클래스를 통해서만 사용)

> 인터페이스를 쓰는 이유: 여러 개발자가 동시에 개발할 때 "이 기능은 반드시 구현해야 한다"는 규격을 미리 정해두면, 내부 구현이 나중에 바뀌어도 메소드 이름(사용법)은 그대로 유지되어 유지보수가 편해진다. (예: 라이브러리의 `List` 인터페이스를 `ArrayList`, `LinkedList` 등 여러 클래스가 각자의 방식으로 구현)

</details>

<details>
<summary><b>Chapter11. 예외처리(Exception Handling)</b></summary>

### 1. 예외처리란

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

### 2. try ~ catch ~ finally

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

### 3. 멀티 catch (다중 예외처리)

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

### 4. throw / throws

| 구분 | 의미 |
|---|---|
| `throws` | 메소드 선언부에 "이 메소드는 이런 예외가 발생할 수 있다"고 미리 선언 (예외 회피 — 컴파일 통과 목적) |
| `throw` | 필요할 때 직접 예외를 만들어서 강제로 발생시킴 (`throw new 클래스()`) |

> `throws`는 메소드 안에서 try~catch 위치를 정하기 애매하거나 소스가 길 때, 또는 라이브러리를 만들 때 주로 사용한다. 일반적인 경우엔 try~catch로 직접 처리하는 경우가 더 많다.

</details>

<details>
<summary><b>Chapter12~15. 라이브러리(java.lang) · 제네릭 · 컬렉션</b></summary>

### 1. 라이브러리 (java.lang)

**Wrapper 클래스**: 기본형(int, double 등)을 클래스처럼 다루기 위해 감싸는 클래스. 제네릭(`<>`)에는 기본형을 직접 못 쓰기 때문에 Wrapper가 필요하다.

| 기본형 | Wrapper 클래스 |
|---|---|
| `int` | `Integer` |
| `long` | `Long` |
| `double` | `Double` |
| `char` | `Character` |
| `boolean` | `Boolean` |

```java
Integer i = new Integer(10);
int ii = i;   // 오토박싱/언박싱 - 기본형과 Wrapper는 서로 자동 호환됨
```

> 웹이나 네트워크로 넘어오는 값은 무조건 문자열(String)이기 때문에, 정수로 계산하려면 `Integer.parseInt("10")`처럼 변환(파싱)해야 한다.

**문자열 처리 클래스**

| 클래스 | 특징 |
|---|---|
| `StringBuilder` | 문자를 모아서 관리, 동기화 방식(안정성 우선) |
| `StringBuffer` | 문자를 모아서 관리, 비동기화 방식(속도 우선) |
| `StringTokenizer` | 간단한 구분자로 문자열을 빠르게 분리(`split()`보다 단순한 경우에 유리) |

```java
String info = "32,000원 | 2026년 3월 19일 발행 | 448쪽";

// split() - 정규식 사용
String[] data = info.split("\\|");

// StringTokenizer - 간단한 구분자 분리
StringTokenizer st = new StringTokenizer(info, "|");
while (st.hasMoreTokens()) {
    System.out.println(st.nextToken());
}
```

### 2. 제네릭(Generic)

클래스나 메소드를 정의할 때 사용할 데이터형을 `<>` 안에 미리 지정해서, **타입을 통일하고 형변환 없이 안전하게 쓰기 위한 문법**.

```java
class Box<T> {         // T: Type(클래스형)의 약자, 관례적으로 쓰는 이름
    T t;
    public void setT(T t) { this.t = t; }
    public T getT() { return t; }
}

Box box = new Box();          // 데이터형 지정 없음 → 내부적으로 Object로 처리
Box<String> box1 = new Box<String>();   // String 전용 Box로 확정
```

**규칙**
- `<>` 안에는 **클래스만** 사용 가능 (`<int>`, `<double>` 같은 기본형은 불가 → `<Integer>`, `<Double>`처럼 Wrapper 사용)
- 사용자가 만든 클래스도 제네릭으로 사용 가능

**제네릭을 쓰는 이유**
- 데이터형이 통일되어 가독성이 좋아짐
- 꺼내 쓸 때 형변환이 필요 없어짐 (컴파일 시점에 타입이 확정되어 있으므로)
- 잘못된 타입이 들어오는 걸 컴파일 단계에서 미리 막을 수 있음

### 3. 컬렉션(Collection)

배열은 크기가 고정되어 있고 정렬·검색 기능도 직접 구현해야 하는 단점이 있다. 컬렉션은 이런 배열의 단점을 보완해서, **크기가 자동으로 늘어나고 정렬·검색 기능까지 표준화되어 제공되는 데이터 저장 구조**다.

**컬렉션의 세 종류**

| 구분 | 순서 | 중복 | 대표 클래스 | 활용 예 |
|---|---|---|---|---|
| `List` | O (인덱스 있음) | O | `ArrayList`, `LinkedList`, `Vector` | 게시판 목록, 장바구니 |
| `Set` | X | X | `HashSet`, `TreeSet` | 로또 번호, 중복 없는 태그 |
| `Map` | key-value 쌍 | key는 중복 불가 | `HashMap`, `Hashtable` | 전화번호부, 설정값 |

**List 구현 클래스 비교**

| 클래스 | 구조 | 특징 |
|---|---|---|
| `ArrayList` | 배열 기반 | 조회(접근) 속도가 빠름, 추가/삭제는 느림 → **웹 검색/조회 위주**에 많이 사용 |
| `LinkedList` | 노드 기반 | 추가/삭제가 빠름, 조회는 느림 → **파일 관리, 댓글/게시판**처럼 삽입이 잦은 곳에 사용 |
| `Vector` | ArrayList와 유사 | 동기화 처리되어 있어 속도는 느리지만 신뢰성이 높음 → **네트워크 접속자 관리** |

> **배열 기반 vs 노드 기반**: ArrayList는 데이터를 메모리에 한 줄로 쭉 붙여 저장해서, 인덱스로 원하는 칸에 바로 접근할 수 있다(조회가 빠름). 대신 중간에 추가/삭제하면 뒤 데이터를 전부 밀거나 당겨야 해서 느리다. LinkedList는 데이터를 각각 노드로 만들고, 노드끼리 다음 노드의 주소만 연결해서 관리한다. 중간에 추가/삭제할 땐 앞뒤 노드 연결만 바꾸면 되지만, 특정 위치를 찾으려면 처음부터 노드를 하나씩 따라가야 해서 조회는 느리다.

```java
List<String> list = new ArrayList<String>();
list.add("1");
list.add("2");
list.add("3");

for (String s : list) {
    System.out.println(s);
}
```

> `List<String>`처럼 `<>` 안에 담을 데이터형을 지정(제네릭)해서 사용한다. 이렇게 하면 `list.add()`, `list.get()` 등을 쓸 때 형변환 없이 바로 원하는 타입으로 다룰 수 있다.

</details>

<details>
<summary><b>Chapter16~17. 람다(Lambda) · 스트림(Stream)</b></summary>

### 1. 람다식(Lambda)

함수 인터페이스(메소드가 1개뿐인 인터페이스)를 **익명으로, 코드 없이 간단하게 표현**하는 문법. 소스가 짧아지는 대신 가독성은 다소 떨어질 수 있다.

```java
// 기존 방식 (익명 클래스)
new Thread(new Runnable() {
    public void run() {
        System.out.println("쓰레드 처리");
    }
}).start();

// 람다
new Thread(() -> System.out.println("쓰레드 처리")).start();
```

**기본 문법**: `(매개변수) -> {실행문}`

```java
(a, b) -> a + b     // 리턴형은 자동 추론됨 (자바스크립트의 화살표 함수와 유사한 개념)
```

| 구분 | 기존 방식(메소드) | 람다 |
|---|---|---|
| 재사용 | 메소드로 만들어두고 반복 호출 | 그 자리에서 즉석으로 한 번 사용 |
| 길이 | 구현이 길다 | 짧다 |

> 람다는 반복문, 리스트 처리, 조건 필터링처럼 **단순한 조건을 짧게 처리**할 때 유리하고, 조건이 복잡해지면 오히려 기존 방식(if문, 메소드)이 더 명확하다.

```java
List<Integer> list = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9,10));

// 기존 for문
for (int i : list) {
    if (i % 2 == 0)
        System.out.println(i);
}

// 람다 + 스트림
list.stream()
    .filter(x -> x > 10)
    .forEach(System.out::println);
```

### 2. 스트림(Stream)

컬렉션(List 등)의 데이터를 **파이프라인처럼 순서대로 흘려보내면서** 가공·처리하는 방식. `filter`(조건 걸러내기) → `map`(값 변형) → `forEach`(최종 처리) 순서로 이어붙여 쓴다.

```java
List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

list.stream()
    .filter(n -> n % 2 == 0)   // 짝수만 통과
    .map(n -> n * n)            // 제곱으로 변형
    .forEach(System.out::println);

// 위 코드와 동일한 기존 for문
for (int i : list) {           // stream
    if (i % 2 == 0) {          // filter
        i = i * i;              // map
        System.out.println(i);  // forEach
    }
}
```

**스트림 주요 메소드**

| 메소드 | 역할 |
|---|---|
| `filter(조건)` | 조건에 맞는 데이터만 통과시킴 |
| `map(변환)` | 데이터를 다른 값/형태로 변형 |
| `forEach(처리)` | 최종적으로 하나씩 꺼내서 처리(주로 출력) |
| `collect(Collectors.toList())` | 처리된 결과를 다시 List로 모음 |

```java
// 메소드 레퍼런스(::) - 람다를 더 짧게 줄이는 문법
names.stream()
     .map(name -> name.toUpperCase())   // 람다
     .forEach(name -> System.out.println(name));

names.stream()
     .map(String::toUpperCase)          // 메소드 레퍼런스로 축약
     .forEach(System.out::println);
```

**활용 — 조건 검색 + 결과 리스트로 모으기**

```java
// 성인 회원만 걸러서 새 리스트로 만들기
List<User> adults = users.stream()
        .filter(u -> u.getAge() >= 18)
        .collect(Collectors.toList());

// 회원 이름만 추출
List<String> names = users.stream()
        .map(User::getName)
        .collect(Collectors.toList());
```

**활용 — 그룹별 합계 (실무에서 통계 낼 때 자주 사용)**

```java
Map<String, Integer> totalByUser =
    orders.stream()
          .collect(Collectors.groupingBy(
                Order::getUserName,
                Collectors.summingInt(Order::getPrice)));
// 사용자 이름별로 그룹을 묶고, 각 그룹의 price를 합산
```

</details>

<details>
<summary><b>Chapter18~19. 입출력(IO) · 네트워크(쓰레드 · 내부클래스)</b></summary>

### 1. IO(입출력)란

데이터의 흐름을 관리하는 통로. 데이터가 이동할 공간이 필요하기 때문에 `Stream`(통로)을 사용하며, 기본적으로 단방향이라 입력과 출력을 동시에 하려면 쓰레드를 함께 사용한다.

**사용처**: 파일 읽기/쓰기, 파일 이동, JSON/XML 등 텍스트 변경, 설정 파일, 네트워크 통신(서버-클라이언트), 사용자 입력(콘솔)

**IO 주요 클래스**

| 구분 | 클래스 | 특징 |
|---|---|---|
| 읽기 | `InputStream` → `FileInputStream` | 1바이트씩 전송, 업로드·다운로드에 사용 |
| 읽기(버퍼) | `BufferedInputStream` | 여러 데이터를 한 번에 모아 보내서 효율적 |
| 쓰기 | `OutputStream` → `FileOutputStream` | 1바이트씩 전송, 파일 쓰기 |
| 쓰기(버퍼) | `BufferedOutputStream` | - |
| 읽기(문자) | `Reader` → `FileReader` | 2바이트씩 전송, 파일 제어(읽기) |
| 읽기(문자,버퍼) | `BufferedReader` | - |
| 쓰기(문자) | `Writer` → `FileWriter` | 2바이트씩 전송, 파일 제어(쓰기) |
| 쓰기(문자,버퍼) | `BufferedWriter` | - |

> `Buffered` 계열은 데이터를 여러 개 모아서 한 번에 전송하기 때문에, 하나씩 전송하는 기본 Stream/Reader보다 효율적이다.

```java
try {
    FileInputStream fis = new FileInputStream("c:\\javaDev\\고객.txt");
    BufferedInputStream bis = new BufferedInputStream(fis);

    FileOutputStream fos = new FileOutputStream("c:\\java_data\\고객.txt");
    BufferedOutputStream bos = new BufferedOutputStream(fos);

    int i = 0;
    byte[] buffer = new byte[1024];
    while ((i = bis.read(buffer, 0, 1024)) != -1) {
        bos.write(buffer, 0, i);
    }

    fis.close(); bis.close(); fos.close(); bos.close();
} catch (Exception ex) {
    System.out.println(ex.getMessage());
}
```

> 파일 입출력은 `CheckedException`을 가지고 있어서 **반드시 예외처리**가 필요하고, 다 쓰고 나면 `close()`로 스트림을 닫아줘야 한다.

**Files 클래스 (java.nio)** — 대부분 `static` 메소드로 되어 있어 `Files.` 을 찍고 바로 사용

| 메소드 | 기능 |
|---|---|
| `exists(경로명)` | 파일 존재 여부 확인 |
| `createFile(경로명)` | 새 파일 생성 |
| `createDirectory(경로명)` | 폴더 생성 |
| `delete(경로명)` | 파일 삭제 |
| `readAllLines(경로명)` | 모든 줄을 `List<String>`으로 읽어옴 |
| `write(경로명, content)` | 파일 쓰기 |
| `copy(source, target)` | 파일 복사 (원본 유지) |
| `move(source, target)` | 파일 이동 (원본 사라짐) |
| `size(경로명)` | 파일 크기 |

> 경로명은 `Paths`로 먼저 `Path` 객체를 만들어서 사용해야 한다. 복사·이동 시 파일이 이미 있으면 `StandardCopyOption.REPLACE_EXISTING` 옵션으로 덮어쓰기 처리한다.

### 2. 쓰레드(Thread)

| 구분 | 의미 |
|---|---|
| 프로세스 | 한 개의 프로그램 |
| 쓰레드 | 한 개의 프로세스 안에서 여러 기능을 동시에 수행 (동시성, 시분할) |

쓰레드는 게임이나 서버(여러 명이 동시에 접속하는 환경)에 많이 사용된다.

**구현 방법**

```java
// 1) Thread 클래스 상속
class A extends Thread { }

// 2) Runnable 인터페이스 구현 - 표준화된 방식
class A implements Runnable { }
```

**쓰레드 생명주기**: `new`(생성) → `Runnable`(구현 준비, 자원을 공유하며 대기) → `Running`(`run()` 실행) → `Blocked`(일시정지) → `Dead`(메모리 해제)

> 쓰레드는 한 가지 일만 수행하도록 설계하는 게 기본 원칙이다. (예: 게임에서 총알 하나, 비행기 하나씩 각자의 쓰레드로 처리)

### 3. 내부클래스(Inner Class)

**멤버클래스**: 공통으로 사용되는 변수나 메소드가 있을 때, 클래스 안에 클래스를 두는 방식. 주로 네트워크 서버, 쓰레드를 만들 때 사용한다.

```java
class Server {
    // 사용자 정보를 공유해야 하므로 이너클래스로 관리
    class 통신 { }
}
```

**익명클래스**: 상속을 이미 다른 클래스로 받아 쓰고 있어서 추가로 상속을 못 받는 경우, 상속 없이 그 자리에서 오버라이딩만 해서 사용하는 방식.

```java
class A {
    B b = new B() {
        void disp() { }   // 상속(extends) 없이 즉석에서 재정의
    };
}
class B {
    void disp() { }
}
```

> 윈도우 프로그램에서 버튼 클릭 이벤트를 처리할 때 자주 쓰인다 — 이미 `JFrame`을 상속받은 상태라 버튼 클래스를 또 상속받을 수 없으니, 익명클래스로 그 자리에서 동작만 재정의하는 식이다.

</details>
