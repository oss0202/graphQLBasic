# GraphQL

![GraphQL](/doc/img/logo.png)

GraphQL(gql)은 페이스북에서 만든 쿼리 언어로 웹 클라이언트가 데이터를 서버로 부터 효울적으로 가져오는 것이 목적이다.

- gql 쿼리 예시
```
{
  book {
    name
    author
  }
}
```

서버사이드 gql 애플리케이션은 gql 로 작성된 쿼리를 입력 받아 처리한 결과를 다시 클라이언트로 돌려준다.


### REST API와 비교

REST API는 URL, METHOD 등을 조합하기 때문에 다양한 Endpoint가 존재한다. 

반면 gql은 단 하나의 Endpoint가 존재한다. 

- https://www.youtube.com/watch?v=EkWI6Ru8lFQ&t=544s


![rest](/doc/img/rest.png)


## GraphQL 구조


### 쿼리와 뮤테이션 

gql에서는 쿼리와 뮤테이션을 나누어 사용하는데, 내부적으로 동일하다. 

쿼리는 데이터를 읽는데 사용하고, 뮤테이션은 변하는데 사용하는 개념적인 정의이다.


![data](/doc/img/data.png)

: 쿼리문, 응답 데이터 형식

### Resolver

데이터를 가져오는 역할을 resolver 가 담당한다. 

gql 쿼리문 파싱은 gql 라이브러리에서 처리하지만, resolver는 프로그래머가 직접 구현해야 한다.

직접 구현하는 부담이 있지만, 데이터의 source 의 종류에 상관 없이 구현이 가능하다.

데이터베이스, 파일, 외부 등 에서 가져올 수 있다.

gql 쿼리에서는 각각의 필드마다 함수가 하나씩 존재하는데, 함수가 resolver 이다.

만약 필드가 문자열이나 숫자와 같은 primitive 타입인 경우에는 실행이 종료되지만, 

resolver의 경우 호출이 연쇄적으로 일어난다. 


- 연쇄적 resolver 호출은 DFS로 동작한다. 이러한 부분 때문에 Graph 단어가 쓰임


 ### Reference
 - https://tech.kakao.com/2019/08/01/graphql-basic/



## Getting started
- reference : https://www.graphql-java.com/tutorials/getting-started-with-spring-boot/

- Schema : [schema.graphqls](https://github.com/hotire/spring-graphql/blob/master/src/main/resources/schema.graphqls)

- GraphQLProvider : [GraphQLProvider](https://github.com/hotire/spring-graphql/blob/master/src/main/java/com/github/hotire/graphql/GraphQLProvider.java)

 
 
