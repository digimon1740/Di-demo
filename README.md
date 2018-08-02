# @Autowired, @Inject, @Resource 차이점

- @Autowired : 스프링 전용, 타입을 기준으로 객체를 주입
- @Inject : JSR-330 스프링 전용이 아님, @Autowired 와 마찬가지로 타입을 기준으로 객체를 주입
- @Resource : 스프링 전용이 아님, 이름을 기준으로 객체를 주입 (이름과 객체명이 같아야함)
- @Qualifier : 타입을 기준으로 객체를 주입할 경우 간혹 다수의 후보들이 생길 수 있음 (같은 타입이면서 빈네임이 다른 경우) 이 경우에 빈네임을 직접 지정할 수 있음.