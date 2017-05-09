# jpa-test

## 목적 

spring-boot 환경에서 spring data jpa로 
composite key entity 에 대한 custom 삭제 메소드를 생성/사용시
typeMissMatch 와 같은 예외 발생 (..정확한 예외명은 추후 업데이트)



```java
import org.springframework.data.jpa.repository.JpaRepository;
import com.sample.domain.CustomerManager;
import com.sample.domain.CustomerManagerId;

public interface CustomerManagerRepository extends JpaRepository<CustomerManager, CustomerManagerId>{
	public void deleteByCustomerId(Long customerId);
}
```

## 하지만

실제 개발환경 postgreSQL, QuertDSL, lombok 에서는 발생하던 부분이
재 확인을 위해 작성한 프로젝트에서는 발생되지 않음...

h2를 사용한 부분이 문제인지.. idClass에서의 lombok 문제인지..


## ...안타까움
* 기록용으로 작성

