# 하얀 칸
브론즈 2

[백준 문제 링크](https://www.acmicpc.net/problem/1100)

### 내가 푼 방법

---

문제에는 검정 칸과 하얀 칸이 번갈아가면서 색칠되어있다고 했으니깐
하얀칸이 있는 칸은 0번째 배열 에는 0, 2, 4, 6
1번째 배열에는 1,3,5,7
2번째에는 0,2,4,6 이렇게 7번째 배열까지 도달하는 것이다.
배열마다 하얀 칸 안에 인덱스가 .인지 F인지 판별해서 F일때 마다
수를 ++해주면 된다.


### 문제를 통해 알게 된 함수

--- 

#### charAt(index)
배열에 문자를 index기준으로 뽑고싶을 때 사용한다.
```java
//예제
String str;
str = new String;

for(i=0 : str.length()){
    System.out.print(str.charAt(i) );
}
```

#### nextLine()과 next()에 차이점
**nextLine()** 은 한 줄 전체를 입력받고
**next()** 는 공백 기준으로 입력 받는다.

예를들어
```sql
Hello World! I am Jaemyeong
```
이라는 문장을 입력받을 때 nextLine()으로 입력 받을시
"Hello World! I am Jaemyeong" 전체를 한줄로 입력받고
next()로 입력받았을 때는 "Hello"를 첫번째 호출할 때 반환하고 "World!"를 두번째
세번째는 ... 띄어쓰기 기준으로 호출했을 때 반환한다. 