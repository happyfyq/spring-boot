# spring-boot
springBoot整合mybatis 


项目结构:

    ├── pom.xml
    └── src
        ├── main
        │   ├── java
        │   │   └── com
        │   │       └── example
        │   │           └── demo
        │   │               ├── DemoApplication.java
        │   │               └── controller
        │   │                   └──CityRestController.java
        │   │               └──dao
        │   │                   └──City.dao
        │   │               └──domain
        │   │                   └──City.java
        │   │               └──service
        │   │                   ├── impl
        │   │                      └──CityServiceImpl.java
        │   │                   └── CityService.java
        │   │
        │   └── resources
        │       ├──mapper
    	│		 └── CityMapper.xml
        │       └── applicationyml

该项目就是一个基于maven的springboot项目，然后整合了mybatis，数据库用的mysql。
