# 오브젝트책 읽고 실습 하기

# 협력
- Screening, Movie, Reservation 인스턴스들은 서로의 메서드를 호출하며 상호 작용한다.
- 이처럼 어떤 시스템의 기능을 구현하기 위해 객체들 사이에 이뤄지는 상호작용을 협력(Collaboration)이라 부른다.   

# 협력 관계의 개선
## 객체간의 상호작용 방식
1. 객체의 내부 상태는 외부에서 접근하지못하도록 감춰야한다.
2. 객체는 다른 객체의 인터페이스에 공개된 행동을 수행하도록 **요청(request)** 하고, 요청받은 객체는 요청을 처리 후 **응답(response)** 한다.
3. 객체가 다른 객체와 상호작용할 수 있는 유일한 방법은 **메세지를 전송**하는 것뿐이다.
4. 다른 객체에 요청이 도착할 때 해당 객체가 **메세지를 수신**했다고 이야기한다.
5. 메세지를 수신한 객체는 스스로 결정에 따라 자율적으로 메시지를 처리할 방법을 결정
6. 이처럼 메시지를 처리하기 위한 자신만의 방법을 **메서드(method)** 라 한다.

# 코드의 재사용
- 코드를 재사용을 위해서는 상속보다는 **합성**이 더 좋은 방법이다.
- `합성이란?`: 다른 객체의 인스턴스를 자신의 인스턴스 변수로 포함해서 재사용하는 방법을 말한다.

## 상속에 의한 코드재사용이 설계에 미치는 영향
- 상속의 가장 큰 문제점은 캡슐화를 위반한다.
- 설계를 유연하지 못하게 만든다.

### 이유
**단점 1 - 캡슐화 위반**
- 부모 클래스의 구현이 자식 클래스에게 노출되기 때문에 캡슐화가 약화된다.
- 자식 클래스가 부모 클래스에 강하게 결합되도록 만들기 때문에
- 부모클래스를 변경할 때 자식 클래스도 함께 변경될 확률을 높인다.
- 결과적으로 상속을 과도하게 사용한 코드는 변경하기도 어려워진다. 

**단점 2 - 설계가 유연하지 않다**
- 상속은 부모 클래스와 자식 클래스 사이의 관계를 컴파일 시점에 결정한다.
- 따라서 실행 시점에 객체의 종류를 변경하는 것이 불가능하다.
- 위 문제를 해결하기 위한 최선의 방법으로 변경하고자하는 클래스를 생성한 후 복사하는 방법이 있다.
- 이것은 부모클래스와 자식클래스가 강하게 결합되 있기때문이다.

### 해결방안
**인스턴스 변수로 연결한 기존 방법을 사용하면 실행 시점에 할인 정책을 간단하게 변경할 수 있다.**
- 이 방법이 상속과 다른점은 
- 상속이 부모 클래스의 코드와 자식 클래스의 코드를 컴파일 시점에 하나의 단위로 강하게 결합하는 데에 비해
- 인터페이스를 통해 약하게 결합된다는 것이다.
- 이처럼 인터페이스에 정의된 메시지를 통해서만 코드를 재사용하는 방법을 **합성**이라고 부른다.

## 합성을 사용한 코드 재사용
**합성은 상속이 가지는 두 가지 문제점을 모두 해결한다.**
1. 인터페이스에서 정의된 메시지를 통해서만 재사용이 가능하기 때문에 구현을 효과적으로 캡슐화 할 수 있다.
2. 의존하는 인터페이스를 교체하는 것이 비교적 쉽기 떄문에 설계를 유연하게 만든다.
 
**정리**
- 코드 재사용을 위해서는 상속보다는 합성을 선호하는 것이 더 좋은 방법이다.
- 그렇다고 해서 상속을 절대 사용하지 말라는 것은 아니다. 
- 상속과 합성을 함께 사용해야한다.
- 대부분의 설계에서는 상속과 합성을 함꼐사용해야 한다.