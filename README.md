# 2026-03-03-java_study
# ☕ Java 스터디 정리

## 📌 목차

- [x] Chapter01~03 : 변수와 연산자
- [x] Chapter04 : 제어문 (조건문 · 반복문)
- [ ] Chapter05 : 배열 · 메소드
- [ ] Chapter06~08 : 객체지향, 인터페이스
- [ ] Chapter11 : 예외처리
- [ ] Chapter12~15 : 라이브러리, 제네릭, 컬렉션
- [ ] Chapter16~17 : 람다, 스트림
- [ ] Chapter18~19 : 입출력, 네트워크

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

> 제어문은 프로그램의 흐름을 조절하는 문법이다. 특정 조건에서만 실행하거나(조건문), 같은 동작을 여러 번 반복하는 것(반복문)이 핵심이다.

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
