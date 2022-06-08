# adapter_pattern
어댑터패턴

1.개요
 - 어댑터 패턴은 어댑터처럼 사용되는 패턴이다. 
 - 220v를 사용하는 한국에서 쓰던 기기들을 어댑터를 110v를 쓰는곳에 가서도 그대로 쓸 수 있게끔 해주는 패턴이라 생각 하면 된다.
 - 한 클래스의 인터페이스르 사용하고자 하는 다른 인터페이스로 변환할 때 주로 사용하며 이를 이용하면 인터페이스 호환성이 맞지 않아 쓸 수 없는 클래스를 
  연관 관계로 연결해서 사용할 수 있게 해주는 패턴이다.
  
2.사용성
 - 기존 클래스를 사용하고 싶은데 인터페이스가 맞지 않을 때 
 - 아직 예측하지 못한 클래스나 실제 관련되지 않는 클래스들이 기존 클래스를 재사용하고자 하지만 이미 정의된 재사용 가능한 클래스가 지금
  요청하는 인터페이슬르 꼭 정의하고 있지 않을 때. 다시 말해 이미 만든 것을 재사용하고자 하나 재사용 가능한 라이브러리를 수정할 수 없을 때
 - 이미 존재하는 여러 개의 서브 클래스를 사용해야 하는데 이 서브클래스들의 상속을 통해서 이들의 인터페이스를 다시 개조한다는 것이 현실성이 잆을 때,
  객체 적을자를 써서 부모 클래스의 인터페이스를 변형하는 것이 더 바람직함

3.장단점
 
 #장점
 - adapter패턴의 가장 큰 장점은 기존 코드를 변경하지 않아도 된다는 점이다.
 - 기존 코드를 변경하지 않기 때문에 클래스 재활용성을 증가시킬 수 있다.
 
 #단점 
 - 구성요소를 위해 클래스를 증가시켜야 하기 때문에 복잡도가 증가할 수 있다.
 - 클래스 어댑터 의 경우 상속을 사용하기 때문에 유연하지 못한다.
 - 반경 객체 어댑터의 경우는 대부분의 코드를 다시 작성해야 하기 떄문에 효율적이지 못한다.

4.사용 라이브러리

 #자바
 - java.util.Arrays#asList(T...)
 - java.util.Collections#list(Enumeration), java.util.Collections#enumeration()
 - java.io.InputStreamReader(InputStream)
 - java.io.OutputStreamWriter(OutputStream)

 #스프링
 - HandlerAdpter: 우리가 작성하는 다양한 형태의 핸들러 코드를 스프링 MVC가 실행할 수 있 는 형태로 변환해주는 어댑터용 인터페이스.
